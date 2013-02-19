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
 * Represents VTBL for COM interface IWMPSettings.
 */
public class IWMPSettingsVTBL extends IDispatchVTBL {
    public IWMPSettingsVTBL(CoClassMetaInfo classMetaInfo) {
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
                                "getAutoStart",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setAutoStart",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBaseURL",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBaseURL",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getDefaultFrame",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setDefaultFrame",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getInvokeURLs",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setInvokeURLs",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMute",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setMute",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getPlayCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setPlayCount",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getRate",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new DoubleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setRate",
                                new HResult(),
                                new Parameter[]{
                                        new DoubleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getBalance",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setBalance",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getVolume",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setVolume",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMode",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new VariantBool())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "setMode",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getEnableErrorDialogs",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setEnableErrorDialogs",
                                new HResult(),
                                new Parameter[]{
                                        new VariantBool()
                                }
                        )
                }
        );
    }
}