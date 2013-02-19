package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPDMRRenderingControlService.
 */
public interface IWMPDMRRenderingControlService extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{FF4B1BDA-19F0-42CF-8DDA-19162950C543}";

    /**
     * Method ListPresets
     */
    void listPresets(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in,out]*/ pbstrCurrentPresetList)
            throws ComException;

    /**
     * Method SelectPreset
     */
    void selectPreset(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrPresetName)
            throws ComException;

    /**
     * Method GetMute
     */
    void getMute(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            VariantBool /*[in,out]*/ pbCurrentMute)
            throws ComException;

    /**
     * Method SetMute
     */
    void setMute(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            VariantBool /*[in]*/ bDesiredMute)
            throws ComException;

    /**
     * Method GetVolume
     */
    void getVolume(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            UInt16 /*[in,out]*/ puiCurrentVolume)
            throws ComException;

    /**
     * Method SetVolume
     */
    void setVolume(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrChannel,
            UInt16 /*[in]*/ uiDesiredVolume)
            throws ComException;

    /**
     * Property LastChange
     */
    BStr getLastChange()
            throws ComException;

    /**
     * Property PresetNameList
     */
    BStr getPresetNameList()
            throws ComException;

    /**
     * Property Mute
     */
    VariantBool getMuteProperty()
            throws ComException;

    /**
     * Property Volume
     */
    UInt16 getVolumeProperty()
            throws ComException;

    /**
     * Property A_ARG_TYPE_Channel
     */
    BStr getA_ARG_TYPE_Channel()
            throws ComException;

    /**
     * Property A_ARG_TYPE_InstanceID
     */
    UInt32 getA_ARG_TYPE_InstanceID()
            throws ComException;

    /**
     * Property A_ARG_TYPE_PresetName
     */
    BStr getA_ARG_TYPE_PresetName()
            throws ComException;
}
