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
 * Represents VTBL for COM interface IWMPDownloadManager.
 */
public class IWMPDownloadManagerVTBL extends IDispatchVTBL {
    public IWMPDownloadManagerVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getDownloadCollection",
                                new HResult(),
                                new Parameter[]{
                                        new Int32(),
                                        new Pointer(new IWMPDownloadCollectionImpl())
                                },
                                1
                        ),
                        new VirtualMethodCallback(
                                "createDownloadCollection",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IWMPDownloadCollectionImpl())
                                },
                                0
                        )
                }
        );
    }
}