package teamdev.wmplayer.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.PlayState;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class PlayStateTest {
    private JFrame frame;
    private WMPlayerComponent wmPlayerComponent;

    @Before
    public void prepareFrameWithComponent() {
        frame = new JFrame();
        wmPlayerComponent = new WMPlayerComponent();
        frame.getContentPane().add(wmPlayerComponent);
        frame.setVisible(true);
    }

    @Test
    public void changeStateWhenFileOpened() {
        try {
            wmPlayerComponent.open(new File("Wildlife.wmv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals("The player state after opening the file is not the expected state.", PlayState.PLAYING, wmPlayerComponent.getPlayState());
    }

    @Test
    public void changeStateWhenStartedPlaying() {
        try {
            wmPlayerComponent.open(new File("Wildlife.wmv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        wmPlayerComponent.play();
        assertEquals("The player state after pausing is not the expected state.", PlayState.PLAYING, wmPlayerComponent.getPlayState());
    }

    @Test
    public void changeStateWhenPaused() {
        try {
            wmPlayerComponent.open(new File("Wildlife.wmv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        wmPlayerComponent.pause();
        assertEquals("The player state after pausing is not the expected state.", PlayState.PAUSED, wmPlayerComponent.getPlayState());
    }

    @Test
    public void changeStateWhenStopped() {
        try {
            wmPlayerComponent.open(new File("Wildlife.wmv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        wmPlayerComponent.stop();
        assertEquals("The player state after stopping is not the expected state.", PlayState.STOPPED, wmPlayerComponent.getPlayState());
    }

    @After
    public void performCleanup() {
        wmPlayerComponent.destroy();
    }
}
