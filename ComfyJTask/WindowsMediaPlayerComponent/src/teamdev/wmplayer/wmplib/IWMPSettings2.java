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
 * Represents Java interface for COM interface IWMPSettings2.
 */
public interface IWMPSettings2 extends IWMPSettings {
    public static final String INTERFACE_IDENTIFIER = "{FDA937A4-EECE-4DA5-A0B6-39BF89ADE2C2}";

    /**
     *
     */
    VariantBool requestMediaAccessRights(
            BStr /*[in]*/ bstrDesiredAccess)
            throws ComException;

    /**
     * Returns the LCID of default audio language
     */
    Int32 getDefaultAudioLanguage()
            throws ComException;

    /**
     *
     */
    BStr getMediaAccessRights()
            throws ComException;
}
