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
 * Represents VTBL for COM interface IWMPRegionalButtonCtrl.
 */
public class IWMPRegionalButtonCtrlVTBL extends IDispatchVTBL {
    public IWMPRegionalButtonCtrlVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getDownImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setDownImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getHoverDownImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setHoverDownImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getHoverHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setHoverHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getDisabledImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setDisabledImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMappingImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setMappingImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
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
                                "getCursor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCursor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getShowBackground",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setShowBackground",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getRadio",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setRadio",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getButtonCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "createButton",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IDispatchImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getButton",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new IDispatchImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "click",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getHueShift",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setHueShift",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getSaturation",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setSaturation",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        )
                }
        );
    }
}