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
 * Represents VTBL for COM interface IWMPLayoutSubView.
 */
public class IWMPLayoutSubViewVTBL extends IWMPObjectExtendedPropsVTBL {
    public IWMPLayoutSubViewVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getTransparencyColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setTransparencyColor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBackgroundColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundColor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBackgroundImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBackgroundTiled",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundTiled",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBackgroundImageHueShift",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundImageHueShift",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBackgroundImageSaturation",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundImageSaturation",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getResizeBackgroundImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setResizeBackgroundImage",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        )
                }
        );
    }
}