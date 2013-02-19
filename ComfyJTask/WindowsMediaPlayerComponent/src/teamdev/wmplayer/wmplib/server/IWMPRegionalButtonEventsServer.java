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
 * Adapter for server implementation of IWMPRegionalButtonEvents
 */
public class IWMPRegionalButtonEventsServer extends IDispatchServer
        implements IWMPRegionalButtonEvents {
    public IWMPRegionalButtonEventsServer(CoClassMetaInfo classImpl) {
        super(classImpl);

        registerMethods(IWMPRegionalButtonEvents.class);
    }

    /**
     * event onblur
     */
    public void onblur()
            throws ComException {
    }

    /**
     * event onfocus
     */
    public void onfocus()
            throws ComException {
    }

    /**
     * event onclick
     */
    public void onclick()
            throws ComException {
    }

    /**
     * event ondblclick
     */
    public void ondblclick()
            throws ComException {
    }

    /**
     * event onmousedown
     */
    public void onmousedown()
            throws ComException {
    }

    /**
     * event onmouseup
     */
    public void onmouseup()
            throws ComException {
    }

    /**
     * event onmousemove
     */
    public void onmousemove()
            throws ComException {
    }

    /**
     * event onmouseover
     */
    public void onmouseover()
            throws ComException {
    }

    /**
     * event onmouseout
     */
    public void onmouseout()
            throws ComException {
    }

    /**
     * event onkeypress
     */
    public void onkeypress()
            throws ComException {
    }

    /**
     * event onkeydown
     */
    public void onkeydown()
            throws ComException {
    }

    /**
     * event onkeyup
     */
    public void onkeyup()
            throws ComException {
    }

}