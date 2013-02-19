package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPEvents2.
 */
public class IWMPEvents2VTBL extends IWMPEventsVTBL {
    public IWMPEvents2VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "deviceConnect",
                                null,
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "deviceDisconnect",
                                null,
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "deviceStatusChange",
                                null,
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl(),
                                        new WMPDeviceStatus()
                                }
                        ),
                        new VirtualMethodCallback(
                                "deviceSyncStateChange",
                                null,
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl(),
                                        new WMPSyncState()
                                }
                        ),
                        new VirtualMethodCallback(
                                "deviceSyncError",
                                null,
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl(),
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "createPartnershipComplete",
                                null,
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl(),
                                        new HResult()
                                }
                        )
                }
        );
    }
}