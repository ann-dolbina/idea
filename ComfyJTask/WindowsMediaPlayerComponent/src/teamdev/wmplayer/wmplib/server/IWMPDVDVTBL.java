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
 * Represents VTBL for COM interface IWMPDVD.
 */
public class IWMPDVDVTBL extends IDispatchVTBL {
    public IWMPDVDVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getIsAvailable",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getDomain",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "topMenu",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "titleMenu",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "back",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "resume",
                                new HResult(),
                                new Parameter[]{
                                }
                        )
                }
        );
    }
}