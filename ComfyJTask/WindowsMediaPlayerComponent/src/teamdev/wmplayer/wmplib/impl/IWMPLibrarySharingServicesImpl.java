package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPLibrarySharingServices.
 */
public class IWMPLibrarySharingServicesImpl extends IUnknownImpl
        implements IWMPLibrarySharingServices {
    public static final String INTERFACE_IDENTIFIER = IWMPLibrarySharingServices.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLibrarySharingServicesImpl() {
    }

    protected IWMPLibrarySharingServicesImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLibrarySharingServicesImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLibrarySharingServicesImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLibrarySharingServicesImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public VariantBool isLibraryShared()
            throws ComException {
        VariantBool pvbShared = new VariantBool();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pvbShared == null ? (Parameter) PTR_NULL : new Pointer(pvbShared)
                }
        );
        return pvbShared;
    }

    /**
     *
     */
    public VariantBool isLibrarySharingEnabled()
            throws ComException {
        VariantBool pvbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pvbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pvbEnabled)
                }
        );
        return pvbEnabled;
    }

    /**
     *
     */
    public void showLibrarySharing()
            throws ComException {
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPLibrarySharingServicesImpl(this);
    }
}
