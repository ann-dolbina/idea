package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPPlayerServices.
 */
public interface IWMPPlayerServices extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{1D01FBDB-ADE2-4C8D-9842-C190B95C3306}";

    /**
     *
     */
    void activateUIPlugin(
            BStr /*[in]*/ bstrPlugin)
            throws ComException;

    /**
     *
     */
    void setTaskPane(
            BStr /*[in]*/ bstrTaskPane)
            throws ComException;

    /**
     *
     */
    void setTaskPaneURL(
            BStr /*[in]*/ bstrTaskPane,
            BStr /*[in]*/ bstrURL,
            BStr /*[in]*/ bstrFriendlyName)
            throws ComException;
}
