package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPLibraryType.
 */
public class WMPLibraryType extends ComEnumeration {
    public static final int wmpltUnknown = 0;
    public static final int wmpltAll = 1;
    public static final int wmpltLocal = 2;
    public static final int wmpltRemote = 3;
    public static final int wmpltDisc = 4;
    public static final int wmpltPortableDevice = 5;

    public WMPLibraryType() {
    }

    public WMPLibraryType(long val) {
        super(val);
    }

    public WMPLibraryType(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPLibraryType(this);
    }
}