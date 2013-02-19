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
 * Represents VTBL for COM interface IWMPMediaCollection.
 */
public class IWMPMediaCollectionVTBL extends IDispatchVTBL {
    public IWMPMediaCollectionVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "add",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPMediaImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getAll",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getByName",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getByGenre",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getByAuthor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getByAlbum",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getByAttribute",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                2
                        ),
                        new VirtualMethodCallback(
                                "remove",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getAttributeStringCollection",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new IWMPStringCollectionImpl())
                                },
                                2
                        ),
                        new VirtualMethodCallback(
                                "getMediaAtom",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new Int32())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "setDeleted",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "isDeleted",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        )
                }
        );
    }
}