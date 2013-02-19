package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPSyncDevice.
 */
public class IWMPSyncDeviceImpl extends IUnknownImpl
        implements IWMPSyncDevice {
    public static final String INTERFACE_IDENTIFIER = IWMPSyncDevice.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSyncDeviceImpl() {
    }

    protected IWMPSyncDeviceImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSyncDeviceImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSyncDeviceImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSyncDeviceImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     *
     */
    public void createPartnership(
            VariantBool /*[in]*/ vbShowUI)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        vbShowUI
                }
        );
    }

    /**
     *
     */
    public void deletePartnership()
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void start()
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void stop()
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void showSettings()
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public VariantBool isIdentical(
            IWMPSyncDevice /*[in]*/ pDevice)
            throws ComException {
        VariantBool pvbool = new VariantBool();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                        pvbool == null ? (Parameter) PTR_NULL : new Pointer(pvbool)
                }
        );
        return pvbool;
    }

    /**
     *
     */
    public BStr getFriendlyName()
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     *
     */
    public void setFriendlyName(
            BStr /*[in]*/ pbstrName)
            throws ComException {
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : pbstrName
                }
        );
    }

    /**
     *
     */
    public BStr getDeviceName()
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     *
     */
    public BStr getDeviceId()
            throws ComException {
        BStr pbstrDeviceId = new BStr();
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDeviceId == null ? (Parameter) PTR_NULL : new Pointer(pbstrDeviceId)
                }
        );
        return pbstrDeviceId;
    }

    /**
     *
     */
    public Int32 getPartnershipIndex()
            throws ComException {
        Int32 plIndex = new Int32();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plIndex == null ? (Parameter) PTR_NULL : new Pointer(plIndex)
                }
        );
        return plIndex;
    }

    /**
     *
     */
    public VariantBool getConnected()
            throws ComException {
        VariantBool pvbConnected = new VariantBool();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pvbConnected == null ? (Parameter) PTR_NULL : new Pointer(pvbConnected)
                }
        );
        return pvbConnected;
    }

    /**
     *
     */
    public WMPDeviceStatus getStatus()
            throws ComException {
        WMPDeviceStatus pwmpds = new WMPDeviceStatus();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpds == null ? (Parameter) PTR_NULL : new Pointer(pwmpds)
                }
        );
        return pwmpds;
    }

    /**
     *
     */
    public WMPSyncState getSyncState()
            throws ComException {
        WMPSyncState pwmpss = new WMPSyncState();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpss == null ? (Parameter) PTR_NULL : new Pointer(pwmpss)
                }
        );
        return pwmpss;
    }

    /**
     *
     */
    public Int32 getProgress()
            throws ComException {
        Int32 plProgress = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plProgress == null ? (Parameter) PTR_NULL : new Pointer(plProgress)
                }
        );
        return plProgress;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSyncDeviceImpl(this);
    }
}
