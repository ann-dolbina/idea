package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPBurnFormat.
 */
public class WMPBurnFormat extends ComEnumeration {
    public static final int wmpbfAudioCD = 0;
    public static final int wmpbfDataCD = 1;

    public WMPBurnFormat() {
    }

    public WMPBurnFormat(long val) {
        super(val);
    }

    public WMPBurnFormat(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPBurnFormat(this);
    }
}