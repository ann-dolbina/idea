package teamdev.wmplayer.tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.PlayerAdapter;
import teamdev.wmplayer.PlayerListener;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ListenersTest {
    private JFrame frame;
    private WMPlayerComponent wmPlayerComponent;

    @Before
    public void prepareFrameWithComponent() {
        frame = new JFrame();
        wmPlayerComponent = new WMPlayerComponent();
        frame.getContentPane().add(wmPlayerComponent);
        try {
            wmPlayerComponent.open(new File("Wildlife.wmv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

    @Test
    public void addingTheSamePlayStateChangeListenerToTheComponentTwice() {
        PlayerListener listener = new PlayerAdapter();
        wmPlayerComponent.addPlayerListener(listener);
        try {
            wmPlayerComponent.addPlayerListener(listener);
            Assert.fail("No exception thrown when adding the same PlayStateChangeListener to the component twice");
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    public void removingTheSamePlayStateChangeListenerFromTheComponentTwice() {
        PlayerListener listener = new PlayerAdapter();
        wmPlayerComponent.addPlayerListener(listener);
        wmPlayerComponent.removePlayerListener(listener);
        try {
            wmPlayerComponent.removePlayerListener(listener);
            Assert.fail("No exception thrown when removing the same PlayStateChangeListener to the component twice");
        } catch (IllegalArgumentException exception) {

        }
    }


    @After
    public void performCleanup() {
        wmPlayerComponent.destroy();
        frame.dispose();
    }

}
