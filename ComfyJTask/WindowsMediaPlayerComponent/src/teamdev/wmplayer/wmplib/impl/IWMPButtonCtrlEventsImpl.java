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
 * Represents COM dispinterface IWMPButtonCtrlEvents.
 */
public class IWMPButtonCtrlEventsImpl extends IDispatchImpl
        implements IWMPButtonCtrlEvents {
    public static final String INTERFACE_IDENTIFIER = "{BB17FFF7-1692-4555-918A-6AF7BFACEDD2}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPButtonCtrlEventsImpl() {
    }

    protected IWMPButtonCtrlEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPButtonCtrlEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPButtonCtrlEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPButtonCtrlEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * event ondragbegin
     */
    public void onclick()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onclick", parameters, void.class);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPButtonCtrlEventsImpl(this);
    }
}
