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
 * Represents VTBL for COM interface IWMPLibraryTreeCtrl.
 */
public class IWMPLibraryTreeCtrlVTBL extends IDispatchVTBL {
    public IWMPLibraryTreeCtrlVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getDropDownVisible",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setDropDownVisible",
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
                                "getFontSize",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setFontSize",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getFontStyle",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setFontStyle",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getFontFace",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setFontFace",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getFilter",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setFilter",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getExpandState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setExpandState",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new IWMPPlaylistImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getSelectedPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getSelectedMedia",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPMediaImpl())
                                },
                                0
                        )
                }
        );
    }
}