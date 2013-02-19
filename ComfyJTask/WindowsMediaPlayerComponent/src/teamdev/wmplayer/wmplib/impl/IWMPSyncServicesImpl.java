package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPSyncServices.
 */
public class IWMPSyncServicesImpl extends IUnknownImpl
        implements IWMPSyncServices {
    public static final String INTERFACE_IDENTIFIER = IWMPSyncServices.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSyncServicesImpl() {
    }

    protected IWMPSyncServicesImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSyncServicesImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSyncServicesImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSyncServicesImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public IWMPSyncDevice getDevice(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        IWMPSyncDeviceImpl ppDevice = new IWMPSyncDeviceImpl();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        ppDevice == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDevice)
                }
        );
        return ppDevice;
    }

    /**
     *
     */
    public Int32 getDeviceCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSyncServicesImpl(this);
    }
}
