package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPFolderScanState.
 */
public class WMPFolderScanState extends ComEnumeration {
    public static final int wmpfssUnknown = 0;
    public static final int wmpfssScanning = 1;
    public static final int wmpfssUpdating = 2;
    public static final int wmpfssStopped = 3;

    public WMPFolderScanState() {
    }

    public WMPFolderScanState(long val) {
        super(val);
    }

    public WMPFolderScanState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPFolderScanState(this);
    }
}