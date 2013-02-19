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
 * Represents COM dispinterface IWMPSliderCtrlEvents.
 */
public class IWMPSliderCtrlEventsImpl extends IDispatchImpl
        implements IWMPSliderCtrlEvents {
    public static final String INTERFACE_IDENTIFIER = "{CDAC14D2-8BE4-11D3-BB48-00A0C93CA73A}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSliderCtrlEventsImpl() {
    }

    protected IWMPSliderCtrlEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSliderCtrlEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSliderCtrlEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSliderCtrlEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * event ondragbegin
     */
    public void ondragbegin()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "ondragbegin", parameters, void.class);
    }

    /**
     * event ondragend
     */
    public void ondragend()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "ondragend", parameters, void.class);
    }

    /**
     * event onpositionchange
     */
    public void onpositionchange()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onpositionchange", parameters, void.class);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSliderCtrlEventsImpl(this);
    }
}
