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
 * Represents COM dispinterface IWMPVideoCtrlEvents.
 */
public class IWMPVideoCtrlEventsImpl extends IDispatchImpl
        implements IWMPVideoCtrlEvents {
    public static final String INTERFACE_IDENTIFIER = "{A85C0477-714C-4A06-B9F6-7C8CA38B45DC}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPVideoCtrlEventsImpl() {
    }

    protected IWMPVideoCtrlEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPVideoCtrlEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPVideoCtrlEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPVideoCtrlEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * event onvideostart
     */
    public void onvideostart()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onvideostart", parameters, void.class);
    }

    /**
     * event onvideostart
     */
    public void onvideoend()
            throws ComException {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "onvideoend", parameters, void.class);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPVideoCtrlEventsImpl(this);
    }
}
