package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPDeviceStatus.
 */
public class WMPDeviceStatus extends ComEnumeration {
    public static final int wmpdsUnknown = 0;
    public static final int wmpdsPartnershipExists = 1;
    public static final int wmpdsPartnershipDeclined = 2;
    public static final int wmpdsPartnershipAnother = 3;
    public static final int wmpdsManualDevice = 4;
    public static final int wmpdsNewDevice = 5;
    public static final int wmpdsLast = 6;

    public WMPDeviceStatus() {
    }

    public WMPDeviceStatus(long val) {
        super(val);
    }

    public WMPDeviceStatus(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPDeviceStatus(this);
    }
}