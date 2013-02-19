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
 * Represents Java interface for COM interface IWMPEqualizerSettingsCtrl.
 */
public interface IWMPEqualizerSettingsCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{2BD3716F-A914-49FB-8655-996D5F495498}";

    /**
     * method reset
     */
    void reset()
            throws ComException;

    /**
     * method nextPreset
     */
    void nextPreset()
            throws ComException;

    /**
     * method previousPreset
     */
    void previousPreset()
            throws ComException;

    /**
     * property bypass
     */
    VariantBool getBypass()
            throws ComException;

    /**
     * property bypass
     */
    void setBypass(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property gainLevel1
     */
    SingleFloat getGainLevel1()
            throws ComException;

    /**
     * property gainLevel1
     */
    void setGainLevel1(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel2
     */
    SingleFloat getGainLevel2()
            throws ComException;

    /**
     * property gainLevel2
     */
    void setGainLevel2(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel3
     */
    SingleFloat getGainLevel3()
            throws ComException;

    /**
     * property gainLevel3
     */
    void setGainLevel3(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel4
     */
    SingleFloat getGainLevel4()
            throws ComException;

    /**
     * property gainLevel4
     */
    void setGainLevel4(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel5
     */
    SingleFloat getGainLevel5()
            throws ComException;

    /**
     * property gainLevel5
     */
    void setGainLevel5(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel6
     */
    SingleFloat getGainLevel6()
            throws ComException;

    /**
     * property gainLevel6
     */
    void setGainLevel6(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel7
     */
    SingleFloat getGainLevel7()
            throws ComException;

    /**
     * property gainLevel7
     */
    void setGainLevel7(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel8
     */
    SingleFloat getGainLevel8()
            throws ComException;

    /**
     * property gainLevel8
     */
    void setGainLevel8(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel9
     */
    SingleFloat getGainLevel9()
            throws ComException;

    /**
     * property gainLevel9
     */
    void setGainLevel9(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevel10
     */
    SingleFloat getGainLevel10()
            throws ComException;

    /**
     * property gainLevel10
     */
    void setGainLevel10(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     * property gainLevels
     */
    SingleFloat getGainLevels(
            Int32 /*[in]*/ iIndex)
            throws ComException;

    /**
     * property gainLevels
     */
    void setGainLevels(
            Int32 /*[in]*/ iIndex,
            SingleFloat /*[in]*/ pflLevel)
            throws ComException;

    /**
     *
     */
    Int32 getBands()
            throws ComException;

    /**
     * property currentPreset
     */
    Int32 getCurrentPreset()
            throws ComException;

    /**
     * property currentPreset
     */
    void setCurrentPreset(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property currentPresetTitle
     */
    BStr getCurrentPresetTitle()
            throws ComException;

    /**
     * property presetCount
     */
    Int32 getPresetCount()
            throws ComException;

    /**
     * property enhancedAudio
     */
    VariantBool getEnhancedAudio()
            throws ComException;

    /**
     * property enhancedAudio
     */
    void setEnhancedAudio(
            VariantBool /*[in]*/ pfVal)
            throws ComException;

    /**
     * property speakerSize
     */
    Int32 getSpeakerSize()
            throws ComException;

    /**
     * property speakerSize
     */
    void setSpeakerSize(
            Int32 /*[in]*/ plVal)
            throws ComException;

    /**
     * property currentSpeakerName
     */
    BStr getCurrentSpeakerName()
            throws ComException;

    /**
     * property truBassLevel
     */
    Int32 getTruBassLevel()
            throws ComException;

    /**
     * property truBassLevel
     */
    void setTruBassLevel(
            Int32 /*[in]*/ plTruBassLevel)
            throws ComException;

    /**
     * property wowLevel
     */
    Int32 getWowLevel()
            throws ComException;

    /**
     * property wowLevel
     */
    void setWowLevel(
            Int32 /*[in]*/ plWowLevel)
            throws ComException;

    /**
     * property splineTension
     */
    SingleFloat getSplineTension()
            throws ComException;

    /**
     * property splineTension
     */
    void setSplineTension(
            SingleFloat /*[in]*/ pflSplineTension)
            throws ComException;

    /**
     * property enableSplineTension
     */
    VariantBool getEnableSplineTension()
            throws ComException;

    /**
     * property enableSplineTension
     */
    void setEnableSplineTension(
            VariantBool /*[in]*/ pfEnableSplineTension)
            throws ComException;

    /**
     * property presetTitle
     */
    BStr getPresetTitle(
            Int32 /*[in]*/ iIndex)
            throws ComException;

    /**
     * property normalization
     */
    VariantBool getNormalization()
            throws ComException;

    /**
     * property normalization
     */
    void setNormalization(
            VariantBool /*[in]*/ pfVal)
            throws ComException;

    /**
     * property normalizationAverage
     */
    SingleFloat getNormalizationAverage()
            throws ComException;

    /**
     * property normalizationPeak
     */
    SingleFloat getNormalizationPeak()
            throws ComException;

    /**
     * property crossFade
     */
    VariantBool getCrossFade()
            throws ComException;

    /**
     * property crossFade
     */
    void setCrossFade(
            VariantBool /*[in]*/ pfVal)
            throws ComException;

    /**
     * property crossFadeWindow
     */
    Int32 getCrossFadeWindow()
            throws ComException;

    /**
     * property crossFadeWindow
     */
    void setCrossFadeWindow(
            Int32 /*[in]*/ plWindow)
            throws ComException;
}
