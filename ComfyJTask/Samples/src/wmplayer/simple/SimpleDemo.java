package wmplayer.simple;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: anna.dolbina
 * Date: 14.02.13
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 */
public class SimpleDemo {

    public static void main(String[] args){
        final java.util.Deque<WMPlayerSimpleComponent> players=new LinkedList<WMPlayerSimpleComponent>();
        final JTabbedPane component=new JTabbedPane();
        final JFrame frame=new JFrame("Test");
        frame.setSize(new Dimension(640,480));
        final Container contentPane=frame.getContentPane();
        contentPane.setLayout(new GridLayout(1, 3, 5, 5));
        //contentPane.setLayout(new BorderLayout());
        //contentPane.add(component,BorderLayout.CENTER);

        frame.setVisible(true);

        try {
            Thread.sleep(1000);
            for (int i=0;i<3;i++){
                WMPlayerSimpleComponent player=new WMPlayerSimpleComponent();
                player.setName("Player "+players.size());
                players.add(player);
                component.addTab(player.getName(), player);
                contentPane.add(player);
                contentPane.revalidate();
                Thread.sleep(1000);
            }
            while(!players.isEmpty()){
                WMPlayerSimpleComponent player =players.removeFirst();
                contentPane.remove(player);
                component.remove(player);
                player.destroy();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        frame.dispose();
        System.exit(0);
    }
}
