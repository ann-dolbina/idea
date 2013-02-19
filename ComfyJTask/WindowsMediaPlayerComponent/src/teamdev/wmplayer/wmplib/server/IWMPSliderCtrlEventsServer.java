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
 * Adapter for server implementation of IWMPSliderCtrlEvents
 */
public class IWMPSliderCtrlEventsServer extends IDispatchServer
        implements IWMPSliderCtrlEvents {
    public IWMPSliderCtrlEventsServer(CoClassMetaInfo classImpl) {
        super(classImpl);

        registerMethods(IWMPSliderCtrlEvents.class);
    }

    /**
     * event ondragbegin
     */
    public void ondragbegin()
            throws ComException {
    }

    /**
     * event ondragend
     */
    public void ondragend()
            throws ComException {
    }

    /**
     * event onpositionchange
     */
    public void onpositionchange()
            throws ComException {
    }

}