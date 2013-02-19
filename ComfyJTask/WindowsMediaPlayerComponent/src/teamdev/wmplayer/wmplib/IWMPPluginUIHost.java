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
 * Represents Java interface for COM interface IWMPPluginUIHost.
 */
public interface IWMPPluginUIHost extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{5D0AD945-289E-45C5-A9C6-F301F0152108}";

    /**
     * method getProperty
     */
    Variant getProperty(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * method setProperty
     */
    void setProperty(
            BStr /*[in]*/ bstrName,
            Variant /*[in]*/ newVal)
            throws ComException;

    /**
     * property backgroundColor
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     * property backgroundColor
     */
    void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property objectID
     */
    BStr getObjectID()
            throws ComException;

    /**
     * property objectID
     */
    void setObjectID(
            BStr /*[in]*/ pVal)
            throws ComException;
}
