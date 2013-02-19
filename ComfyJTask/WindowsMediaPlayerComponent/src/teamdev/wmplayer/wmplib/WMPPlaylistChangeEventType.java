package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPPlaylistChangeEventType.
 */
public class WMPPlaylistChangeEventType extends ComEnumeration {
    public static final int wmplcUnknown = 0;
    public static final int wmplcClear = 1;
    public static final int wmplcInfoChange = 2;
    public static final int wmplcMove = 3;
    public static final int wmplcDelete = 4;
    public static final int wmplcInsert = 5;
    public static final int wmplcAppend = 6;
    public static final int wmplcPrivate = 7;
    public static final int wmplcNameChange = 8;
    public static final int wmplcMorph = 9;
    public static final int wmplcSort = 10;
    public static final int wmplcLast = 11;

    public WMPPlaylistChangeEventType() {
    }

    public WMPPlaylistChangeEventType(long val) {
        super(val);
    }

    public WMPPlaylistChangeEventType(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPPlaylistChangeEventType(this);
    }
}