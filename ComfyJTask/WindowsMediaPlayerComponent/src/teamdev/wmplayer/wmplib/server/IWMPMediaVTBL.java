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
 * Represents VTBL for COM interface IWMPMedia.
 */
public class IWMPMediaVTBL extends IDispatchVTBL {
    public IWMPMediaVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getIsIdentical",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getSourceURL",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
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
                                "getImageSourceWidth",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getImageSourceHeight",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getMarkerCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getMarkerTime",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new DoubleFloat())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getMarkerName",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getDuration",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new DoubleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getDurationString",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
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
                                "getItemInfoByAtom",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "isMemberOf",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "isReadOnlyItem",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        )
                }
        );
    }
}