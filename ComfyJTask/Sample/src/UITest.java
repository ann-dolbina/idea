import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


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
    }

}
