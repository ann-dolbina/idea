package teamdev.wmplayer.tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.UnsupportedFileTypeException;
import teamdev.wmplayer.WMPlayerComponent;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FileOpeningTest {
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
    public void openNonExistingFile() {
        try {
            wmPlayerComponent.open(new File("notexistingfile.avi"));
            Assert.fail("Exception wasn't thrown when trying to open file which doesn't exist");
        } catch (FileNotFoundException exception) {

        }

    }

    @Test
    public void openNotSupportedFile() {
        try {
            wmPlayerComponent.open(new File("textfile.txt"));
            Assert.fail("Exception wasn't thrown when trying to open file which is not supported");
        } catch (UnsupportedFileTypeException exception) {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void performCleanup() {
        if (wmPlayerComponent != null) {
            wmPlayerComponent.destroy();

        }
        frame.dispose();
    }
}
