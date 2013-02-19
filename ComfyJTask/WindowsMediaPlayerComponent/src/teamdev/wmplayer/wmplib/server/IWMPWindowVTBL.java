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
 * Represents VTBL for COM interface IWMPWindow.
 */
public class IWMPWindowVTBL extends IDispatchVTBL {
    public IWMPWindowVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "setWindowPos",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getFrameRate",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setFrameRate",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMouseX",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getMouseY",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setOnsizing",
                                new HResult(),
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "openViewAlwaysOnTop",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        )
                }
        );
    }
}