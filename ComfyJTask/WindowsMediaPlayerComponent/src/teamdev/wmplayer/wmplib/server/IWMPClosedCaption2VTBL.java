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
 * Represents VTBL for COM interface IWMPClosedCaption2.
 */
public class IWMPClosedCaption2VTBL extends IWMPClosedCaptionVTBL {
    public IWMPClosedCaption2VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getSAMILangCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getSAMILangName",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getSAMILangID",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new Int32())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getSAMIStyleCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getSAMIStyleName",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        )
                }
        );
    }
}