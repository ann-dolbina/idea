package teamdev.wmplayer.tests;

import com.jniwrapper.UInt32;
import com.jniwrapper.win32.Msg;
import com.jniwrapper.win32.ui.Wnd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MouseEventsTest {
    private static final Rectangle BOUNDS = new Rectangle(10, 10, 320, 240);
    public static final int X = 100;
    public static final int Y = 100;
    private static final int TIMEOUT = 200;
    private static final int WORD_LENGTH = 16;
    private static final int MK_LBUTTON = 0x0001;
    private static final int MK_MBUTTON = 0x0010;
    private static final int MK_RBUTTON = 0x0002;
    private static final int MK_CONTROL = 0x0008;
    private static final int MK_SHIFT = 0x0004;
    private static final long VK_MENU = 0x12;
    private static final int VK_ESCAPE = 27;
    private static final int VK_CONTROL = 0x00000011;
    private static final int VK_SHIFT = 0x00000010;
    private static final int HTCLIENT = 1;
    private JFrame frame;
    private WMPlayerComponent wmPlayerComponent;
    private Wnd playerWnd;

    @Before
    public void prepareFrameWithComponent() {
        frame = new JFrame();
        wmPlayerComponent = new WMPlayerComponent();
        frame.getContentPane().add(wmPlayerComponent);
        frame.setBounds(BOUNDS);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        java.util.List<Wnd> windows = retrieveAllChildWindowsOfClass(new Wnd(wmPlayerComponent), "ATL");
        if (windows.isEmpty()) throw new RuntimeException("Player window not found");
        playerWnd = windows.get(0);
       /* try {
            Thread.sleep(15000);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }*/

    }

    @Test
    public void oneLeftClickOnComponent() {
        final AtomicInteger received = new AtomicInteger(0);

        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                received.set(e.getButton());
                synchronized (frame) {
                    frame.notifyAll();
                }

            }
        });
        sendLeftButtonMouseClickToComponent();
        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertEquals("Received mouse button number is not a number of left button", MouseEvent.BUTTON1, received.get());
    }

    @Test
    public void oneMiddleButtonClickOnComponent() {
        final AtomicInteger received = new AtomicInteger(0);

        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                received.set(e.getButton());
                synchronized (frame) {
                    frame.notifyAll();
                }
            }
        });
        sendMiddleButtonMouseClickToComponent();
        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertEquals("Received mouse button number is not a number of middle button", MouseEvent.BUTTON2, received.get());
    }

    @Test
    public void oneRightClickOnComponent() {
        final AtomicInteger received = new AtomicInteger(0);

        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int button = e.getButton();
                received.set(e.getButton());
                if (button == 3) {
                    synchronized (frame) {
                        frame.notifyAll();
                    }
                }

            }
        });
        sendRightButtonMouseClickToComponent();
        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertEquals("Received mouse button number is not a number of right button", MouseEvent.BUTTON3, received.get());

    }

    @Test
    public void doubleLeftClickOnComponent() {
        final AtomicInteger counter = new AtomicInteger(0);
        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clicks = e.getClickCount();
                counter.set(e.getClickCount());
                if (clicks == 2) {
                    synchronized (frame) {
                        frame.notifyAll();
                    }
                }

            }
        });
        sendLeftButtonMouseDoubleClickToComponent();
        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertEquals("A double-click wasn't received", 2, counter.get());
    }

    @Test
    public void mouseMoveOnComponent() {
        final AtomicBoolean received = new AtomicBoolean(false);

        wmPlayerComponent.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                received.set(true);
                synchronized (frame) {
                    frame.notifyAll();
                }
            }
        });
        moveMouseOnComponent();
        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertTrue("Mouse move event was not received", received.get());
    }

    @Test
    public void ctrlClickOnComponent() {
        final AtomicBoolean receivedKey = new AtomicBoolean(false);

        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.isControlDown()) {
                    receivedKey.set(true);
                    synchronized (frame) {
                        frame.notifyAll();
                    }
                }

            }
        });
        sendCtrlLeftClickToComponent();

        synchronized (frame) {
            try {
                frame.wait(TIMEOUT*4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertTrue("Ctrl key wasn't received", receivedKey.get());
    }

    @Test
    public void altClickOnComponent() {
        final AtomicBoolean receivedKey = new AtomicBoolean(false);

        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                receivedKey.set(e.isAltDown());
                synchronized (frame) {
                    frame.notifyAll();
                }

            }
        });
        sendAltLeftClickToComponent();

        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertTrue("Alt key wasn't received", receivedKey.get());
    }

    @Test
    public void shiftClickOnComponent() {
        final AtomicBoolean receivedKey = new AtomicBoolean(false);

        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                receivedKey.set(e.isShiftDown());
                synchronized (frame) {
                    frame.notifyAll();
                }

            }
        });
        sendShiftLeftClickToComponent();


        synchronized (frame) {
            try {
                frame.wait(TIMEOUT);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        assertTrue("Shift key wasn't received", receivedKey.get());
    }

    @After
    public void performCleanup() {
        wmPlayerComponent.destroy();
        frame.dispose();
    }

    private void sendLeftButtonMouseClickToComponent() {
        playerWnd.sendMessage(Msg.WM_LBUTTONDOWN, new UInt32(MK_LBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_LBUTTONUP, new UInt32(0), new UInt32(makeMousePositionLParam(X, Y)));
    }

    private void sendMiddleButtonMouseClickToComponent() {
        playerWnd.sendMessage(Msg.WM_MBUTTONDOWN, new UInt32(MK_MBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_MBUTTONUP, new UInt32(0), new UInt32(makeMousePositionLParam(X, Y)));
    }

    private void sendRightButtonMouseClickToComponent() {
        playerWnd.sendMessage(Msg.WM_RBUTTONDOWN, new UInt32(MK_RBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_RBUTTONUP, new UInt32(0), new UInt32(makeMousePositionLParam(X, Y)));
        /*long res=Function.call("user32", "keybd_event",null,new UInt8((short)VK_ESCAPE),new UInt8((short)0x1),new UInt32(0),new Int(0));
        System.out.println(new LastErrorException(res).getMessage());
        res=Function.call("user32", "keybd_event",null,new UInt8((short)VK_ESCAPE),new UInt8((short)0x1),new UInt32(2),new Int(0));
        System.out.println(new LastErrorException(res).getMessage());*/
    }

    private void sendLeftButtonMouseDoubleClickToComponent() {
        playerWnd.sendMessage(Msg.WM_LBUTTONDOWN, new UInt32(MK_LBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_LBUTTONUP, new UInt32(0), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_LBUTTONDBLCLK, new UInt32(MK_LBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_LBUTTONUP, new UInt32(0), new UInt32(makeMousePositionLParam(X, Y)));
    }

    private void moveMouseOnComponent() {
        playerWnd.sendMessage(Msg.WM_MOUSEMOVE, new UInt32(0), new UInt32(makeMousePositionLParam(X - 10, Y)));
    }

    private void sendCtrlLeftClickToComponent() {
        Wnd playerParentWnd=new Wnd(frame);
        try {
            playerWnd.postMessage(Msg.WM_KEYDOWN, VK_CONTROL, 0x001D0001);
            Thread.sleep(TIMEOUT);
            playerWnd.sendMessage(Msg.WM_MOUSEACTIVATE, playerParentWnd, new UInt32((Msg.WM_LBUTTONDOWN << 16) | HTCLIENT));
            playerWnd.sendMessage(Msg.WM_SETCURSOR, playerWnd, new UInt32((Msg.WM_LBUTTONDOWN << 16) | HTCLIENT));
            playerWnd.postMessage(Msg.WM_LBUTTONDOWN, MK_CONTROL | MK_LBUTTON, makeMousePositionLParam(X, Y));
            Thread.sleep(TIMEOUT);
            playerWnd.sendMessage(Msg.WM_SETCURSOR, playerWnd, new UInt32((Msg.WM_MOUSEMOVE << 16) | HTCLIENT));
            playerWnd.postMessage(Msg.WM_MOUSEMOVE, MK_CONTROL | MK_LBUTTON, makeMousePositionLParam(X, Y));
            Thread.sleep(TIMEOUT);
            playerWnd.sendMessage(Msg.WM_SETCURSOR, playerWnd, new UInt32((Msg.WM_LBUTTONUP << 16) | HTCLIENT));
            playerWnd.postMessage(Msg.WM_LBUTTONUP, MK_CONTROL, makeMousePositionLParam(X, Y));
            playerWnd.postMessage(Msg.WM_KEYUP, VK_CONTROL, 0xC01D0001);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private void sendAltLeftClickToComponent() {
        //long res=Function.call("user32", "keybd_event",null,new UInt8((short)VK_MENU),new UInt8((short)0x38),new UInt32(0),new Int(0));
        playerWnd.sendMessage(Msg.WM_SYSKEYDOWN, new UInt32(VK_MENU), new UInt32(0x60380001));
        playerWnd.sendMessage(Msg.WM_LBUTTONDOWN, new UInt32(MK_LBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_LBUTTONUP, new UInt32(0), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.sendMessage(Msg.WM_KEYUP, new UInt32(VK_MENU), new UInt32(0xC0380001));
        //res=Function.call("user32", "keybd_event",null,new UInt8((short)VK_MENU),new UInt8((short)0x38),new UInt32(2),new Int(0));
    }

    private void sendShiftLeftClickToComponent() {
        //long res=Function.call("user32", "keybd_event",null,new UInt8((short)VK_SHIFT),new UInt8((short)0x2A),new UInt32(0),new Int(0));
        //playerWnd.sendMessage(Msg.WM_KEYDOWN, new UInt32(VK_SHIFT), new UInt32(0x402A0001));
        playerWnd.postMessage(Msg.WM_KEYDOWN, VK_SHIFT, 0x402A0001);
        //playerWnd.sendMessage(Msg.WM_LBUTTONDOWN, new UInt32(MK_SHIFT | MK_LBUTTON), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.postMessage(Msg.WM_LBUTTONDOWN, MK_SHIFT | MK_LBUTTON, makeMousePositionLParam(X, Y));
        //playerWnd.sendMessage(Msg.WM_LBUTTONUP, new UInt32(MK_SHIFT), new UInt32(makeMousePositionLParam(X, Y)));
        playerWnd.postMessage(Msg.WM_LBUTTONUP, MK_SHIFT, makeMousePositionLParam(X, Y));
        //playerWnd.sendMessage(Msg.WM_KEYUP, new UInt32(VK_SHIFT), new UInt32(0xC02A0001));
        playerWnd.postMessage(Msg.WM_KEYUP, VK_SHIFT, 0xC02A0001);
        //res=Function.call("user32", "keybd_event",null,new UInt8((short)VK_SHIFT),new UInt8((short)0x2A),new UInt32(2),new Int(0));
    }

    private long makeMousePositionLParam(int x, int y) {
        return (y << WORD_LENGTH) | x;
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
