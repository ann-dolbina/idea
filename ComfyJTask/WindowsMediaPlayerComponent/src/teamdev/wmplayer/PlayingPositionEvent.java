package teamdev.wmplayer;

import java.util.EventObject;

/**
 * An event which is generated when the position in a file playing in Windows Media Player has changed.
 *
 * @author Anna Dolbina
 */
public class PlayingPositionEvent extends EventObject {
    private final double oldPosition;
    private final double newPosition;

    /**
     * Constructs and initializes an instance of PlayingPositionEvent.
     *
     * @param source      The object on which the event initially occurred.
     * @param oldPosition The previous position of the playing file.
     * @param newPosition The current position of the playing file.
     * @throws IllegalArgumentException if source is null.
     */
    public PlayingPositionEvent(Object source, double oldPosition, double newPosition) {
        super(source);
        this.oldPosition = oldPosition;
        this.newPosition = newPosition;
    }

    /**
     * Returns the previous position in the playing file, in seconds.
     *
     * @return The previous position of the playing file.
     */
    public double getOldPosition() {
        return oldPosition;
    }

    /**
     * Returns the current position in the playing file, in seconds.
     *
     * @return The current position of the playing file.
     */
    public double getNewPosition() {
        return newPosition;
    }
}
