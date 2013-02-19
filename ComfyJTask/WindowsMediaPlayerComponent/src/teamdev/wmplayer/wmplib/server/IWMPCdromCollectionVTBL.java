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
 * Represents VTBL for COM interface IWMPCdromCollection.
 */
public class IWMPCdromCollectionVTBL extends IDispatchVTBL {
    public IWMPCdromCollectionVTBL(CoClassMetaInfo classMetaInfo) {
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
                                "item",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new IWMPCdromImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getByDriveSpecifier",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPCdromImpl())
                                },
                                1
                        )
                }
        );
    }
}