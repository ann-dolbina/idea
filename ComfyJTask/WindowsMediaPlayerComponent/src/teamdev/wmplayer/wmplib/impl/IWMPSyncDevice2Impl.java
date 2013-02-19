package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPSyncDevice2.
 */
public class IWMPSyncDevice2Impl extends IWMPSyncDeviceImpl
        implements IWMPSyncDevice2 {
    public static final String INTERFACE_IDENTIFIER = IWMPSyncDevice2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSyncDevice2Impl() {
    }

    protected IWMPSyncDevice2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSyncDevice2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSyncDevice2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSyncDevice2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void setItemInfo(
            BStr /*[in]*/ bstrItemName,
            BStr /*[in]*/ bstrVal)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        bstrVal == null ? (Parameter) PTR_NULL : bstrVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSyncDevice2Impl(this);
    }
}
