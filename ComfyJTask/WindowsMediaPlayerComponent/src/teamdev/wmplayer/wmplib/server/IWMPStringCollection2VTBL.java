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
 * Represents VTBL for COM interface IWMPStringCollection2.
 */
public class IWMPStringCollection2VTBL extends IWMPStringCollectionVTBL {
    public IWMPStringCollection2VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "isIdentical",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPStringCollection2Impl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getItemInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new BStr(),
                                        new Pointer(new BStr())
                                },
                                2
                        ),
                        new VirtualMethodCallback(
                                "getAttributeCountByType",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new Int32())
                                },
                                3
                        ),
                        new VirtualMethodCallback(
                                "getItemInfoByType",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new BStr(),
                                        new BStr(),
                                        new Int32(),
                                        new Pointer(new Variant())
                                },
                                4
                        )
                }
        );
    }
}