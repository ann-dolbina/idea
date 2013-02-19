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
 * Represents VTBL for COM interface IWMPEvents3.
 */
public class IWMPEvents3VTBL extends IWMPEvents2VTBL {
    public IWMPEvents3VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "cdromRipStateChange",
                                null,
                                new Parameter[]{
                                        new IWMPCdromRipImpl(),
                                        new WMPRipState()
                                }
                        ),
                        new VirtualMethodCallback(
                                "cdromRipMediaError",
                                null,
                                new Parameter[]{
                                        new IWMPCdromRipImpl(),
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "cdromBurnStateChange",
                                null,
                                new Parameter[]{
                                        new IWMPCdromBurnImpl(),
                                        new WMPBurnState()
                                }
                        ),
                        new VirtualMethodCallback(
                                "cdromBurnMediaError",
                                null,
                                new Parameter[]{
                                        new IWMPCdromBurnImpl(),
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "cdromBurnError",
                                null,
                                new Parameter[]{
                                        new IWMPCdromBurnImpl(),
                                        new HResult()
                                }
                        ),
                        new VirtualMethodCallback(
                                "libraryConnect",
                                null,
                                new Parameter[]{
                                        new IWMPLibraryImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "libraryDisconnect",
                                null,
                                new Parameter[]{
                                        new IWMPLibraryImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "folderScanStateChange",
                                null,
                                new Parameter[]{
                                        new WMPFolderScanState()
                                }
                        ),
                        new VirtualMethodCallback(
                                "stringCollectionChange",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl(),
                                        new WMPStringCollectionChangeEventType(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaCollectionMediaAdded",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaCollectionMediaRemoved",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        )
                }
        );
    }
}