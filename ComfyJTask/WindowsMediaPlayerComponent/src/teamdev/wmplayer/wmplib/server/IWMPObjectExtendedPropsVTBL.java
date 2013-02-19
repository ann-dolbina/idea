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
 * Represents VTBL for COM interface IWMPObjectExtendedProps.
 */
public class IWMPObjectExtendedPropsVTBL extends IDispatchVTBL {
    public IWMPObjectExtendedPropsVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getElementType",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getLeft",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setLeft",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getTop",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setTop",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getRight",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setRight",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBottom",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBottom",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getWidth",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setWidth",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getHeight",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setHeight",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getZIndex",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setZIndex",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getClippingImage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setClippingImage",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getClippingColor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setClippingColor",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getVisible",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setVisible",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getEnabled",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setEnabled",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getTabStop",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setTabStop",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getPassThrough",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setPassThrough",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getHorizontalAlignment",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setHorizontalAlignment",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getVerticalAlignment",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setVerticalAlignment",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "moveTo",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "slideTo",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "moveSizeTo",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getAlphaBlend",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setAlphaBlend",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "alphaBlendTo",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getAccName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setAccName",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getAccDescription",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setAccDescription",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getAccKeyboardShortcut",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setAccKeyboardShortcut",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getResizeImages",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setResizeImages",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getNineGridMargins",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setNineGridMargins",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getResizeOptimize",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setResizeOptimize",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getRotation",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setRotation",
                                new HResult(),
                                new Parameter[]{
                                        new SingleFloat()
                                }
                        )
                }
        );
    }
}