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
 * Represents VTBL for COM interface IWMPTheme.
 */
public class IWMPThemeVTBL extends IDispatchVTBL {
    public IWMPThemeVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getTitle",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getVersion",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new SingleFloat())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAuthorVersion",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAuthor",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCopyright",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentViewID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentViewID",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "showErrorDialog",
                                new HResult(),
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "logString",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "openView",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "openViewRelative",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Int32(),
                                        new Int32(),
                                        new Pointer(new IDispatchImpl())
                                },
                                3
                        ),
                        new VirtualMethodCallback(
                                "closeView",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "openDialog",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new BStr())
                                },
                                2
                        ),
                        new VirtualMethodCallback(
                                "loadString",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "loadPreference",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "savePreference",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playSound",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "openViewRelativeInternal",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new IDispatchImpl())
                                },
                                8
                        ),
                        new VirtualMethodCallback(
                                "setViewPosition",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new BStr(),
                                        new BStr()
                                }
                        )
                }
        );
    }
}