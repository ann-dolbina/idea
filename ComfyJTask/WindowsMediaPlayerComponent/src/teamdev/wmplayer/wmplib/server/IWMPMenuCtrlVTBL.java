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
 * Represents VTBL for COM interface IWMPMenuCtrl.
 */
public class IWMPMenuCtrlVTBL extends IDispatchVTBL {
    public IWMPMenuCtrlVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "deleteAllItems",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "appendItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "appendSeparator",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "enableItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "checkItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "checkRadioItem",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getShowFlags",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setShowFlags",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "show",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "showEx",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        )
                }
        );
    }
}