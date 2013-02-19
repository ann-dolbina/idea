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
 * Represents COM interface IWMPDMRRenderingControlService.
 */
public class IWMPDMRRenderingControlServiceImpl extends IDispatchImpl
        implements IWMPDMRRenderingControlService {
    public static final String INTERFACE_IDENTIFIER = IWMPDMRRenderingControlService.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDMRRenderingControlServiceImpl() {
    }

    protected IWMPDMRRenderingControlServiceImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDMRRenderingControlServiceImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDMRRenderingControlServiceImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDMRRenderingControlServiceImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Method ListPresets
     */
    public void listPresets(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in,out]*/ pbstrCurrentPresetList)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pbstrCurrentPresetList == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentPresetList)
                }
        );
    }

    /**
     * Method SelectPreset
     */
    public void selectPreset(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrPresetName)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrPresetName == null ? (Parameter) PTR_NULL : bstrPresetName
                }
        );
    }

    /**
     * Method GetMute
     */
    public void getMute(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            VariantBool /*[in,out]*/ pbCurrentMute)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrChannel == null ? (Parameter) PTR_NULL : bstrChannel,
                        pbCurrentMute == null ? (Parameter) PTR_NULL : new Pointer(pbCurrentMute)
                }
        );
    }

    /**
     * Method SetMute
     */
    public void setMute(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            VariantBool /*[in]*/ bDesiredMute)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrChannel == null ? (Parameter) PTR_NULL : bstrChannel,
                        bDesiredMute
                }
        );
    }

    /**
     * Method GetVolume
     */
    public void getVolume(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            UInt16 /*[in,out]*/ puiCurrentVolume)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrChannel == null ? (Parameter) PTR_NULL : bstrChannel,
                        puiCurrentVolume == null ? (Parameter) PTR_NULL : new Pointer(puiCurrentVolume)
                }
        );
    }

    /**
     * Method SetVolume
     */
    public void setVolume(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            UInt16 /*[in]*/ uiDesiredVolume)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrChannel == null ? (Parameter) PTR_NULL : bstrChannel,
                        uiDesiredVolume
                }
        );
    }

    /**
     * Property LastChange
     */
    public BStr getLastChange()
            throws ComException {
        BStr pbstrLastChange = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLastChange == null ? (Parameter) PTR_NULL : new Pointer(pbstrLastChange)
                }
        );
        return pbstrLastChange;
    }

    /**
     * Property PresetNameList
     */
    public BStr getPresetNameList()
            throws ComException {
        BStr pbstrPresetNameList = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrPresetNameList == null ? (Parameter) PTR_NULL : new Pointer(pbstrPresetNameList)
                }
        );
        return pbstrPresetNameList;
    }

    /**
     * Property Mute
     */
    public VariantBool getMuteProperty()
            throws ComException {
        VariantBool pbMute = new VariantBool();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbMute == null ? (Parameter) PTR_NULL : new Pointer(pbMute)
                }
        );
        return pbMute;
    }

    /**
     * Property Volume
     */
    public UInt16 getVolumeProperty()
            throws ComException {
        UInt16 puiVolume = new UInt16();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        puiVolume == null ? (Parameter) PTR_NULL : new Pointer(puiVolume)
                }
        );
        return puiVolume;
    }

    /**
     * Property A_ARG_TYPE_Channel
     */
    public BStr getA_ARG_TYPE_Channel()
            throws ComException {
        BStr pbstrA_ARG_TYPE_Channel = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrA_ARG_TYPE_Channel == null ? (Parameter) PTR_NULL : new Pointer(pbstrA_ARG_TYPE_Channel)
                }
        );
        return pbstrA_ARG_TYPE_Channel;
    }

    /**
     * Property A_ARG_TYPE_InstanceID
     */
    public UInt32 getA_ARG_TYPE_InstanceID()
            throws ComException {
        UInt32 pulA_ARG_TYPE_InstanceID = new UInt32();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pulA_ARG_TYPE_InstanceID == null ? (Parameter) PTR_NULL : new Pointer(pulA_ARG_TYPE_InstanceID)
                }
        );
        return pulA_ARG_TYPE_InstanceID;
    }

    /**
     * Property A_ARG_TYPE_PresetName
     */
    public BStr getA_ARG_TYPE_PresetName()
            throws ComException {
        BStr pbstrA_ARG_TYPE_PresetName = new BStr();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrA_ARG_TYPE_PresetName == null ? (Parameter) PTR_NULL : new Pointer(pbstrA_ARG_TYPE_PresetName)
                }
        );
        return pbstrA_ARG_TYPE_PresetName;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDMRRenderingControlServiceImpl(this);
    }
}
