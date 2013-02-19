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
 * Represents COM interface IWMPNowDoingDispatch.
 */
public class IWMPNowDoingDispatchImpl extends IDispatchImpl
        implements IWMPNowDoingDispatch {
    public static final String INTERFACE_IDENTIFIER = IWMPNowDoingDispatch.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPNowDoingDispatchImpl() {
    }

    protected IWMPNowDoingDispatchImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPNowDoingDispatchImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPNowDoingDispatchImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPNowDoingDispatchImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method buyContent
     */
    public void buyContent()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method hideBasket
     */
    public void hideBasket()
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method burnNavigateToStatus
     */
    public void burnNavigateToStatus()
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method syncNavigateToStatus
     */
    public void syncNavigateToStatus()
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method logData
     */
    public void logData(
            BStr /*[in]*/ ID,
            BStr /*[in]*/ data)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ID == null ? (Parameter) PTR_NULL : ID,
                        data == null ? (Parameter) PTR_NULL : data
                }
        );
    }

    /**
     * method formatTime
     */
    public BStr formatTime(
            Int32 /*[in]*/ value)
            throws ComException {
        BStr pbstrReturn = new BStr();
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        value,
                        pbstrReturn == null ? (Parameter) PTR_NULL : new Pointer(pbstrReturn)
                }
        );
        return pbstrReturn;
    }

    /**
     *
     */
    public Int32 getDPI()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property mode
     */
    public BStr getMode()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_selectedDrive
     */
    public void setBurn_selectedDrive(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property burn_selectedDrive
     */
    public Int32 getBurn_selectedDrive()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_selectedDevice
     */
    public Int32 getSync_selectedDevice()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_selectedDevice
     */
    public void setSync_selectedDevice(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property burn_numDiscsSpanned
     */
    public Int32 getBurn_numDiscsSpanned()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method editPlaylist
     */
    public IDispatch getEditPlaylist()
            throws ComException {
        IDispatchImpl ppEditPlaylist = new IDispatchImpl();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppEditPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppEditPlaylist)
                }
        );
        return ppEditPlaylist;
    }

    /**
     * property basketPlaylistName
     */
    public BStr getBasketPlaylistName()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property isHighContrastMode
     */
    public VariantBool getIsHighContrastMode()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property allowRating
     */
    public VariantBool getAllowRating()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property allowShop
     */
    public VariantBool getAllowShop()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_mediaType
     */
    public BStr getBurn_mediaType()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_contentType
     */
    public BStr getBurn_contentType()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_freeSpace
     */
    public Int32 getBurn_freeSpace()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_totalSpace
     */
    public Int32 getBurn_totalSpace()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_driveName
     */
    public BStr getBurn_driveName()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_numDevices
     */
    public Int32 getBurn_numDevices()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_spaceToUse
     */
    public Int32 getBurn_spaceToUse()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property burn_percentComplete
     */
    public Int32 getBurn_percentComplete()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_spaceToUse
     */
    public Int32 getSync_spaceToUse()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_spaceUsed
     */
    public Int32 getSync_spaceUsed()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_totalSpace
     */
    public Int32 getSync_totalSpace()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_deviceName
     */
    public BStr getSync_deviceName()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_numDevices
     */
    public Int32 getSync_numDevices()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_oemName
     */
    public BStr getSync_oemName()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property sync_percentComplete
     */
    public Int32 getSync_percentComplete()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPNowDoingDispatchImpl(this);
    }
}
