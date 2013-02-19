package teamdev.wmplayer;

import com.jniwrapper.DoubleFloat;
import com.jniwrapper.Int32;
import com.jniwrapper.win32.automation.OleContainer;
import com.jniwrapper.win32.automation.impl.IDispatchImpl;
import com.jniwrapper.win32.automation.server.IDispatchVTBL;
import com.jniwrapper.win32.automation.types.BStr;
import com.jniwrapper.win32.com.server.IClassFactoryServer;
import com.jniwrapper.win32.com.types.IID;
import com.jniwrapper.win32.ole.IConnectionPoint;
import com.jniwrapper.win32.ole.IConnectionPointContainer;
import com.jniwrapper.win32.ole.impl.IConnectionPointContainerImpl;
import com.jniwrapper.win32.ole.types.OleVerbs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import teamdev.wmplayer.wmplib.IWMPControls;
import teamdev.wmplayer.wmplib.IWMPCore;
import teamdev.wmplayer.wmplib.IWMPMedia;
import teamdev.wmplayer.wmplib._WMPOCXEvents;
import teamdev.wmplayer.wmplib.impl.IWMPCoreImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class enables to embed OLE/ActiveX Windows Media Player controls into java GUI AWT/Swing application.
 *
 * @author Anna Dolbina
 */
public class WMPlayerComponent extends JComponent {
    public static final Dimension PREFERRED_SIZE = new Dimension(320, 240);
    private static final int PLAYLIST_OPEN_NO_MEDIA = 6;
    public static final int MEDIA_OPEN = 13;
    private PlayState playState;
    private File file;
    private final OleContainer playerContainer = new OleContainer();
    private double mediaDuration;
    private final Set<PlayerListener> playerListeners = Collections.synchronizedSet(new LinkedHashSet<PlayerListener>());
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final IWMPCore iwmpCore;
    private final IWMPControls wmpControls;
    private IDispatchImpl dispatch;
    private Int32 adviseResult;
    private PlayerEventsHandler eventsHandler;
    private IClassFactoryServer server;

    /**
     * Constructs and initializes an instance of WMPlayerComponent.
     */
    public WMPlayerComponent() {
        super();
        try {
            initialize();
        } catch (InvocationTargetException e) {
            logger.error("Cannot initialize the component: ", e);
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            logger.error("Cannot initialize the component: ", e);
            throw new RuntimeException(e);
        }

        setPreferredSize(PREFERRED_SIZE);
        playState = PlayState.UNDEFINED;
        file = new File("");
        iwmpCore = new IWMPCoreImpl(playerContainer.getOleObject());
        wmpControls=iwmpCore.getControls();


    }

    /*
     * Initializes OLE/ActiveX Windows Media Player.
     */
    private void initialize() throws InvocationTargetException, InterruptedException {
        setLayout(new BorderLayout());
        add(playerContainer, BorderLayout.CENTER);
        playerContainer.createObject("WMPlayer.OCX");
        playerContainer.setActivationVerb(OleVerbs.INPLACEACTIVATE);
        playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
            public void run() {
                setupEventHandler();

            }
        });
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);
    }


    /*
     * Setups the dispatcher to begin dispatching player events.
     */
    private void setupEventHandler() {
        server = createClassFactoryServer();
        createDispatcher();
        // Get the new instance of Java COM object from the server
        eventsHandler = (PlayerEventsHandler) server.getInstances().pop();
        eventsHandler.setSource(this);
        // Add a property change listener to monitor property changing

        eventsHandler.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals(PlayerEventsHandler.PROPERTY_PLAY_STATE)) {
                    playState = (PlayState) evt.getNewValue();
                    logger.info("Play state changed: " + playState.toString());
                    if (playState == PlayState.PLAYING) {
                        synchronized (iwmpCore) {
                            iwmpCore.notifyAll();
                        }
                    }
                    firePlayStateChangeEvent(new PlayerEvent(playerContainer.getParent(), playState));
                }
                if (evt.getPropertyName().equals(PlayerEventsHandler.PROPERTY_POSITION)) {
                    logger.info("Position state changed: " + evt.getOldValue() + "-->" + evt.getNewValue());
                    firePlayingPositionChangeEvent(new PlayingPositionEvent(playerContainer.getParent(), (Double) evt.getOldValue(), (Double) evt.getNewValue()));
                }
                if (evt.getPropertyName().equals(PlayerEventsHandler.PROPERTY_MOUSE)) {
                    synchronized (logger){
                    MouseEvent e = (MouseEvent) evt.getNewValue();
                    e.setSource(playerContainer.getParent());
                    processMouseEvent(e);
                    processMouseMotionEvent(e);
                    }
                }
                if (evt.getPropertyName().equals(PlayerEventsHandler.PROPERTY_OPEN_STATE)) {
                    logger.info("Open state changed to: " + evt.getNewValue().toString());
                    if ((((Integer) evt.getNewValue() == PLAYLIST_OPEN_NO_MEDIA)) || (((Integer) evt.getNewValue() == MEDIA_OPEN))) {
                        synchronized (wmpControls) {
                            wmpControls.notifyAll();
                        }
                    }
                }

            }
        });
    }

    /*
     * Create an instance of dispatcher with a class factory
     */
    private void createDispatcher() {
        dispatch = new IDispatchImpl();
        server.createInstance(null, dispatch.getIID(), dispatch);
        IConnectionPointContainer connectionPointContainer = new IConnectionPointContainerImpl(playerContainer.getOleObject());
        IConnectionPoint connectionPoint = connectionPointContainer.findConnectionPoint(new IID(_WMPOCXEvents.INTERFACE_IDENTIFIER));
        adviseResult=connectionPoint.advise(dispatch);
        connectionPoint.setAutoDelete(false);
        connectionPoint.release();
        connectionPointContainer.setAutoDelete(false);
        connectionPointContainer.release();
    }

    /*
     * Creates the class factory server for _WMPOCXEvents
     */
    private IClassFactoryServer createClassFactoryServer() {
        IClassFactoryServer server =
                new IClassFactoryServer(PlayerEventsHandler.class);
        server.registerInterface(_WMPOCXEvents.class, new IDispatchVTBL(server));
        server.setDefaultInterface(_WMPOCXEvents.class);
        return server;
    }

    /**
     * Uninitializes OLE/ActiveX Windows Media Player and performs correct clean-up.
     * Must be explicitly called when the component becomes unnecessary
     */

    public void destroy() {
        playerListeners.clear();

        if (wmpControls != null && !wmpControls.isNull()) {
            wmpControls.setAutoDelete(false);
            wmpControls.release();
        }
        if (iwmpCore != null && !iwmpCore.isNull()) {
            iwmpCore.setAutoDelete(false);
            iwmpCore.release();
        }
        IConnectionPointContainer connectionPointContainer = new IConnectionPointContainerImpl(playerContainer.getOleObject());
        IConnectionPoint connectionPoint = connectionPointContainer.findConnectionPoint(new IID(_WMPOCXEvents.INTERFACE_IDENTIFIER));
        connectionPoint.unadvise(adviseResult);
        connectionPoint.setAutoDelete(false);
        connectionPoint.release();
        connectionPointContainer.setAutoDelete(false);
        connectionPointContainer.release();

        if (dispatch!=null && !dispatch.isNull()){
            dispatch.setAutoDelete(false);
            dispatch.release();
        }
        if (server!=null && !server.isNull()){
            server.setAutoDelete(false);
            server.release();
        }
        playerContainer.destroyObject();
    }

    /**
     * Plays the currently opened file.
     */
    public void play() {
        try {
            playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
                @Override
                public void run() {
                    wmpControls.play();
                }
            });
        } catch (Exception e) {
            logger.error("Play exception: ", e);
        }

    }

    /**
     * Pauses the player.
     */
    public void pause() {
        try {
            playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
                @Override
                public void run() {
                    wmpControls.pause();
                }
            });
        } catch (Exception e) {
            logger.error("Pause exception: ", e);
        }

    }

    /**
     * Stops the player.
     */
    public void stop() {
        try {
            playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
                @Override
                public void run() {
                   wmpControls.stop();
                }
            });
        } catch (Exception e) {
            logger.error("Stop exception: ", e);
        }
    }

    /*
     * Retrieves the length of current media in player.
     */
    private void retrieveMediaDuration() {
        IWMPMedia media= iwmpCore.getCurrentMedia();
        mediaDuration= media.getDuration().getValue();
        media.setAutoDelete(false);
        media.release();
    }

    /**
     * Sets the playing position in the currently playing file.
     *
     * @param position the position to set.
     */
    public void setCurrentPosition(final double position) {
        if ((position < 0) || (position > mediaDuration))
            throw new IllegalArgumentException("This playing position is invalid and cannot be set: " + position);
        try {
            playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
                @Override
                public void run() {
                    wmpControls.setCurrentPosition(new DoubleFloat(position));
                }
            });
        } catch (Exception e) {
            logger.error("Failed to set position in media: " + position, e);
        }
    }

    /**
     * Opens the file in the component.
     *
     * @param file the file to open.
     */
    public void open(final File file) throws FileNotFoundException {
        if (file == null)
            throw new IllegalArgumentException("The file argument is null");
        if (!file.isFile())
            throw new FileNotFoundException("The path " + file.getAbsolutePath() + " is not a path to an existing file.");

        try {
            playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
                @Override
                public void run() {
                    iwmpCore.setURL(new BStr(file.getAbsolutePath()));
                }
            });
            synchronized (wmpControls) {
                logger.info("Waiting for open states MEDIA_OPEN or PLAYLIST_OPEN_NO_MEDIA...");
                wmpControls.wait();
            }

        } catch (Exception e) {
            logger.error("Player failed to open file specified: " + file, e);
        }
        synchronized (iwmpCore) {
            long openState = iwmpCore.getOpenState().getValue();
            if (openState == PLAYLIST_OPEN_NO_MEDIA)
                throw new UnsupportedFileTypeException("Cannot open this file: " + file.getAbsolutePath());
            if (openState == MEDIA_OPEN) logger.info("Media opened");
            retrieveMediaDuration();
            try {
                iwmpCore.wait();
            } catch (InterruptedException e) {
                logger.error("Interrupted when waiting for play state PLAYING");
            }
        }
        this.file = file;
    }

    /**
     * Returns the file opened in the player.
     *
     * @return the file opened in the player.
     */
    public File getFile() {
        return file;
    }

    /**
     * Return the current play state of the player.
     *
     * @return the current play state of the player.
     */
    public PlayState getPlayState() {
        return playState;
    }

    /**
     * Returns the duration of the opened file.
     *
     * @return the duration of the opened file, in seconds.
     */
    public double getMediaDuration() {
        return mediaDuration;
    }

    /**
     * Adds the given PlayStateChangeListener to the component. After adding
     * the listener will receive its play state change events.
     *
     * @param listener the listener to add
     */
    public void addPlayerListener(PlayerListener listener) {
        if (listener == null) throw new IllegalArgumentException("Passed listener argument is null");
        if (playerListeners.contains(listener))
            throw new IllegalArgumentException("The passed listener is already added");
        playerListeners.add(listener);

    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        super.addMouseListener(l);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
        super.addMouseMotionListener(l);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
        super.addMouseWheelListener(l);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public synchronized void removeMouseListener(MouseListener l) {
        super.removeMouseListener(l);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public synchronized void removeMouseMotionListener(MouseMotionListener l) {
        super.removeMouseMotionListener(l);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public synchronized void removeMouseWheelListener(MouseWheelListener l) {
        super.removeMouseWheelListener(l);    //To change body of overridden methods use File | Settings | File Templates.
    }

    /**
     * Removes the given PlayStateChangeListener from the component. After removing
     * this listener wil not receive this component's play state change events.
     *
     * @param listener the listener to remove
     */
    public void removePlayerListener(PlayerListener listener) {
        if (listener == null) throw new IllegalArgumentException("Passed listener argument is null");
        if (!playerListeners.contains(listener))
            throw new IllegalArgumentException("The passed listener is not added to the component");
        playerListeners.remove(listener);
    }

    /**
     * Fires the specified event to all PlayStateChangeListener objects which are
     * added to this component.
     *
     * @param event The event to fire
     */
    protected void firePlayStateChangeEvent(PlayerEvent event) {
        if (event == null) throw new IllegalArgumentException("Passed event argument is null");
        Set<PlayerListener> listeners = new HashSet(playerListeners);
        for (java.util.Iterator<PlayerListener> iterator = listeners.iterator(); iterator.hasNext(); ) {
            PlayerListener listener = iterator.next();
            switch (event.getPlayState()) {
                case PLAYING: {
                    listener.playerStarted(event);
                    break;
                }
                case PAUSED: {
                    listener.playerPaused(event);
                    break;
                }
                case STOPPED: {
                    listener.playerStopped(event);
                    break;
                }
            }

        }
    }

    /**
     * Fires the specified event to all PositionChangeListener objects which are
     * added to this component.
     *
     * @param event The event to fire
     */
    protected void firePlayingPositionChangeEvent(PlayingPositionEvent event) {
        if (event == null) throw new IllegalArgumentException("Passed event argument is null");
        Set<PlayerListener> listeners = new HashSet<PlayerListener>(playerListeners);
        for (java.util.Iterator<PlayerListener> iterator = listeners.iterator(); iterator.hasNext(); ) {
            PlayerListener listener = iterator.next();
            listener.playingPositionChanged(event);
        }
    }


}
