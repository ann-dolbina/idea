package teamdev.wmplayer;

/**
 * A listener interface for receiving notification of events on <code>WMPlayerComponent</code>.
 */
public interface PlayerListener {

    /**
     * Invoked when player stopped playing media.
     *
     * @param event the event object describing play state change.
     */
    public void playerStopped(PlayerEvent event);

    /**
     * Invoked when player paused.
     *
     * @param event the event object describing play state change.
     */
    public void playerPaused(PlayerEvent event);

    /**
     * Invoked when player started playing media.
     *
     * @param event the event object describing play state change.
     */
    public void playerStarted(PlayerEvent event);

    /**
     * Invoked when the position in media playing in {@link WMPlayerComponent} has changed.
     *
     * @param event the event object describing position state change
     */
    public void playingPositionChanged(PlayingPositionEvent event);
}
