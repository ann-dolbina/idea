package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPPlayerServices2.
 */
public interface IWMPPlayerServices2 extends IWMPPlayerServices {
    public static final String INTERFACE_IDENTIFIER = "{1BB1592F-F040-418A-9F71-17C7512B4D70}";

    /**
     *
     */
    void setBackgroundProcessingPriority(
            BStr /*[in]*/ bstrPriority)
            throws ComException;
}
