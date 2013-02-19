package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPControls3.
 */
public class IWMPControls3VTBL extends IWMPControls2VTBL {
    public IWMPControls3VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getAudioLanguageCount",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAudioLanguageID",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new Int32())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getAudioLanguageDescription",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getCurrentAudioLanguage",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentAudioLanguage",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentAudioLanguageIndex",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentAudioLanguageIndex",
                                new HResult(),
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getLanguageName",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new BStr())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "getCurrentPositionTimecode",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentPositionTimecode",
                                new HResult(),
                                new Parameter[]{
                                        new BStr()
                                }
                        )
                }
        );
    }
}