package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPSyncDevice.
 */
public class IWMPSyncDeviceVTBL extends IUnknownVTBL {
    public IWMPSyncDeviceVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getFriendlyName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setFriendlyName",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getDeviceName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getDeviceId",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPartnershipIndex",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getConnected",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getStatus",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPDeviceStatus())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getSyncState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPSyncState())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getProgress",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getItemInfo",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "createPartnership",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "deletePartnership",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "start",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "stop",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "showSettings",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "isIdentical",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPSyncDeviceImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        )
                }
        );
    }
}