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
 * Represents Java interface for COM interface IWMPNowPlayingHelperDispatch.
 */
public interface IWMPNowPlayingHelperDispatch extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{504F112E-77CC-4E3C-A073-5371B31D9B36}";

    /**
     * method resolveDisplayView
     */
    BStr resolveDisplayView(
            VariantBool /*[in]*/ fSafe)
            throws ComException;

    /**
     * method isValidDisplayView
     */
    VariantBool isValidDisplayView(
            BStr /*[in]*/ bstrView)
            throws ComException;

    /**
     * method getSkinFile
     */
    BStr getSkinFile()
            throws ComException;

    /**
     * method getCurrentArtID
     */
    Int32 getCurrentArtID(
            VariantBool /*[in]*/ fLargeArt)
            throws ComException;

    /**
     * method getTimeString
     */
    BStr getTimeString(
            DoubleFloat /*[in]*/ dTime)
            throws ComException;

    /**
     * method getCurrentScriptCommand
     */
    BStr getCurrentScriptCommand(
            BStr /*[in]*/ bstrType)
            throws ComException;

    /**
     * method calcLayout
     */
    void calcLayout(
            Int32 /*[in]*/ lWidth,
            Int32 /*[in]*/ lHeight,
            VariantBool /*[in]*/ vbCaptions,
            VariantBool /*[in]*/ vbBanner)
            throws ComException;

    /**
     * method getLayoutSize
     */
    Int32 getLayoutSize(
            Int32 /*[in]*/ nProp)
            throws ComException;

    /**
     * method getRootPlaylist
     */
    IDispatch getRootPlaylist(
            IDispatch /*[in]*/ pPlaylist)
            throws ComException;

    /**
     * method getHTMLViewURL
     */
    BStr getHTMLViewURL()
            throws ComException;

    /**
     * method getStatusString
     */
    BStr getStatusString(
            BStr /*[in]*/ bstrStatusId)
            throws ComException;

    /**
     * method getStatusPct
     */
    Int32 getStatusPct(
            BStr /*[in]*/ bstrStatusId)
            throws ComException;

    /**
     * method getStatusResult
     */
    Int32 getStatusResult(
            BStr /*[in]*/ bstrStatusId)
            throws ComException;

    /**
     * method getStatusIcon
     */
    Int32 getStatusIcon(
            BStr /*[in]*/ bstrStatusId)
            throws ComException;

    /**
     * method getStatusIdList
     */
    BStr getStatusIdList()
            throws ComException;

    /**
     * clear all user color info
     */
    void clearColors()
            throws ComException;

    /**
     *
     */
    void initRipHelper()
            throws ComException;

    /**
     *
     */
    void startRip()
            throws ComException;

    /**
     *
     */
    void stopRip()
            throws ComException;

    /**
     *
     */
    void nextPlaylist()
            throws ComException;

    /**
     *
     */
    void previousPlaylist()
            throws ComException;

    /**
     *
     */
    void playOffsetMedia(
            Int32 /*[in]*/ iOffset)
            throws ComException;

    /**
     *
     */
    void setGestureStatus(
            IDispatch /*[in]*/ pObject,
            Int32 /*[in]*/ newVal)
            throws ComException;

    /**
     *
     */
    void syncToAlbumArt(
            IDispatch /*[in]*/ pObject,
            Int32 /*[in]*/ iOffsetFromCurrentMedia,
            BStr /*[in]*/ bstrFallbackImage)
            throws ComException;

    /**
     * property viewFriendlyName
     */
    BStr getViewFriendlyName(
            BStr /*[in]*/ bstrView)
            throws ComException;

    /**
     * property viewPresetCount
     */
    Int32 getViewPresetCount(
            BStr /*[in]*/ bstrView)
            throws ComException;

    /**
     * method viewPresetName
     */
    BStr getViewPresetName(
            BStr /*[in]*/ bstrView,
            Int32 /*[in]*/ nPresetIndex)
            throws ComException;

    /**
     * property effectFriendlyName
     */
    BStr getEffectFriendlyName(
            BStr /*[in]*/ bstrEffect)
            throws ComException;

    /**
     * method effectPresetName
     */
    BStr getEffectPresetName(
            BStr /*[in]*/ bstrEffect,
            Int32 /*[in]*/ nPresetIndex)
            throws ComException;

    /**
     * method captionsAvailable
     */
    VariantBool getCaptionsAvailable()
            throws ComException;

    /**
     * property linkAvailable
     */
    Int32 getLinkAvailable()
            throws ComException;

    /**
     * property linkRequest
     */
    Int32 getLinkRequest()
            throws ComException;

    /**
     * property linkRequest
     */
    void setLinkRequest(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property linkRequestParams
     */
    BStr getLinkRequestParams()
            throws ComException;

    /**
     * property linkRequestParams
     */
    void setLinkRequestParams(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    IUnknown getEditObj()
            throws ComException;

    /**
     *
     */
    void setEditObj(
            IUnknown /*[in]*/ ppVal)
            throws ComException;

    /**
     *
     */
    BStr getNotificationString()
            throws ComException;

    /**
     *
     */
    BStr getHtmlViewBaseURL()
            throws ComException;

    /**
     *
     */
    void setHtmlViewBaseURL(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getHtmlViewFullURL()
            throws ComException;

    /**
     *
     */
    void setHtmlViewFullURL(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getHtmlViewSecureLock()
            throws ComException;

    /**
     *
     */
    void setHtmlViewSecureLock(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getHtmlViewBusy()
            throws ComException;

    /**
     *
     */
    void setHtmlViewBusy(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getHtmlViewShowCert()
            throws ComException;

    /**
     *
     */
    void setHtmlViewShowCert(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getPreviousEnabled()
            throws ComException;

    /**
     *
     */
    void setPreviousEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getDoPreviousNow()
            throws ComException;

    /**
     *
     */
    void setDoPreviousNow(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getDPI()
            throws ComException;

    /**
     *
     */
    BStr getLastMessage()
            throws ComException;

    /**
     *
     */
    void setLastMessage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getInVistaPlus()
            throws ComException;

    /**
     *
     */
    VariantBool getIsBidi()
            throws ComException;

    /**
     *
     */
    VariantBool getIsOCX()
            throws ComException;

    /**
     *
     */
    VariantBool getHoverTransportsEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getIsAudioCD()
            throws ComException;

    /**
     *
     */
    void setIsAudioCD(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getCanRip()
            throws ComException;

    /**
     *
     */
    void setCanRip(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getIsRipping()
            throws ComException;

    /**
     *
     */
    void setIsRipping(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getCurrentDrive()
            throws ComException;

    /**
     *
     */
    void setCurrentDrive(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getShowMMO()
            throws ComException;

    /**
     *
     */
    void setShowMMO(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getMMOVisible()
            throws ComException;

    /**
     *
     */
    VariantBool getSuggestionsVisible()
            throws ComException;

    /**
     *
     */
    BStr getSuggestionsTextColor()
            throws ComException;

    /**
     *
     */
    BStr getFontFace()
            throws ComException;

    /**
     *
     */
    Int32 getFontSize()
            throws ComException;

    /**
     *
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     *
     */
    Int32 getDoubleClickTime()
            throws ComException;

    /**
     *
     */
    VariantBool getPlayAgain()
            throws ComException;

    /**
     *
     */
    VariantBool getPreviousPlaylistAvailable()
            throws ComException;

    /**
     *
     */
    VariantBool getNextPlaylistAvailable()
            throws ComException;

    /**
     *
     */
    VariantBool getBasketVisible()
            throws ComException;

    /**
     *
     */
    void setBasketVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getMmoTextColor()
            throws ComException;

    /**
     *
     */
    VariantBool getBackgroundVisible()
            throws ComException;

    /**
     *
     */
    void setBackgroundEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getBackgroundEnabled()
            throws ComException;

    /**
     *
     */
    void setBackgroundIndex(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getBackgroundIndex()
            throws ComException;

    /**
     *
     */
    BStr getUpNext()
            throws ComException;

    /**
     *
     */
    VariantBool getPlaybackOverlayVisible()
            throws ComException;

    /**
     *
     */
    VariantBool getRemoted()
            throws ComException;

    /**
     *
     */
    VariantBool getGlassEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getHighContrast()
            throws ComException;

    /**
     *
     */
    void setTestHighContrast(
            BStr /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    void getSessionPlaylistCount(
            Int32 /*[out]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getMetadataString()
            throws ComException;

    /**
     *
     */
    void setMetadataString(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getAlbumArtAlpha()
            throws ComException;

    /**
     *
     */
    VariantBool getPlayerModeAlbumArtSelected()
            throws ComException;

    /**
     *
     */
    VariantBool getInFullScreen()
            throws ComException;
}
