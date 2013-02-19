package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.server.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPDMRConnectionManagerService.
 */
public class IWMPDMRConnectionManagerServiceVTBL extends IDispatchVTBL {
    public IWMPDMRConnectionManagerServiceVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getSourceProtocolInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getSinkProtocolInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentConnectionIDsProperty",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_ConnectionStatus",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_ConnectionManager",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_Direction",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_ProtocolInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_ConnectionID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_AVTransportID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_RcsID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getProtocolInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentConnectionIDs",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentConnectionInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new Int32()),
                                        new Pointer(new Int32()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new Int32()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr())
                                }
                        )
                }
        );
    }
}