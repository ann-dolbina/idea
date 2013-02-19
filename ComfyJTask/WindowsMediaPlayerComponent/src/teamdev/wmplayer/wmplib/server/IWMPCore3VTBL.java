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
 * Represents VTBL for COM interface IWMPCore3.
 */
public class IWMPCore3VTBL extends IWMPCore2VTBL {
    public IWMPCore3VTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "newPlaylist",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new BStr(),
                                        new Pointer(new IWMPPlaylistImpl())
                                },
                                2
                        ),
                        new VirtualMethodCallback(
                                "newMedia",
                                new HResult(),
                                new Parameter[]{
                                        new BStr(),
                                        new Pointer(new IWMPMediaImpl())
                                },
                                1
                        )
                }
        );
    }
}