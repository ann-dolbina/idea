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
 * Represents COM interface IWMPSubscriptionServicePlayMedia.
 */
public class IWMPSubscriptionServicePlayMediaImpl extends IWMPSubscriptionServiceLimitedImpl
        implements IWMPSubscriptionServicePlayMedia {
    public static final String INTERFACE_IDENTIFIER = IWMPSubscriptionServicePlayMedia.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSubscriptionServicePlayMediaImpl() {
    }

    protected IWMPSubscriptionServicePlayMediaImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSubscriptionServicePlayMediaImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSubscriptionServicePlayMediaImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSubscriptionServicePlayMediaImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method playMedia
     */
    public void playMedia(
            BStr /*[in]*/ bstrURL)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSubscriptionServicePlayMediaImpl(this);
    }
}
