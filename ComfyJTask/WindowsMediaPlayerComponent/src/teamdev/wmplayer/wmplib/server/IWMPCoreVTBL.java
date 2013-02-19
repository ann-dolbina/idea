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
 * Represents VTBL for COM interface IWMPCore.
 */
public class IWMPCoreVTBL extends IDispatchVTBL {
    public IWMPCoreVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "close",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "getURL",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setURL",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getOpenState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPOpenState())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPlayState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPPlayState())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getControls",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPControlsImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getSettings",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPSettingsImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentMedia",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPMediaImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentMedia",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMediaCollection",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPMediaCollectionImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPlaylistCollection",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistCollectionImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getVersionInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "launchURL",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getNetwork",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPNetworkImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCdromCollection",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPCdromCollectionImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getClosedCaption",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPClosedCaptionImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getIsOnline",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getError",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPErrorImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getStatus",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        )
                }
        );
    }
}