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
 * Represents COM interface IWMPRemoteMediaServices.
 */
public class IWMPRemoteMediaServicesImpl extends IUnknownImpl
        implements IWMPRemoteMediaServices {
    public static final String INTERFACE_IDENTIFIER = IWMPRemoteMediaServices.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPRemoteMediaServicesImpl() {
    }

    protected IWMPRemoteMediaServicesImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPRemoteMediaServicesImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPRemoteMediaServicesImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPRemoteMediaServicesImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void getServiceType(
            BStr /*[out]*/ pbstrType)
            throws ComException {
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrType == null ? (Parameter) PTR_NULL : new Pointer(pbstrType)
                }
        );
    }

    /**
     *
     */
    public void getApplicationName(
            BStr /*[out]*/ pbstrName)
            throws ComException {
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
    }

    /**
     *
     */
    public void getScriptableObject(
            BStr /*[out]*/ pbstrName,
            IDispatch /*[out]*/ ppDispatch)
            throws ComException {
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName),
                        ppDispatch == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDispatch)
                }
        );
    }

    /**
     *
     */
    public void getCustomUIMode(
            BStr /*[out]*/ pbstrFile)
            throws ComException {
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFile == null ? (Parameter) PTR_NULL : new Pointer(pbstrFile)
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPRemoteMediaServicesImpl(this);
    }
}
