package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;

/**
 * Represents COM alias ULONG_PTR.
 */
public class ULONG_PTR extends UInt32 {
    public ULONG_PTR() {
    }

    public ULONG_PTR(ULONG_PTR that) {
        super(that);
    }

    public ULONG_PTR(long value) {
        super(value);
    }

    public Object clone() {
        return new ULONG_PTR(this);
    }
}