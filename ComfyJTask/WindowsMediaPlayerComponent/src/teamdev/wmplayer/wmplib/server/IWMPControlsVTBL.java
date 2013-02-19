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
 * Represents VTBL for COM interface IWMPControls.
 */
public class IWMPControlsVTBL extends IDispatchVTBL {
    public IWMPControlsVTBL(CoClassMetaInfo classMetaInfo) {
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
                                "play",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "stop",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "pause",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "fastForward",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "fastReverse",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentPosition",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new DoubleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentPosition",
                                new HResult(),
                                new Parameter[]{
                                        new DoubleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentPositionString",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "next",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "previous",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentItem",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPMediaImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentItem",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentMarker",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentMarker",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playItem",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPMediaImpl()
                                }
                        )
                }
        );
    }
}