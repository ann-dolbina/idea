package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPSyncDevice2.
 */
public interface IWMPSyncDevice2 extends IWMPSyncDevice {
    public static final String INTERFACE_IDENTIFIER = "{88AFB4B2-140A-44D2-91E6-4543DA467CD1}";

    /**
     *
     */
    void setItemInfo(
            BStr /*[in]*/ bstrItemName,
            BStr /*[in]*/ bstrVal)
            throws ComException;
}
