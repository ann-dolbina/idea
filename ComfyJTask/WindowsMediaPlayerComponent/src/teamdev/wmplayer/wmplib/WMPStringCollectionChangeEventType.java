package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPStringCollectionChangeEventType.
 */
public class WMPStringCollectionChangeEventType extends ComEnumeration {
    public static final int wmpsccetUnknown = 0;
    public static final int wmpsccetInsert = 1;
    public static final int wmpsccetChange = 2;
    public static final int wmpsccetDelete = 3;
    public static final int wmpsccetClear = 4;
    public static final int wmpsccetBeginUpdates = 5;
    public static final int wmpsccetEndUpdates = 6;

    public WMPStringCollectionChangeEventType() {
    }

    public WMPStringCollectionChangeEventType(long val) {
        super(val);
    }

    public WMPStringCollectionChangeEventType(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPStringCollectionChangeEventType(this);
    }
}