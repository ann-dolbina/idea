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
 * Represents Java interface for COM interface IWMPSubscriptionServiceLimited.
 */
public interface IWMPSubscriptionServiceLimited extends IWMPExternalColors {
    public static final String INTERFACE_IDENTIFIER = "{54DF358E-CF38-4010-99F1-F44B0E9000E5}";

    /**
     *
     */
    void navigateTaskPaneURL(
            BStr /*[in]*/ bstrKeyName,
            BStr /*[in]*/ bstrTaskPane,
            BStr /*[in]*/ bstrParams)
            throws ComException;

    /**
     *
     */
    void setSelectedTaskPane(
            BStr /*[in]*/ bstrTaskPane)
            throws ComException;

    /**
     *
     */
    BStr getSelectedTaskPane()
            throws ComException;
}
