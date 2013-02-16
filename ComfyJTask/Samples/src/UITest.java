import com.jniwrapper.win32.hook.*;
import com.jniwrapper.win32.ui.Wnd;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.LinkedList;


public class UITest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final WMPlayerComponent wmPlayerComponent = new WMPlayerComponent();

        frame.setBounds(0, 0, 320, 240);
        frame.getContentPane().setLayout(new BorderLayout());

        frame.getContentPane().add(wmPlayerComponent);


        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                wmPlayerComponent.destroy();
                Hook.CALLWNDPROC.uninstall();
            }
        });

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        wmPlayerComponent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.isControlDown()) System.out.println("Ctrl is down");
                if (e.isShiftDown()) System.out.println("Shift is down");
                if (e.isAltDown()) System.out.println("Alt is down");
            }
        });

        java.util.List<Wnd> windows = retrieveAllChildWindowsOfClass(new Wnd(wmPlayerComponent), "ATL");
        if (windows.isEmpty()) throw new RuntimeException("Player window not found");
        Wnd playerWnd = windows.get(0);
        Hook.CALLWNDPROC.addListener(new HookEventListener() {
            @Override
            public void onHookEvent(HookEventObject hookEventObject) {
                CallWndProcEvent event=(CallWndProcEvent)hookEventObject;
                System.out.println("Message: "+event.getMessage());
                System.out.println("LParam:"+event.getLParam());
                System.out.println("WParam:"+event.getWParam()+"\n");
            }
        });
        EventsFilter filter = new EventsFilter();
        filter.setAllowAllEvents(true);
        filter.addWindow(playerWnd,true);
        Hook.CALLWNDPROC.install();
        Hook.CALLWNDPROC.setFilter(filter);

    }
    private  static java.util.List<Wnd> retrieveAllChildWindowsOfClass(Wnd parent, String classNamePart) {
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
