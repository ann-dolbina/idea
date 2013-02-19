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
 * Represents Java interface for COM interface IWMPCore3.
 */
public interface IWMPCore3 extends IWMPCore2 {
    public static final String INTERFACE_IDENTIFIER = "{7587C667-628F-499F-88E7-6A6F4E888464}";

    /**
     * Creates a new playlist object
     */
    IWMPPlaylist newPlaylist(
            BStr /*[in]*/ bstrName,
            BStr /*[in]*/ bstrURL)
            throws ComException;

    /**
     * Creates a new media object
     */
    IWMPMedia newMedia(
            BStr /*[in]*/ bstrURL)
            throws ComException;
}
