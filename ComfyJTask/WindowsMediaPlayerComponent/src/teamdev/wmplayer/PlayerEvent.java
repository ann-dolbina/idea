package teamdev.wmplayer;

import java.util.EventObject;

/**
 * An event which is generated when the Windows Media Player play state is changed.
 *
 * @author Anna Dolbina
 */
public class PlayerEvent extends EventObject {

    private final PlayState playState;

    /**
     * Constructs and initializes an instance of PlayerEvent.
     *
     * @param source The object on which the event initially occurred.
     * @param state  The new play state of the Windows Media Player
     */
    public PlayerEvent(Object source, PlayState state) {
        super(source);
        this.playState = state;
    }

    /**
     * Returns the play state of the Windows Media Player.
     *
     * @return the play state of the Windows Media Player.
     */

    public PlayState getPlayState() {
        return playState;
    }
}
