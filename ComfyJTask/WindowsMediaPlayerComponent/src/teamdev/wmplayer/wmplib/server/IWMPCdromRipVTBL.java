package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPCdromRip.
 */
public class IWMPCdromRipVTBL extends IUnknownVTBL {
    public IWMPCdromRipVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getRipState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new WMPRipState())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getRipProgress",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "startRip",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "stopRip",
                                new HResult(),
                                new Parameter[]{
                                }
                        )
                }
        );
    }
}