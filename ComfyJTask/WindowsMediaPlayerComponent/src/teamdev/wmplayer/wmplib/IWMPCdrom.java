package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPCdrom.
 */
public interface IWMPCdrom extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{CFAB6E98-8730-11D3-B388-00C04F68574B}";

    /**
     * Eject the CD in the CDROM drive
     */
    void eject()
            throws ComException;

    /**
     * Returns the CDROM drive specifier
     */
    BStr getDriveSpecifier()
            throws ComException;

    /**
     * Returns the playlist of tracks currently in the CDROM drive
     */
    IWMPPlaylist getPlaylist()
            throws ComException;
}
