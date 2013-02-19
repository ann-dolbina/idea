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
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPCdromBurn.
 */
public class IWMPCdromBurnVTBL extends IUnknownVTBL {
    public IWMPCdromBurnVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "isAvailable",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new VariantBool())
                                },
                                1
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
                                "getLabel",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setLabel",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBurnFormat",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPBurnFormat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBurnFormat",
                                new HResult(),
                                new Parameter[]{
                                        new WMPBurnFormat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBurnPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBurnPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "refreshStatus",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBurnState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPBurnState())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getBurnProgress",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "startBurn",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "stopBurn",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "erase",
                                new HResult(),
                                new Parameter[]{
                                }
                        )
                }
        );
    }
}