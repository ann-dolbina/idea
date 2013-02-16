package teamdev.wmplayer.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import teamdev.wmplayer.*;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayerEventsTest {
    private javax.swing.JFrame frame;
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
    public void receivingPlayerEventWhenStartedPlaying() {
        final PlayState[] states = {null};
        PlayerListener listener = new PlayerAdapter() {

            @Override
            public void playerStarted(PlayerEvent event) {
                states[0] = event.getPlayState();
            }

        };
        wmPlayerComponent.pause();
        wmPlayerComponent.addPlayerListener(listener);
        wmPlayerComponent.play();
        assertNotNull("No events were received", states[0]);
        assertEquals("The received event is not the expected event", PlayState.PLAYING, states[0]);
    }

    @Test
    public void receivingPlayerEventWhenPaused() {
        final PlayState[] states = {null};
        PlayerListener listener = new PlayerAdapter() {

            @Override
            public void playerPaused(PlayerEvent event) {
                states[0] = event.getPlayState();
            }

        };
        wmPlayerComponent.play();
        wmPlayerComponent.addPlayerListener(listener);
        wmPlayerComponent.pause();

        assertNotNull("No events were received", states[0]);
        assertEquals("Received event is not the expected event", PlayState.PAUSED, states[0]);

    }

    @Test
    public void receivingPlayerEventWhenStopped() {
        final PlayState[] states = {null};
        PlayerListener listener = new PlayerAdapter() {

            @Override
            public void playerStopped(PlayerEvent event) {
                states[0] = event.getPlayState();
            }

        };
        wmPlayerComponent.play();
        wmPlayerComponent.addPlayerListener(listener);

        wmPlayerComponent.stop();

        assertNotNull("No events were received", states[0]);
        assertEquals("Received event is not the expected event", PlayState.STOPPED, states[0]);
    }

    @Test
    public void receivingPlayerEventWhenPlayingPositionChanged() {
        final Double[] positions = {null};
        PlayerListener listener = new PlayerAdapter() {
            @Override
            public void playingPositionChanged(PlayingPositionEvent event) {
                positions[0] = event.getNewPosition();
            }

        };
        wmPlayerComponent.play();
        wmPlayerComponent.addPlayerListener(listener);
        double duration = wmPlayerComponent.getMediaDuration();
        double newPosition = duration / 2;
        wmPlayerComponent.setCurrentPosition(newPosition);

        assertNotNull("No events were received", positions[0]);
        assertEquals("Received position is not the expected position", new Double(newPosition), positions[0]);
    }

    @After
    public void performCleanup() {
        wmPlayerComponent.destroy();
        frame.dispose();
    }
}
