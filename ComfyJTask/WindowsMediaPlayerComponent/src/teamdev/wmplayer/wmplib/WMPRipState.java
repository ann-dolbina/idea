package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPRipState.
 */
public class WMPRipState extends ComEnumeration {
    public static final int wmprsUnknown = 0;
    public static final int wmprsRipping = 1;
    public static final int wmprsStopped = 2;

    public WMPRipState() {
    }

    public WMPRipState(long val) {
        super(val);
    }

    public WMPRipState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPRipState(this);
    }
}