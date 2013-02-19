package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMP_WRITENAMESEX_TYPE.
 */
public class WMP_WRITENAMESEX_TYPE extends ComEnumeration {
    public static final int WMP_WRITENAMES_TYPE_CD_BY_TOC = 0;
    public static final int WMP_WRITENAMES_TYPE_CD_BY_CONTENT_ID = 1;
    public static final int WMP_WRITENAMES_TYPE_CD_BY_MDQCD = 2;
    public static final int WMP_WRITENAMES_TYPE_DVD_BY_DVDID = 3;

    public WMP_WRITENAMESEX_TYPE() {
    }

    public WMP_WRITENAMESEX_TYPE(long val) {
        super(val);
    }

    public WMP_WRITENAMESEX_TYPE(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMP_WRITENAMESEX_TYPE(this);
    }
}