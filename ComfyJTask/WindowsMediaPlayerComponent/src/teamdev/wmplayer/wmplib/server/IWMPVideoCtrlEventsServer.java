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
 * Adapter for server implementation of IWMPVideoCtrlEvents
 */
public class IWMPVideoCtrlEventsServer extends IDispatchServer
        implements IWMPVideoCtrlEvents {
    public IWMPVideoCtrlEventsServer(CoClassMetaInfo classImpl) {
        super(classImpl);

        registerMethods(IWMPVideoCtrlEvents.class);
    }

    /**
     * event onvideostart
     */
    public void onvideostart()
            throws ComException {
    }

    /**
     * event onvideostart
     */
    public void onvideoend()
            throws ComException {
    }

}