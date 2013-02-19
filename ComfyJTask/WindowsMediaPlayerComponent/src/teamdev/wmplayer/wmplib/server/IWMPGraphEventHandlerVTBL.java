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
 * Represents VTBL for COM interface IWMPGraphEventHandler.
 */
public class IWMPGraphEventHandlerVTBL extends IDispatchVTBL {
    public IWMPGraphEventHandlerVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "notifyGraphStateChange",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "asyncNotifyGraphStateChange",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyRateChange",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new DoubleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyPlaybackEnd",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new BStr(),
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyStreamEnd",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyScriptCommand",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyEarlyScriptCommand",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new BStr(),
                                        new BStr(),
                                        new DoubleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyMarkerHit",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyGraphError",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32(),
                                        new BStr(),
                                        new IUnknownImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyAcquireCredentials",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new BStr(),
                                        new BStr(),
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new UInt32()),
                                        new Pointer(new VariantBool())
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyUntrustedLicense",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new BStr(),
                                        new Pointer(new VariantBool())
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyLicenseDialog",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new BStr(),
                                        new BStr(),
                                        new Pointer.Const(new UInt8()),
                                        new UInt32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNeedsIndividualization",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Pointer(new VariantBool())
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNewMetadata",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNewMediaCaps",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyDisconnect",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifySave",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyDelayClose",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyDVD",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyRequestAppThreadAction",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new UInt32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyPrerollReady",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNewIcons",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyStepComplete",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNewBitrate",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new UInt32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyGraphCreationPreRender",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyGraphCreationPostRender",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new ULONG_PTR()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyGraphUserEvent",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyRevocation",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new Pointer(new VariantBool())
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNeedsWMGraphIndividualization",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new ULONG_PTR(),
                                        new Pointer(new VariantBool()),
                                        new Pointer(new VariantBool())
                                }
                        ),
                        new VirtualMethodCallback(
                                "notifyNeedsFullscreen",
                                new HResult(),
                                new Parameter[]{
                                        new ULONG_PTR()
                                }
                        )
                }
        );
    }
}