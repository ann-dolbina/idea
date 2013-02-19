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
 * Represents Java interface for COM interface IWMPBrandDispatch.
 */
public interface IWMPBrandDispatch extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{98BB02D4-ED74-43CC-AD6A-45888F2E0DCC}";

    /**
     * method setNavigateProps
     */
    void setNavigateProps(
            BStr /*[in]*/ bstrPane,
            Int32 /*[in]*/ lDispid,
            BStr /*[in]*/ bstrParams)
            throws ComException;

    /**
     * method getMediaParams
     */
    BStr getMediaParams(
            IUnknown /*[in]*/ pObject,
            BStr /*[in]*/ bstrURL)
            throws ComException;

    /**
     * property fullServiceName
     */
    BStr getFullServiceName()
            throws ComException;

    /**
     * property friendlyName
     */
    BStr getFriendlyName()
            throws ComException;

    /**
     * property guideButtonText
     */
    BStr getGuideButtonText()
            throws ComException;

    /**
     * property guideButtonTip
     */
    BStr getGuideButtonTip()
            throws ComException;

    /**
     * property guideMenuText
     */
    BStr getGuideMenuText()
            throws ComException;

    /**
     * property guideAccText
     */
    BStr getGuideAccText()
            throws ComException;

    /**
     * property task1ButtonText
     */
    BStr getTask1ButtonText()
            throws ComException;

    /**
     * property task1ButtonTip
     */
    BStr getTask1ButtonTip()
            throws ComException;

    /**
     * property task1MenuText
     */
    BStr getTask1MenuText()
            throws ComException;

    /**
     * property task1AccText
     */
    BStr getTask1AccText()
            throws ComException;

    /**
     * property guideUrl
     */
    BStr getGuideUrl()
            throws ComException;

    /**
     * property task1Url
     */
    BStr getTask1Url()
            throws ComException;

    /**
     * property imageLargeUrl
     */
    BStr getImageLargeUrl()
            throws ComException;

    /**
     * property imageSmallUrl
     */
    BStr getImageSmallUrl()
            throws ComException;

    /**
     * property imageMenuUrl
     */
    BStr getImageMenuUrl()
            throws ComException;

    /**
     * property infoCenterUrl
     */
    BStr getInfoCenterUrl()
            throws ComException;

    /**
     * property albumInfoUrl
     */
    BStr getAlbumInfoUrl()
            throws ComException;

    /**
     * property buyCDUrl
     */
    BStr getBuyCDUrl()
            throws ComException;

    /**
     * property htmlViewUrl
     */
    BStr getHtmlViewUrl()
            throws ComException;

    /**
     * property navigateUrl
     */
    BStr getNavigateUrl()
            throws ComException;

    /**
     * property cookieUrl
     */
    BStr getCookieUrl()
            throws ComException;

    /**
     * property downloadStatusUrl
     */
    BStr getDownloadStatusUrl()
            throws ComException;

    /**
     * property colorPlayer
     */
    BStr getColorPlayer()
            throws ComException;

    /**
     * property colorPlayerText
     */
    BStr getColorPlayerText()
            throws ComException;

    /**
     * property navigateDispid
     */
    Int32 getNavigateDispid()
            throws ComException;

    /**
     * property navigateParams
     */
    BStr getNavigateParams()
            throws ComException;

    /**
     * property navigatePane
     */
    BStr getNavigatePane()
            throws ComException;

    /**
     * property selectedPane
     */
    BStr getSelectedPane()
            throws ComException;

    /**
     * property selectedPane
     */
    void setSelectedPane(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property selectedTask
     */
    void setSelectedTask(
            Int32 /*[in]*/ param1)
            throws ComException;

    /**
     * property contentPartnerSelected
     */
    VariantBool getContentPartnerSelected()
            throws ComException;
}
