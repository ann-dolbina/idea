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
 * Represents COM interface IWMPSubscriptionServiceExternal.
 */
public class IWMPSubscriptionServiceExternalImpl extends IWMPSubscriptionServiceLimitedImpl
        implements IWMPSubscriptionServiceExternal {
    public static final String INTERFACE_IDENTIFIER = IWMPSubscriptionServiceExternal.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSubscriptionServiceExternalImpl() {
    }

    protected IWMPSubscriptionServiceExternalImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSubscriptionServiceExternalImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSubscriptionServiceExternalImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSubscriptionServiceExternalImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public IWMPDownloadManager getDownloadManager()
            throws ComException {
        IWMPDownloadManagerImpl ppDownloadMgr = new IWMPDownloadManagerImpl();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppDownloadMgr == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDownloadMgr)
                }
        );
        return ppDownloadMgr;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSubscriptionServiceExternalImpl(this);
    }
}
