package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPSyncServices.
 */
public interface IWMPSyncServices extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{8B5050FF-E0A4-4808-B3A8-893A9E1ED894}";

    /**
     *
     */
    IWMPSyncDevice getDevice(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     *
     */
    Int32 getDeviceCount()
            throws ComException;
}
