package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPBurnState.
 */
public class WMPBurnState extends ComEnumeration {
    public static final int wmpbsUnknown = 0;
    public static final int wmpbsBusy = 1;
    public static final int wmpbsReady = 2;
    public static final int wmpbsWaitingForDisc = 3;
    public static final int wmpbsRefreshStatusPending = 4;
    public static final int wmpbsPreparingToBurn = 5;
    public static final int wmpbsBurning = 6;
    public static final int wmpbsStopped = 7;
    public static final int wmpbsErasing = 8;
    public static final int wmpbsDownloading = 9;

    public WMPBurnState() {
    }

    public WMPBurnState(long val) {
        super(val);
    }

    public WMPBurnState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPBurnState(this);
    }
}