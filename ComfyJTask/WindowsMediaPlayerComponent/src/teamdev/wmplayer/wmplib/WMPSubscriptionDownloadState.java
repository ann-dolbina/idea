package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPSubscriptionDownloadState.
 */
public class WMPSubscriptionDownloadState extends ComEnumeration {
    public static final int wmpsdlsDownloading = 0;
    public static final int wmpsdlsPaused = 1;
    public static final int wmpsdlsProcessing = 2;
    public static final int wmpsdlsCompleted = 3;
    public static final int wmpsdlsCancelled = 4;

    public WMPSubscriptionDownloadState() {
    }

    public WMPSubscriptionDownloadState(long val) {
        super(val);
    }

    public WMPSubscriptionDownloadState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPSubscriptionDownloadState(this);
    }
}