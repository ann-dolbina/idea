package teamdev.wmplayer;

import com.jniwrapper.DoubleFloat;
import com.jniwrapper.Int16;
import com.jniwrapper.Int32;
import com.jniwrapper.win32.com.server.CoClassMetaInfo;
import teamdev.wmplayer.wmplib.server._WMPOCXEventsServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Iterator;
import java.util.LinkedList;


class PlayerEventsHandler extends _WMPOCXEventsServer {

    public static final String PROPERTY_POSITION = "position";
    public static final String PROPERTY_PLAY_STATE = "play state";
    public static final String PROPERTY_OPEN_STATE = "open state";
    public static final String PROPERTY_MOUSE = "mouse";
    private static final int ALT_MASK = 4;
    private static final int ALT_OFFSET = 7;
    private static final int CTRL_SHIFT_MASK = 3;
    private static final int CTRL_SHIFT_OFFSET = 6;
    private static final int BUTTON1_MASK = 1;
    private static final int BUTTON3_MASK = 2;
    private static final int BUTTON2_MASK = 4;
    private WMPlayerComponent source;
    private final Point sourceLocation = new Point();

    private final PropertyChangeSupport propertyChangeSupport =
            new PropertyChangeSupport(this);

    public PlayerEventsHandler(CoClassMetaInfo coClassMetaInfo) {
        super(coClassMetaInfo);
    }

    @Override
    public void click(Int16 nButton, Int16 nShiftState, Int32 fX, Int32 fY) {
        long time = System.currentTimeMillis();
        int modifiers = convertButtonsState(nShiftState);
        java.util.List<Integer> buttons = convertMouseButtonsState(nButton);
        for (Iterator<Integer> iterator = buttons.iterator(); iterator.hasNext(); ) {
            Integer button = iterator.next();
            MouseEvent e = new MouseEvent(source, MouseEvent.MOUSE_CLICKED, time, modifiers, (int) fX.getValue(), (int) fY.getValue(), sourceLocation.x, sourceLocation.y, 1, false, button);
            propertyChangeSupport.firePropertyChange(PROPERTY_MOUSE, null, e);
        }
    }

    @Override
    public void doubleClick(Int16 nButton, Int16 nShiftState, Int32 fX, Int32 fY) {
        long time = System.currentTimeMillis();
        int modifiers = convertButtonsState(nShiftState);
        java.util.List<Integer> buttons = convertMouseButtonsState(nButton);
        for (Iterator<Integer> iterator = buttons.iterator(); iterator.hasNext(); ) {
            Integer button = iterator.next();
            MouseEvent e = new MouseEvent(source, MouseEvent.MOUSE_CLICKED, time, modifiers, (int) fX.getValue(), (int) fY.getValue(), sourceLocation.x, sourceLocation.y, 2, false, button);
            propertyChangeSupport.firePropertyChange(PROPERTY_MOUSE, null, e);
        }
    }

    @Override
    public void mouseDown(Int16 nButton, Int16 nShiftState, Int32 fX, Int32 fY) {
        long time = System.currentTimeMillis();
        int modifiers = convertButtonsState(nShiftState);
        java.util.List<Integer> buttons = convertMouseButtonsState(nButton);
        for (Iterator<Integer> iterator = buttons.iterator(); iterator.hasNext(); ) {
            Integer button = iterator.next();
            MouseEvent e = new MouseEvent(source, MouseEvent.MOUSE_PRESSED, time, modifiers, (int) fX.getValue(), (int) fY.getValue(), sourceLocation.x, sourceLocation.y, 1, false, button);
            propertyChangeSupport.firePropertyChange(PROPERTY_MOUSE, null, e);
        }
    }

    @Override
    public void mouseMove(Int16 nButton, Int16 nShiftState, Int32 fX, Int32 fY) {
        long time = System.currentTimeMillis();
        int modifiers = convertButtonsState(nShiftState);
        java.util.List<Integer> buttons = convertMouseButtonsState(nButton);
        if (buttons.isEmpty()) {
            MouseEvent e = new MouseEvent(source, MouseEvent.MOUSE_MOVED, time, modifiers, (int) fX.getValue(), (int) fY.getValue(), sourceLocation.x, sourceLocation.y, 1, false, MouseEvent.NOBUTTON);
            propertyChangeSupport.firePropertyChange(PROPERTY_MOUSE, null, e);
        }
        for (Iterator<Integer> iterator = buttons.iterator(); iterator.hasNext(); ) {
            Integer button = iterator.next();
            MouseEvent e = new MouseEvent(source, MouseEvent.MOUSE_DRAGGED, time, modifiers, (int) fX.getValue(), (int) fY.getValue(), sourceLocation.x, sourceLocation.y, 1, false, button);
            propertyChangeSupport.firePropertyChange(PROPERTY_MOUSE, null, e);
        }

    }

    @Override
    public void mouseUp(Int16 nButton, Int16 nShiftState, Int32 fX, Int32 fY) {
        long time = System.currentTimeMillis();
        int modifiers = convertButtonsState(nShiftState);
        java.util.List<Integer> buttons = convertMouseButtonsState(nButton);
        for (Iterator<Integer> iterator = buttons.iterator(); iterator.hasNext(); ) {
            Integer button = iterator.next();

            MouseEvent e = new MouseEvent(source, MouseEvent.MOUSE_RELEASED, time, modifiers, (int) fX.getValue(), (int) fY.getValue(), sourceLocation.x, sourceLocation.y, 1, false, button);
            propertyChangeSupport.firePropertyChange(PROPERTY_MOUSE, null, e);
        }

    }

    /*
    Converts Ctrl, Alt and Shift states into AWT states representation
     */
    private int convertButtonsState(Int16 nShiftState) {
        int shiftState = (int) nShiftState.getValue();
        return ((shiftState & ALT_MASK) << ALT_OFFSET) + ((shiftState & CTRL_SHIFT_MASK) << CTRL_SHIFT_OFFSET);
    }

    private java.util.List<Integer> convertMouseButtonsState(Int16 nButton) {
        int state = (int) nButton.getValue();
        java.util.List<Integer> buttons = new LinkedList<Integer>();
        if ((state & BUTTON1_MASK) == BUTTON1_MASK) buttons.add(MouseEvent.BUTTON1);
        if ((state & BUTTON2_MASK) == BUTTON2_MASK) buttons.add(MouseEvent.BUTTON2);
        if ((state & BUTTON3_MASK) == BUTTON3_MASK) buttons.add(MouseEvent.BUTTON3);
        return buttons;
    }

    private static PlayState getPlayState(int state) {
        PlayState[] values = PlayState.values();
        for (int i = 0; i < values.length; i++) {
            PlayState value = values[i];
            if (value.getState() == state)
                return value;
        }
        throw new IllegalArgumentException("Passed state is not a valid play state");
    }

    public void positionChange(DoubleFloat oldPosition, DoubleFloat newPosition) {
        propertyChangeSupport.firePropertyChange(PROPERTY_POSITION,
                oldPosition.getValue(), newPosition.getValue());


    }

    public void playStateChange(Int32 state) {
        propertyChangeSupport.firePropertyChange(PROPERTY_PLAY_STATE,
                getPlayState(0), getPlayState((int) state.getValue()));


    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void openStateChange(Int32 newState) {
        propertyChangeSupport.firePropertyChange(PROPERTY_OPEN_STATE, 0, (int) newState.getValue());
    }

    public void setSource(WMPlayerComponent wmPlayerComponent) {
        this.source = wmPlayerComponent;
        Point location = source.getLocation();
        sourceLocation.x = location.x;
        sourceLocation.y = location.y;
        source.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                Point newLocation = e.getComponent().getLocation();
                sourceLocation.x = newLocation.x;
                sourceLocation.y = newLocation.y;
            }
        });
    }
}
