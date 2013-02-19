package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPSyncState.
 */
public class WMPSyncState extends ComEnumeration {
    public static final int wmpssUnknown = 0;
    public static final int wmpssSynchronizing = 1;
    public static final int wmpssStopped = 2;
    public static final int wmpssEstimating = 3;
    public static final int wmpssLast = 4;

    public WMPSyncState() {
    }

    public WMPSyncState(long val) {
        super(val);
    }

    public WMPSyncState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPSyncState(this);
    }
}