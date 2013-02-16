package teamdev.wmplayer.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.UnsupportedFileTypeException;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.fail;

public class PlayingPositionTest {
    private JFrame frame;
    private WMPlayerComponent wmPlayerComponent;

    @Before
    public void prepareFrameWithComponent() {

        frame = new JFrame();
        wmPlayerComponent = new WMPlayerComponent();
        frame.getContentPane().add(wmPlayerComponent);
        frame.setVisible(true);

        try {
            wmPlayerComponent.open(new File("Wildlife.wmv"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedFileTypeException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void settingNegativePlayingPosition() {
        try {
            wmPlayerComponent.setCurrentPosition(-1);
            fail("Exception wasn't thrown when playing position was set to negative");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void settingPlayingPositionThatIsGreaterThanMediaDuration() {
        double duration = wmPlayerComponent.getMediaDuration();
        try {
            wmPlayerComponent.setCurrentPosition(duration + 1);
            fail("Exception wasn't thrown when playing position was set to greater than media duration");
        } catch (IllegalArgumentException e) {

        }
    }

    @After
    public void performCleanup() {
        wmPlayerComponent.destroy();
        frame.dispose();
    }
}
