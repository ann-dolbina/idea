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
 * Represents COM interface IWMPEvents2.
 */
public class IWMPEvents2Impl extends IWMPEventsImpl
        implements IWMPEvents2 {
    public static final String INTERFACE_IDENTIFIER = IWMPEvents2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEvents2Impl() {
    }

    protected IWMPEvents2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEvents2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEvents2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEvents2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Occurs when a device is connected
     */
    public void deviceConnect(
            IWMPSyncDevice /*[in]*/ pDevice) {
        invokeVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice
                }
        );
    }

    /**
     * Occurs when a device is disconnected
     */
    public void deviceDisconnect(
            IWMPSyncDevice /*[in]*/ pDevice) {
        invokeVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice
                }
        );
    }

    /**
     * Occurs when a device status changes
     */
    public void deviceStatusChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPDeviceStatus /*[in]*/ NewStatus) {
        invokeVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                        NewStatus
                }
        );
    }

    /**
     * Occurs when a device sync state changes
     */
    public void deviceSyncStateChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPSyncState /*[in]*/ NewState) {
        invokeVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                        NewState
                }
        );
    }

    /**
     * Occurs when a device's media has an error
     */
    public void deviceSyncError(
            IWMPSyncDevice /*[in]*/ pDevice,
            IDispatch /*[in]*/ pMedia) {
        invokeVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                        pMedia == null ? (Parameter) PTR_NULL : (Parameter) pMedia
                }
        );
    }

    /**
     * Occurs when createPartnership call completes
     */
    public void createPartnershipComplete(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult) {
        invokeVirtualMethod(
                53,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                        hrResult
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEvents2Impl(this);
    }
}
