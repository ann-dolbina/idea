import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 *
 */
public class WMPlayerDemoFrame extends JFrame {

    private final JTabbedPane tabbedPane = new JTabbedPane();
    public WMPlayerDemoFrame() {
        super("Windows Media Player integration demo");
        init();
    }
    /*
     * Setups the demo frame.
     */
    private void init() {
        setSize(640, 480);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(tabbedPane,BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setupMenuBar();

    }
    /*
     * Setups the menu bar
     */
    private void setupMenuBar() {
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open...");
        JMenuItem exitItem = new JMenuItem("Exit");

        menu.add(openItem);
        menu.addSeparator();
        menu.add(exitItem);

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser(".");
                chooser.setMultiSelectionEnabled(false);

                if (chooser.showOpenDialog(WMPlayerDemoFrame.this) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    if (file != null) {
                        openFile(file);
                    }
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = tabbedPane.getTabCount();
                for (int i = 0; i < count; i++) {
                    WMPlayerComponent component = (WMPlayerComponent) tabbedPane.getComponentAt(i);

                    component.destroy();
                }
                System.exit(0);
            }
        });

        menuBar.add(menu);

        setJMenuBar(menuBar);
    }
    /*
     * Opens the specified file in a new tab of the tabbed pane
     */
    private void openFile(File file) {
        WMPlayerComponent newPlayer = new WMPlayerComponent();
        newPlayer.setSize(320, 240);
        try {
            newPlayer.open(file);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Cannot open file", JOptionPane.ERROR_MESSAGE);
            newPlayer.destroy();
            return;
        }
        newPlayer.setName("Player " + tabbedPane.getTabCount());

        newPlayer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked on " + e.getComponent().getName());
            }
        });
        TabRenderer tabRenderer = new TabRenderer(file.getName(), tabbedPane);
        tabbedPane.addTab(file.getName(), newPlayer);
        tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(newPlayer), tabRenderer);

    }
}
