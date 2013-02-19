package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM dispinterface IWMPRegionalButtonEvents.
 */
public class IWMPRegionalButtonEventsImpl extends IDispatchImpl
        implements IWMPRegionalButtonEvents {
    public static final String INTERFACE_IDENTIFIER = "{50FC8D31-67AC-11D3-BD4C-00C04F6EA5AE}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPRegionalButtonEventsImpl() {
    }

    protected IWMPRegionalButtonEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPRegionalButtonEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPRegionalButtonEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPRegionalButtonEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * event onblur
     */
    public void onblur()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onblur", parameters, void.class);
    }

    /**
     * event onfocus
     */
    public void onfocus()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onfocus", parameters, void.class);
    }

    /**
     * event onclick
     */
    public void onclick()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onclick", parameters, void.class);
    }

    /**
     * event ondblclick
     */
    public void ondblclick()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "ondblclick", parameters, void.class);
    }

    /**
     * event onmousedown
     */
    public void onmousedown()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onmousedown", parameters, void.class);
    }

    /**
     * event onmouseup
     */
    public void onmouseup()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onmouseup", parameters, void.class);
    }

    /**
     * event onmousemove
     */
    public void onmousemove()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onmousemove", parameters, void.class);
    }

    /**
     * event onmouseover
     */
    public void onmouseover()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onmouseover", parameters, void.class);
    }

    /**
     * event onmouseout
     */
    public void onmouseout()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onmouseout", parameters, void.class);
    }

    /**
     * event onkeypress
     */
    public void onkeypress()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onkeypress", parameters, void.class);
    }

    /**
     * event onkeydown
     */
    public void onkeydown()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onkeydown", parameters, void.class);
    }

    /**
     * event onkeyup
     */
    public void onkeyup()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onkeyup", parameters, void.class);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPRegionalButtonEventsImpl(this);
    }
}
