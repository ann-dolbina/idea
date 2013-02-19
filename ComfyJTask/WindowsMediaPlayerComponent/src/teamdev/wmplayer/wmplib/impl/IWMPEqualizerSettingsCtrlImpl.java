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
 * Represents COM interface IWMPEqualizerSettingsCtrl.
 */
public class IWMPEqualizerSettingsCtrlImpl extends IDispatchImpl
        implements IWMPEqualizerSettingsCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPEqualizerSettingsCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEqualizerSettingsCtrlImpl() {
    }

    protected IWMPEqualizerSettingsCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEqualizerSettingsCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEqualizerSettingsCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEqualizerSettingsCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method reset
     */
    public void reset()
            throws ComException {
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method nextPreset
     */
    public void nextPreset()
            throws ComException {
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method previousPreset
     */
    public void previousPreset()
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property bypass
     */
    public VariantBool getBypass()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property bypass
     */
    public void setBypass(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property gainLevel1
     */
    public SingleFloat getGainLevel1()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel1
     */
    public void setGainLevel1(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel2
     */
    public SingleFloat getGainLevel2()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel2
     */
    public void setGainLevel2(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel3
     */
    public SingleFloat getGainLevel3()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel3
     */
    public void setGainLevel3(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel4
     */
    public SingleFloat getGainLevel4()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel4
     */
    public void setGainLevel4(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel5
     */
    public SingleFloat getGainLevel5()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel5
     */
    public void setGainLevel5(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel6
     */
    public SingleFloat getGainLevel6()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel6
     */
    public void setGainLevel6(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel7
     */
    public SingleFloat getGainLevel7()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel7
     */
    public void setGainLevel7(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel8
     */
    public SingleFloat getGainLevel8()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel8
     */
    public void setGainLevel8(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel9
     */
    public SingleFloat getGainLevel9()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel9
     */
    public void setGainLevel9(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevel10
     */
    public SingleFloat getGainLevel10()
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevel10
     */
    public void setGainLevel10(
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflLevel
                }
        );
    }

    /**
     * property gainLevels
     */
    public SingleFloat getGainLevels(
            Int32 /*[in]*/ iIndex)
            throws ComException {
        SingleFloat pflLevel = new SingleFloat();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        iIndex,
                        pflLevel == null ? (Parameter) PTR_NULL : new Pointer(pflLevel)
                }
        );
        return pflLevel;
    }

    /**
     * property gainLevels
     */
    public void setGainLevels(
            Int32 /*[in]*/ iIndex,
            SingleFloat /*[in]*/ pflLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        iIndex,
                        pflLevel
                }
        );
    }

    /**
     *
     */
    public Int32 getBands()
            throws ComException {
        Int32 pbands = new Int32();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbands == null ? (Parameter) PTR_NULL : new Pointer(pbands)
                }
        );
        return pbands;
    }

    /**
     * property currentPreset
     */
    public Int32 getCurrentPreset()
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
     * property currentPreset
     */
    public void setCurrentPreset(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property currentPresetTitle
     */
    public BStr getCurrentPresetTitle()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property presetCount
     */
    public Int32 getPresetCount()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property enhancedAudio
     */
    public VariantBool getEnhancedAudio()
            throws ComException {
        VariantBool pfVal = new VariantBool();
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal == null ? (Parameter) PTR_NULL : new Pointer(pfVal)
                }
        );
        return pfVal;
    }

    /**
     * property enhancedAudio
     */
    public void setEnhancedAudio(
            VariantBool /*[in]*/ pfVal)
            throws ComException {
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal
                }
        );
    }

    /**
     * property speakerSize
     */
    public Int32 getSpeakerSize()
            throws ComException {
        Int32 plVal = new Int32();
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plVal == null ? (Parameter) PTR_NULL : new Pointer(plVal)
                }
        );
        return plVal;
    }

    /**
     * property speakerSize
     */
    public void setSpeakerSize(
            Int32 /*[in]*/ plVal)
            throws ComException {
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plVal
                }
        );
    }

    /**
     * property currentSpeakerName
     */
    public BStr getCurrentSpeakerName()
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     * property truBassLevel
     */
    public Int32 getTruBassLevel()
            throws ComException {
        Int32 plTruBassLevel = new Int32();
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plTruBassLevel == null ? (Parameter) PTR_NULL : new Pointer(plTruBassLevel)
                }
        );
        return plTruBassLevel;
    }

    /**
     * property truBassLevel
     */
    public void setTruBassLevel(
            Int32 /*[in]*/ plTruBassLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plTruBassLevel
                }
        );
    }

    /**
     * property wowLevel
     */
    public Int32 getWowLevel()
            throws ComException {
        Int32 plWowLevel = new Int32();
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plWowLevel == null ? (Parameter) PTR_NULL : new Pointer(plWowLevel)
                }
        );
        return plWowLevel;
    }

    /**
     * property wowLevel
     */
    public void setWowLevel(
            Int32 /*[in]*/ plWowLevel)
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plWowLevel
                }
        );
    }

    /**
     * property splineTension
     */
    public SingleFloat getSplineTension()
            throws ComException {
        SingleFloat pflSplineTension = new SingleFloat();
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflSplineTension == null ? (Parameter) PTR_NULL : new Pointer(pflSplineTension)
                }
        );
        return pflSplineTension;
    }

    /**
     * property splineTension
     */
    public void setSplineTension(
            SingleFloat /*[in]*/ pflSplineTension)
            throws ComException {
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflSplineTension
                }
        );
    }

    /**
     * property enableSplineTension
     */
    public VariantBool getEnableSplineTension()
            throws ComException {
        VariantBool pfEnableSplineTension = new VariantBool();
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfEnableSplineTension == null ? (Parameter) PTR_NULL : new Pointer(pfEnableSplineTension)
                }
        );
        return pfEnableSplineTension;
    }

    /**
     * property enableSplineTension
     */
    public void setEnableSplineTension(
            VariantBool /*[in]*/ pfEnableSplineTension)
            throws ComException {
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfEnableSplineTension
                }
        );
    }

    /**
     * property presetTitle
     */
    public BStr getPresetTitle(
            Int32 /*[in]*/ iIndex)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        iIndex,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property normalization
     */
    public VariantBool getNormalization()
            throws ComException {
        VariantBool pfVal = new VariantBool();
        invokeStandardVirtualMethod(
                53,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal == null ? (Parameter) PTR_NULL : new Pointer(pfVal)
                }
        );
        return pfVal;
    }

    /**
     * property normalization
     */
    public void setNormalization(
            VariantBool /*[in]*/ pfVal)
            throws ComException {
        invokeStandardVirtualMethod(
                54,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal
                }
        );
    }

    /**
     * property normalizationAverage
     */
    public SingleFloat getNormalizationAverage()
            throws ComException {
        SingleFloat pflAverage = new SingleFloat();
        invokeStandardVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflAverage == null ? (Parameter) PTR_NULL : new Pointer(pflAverage)
                }
        );
        return pflAverage;
    }

    /**
     * property normalizationPeak
     */
    public SingleFloat getNormalizationPeak()
            throws ComException {
        SingleFloat pflPeak = new SingleFloat();
        invokeStandardVirtualMethod(
                56,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pflPeak == null ? (Parameter) PTR_NULL : new Pointer(pflPeak)
                }
        );
        return pflPeak;
    }

    /**
     * property crossFade
     */
    public VariantBool getCrossFade()
            throws ComException {
        VariantBool pfVal = new VariantBool();
        invokeStandardVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal == null ? (Parameter) PTR_NULL : new Pointer(pfVal)
                }
        );
        return pfVal;
    }

    /**
     * property crossFade
     */
    public void setCrossFade(
            VariantBool /*[in]*/ pfVal)
            throws ComException {
        invokeStandardVirtualMethod(
                58,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal
                }
        );
    }

    /**
     * property crossFadeWindow
     */
    public Int32 getCrossFadeWindow()
            throws ComException {
        Int32 plWindow = new Int32();
        invokeStandardVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plWindow == null ? (Parameter) PTR_NULL : new Pointer(plWindow)
                }
        );
        return plWindow;
    }

    /**
     * property crossFadeWindow
     */
    public void setCrossFadeWindow(
            Int32 /*[in]*/ plWindow)
            throws ComException {
        invokeStandardVirtualMethod(
                60,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plWindow
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEqualizerSettingsCtrlImpl(this);
    }
}
