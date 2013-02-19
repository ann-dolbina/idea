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
 * Represents VTBL for COM interface IWMPLibraryServices.
 */
public class IWMPLibraryServicesVTBL extends IUnknownVTBL {
    public IWMPLibraryServicesVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getCountByType",
                                new HResult(),
                                new Parameter[]{
                                        new WMPLibraryType(),
                                        new Pointer(new Int32())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getLibraryByType",
                                new HResult(),
                                new Parameter[]{
                                        new WMPLibraryType(),
                                        new Int32(),
                                        new Pointer(new IWMPLibraryImpl())
                                },
                                2
                        )
                }
        );
    }
}