package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPPlayState.
 */
public class WMPPlayState extends ComEnumeration {
    public static final int wmppsUndefined = 0;
    public static final int wmppsStopped = 1;
    public static final int wmppsPaused = 2;
    public static final int wmppsPlaying = 3;
    public static final int wmppsScanForward = 4;
    public static final int wmppsScanReverse = 5;
    public static final int wmppsBuffering = 6;
    public static final int wmppsWaiting = 7;
    public static final int wmppsMediaEnded = 8;
    public static final int wmppsTransitioning = 9;
    public static final int wmppsReady = 10;
    public static final int wmppsReconnecting = 11;
    public static final int wmppsLast = 12;

    public WMPPlayState() {
    }

    public WMPPlayState(long val) {
        super(val);
    }

    public WMPPlayState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPPlayState(this);
    }
}