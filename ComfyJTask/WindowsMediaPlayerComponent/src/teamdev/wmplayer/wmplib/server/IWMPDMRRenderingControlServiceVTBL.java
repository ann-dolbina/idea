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
 * Represents VTBL for COM interface IWMPDMRRenderingControlService.
 */
public class IWMPDMRRenderingControlServiceVTBL extends IDispatchVTBL {
    public IWMPDMRRenderingControlServiceVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getLastChange",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPresetNameList",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getMuteProperty",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new VariantBool())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getVolumeProperty",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new UInt16())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_Channel",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_InstanceID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new UInt32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_PresetName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "listPresets",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "selectPreset",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMute",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr(),
                                        new Pointer(new VariantBool())
                                }
                        ),
                        new VirtualMethodCallback(
                                "setMute",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getVolume",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr(),
                                        new Pointer(new UInt16())
                                }
                        ),
                        new VirtualMethodCallback(
                                "setVolume",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr(),
                                        new UInt16()
                                }
                        )
                }
        );
    }
}