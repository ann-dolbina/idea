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
 * Represents VTBL for COM interface IWMPPlaylistCtrlColumn.
 */
public class IWMPPlaylistCtrlColumnVTBL extends IDispatchVTBL {
    public IWMPPlaylistCtrlColumnVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getColumnName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setColumnName",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getColumnID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setColumnID",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getColumnResizeMode",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setColumnResizeMode",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getColumnWidth",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setColumnWidth",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        )
                }
        );
    }
}