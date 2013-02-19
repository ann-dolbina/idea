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
 * Represents VTBL for COM interface IWMPMediaCollection2.
 */
public class IWMPMediaCollection2VTBL extends IWMPMediaCollectionVTBL {
    public IWMPMediaCollection2VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "createQuery",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPQueryImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPlaylistByQuery",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPQueryImpl(),
                                        new BStr(),
                                        new BStr(),
                                        new VariantBool(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                4
                        ),
                        new VirtualMethodCallback(
                                "getStringCollectionByQuery",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new IWMPQueryImpl(),
                                        new BStr(),
                                        new BStr(),
                                        new VariantBool(),
                                        new Pointer(new IWMPStringCollectionImpl())
                                },
                                5
                        ),
                        new VirtualMethodCallback(
                                "getByAttributeAndMediaType",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                3
                        )
                }
        );
    }
}