package teamdev.wmplayer;

/**
 * An abstract adapter class for receiving player events. The methods in this class are empty.
 */
public class PlayerAdapter implements PlayerListener {


    @Override
    public void playerStopped(PlayerEvent event) {

    }

    @Override
    public void playerPaused(PlayerEvent event) {

    }

    @Override
    public void playerStarted(PlayerEvent event) {

    }

    @Override
    public void playingPositionChanged(PlayingPositionEvent event) {

    }
}
