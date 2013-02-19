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
 * Represents VTBL for COM interface IWMPSliderCtrl.
 */
public class IWMPSliderCtrlVTBL extends IDispatchVTBL {
    public IWMPSliderCtrlVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getDirection",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setDirection",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getSlide",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setSlide",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getTiled",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setTiled",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getForegroundColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setForegroundColor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getForegroundEndColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setForegroundEndColor",
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
                                "getBackgroundEndColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundEndColor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getDisabledColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setDisabledColor",
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
                                "getForegroundImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setForegroundImage",
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
                                "getBackgroundHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBackgroundHoverImage",
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
                                "getThumbImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setThumbImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getThumbHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setThumbHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getThumbDownImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setThumbDownImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getThumbDisabledImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setThumbDisabledImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMin",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setMin",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMax",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setMax",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getValue",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setValue",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getToolTip",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setToolTip",
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
                                "getBorderSize",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBorderSize",
                                new HResult(),
                                new Parameter[]{
                                        new Int()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getForegroundHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setForegroundHoverImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getForegroundProgress",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setForegroundProgress",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getUseForegroundProgress",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setUseForegroundProgress",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        )
                }
        );
    }
}