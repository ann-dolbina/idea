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
 * Represents COM interface IWMPSubscriptionServiceLimited.
 */
public class IWMPSubscriptionServiceLimitedImpl extends IWMPExternalColorsImpl
        implements IWMPSubscriptionServiceLimited {
    public static final String INTERFACE_IDENTIFIER = IWMPSubscriptionServiceLimited.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSubscriptionServiceLimitedImpl() {
    }

    protected IWMPSubscriptionServiceLimitedImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSubscriptionServiceLimitedImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSubscriptionServiceLimitedImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSubscriptionServiceLimitedImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void navigateTaskPaneURL(
            BStr /*[in]*/ bstrKeyName,
            BStr /*[in]*/ bstrTaskPane,
            BStr /*[in]*/ bstrParams)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrKeyName == null ? (Parameter) PTR_NULL : bstrKeyName,
                        bstrTaskPane == null ? (Parameter) PTR_NULL : bstrTaskPane,
                        bstrParams == null ? (Parameter) PTR_NULL : bstrParams
                }
        );
    }

    /**
     *
     */
    public void setSelectedTaskPane(
            BStr /*[in]*/ bstrTaskPane)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTaskPane == null ? (Parameter) PTR_NULL : bstrTaskPane
                }
        );
    }

    /**
     *
     */
    public BStr getSelectedTaskPane()
            throws ComException {
        BStr bstrTaskPane = new BStr();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTaskPane == null ? (Parameter) PTR_NULL : new Pointer(bstrTaskPane)
                }
        );
        return bstrTaskPane;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSubscriptionServiceLimitedImpl(this);
    }
}
