package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPEvents4.
 */
public interface IWMPEvents4 extends IWMPEvents3 {
    public static final String INTERFACE_IDENTIFIER = "{26DABCFA-306B-404D-9A6F-630A8405048D}";

    /**
     * Occurs when the sync estimation completed
     */
    void deviceEstimation(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult,
            Int64 /*[in]*/ qwEstimatedUsedSpace,
            Int64 /*[in]*/ qwEstimatedSpace);
}
