package teamdev.wmplayer;


/**
 * Class describing possible play states of Windows Media Player.
 */

public enum PlayState {
    UNDEFINED(0),
    STOPPED(1),
    PAUSED(2),
    PLAYING(3),
    SCAN_FORWARD(4),
    SCAN_REVERSE(5),
    BUFFERING(6),
    WAITING(7),
    MEDIA_ENDED(8),
    TRANSITIONING(9),
    READY(10),
    RECONNECTING(11);

    private final int state;

    private PlayState(int state) {
        this.state = state;
    }

    /**
     * Returns the play state.
     *
     * @return the state value.
     */
    public int getState() {
        return state;
    }

}
