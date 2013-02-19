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
 * Represents COM interface IWMPLayoutSettingsDispatch.
 */
public class IWMPLayoutSettingsDispatchImpl extends IDispatchImpl
        implements IWMPLayoutSettingsDispatch {
    public static final String INTERFACE_IDENTIFIER = IWMPLayoutSettingsDispatch.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLayoutSettingsDispatchImpl() {
    }

    protected IWMPLayoutSettingsDispatchImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLayoutSettingsDispatchImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLayoutSettingsDispatchImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLayoutSettingsDispatchImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method getNamedString
     */
    public BStr getNamedString(
            BStr /*[in]*/ bstrName)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     * method getDurationStringFromSeconds
     */
    public BStr getDurationStringFromSeconds(
            Int32 /*[in]*/ lDurationVal)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lDurationVal,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     * property effectType
     */
    public BStr getEffectType()
            throws ComException {
        BStr pVal = new BStr();
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
     * property effectType
     */
    public void setEffectType(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property effectPreset
     */
    public Int32 getEffectPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property effectPreset
     */
    public void setEffectPreset(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property settingsView
     */
    public BStr getSettingsView()
            throws ComException {
        BStr pVal = new BStr();
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
     * property settingsView
     */
    public void setSettingsView(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property videoZoom
     */
    public Int32 getVideoZoom()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property videoZoom
     */
    public void setVideoZoom(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property videoShrinkToFit
     */
    public VariantBool getVideoShrinkToFit()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property videoShrinkToFit
     */
    public void setVideoShrinkToFit(
            VariantBool /*[in]*/ pVal)
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
     * property videoStretchToFit
     */
    public VariantBool getVideoStretchToFit()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property videoStretchToFit
     */
    public void setVideoStretchToFit(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property userVideoStretchToFit
     */
    public VariantBool getUserVideoStretchToFit()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property userVideoStretchToFit
     */
    public void setUserVideoStretchToFit(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showCaptions
     */
    public VariantBool getShowCaptions()
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
     * property showCaptions
     */
    public void setShowCaptions(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showTitles
     */
    public VariantBool getShowTitles()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property showTitles
     */
    public void setShowTitles(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showEffects
     */
    public VariantBool getShowEffects()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property showEffects
     */
    public void setShowEffects(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showFullScreenPlaylist
     */
    public VariantBool getShowFullScreenPlaylist()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property showFullScreenPlaylist
     */
    public void setShowFullScreenPlaylist(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property contrastMode
     */
    public BStr getContrastMode()
            throws ComException {
        BStr pVal = new BStr();
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
     * property displayView
     */
    public BStr getDisplayView()
            throws ComException {
        BStr pVal = new BStr();
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
     * property displayView
     */
    public void setDisplayView(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property metadataView
     */
    public BStr getMetadataView()
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
     * property metadataView
     */
    public void setMetadataView(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property showSettings
     */
    public VariantBool getShowSettings()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property showSettings
     */
    public void setShowSettings(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showResizeBars
     */
    public VariantBool getShowResizeBars()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property showResizeBars
     */
    public void setShowResizeBars(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showPlaylist
     */
    public VariantBool getShowPlaylist()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property showPlaylist
     */
    public void setShowPlaylist(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property showMetadata
     */
    public VariantBool getShowMetadata()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property showMetadata
     */
    public void setShowMetadata(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property settingsWidth
     */
    public Int32 getSettingsWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property settingsWidth
     */
    public void setSettingsWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property settingsHeight
     */
    public Int32 getSettingsHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property settingsHeight
     */
    public void setSettingsHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property playlistWidth
     */
    public Int32 getPlaylistWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property playlistWidth
     */
    public void setPlaylistWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property playlistHeight
     */
    public Int32 getPlaylistHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property playlistHeight
     */
    public void setPlaylistHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property metadataWidth
     */
    public Int32 getMetadataWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property metadataWidth
     */
    public void setMetadataWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                53,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property metadataHeight
     */
    public Int32 getMetadataHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                54,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property metadataHeight
     */
    public void setMetadataHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property fullScreenAvailable
     */
    public VariantBool getFullScreenAvailable()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                56,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property fullScreenAvailable
     */
    public void setFullScreenAvailable(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property fullScreenRequest
     */
    public VariantBool getFullScreenRequest()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                58,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property fullScreenRequest
     */
    public void setFullScreenRequest(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property quickHide
     */
    public VariantBool getQuickHide()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                60,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property quickHide
     */
    public void setQuickHide(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                61,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property displayPreset
     */
    public Int32 getDisplayPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                62,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property displayPreset
     */
    public void setDisplayPreset(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                63,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property settingsPreset
     */
    public Int32 getSettingsPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                64,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property settingsPreset
     */
    public void setSettingsPreset(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                65,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property metadataPreset
     */
    public Int32 getMetadataPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                66,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property metadataPreset
     */
    public void setMetadataPreset(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                67,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property userDisplayView
     */
    public BStr getUserDisplayView()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                68,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPDisplayView
     */
    public BStr getUserWMPDisplayView()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                69,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userDisplayPreset
     */
    public Int32 getUserDisplayPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                70,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPDisplayPreset
     */
    public Int32 getUserWMPDisplayPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                71,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property dynamicRangeControl
     */
    public Int32 getDynamicRangeControl()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                72,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property dynamicRangeControl
     */
    public void setDynamicRangeControl(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                73,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property slowRate
     */
    public SingleFloat getSlowRate()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                74,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property slowRate
     */
    public void setSlowRate(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                75,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property fastRate
     */
    public SingleFloat getFastRate()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                76,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property fastRate
     */
    public void setFastRate(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                77,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property buttonHueShift
     */
    public SingleFloat getButtonHueShift()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                78,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property buttonHueShift
     */
    public void setButtonHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                79,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property buttonSaturation
     */
    public SingleFloat getButtonSaturation()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                80,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property buttonSaturation
     */
    public void setButtonSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                81,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property backHueShift
     */
    public SingleFloat getBackHueShift()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                82,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property backHueShift
     */
    public void setBackHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                83,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property backSaturation
     */
    public SingleFloat getBackSaturation()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                84,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property backSaturation
     */
    public void setBackSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                85,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property vizRequest
     */
    public Int32 getVizRequest()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                86,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property vizRequest
     */
    public void setVizRequest(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                87,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property appColorLight
     */
    public BStr getAppColorLight()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                88,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property appColorMedium
     */
    public BStr getAppColorMedium()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                89,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property appColorDark
     */
    public BStr getAppColorDark()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                90,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property toolbarButtonHighlight
     */
    public BStr getToolbarButtonHighlight()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                91,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property toolbarButtonShadow
     */
    public BStr getToolbarButtonShadow()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                92,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property toolbarButtonFace
     */
    public BStr getToolbarButtonFace()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                93,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property itemPlayingColor
     */
    public BStr getItemPlayingColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                94,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property itemPlayingBackgroundColor
     */
    public BStr getItemPlayingBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                95,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property itemErrorColor
     */
    public BStr getItemErrorColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                96,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property AppColorLimited
     */
    public VariantBool getAppColorLimited()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                97,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property AppColorBlackBackground
     */
    public VariantBool getAppColorBlackBackground()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                98,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property AppColorBlackBackground
     */
    public void setAppColorBlackBackground(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                99,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property appColorVideoBorder
     */
    public BStr getAppColorVideoBorder()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                100,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property appColorVideoBorder
     */
    public void setAppColorVideoBorder(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                101,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux1()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                102,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux2()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                103,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux3()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                104,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux4()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                105,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux5()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                106,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux6()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                107,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux7()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                108,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux8()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                109,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux9()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                110,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux10()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                111,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux11()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                112,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux12()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                113,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux13()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                114,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux14()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                115,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * auxiliary color
     */
    public BStr getAppColorAux15()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                116,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * status string for remote player (taskbar player)
     */
    public BStr getStatus()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                117,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * status string for remote player (taskbar player)
     */
    public void setStatus(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                118,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property userWMPSettingsView
     */
    public BStr getUserWMPSettingsView()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                119,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPSettingsPreset
     */
    public Int32 getUserWMPSettingsPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                120,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPShowSettings
     */
    public VariantBool getUserWMPShowSettings()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                121,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPMetadataView
     */
    public BStr getUserWMPMetadataView()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                122,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPMetadataPreset
     */
    public Int32 getUserWMPMetadataPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                123,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property userWMPShowMetadata
     */
    public VariantBool getUserWMPShowMetadata()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                124,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property captionsHeight
     */
    public Int32 getCaptionsHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                125,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property captionsHeight
     */
    public void setCaptionsHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                126,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property snapToVideo
     */
    public VariantBool getSnapToVideo()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                127,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property snapToVideo
     */
    public void setSnapToVideo(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                128,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property pinFullScreenControls
     */
    public VariantBool getPinFullScreenControls()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                129,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property pinFullScreenControls
     */
    public void setPinFullScreenControls(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                130,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property isMultiMon
     */
    public VariantBool getIsMultiMon()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                131,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property exclusiveHueShift
     */
    public SingleFloat getExclusiveHueShift()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                132,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property exclusiveHueShift
     */
    public void setExclusiveHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                133,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property exclusiveSaturation
     */
    public SingleFloat getExclusiveSaturation()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                134,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property exclusiveSaturation
     */
    public void setExclusiveSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                135,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * themeBkgColorIsActive
     */
    public VariantBool getThemeBkgColorIsActive()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                136,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * themeBkgColorIsActive
     */
    public void setThemeBkgColorIsActive(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                137,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * themeBkgColorActive
     */
    public BStr getThemeBkgColorActive()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                138,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * themeBkgColorInactive
     */
    public BStr getThemeBkgColorInactive()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                139,
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
        return new IWMPLayoutSettingsDispatchImpl(this);
    }
}
