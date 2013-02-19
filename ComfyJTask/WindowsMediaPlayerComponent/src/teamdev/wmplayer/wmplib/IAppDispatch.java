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
 * Represents Java interface for COM interface IAppDispatch.
 */
public interface IAppDispatch extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{E41C88DD-2364-4FF7-A0F5-CA9859AF783F}";

    /**
     *
     */
    void breadcrumbItemClick(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     *
     */
    void gotoSkinMode()
            throws ComException;

    /**
     *
     */
    void gotoPlayerMode()
            throws ComException;

    /**
     *
     */
    void gotoLibraryMode(
            Int32 /*[in]*/ lButton)
            throws ComException;

    /**
     *
     */
    void navigatePrevious()
            throws ComException;

    /**
     *
     */
    void navigateNext()
            throws ComException;

    /**
     *
     */
    void goFullScreen()
            throws ComException;

    /**
     *
     */
    void serviceLogin()
            throws ComException;

    /**
     *
     */
    void serviceLogout()
            throws ComException;

    /**
     *
     */
    void navigateToAddress(
            BStr /*[in]*/ address)
            throws ComException;

    /**
     *
     */
    void adjustLeft(
            Int32 /*[in]*/ nDistance)
            throws ComException;

    /**
     *
     */
    void previous()
            throws ComException;

    /**
     *
     */
    void configurePlugins(
            Int32 /*[in]*/ nType)
            throws ComException;

    /**
     * method getTimeString
     */
    BStr getTimeString(
            DoubleFloat /*[in]*/ dTime)
            throws ComException;

    /**
     *
     */
    void setWindowPos(
            Int32 /*[in]*/ lTop,
            Int32 /*[in]*/ lLeft,
            Int32 /*[in]*/ lWidth,
            Int32 /*[in]*/ lHeight)
            throws ComException;

    /**
     *
     */
    void logData(
            BStr /*[in]*/ ID,
            BStr /*[in]*/ data)
            throws ComException;

    /**
     *
     */
    void navigateNamespace(
            BStr /*[in]*/ address)
            throws ComException;

    /**
     *
     */
    VariantBool getTitlebarVisible()
            throws ComException;

    /**
     *
     */
    void setTitlebarVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getTitlebarAutoHide()
            throws ComException;

    /**
     *
     */
    void setTitlebarAutoHide(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getCurrentTask()
            throws ComException;

    /**
     *
     */
    void setCurrentTask(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getLibraryBasketMode()
            throws ComException;

    /**
     *
     */
    void setLibraryBasketMode(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getLibraryBasketWidth()
            throws ComException;

    /**
     *
     */
    Int32 getBreadcrumbItemCount()
            throws ComException;

    /**
     *
     */
    BStr getBreadcrumbItemName(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     *
     */
    VariantBool getBreadcrumbItemHasMenu(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     *
     */
    VariantBool getSettingsVisible()
            throws ComException;

    /**
     *
     */
    void setSettingsVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getPlaylistVisible()
            throws ComException;

    /**
     *
     */
    void setPlaylistVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getFullScreenEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getServiceLoginVisible()
            throws ComException;

    /**
     *
     */
    VariantBool getServiceLoginSignedIn()
            throws ComException;

    /**
     *
     */
    Variant getServiceGetInfo(
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     *
     */
    VariantBool getNavigatePreviousEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getNavigateNextEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getGlassEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getInVistaPlus()
            throws ComException;

    /**
     *
     */
    VariantBool getTaskbarVisible()
            throws ComException;

    /**
     *
     */
    void setTaskbarVisible(
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
    VariantBool getPreviousEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getPlayLibraryItemEnabled()
            throws ComException;

    /**
     *
     */
    VariantBool getTitlebarCurrentlyVisible()
            throws ComException;

    /**
     *
     */
    VariantBool getMenubarCurrentlyVisible()
            throws ComException;

    /**
     *
     */
    VariantBool getBgPluginRunning()
            throws ComException;

    /**
     *
     */
    VariantBool getMaximized()
            throws ComException;

    /**
     *
     */
    Int32 getTop()
            throws ComException;

    /**
     *
     */
    void setTop(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getLeft()
            throws ComException;

    /**
     *
     */
    void setLeft(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getWidth()
            throws ComException;

    /**
     *
     */
    void setWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getHeight()
            throws ComException;

    /**
     *
     */
    void setHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getPowerPersonality()
            throws ComException;

    /**
     *
     */
    BStr getExclusiveService()
            throws ComException;

    /**
     *
     */
    void setWindowText(
            BStr /*[in]*/ param1)
            throws ComException;
}
