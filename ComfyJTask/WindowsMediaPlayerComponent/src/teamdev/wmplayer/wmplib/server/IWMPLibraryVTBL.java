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
 * Represents VTBL for COM interface IWMPLibrary.
 */
public class IWMPLibraryVTBL extends IUnknownVTBL {
    public IWMPLibraryVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getType",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPLibraryType())
                                },
                                0
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
                                "isIdentical",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPLibraryImpl(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        )
                }
        );
    }
}