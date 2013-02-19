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
 * Represents VTBL for COM interface IWMPPlaylistCollection.
 */
public class IWMPPlaylistCollectionVTBL extends IDispatchVTBL {
    public IWMPPlaylistCollectionVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "newPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getAll",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistArrayImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getByName",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistArrayImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "remove",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "setDeleted",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "isDeleted",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "importPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                1
                        )
                }
        );
    }
}