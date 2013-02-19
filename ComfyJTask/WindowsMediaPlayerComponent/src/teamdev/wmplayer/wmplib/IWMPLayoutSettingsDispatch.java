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
 * Represents Java interface for COM interface IWMPLayoutSettingsDispatch.
 */
public interface IWMPLayoutSettingsDispatch extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{B2C2D18E-97AF-4B6A-A56B-2FFFF470FB81}";

    /**
     * method getNamedString
     */
    BStr getNamedString(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * method getDurationStringFromSeconds
     */
    BStr getDurationStringFromSeconds(
            Int32 /*[in]*/ lDurationVal)
            throws ComException;

    /**
     * property effectType
     */
    BStr getEffectType()
            throws ComException;

    /**
     * property effectType
     */
    void setEffectType(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property effectPreset
     */
    Int32 getEffectPreset()
            throws ComException;

    /**
     * property effectPreset
     */
    void setEffectPreset(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property settingsView
     */
    BStr getSettingsView()
            throws ComException;

    /**
     * property settingsView
     */
    void setSettingsView(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property videoZoom
     */
    Int32 getVideoZoom()
            throws ComException;

    /**
     * property videoZoom
     */
    void setVideoZoom(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property videoShrinkToFit
     */
    VariantBool getVideoShrinkToFit()
            throws ComException;

    /**
     * property videoShrinkToFit
     */
    void setVideoShrinkToFit(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property videoStretchToFit
     */
    VariantBool getVideoStretchToFit()
            throws ComException;

    /**
     * property videoStretchToFit
     */
    void setVideoStretchToFit(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property userVideoStretchToFit
     */
    VariantBool getUserVideoStretchToFit()
            throws ComException;

    /**
     * property userVideoStretchToFit
     */
    void setUserVideoStretchToFit(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showCaptions
     */
    VariantBool getShowCaptions()
            throws ComException;

    /**
     * property showCaptions
     */
    void setShowCaptions(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showTitles
     */
    VariantBool getShowTitles()
            throws ComException;

    /**
     * property showTitles
     */
    void setShowTitles(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showEffects
     */
    VariantBool getShowEffects()
            throws ComException;

    /**
     * property showEffects
     */
    void setShowEffects(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showFullScreenPlaylist
     */
    VariantBool getShowFullScreenPlaylist()
            throws ComException;

    /**
     * property showFullScreenPlaylist
     */
    void setShowFullScreenPlaylist(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property contrastMode
     */
    BStr getContrastMode()
            throws ComException;

    /**
     * property displayView
     */
    BStr getDisplayView()
            throws ComException;

    /**
     * property displayView
     */
    void setDisplayView(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property metadataView
     */
    BStr getMetadataView()
            throws ComException;

    /**
     * property metadataView
     */
    void setMetadataView(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property showSettings
     */
    VariantBool getShowSettings()
            throws ComException;

    /**
     * property showSettings
     */
    void setShowSettings(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showResizeBars
     */
    VariantBool getShowResizeBars()
            throws ComException;

    /**
     * property showResizeBars
     */
    void setShowResizeBars(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showPlaylist
     */
    VariantBool getShowPlaylist()
            throws ComException;

    /**
     * property showPlaylist
     */
    void setShowPlaylist(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property showMetadata
     */
    VariantBool getShowMetadata()
            throws ComException;

    /**
     * property showMetadata
     */
    void setShowMetadata(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property settingsWidth
     */
    Int32 getSettingsWidth()
            throws ComException;

    /**
     * property settingsWidth
     */
    void setSettingsWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property settingsHeight
     */
    Int32 getSettingsHeight()
            throws ComException;

    /**
     * property settingsHeight
     */
    void setSettingsHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property playlistWidth
     */
    Int32 getPlaylistWidth()
            throws ComException;

    /**
     * property playlistWidth
     */
    void setPlaylistWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property playlistHeight
     */
    Int32 getPlaylistHeight()
            throws ComException;

    /**
     * property playlistHeight
     */
    void setPlaylistHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property metadataWidth
     */
    Int32 getMetadataWidth()
            throws ComException;

    /**
     * property metadataWidth
     */
    void setMetadataWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property metadataHeight
     */
    Int32 getMetadataHeight()
            throws ComException;

    /**
     * property metadataHeight
     */
    void setMetadataHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property fullScreenAvailable
     */
    VariantBool getFullScreenAvailable()
            throws ComException;

    /**
     * property fullScreenAvailable
     */
    void setFullScreenAvailable(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property fullScreenRequest
     */
    VariantBool getFullScreenRequest()
            throws ComException;

    /**
     * property fullScreenRequest
     */
    void setFullScreenRequest(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property quickHide
     */
    VariantBool getQuickHide()
            throws ComException;

    /**
     * property quickHide
     */
    void setQuickHide(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property displayPreset
     */
    Int32 getDisplayPreset()
            throws ComException;

    /**
     * property displayPreset
     */
    void setDisplayPreset(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property settingsPreset
     */
    Int32 getSettingsPreset()
            throws ComException;

    /**
     * property settingsPreset
     */
    void setSettingsPreset(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property metadataPreset
     */
    Int32 getMetadataPreset()
            throws ComException;

    /**
     * property metadataPreset
     */
    void setMetadataPreset(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property userDisplayView
     */
    BStr getUserDisplayView()
            throws ComException;

    /**
     * property userWMPDisplayView
     */
    BStr getUserWMPDisplayView()
            throws ComException;

    /**
     * property userDisplayPreset
     */
    Int32 getUserDisplayPreset()
            throws ComException;

    /**
     * property userWMPDisplayPreset
     */
    Int32 getUserWMPDisplayPreset()
            throws ComException;

    /**
     * property dynamicRangeControl
     */
    Int32 getDynamicRangeControl()
            throws ComException;

    /**
     * property dynamicRangeControl
     */
    void setDynamicRangeControl(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property slowRate
     */
    SingleFloat getSlowRate()
            throws ComException;

    /**
     * property slowRate
     */
    void setSlowRate(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property fastRate
     */
    SingleFloat getFastRate()
            throws ComException;

    /**
     * property fastRate
     */
    void setFastRate(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property buttonHueShift
     */
    SingleFloat getButtonHueShift()
            throws ComException;

    /**
     * property buttonHueShift
     */
    void setButtonHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property buttonSaturation
     */
    SingleFloat getButtonSaturation()
            throws ComException;

    /**
     * property buttonSaturation
     */
    void setButtonSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property backHueShift
     */
    SingleFloat getBackHueShift()
            throws ComException;

    /**
     * property backHueShift
     */
    void setBackHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property backSaturation
     */
    SingleFloat getBackSaturation()
            throws ComException;

    /**
     * property backSaturation
     */
    void setBackSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property vizRequest
     */
    Int32 getVizRequest()
            throws ComException;

    /**
     * property vizRequest
     */
    void setVizRequest(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property appColorLight
     */
    BStr getAppColorLight()
            throws ComException;

    /**
     * property appColorMedium
     */
    BStr getAppColorMedium()
            throws ComException;

    /**
     * property appColorDark
     */
    BStr getAppColorDark()
            throws ComException;

    /**
     * property toolbarButtonHighlight
     */
    BStr getToolbarButtonHighlight()
            throws ComException;

    /**
     * property toolbarButtonShadow
     */
    BStr getToolbarButtonShadow()
            throws ComException;

    /**
     * property toolbarButtonFace
     */
    BStr getToolbarButtonFace()
            throws ComException;

    /**
     * property itemPlayingColor
     */
    BStr getItemPlayingColor()
            throws ComException;

    /**
     * property itemPlayingBackgroundColor
     */
    BStr getItemPlayingBackgroundColor()
            throws ComException;

    /**
     * property itemErrorColor
     */
    BStr getItemErrorColor()
            throws ComException;

    /**
     * property AppColorLimited
     */
    VariantBool getAppColorLimited()
            throws ComException;

    /**
     * property AppColorBlackBackground
     */
    VariantBool getAppColorBlackBackground()
            throws ComException;

    /**
     * property AppColorBlackBackground
     */
    void setAppColorBlackBackground(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property appColorVideoBorder
     */
    BStr getAppColorVideoBorder()
            throws ComException;

    /**
     * property appColorVideoBorder
     */
    void setAppColorVideoBorder(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux1()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux2()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux3()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux4()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux5()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux6()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux7()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux8()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux9()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux10()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux11()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux12()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux13()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux14()
            throws ComException;

    /**
     * auxiliary color
     */
    BStr getAppColorAux15()
            throws ComException;

    /**
     * status string for remote player (taskbar player)
     */
    BStr getStatus()
            throws ComException;

    /**
     * status string for remote player (taskbar player)
     */
    void setStatus(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property userWMPSettingsView
     */
    BStr getUserWMPSettingsView()
            throws ComException;

    /**
     * property userWMPSettingsPreset
     */
    Int32 getUserWMPSettingsPreset()
            throws ComException;

    /**
     * property userWMPShowSettings
     */
    VariantBool getUserWMPShowSettings()
            throws ComException;

    /**
     * property userWMPMetadataView
     */
    BStr getUserWMPMetadataView()
            throws ComException;

    /**
     * property userWMPMetadataPreset
     */
    Int32 getUserWMPMetadataPreset()
            throws ComException;

    /**
     * property userWMPShowMetadata
     */
    VariantBool getUserWMPShowMetadata()
            throws ComException;

    /**
     * property captionsHeight
     */
    Int32 getCaptionsHeight()
            throws ComException;

    /**
     * property captionsHeight
     */
    void setCaptionsHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property snapToVideo
     */
    VariantBool getSnapToVideo()
            throws ComException;

    /**
     * property snapToVideo
     */
    void setSnapToVideo(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property pinFullScreenControls
     */
    VariantBool getPinFullScreenControls()
            throws ComException;

    /**
     * property pinFullScreenControls
     */
    void setPinFullScreenControls(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property isMultiMon
     */
    VariantBool getIsMultiMon()
            throws ComException;

    /**
     * property exclusiveHueShift
     */
    SingleFloat getExclusiveHueShift()
            throws ComException;

    /**
     * property exclusiveHueShift
     */
    void setExclusiveHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property exclusiveSaturation
     */
    SingleFloat getExclusiveSaturation()
            throws ComException;

    /**
     * property exclusiveSaturation
     */
    void setExclusiveSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * themeBkgColorIsActive
     */
    VariantBool getThemeBkgColorIsActive()
            throws ComException;

    /**
     * themeBkgColorIsActive
     */
    void setThemeBkgColorIsActive(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * themeBkgColorActive
     */
    BStr getThemeBkgColorActive()
            throws ComException;

    /**
     * themeBkgColorInactive
     */
    BStr getThemeBkgColorInactive()
            throws ComException;
}
