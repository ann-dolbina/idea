package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.types.*;

/**
 * Represents COM enumeration WMPOpenState.
 */
public class WMPOpenState extends ComEnumeration {
    public static final int wmposUndefined = 0;
    public static final int wmposPlaylistChanging = 1;
    public static final int wmposPlaylistLocating = 2;
    public static final int wmposPlaylistConnecting = 3;
    public static final int wmposPlaylistLoading = 4;
    public static final int wmposPlaylistOpening = 5;
    public static final int wmposPlaylistOpenNoMedia = 6;
    public static final int wmposPlaylistChanged = 7;
    public static final int wmposMediaChanging = 8;
    public static final int wmposMediaLocating = 9;
    public static final int wmposMediaConnecting = 10;
    public static final int wmposMediaLoading = 11;
    public static final int wmposMediaOpening = 12;
    public static final int wmposMediaOpen = 13;
    public static final int wmposBeginCodecAcquisition = 14;
    public static final int wmposEndCodecAcquisition = 15;
    public static final int wmposBeginLicenseAcquisition = 16;
    public static final int wmposEndLicenseAcquisition = 17;
    public static final int wmposBeginIndividualization = 18;
    public static final int wmposEndIndividualization = 19;
    public static final int wmposMediaWaiting = 20;
    public static final int wmposOpeningUnknownURL = 21;

    public WMPOpenState() {
    }

    public WMPOpenState(long val) {
        super(val);
    }

    public WMPOpenState(IntegerParameter t) {
        super(t);
    }

    public Object clone() {
        return new WMPOpenState(this);
    }
}