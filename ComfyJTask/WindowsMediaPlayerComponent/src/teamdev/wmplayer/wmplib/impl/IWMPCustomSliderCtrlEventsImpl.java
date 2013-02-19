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
 * Represents COM dispinterface IWMPCustomSliderCtrlEvents.
 */
public class IWMPCustomSliderCtrlEventsImpl extends IDispatchImpl
        implements IWMPCustomSliderCtrlEvents {
    public static final String INTERFACE_IDENTIFIER = "{95F45AA4-ED0A-11D2-BA67-0000F80855E6}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCustomSliderCtrlEventsImpl() {
    }

    protected IWMPCustomSliderCtrlEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCustomSliderCtrlEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCustomSliderCtrlEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCustomSliderCtrlEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
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
        return new IWMPCustomSliderCtrlEventsImpl(this);
    }
}
