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
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPRemoteMediaServices.
 */
public class IWMPRemoteMediaServicesVTBL extends IUnknownVTBL {
    public IWMPRemoteMediaServicesVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getServiceType",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getApplicationName",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getScriptableObject",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr()),
                                        new Pointer(new IDispatchImpl())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCustomUIMode",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                }
                        )
                }
        );
    }
}