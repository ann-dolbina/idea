package teamdev.wmplayer.tests;

import com.jniwrapper.win32.Rect;
import com.jniwrapper.win32.ui.Wnd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.Assert.assertTrue;

public class SwingUITest {
    public static final int X = 10;
    public static final int Y = 10;
    public static final int WIDTH = 320;
    public static final int HEIGHT = 240;
    public static final String TITLE = "Testing WMPlayer";
    private JFrame frame;
    private JInternalFrame internalFrame;
    private JPanel panel;
    private WMPlayerComponent wmPlayer, wmPlayer1;
    private JDesktopPane desktop;

    @Before
    public void prepareSwingContainersAndComponent() {
        frame = new JFrame(TITLE);
        internalFrame = new JInternalFrame();
        panel = new JPanel();
        desktop = new JDesktopPane();
        desktop.setLayout(new BorderLayout());
        wmPlayer = new WMPlayerComponent();
        wmPlayer1 = new WMPlayerComponent();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createDashedBorder(new Color(128, 128, 0)));
        frame.setContentPane(desktop);
        internalFrame.setBounds(X, Y, WIDTH - 25, HEIGHT - 25);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(X, Y, WIDTH, HEIGHT);
        frame.setVisible(true);
        internalFrame.setVisible(true);
    }

    @Test
    public void componentVisibleInJFrame() {
        frame.getContentPane().add(wmPlayer, BorderLayout.CENTER);
        assertTrue("Found ATL windows' sizes do not match player components' sizes", examineCreatedWindows());
    }

    @Test
    public void componentVisibleInJPanel() {
        panel.add(wmPlayer, BorderLayout.CENTER);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        assertTrue("Found ATL windows' sizes do not match player components' sizes", examineCreatedWindows());
    }

    @Test
    public void componentVisibleInJInternalFrame() {
        internalFrame.getContentPane().add(wmPlayer);
        frame.getContentPane().add(internalFrame);
        assertTrue("Found ATL windows' sizes do not match player components' sizes", examineCreatedWindows());

    }

    @Test
    public void twoPlayerComponentsInJPanel() {
        panel.setLayout(new GridLayout(1, 2));
        panel.add(wmPlayer);
        panel.add(wmPlayer1);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        assertTrue("Found ATL windows' sizes do not match player components' sizes", examineCreatedWindows());
    }

    @After
    public void performCleanup() {
        wmPlayer.destroy();
        wmPlayer1.destroy();
        frame.dispose();
    }

    private boolean examineCreatedWindows() {
        boolean result = true;
        java.util.List<Wnd> canvasWindows = retrieveAllChildWindowsOfClass(new Wnd(frame), "SunAwtCanvas");
        if (canvasWindows.isEmpty()) throw new RuntimeException("No canvas found in frame");
        for (Iterator<Wnd> iterator = canvasWindows.iterator(); iterator.hasNext(); ) {
            Wnd canvas = iterator.next();
            result = result && checkCanvas(canvas);
        }
        return result;
    }

    private boolean checkCanvas(Wnd canvas) {
        boolean result = true;
        java.util.List<Wnd> childWindows = retrieveAllChildWindowsOfClass(canvas, "SunAwtWindow");
        if (childWindows.isEmpty())
            throw new RuntimeException("Canvas window " + canvas.toString() + " has no child windows of class SunAwtWindow");
        for (java.util.Iterator<Wnd> iterator = childWindows.iterator(); iterator.hasNext(); ) {
            Wnd child = iterator.next();
            java.util.List<Wnd> atlWindows = retrieveAllChildWindowsOfClass(child, "ATL");
            if (atlWindows.isEmpty())
                throw new RuntimeException("SunAwtWindow " + child + " has no child windows of class ATL");
            for (Iterator<Wnd> wndIterator = atlWindows.iterator(); wndIterator.hasNext(); ) {
                Rect atlWindowBounds = wndIterator.next().getBounds();
                Dimension atlWindowSize = new Dimension(atlWindowBounds.getWidth(), atlWindowBounds.getHeight());
                result = result && (atlWindowSize.equals(wmPlayer.getSize()) || atlWindowSize.equals(wmPlayer1.getSize()));
            }
        }
        return result;
    }

    private java.util.List<Wnd> retrieveAllChildWindowsOfClass(Wnd parent, String classNamePart) {
        java.util.List<Wnd> frameWndChildWindows = parent.getChildWindows();
        java.util.List<Wnd> foundWindows = new LinkedList<Wnd>();
        for (Iterator<Wnd> iterator = frameWndChildWindows.iterator(); iterator.hasNext(); ) {
            Wnd child = iterator.next();
            if (child.getWindowClassName().contains(classNamePart)) {
                foundWindows.add(child);
            }
        }
        return foundWindows;
    }

}
