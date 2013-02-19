package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPPlayerServices2.
 */
public class IWMPPlayerServices2Impl extends IWMPPlayerServicesImpl
        implements IWMPPlayerServices2 {
    public static final String INTERFACE_IDENTIFIER = IWMPPlayerServices2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlayerServices2Impl() {
    }

    protected IWMPPlayerServices2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlayerServices2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlayerServices2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlayerServices2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void setBackgroundProcessingPriority(
            BStr /*[in]*/ bstrPriority)
            throws ComException {
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrPriority == null ? (Parameter) PTR_NULL : bstrPriority
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlayerServices2Impl(this);
    }
}
