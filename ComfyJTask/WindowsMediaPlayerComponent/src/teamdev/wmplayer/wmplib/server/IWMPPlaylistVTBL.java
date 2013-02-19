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
 * Represents VTBL for COM interface IWMPPlaylist.
 */
public class IWMPPlaylistVTBL extends IDispatchVTBL {
    public IWMPPlaylistVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setName",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getAttributeCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAttributeName",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new IWMPMediaImpl())
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
                                "setItemInfo",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getIsIdentical",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "clear",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "insertItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new IWMPMediaImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "appendItem",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "removeItem",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "moveItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Int32()
                                }
                        )
                }
        );
    }
}