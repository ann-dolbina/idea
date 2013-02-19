import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A tab renderer for the tab of JTabbedPane. Contains title and a close button for this tab.
 */
class TabRenderer extends JPanel {
    private final JTabbedPane pane;

    public TabRenderer(String title, final JTabbedPane pane) {
        super(new FlowLayout(FlowLayout.LEFT, 5, 2));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;
        setOpaque(false);
        JLabel label = new JLabel(title);
        add(label);

        JButton button = new TabButton();
        add(button);
    }

    private class TabButton extends JButton {
        public TabButton() {
            int size = 17;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Close this tab");
            //Make the button looks the same for all Laf's
            setUI(new BasicButtonUI());
            //Make it transparent
            setContentAreaFilled(false);
            //No need to be focusable
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            //Close the proper tab by clicking the button
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = pane.indexOfTabComponent(TabRenderer.this);
                    if (i != -1) {
                        WMPlayerComponent comp = (WMPlayerComponent) pane.getComponentAt(i);
                        System.out.println("Destroying tab " + i + ": fetched " + comp.getName());
                        comp.destroy();
                        pane.removeTabAt(i);
                    }
                }

            });
        }

        //paint the cross
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            //shift the image for pressed buttons
            if (this.getModel().isPressed()) {
                g2.translate(1, 1);
            }
            g2.setStroke(new BasicStroke(2));
            g2.setColor(Color.BLACK);
            int delta = 6;
            g2.drawLine(delta, delta, this.getWidth() - delta - 1, this.getHeight() - delta - 1);
            g2.drawLine(this.getWidth() - delta - 1, delta, delta, this.getHeight() - delta - 1);
            g2.dispose();
        }

    }

}
