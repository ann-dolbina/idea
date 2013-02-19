package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPEvents4.
 */
public class IWMPEvents4Impl extends IWMPEvents3Impl
        implements IWMPEvents4 {
    public static final String INTERFACE_IDENTIFIER = IWMPEvents4.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEvents4Impl() {
    }

    protected IWMPEvents4Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEvents4Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEvents4Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEvents4Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Occurs when the sync estimation completed
     */
    public void deviceEstimation(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult,
            Int64 /*[in]*/ qwEstimatedUsedSpace,
            Int64 /*[in]*/ qwEstimatedSpace) {
        invokeVirtualMethod(
                65,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                        hrResult,
                        qwEstimatedUsedSpace,
                        qwEstimatedSpace
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEvents4Impl(this);
    }
}
