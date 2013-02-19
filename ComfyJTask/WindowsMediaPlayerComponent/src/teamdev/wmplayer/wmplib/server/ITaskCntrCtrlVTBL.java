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
 * Represents VTBL for COM interface ITaskCntrCtrl.
 */
public class ITaskCntrCtrlVTBL extends IDispatchVTBL {
    public ITaskCntrCtrlVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getCurrentContainer",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new IUnknownImpl())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setCurrentContainer",
                                new HResult(),
                                new Parameter[]{
                                        new IUnknownImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "activate",
                                new HResult(),
                                new Parameter[]{
                                }
                        )
                }
        );
    }
}