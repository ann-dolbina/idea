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
 * Represents Java interface for COM interface IWMPEvents2.
 */
public interface IWMPEvents2 extends IWMPEvents {
    public static final String INTERFACE_IDENTIFIER = "{1E7601FA-47EA-4107-9EA9-9004ED9684FF}";

    /**
     * Occurs when a device is connected
     */
    void deviceConnect(
            IWMPSyncDevice /*[in]*/ pDevice);

    /**
     * Occurs when a device is disconnected
     */
    void deviceDisconnect(
            IWMPSyncDevice /*[in]*/ pDevice);

    /**
     * Occurs when a device status changes
     */
    void deviceStatusChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPDeviceStatus /*[in]*/ NewStatus);

    /**
     * Occurs when a device sync state changes
     */
    void deviceSyncStateChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPSyncState /*[in]*/ NewState);

    /**
     * Occurs when a device's media has an error
     */
    void deviceSyncError(
            IWMPSyncDevice /*[in]*/ pDevice,
            IDispatch /*[in]*/ pMedia);

    /**
     * Occurs when createPartnership call completes
     */
    void createPartnershipComplete(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult);
}
