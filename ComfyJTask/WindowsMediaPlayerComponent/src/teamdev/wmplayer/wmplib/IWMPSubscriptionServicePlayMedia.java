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
 * Represents Java interface for COM interface IWMPSubscriptionServicePlayMedia.
 */
public interface IWMPSubscriptionServicePlayMedia extends IWMPSubscriptionServiceLimited {
    public static final String INTERFACE_IDENTIFIER = "{5F0248C1-62B3-42D7-B927-029119E6AD14}";

    /**
     * method playMedia
     */
    void playMedia(
            BStr /*[in]*/ bstrURL)
            throws ComException;
}
