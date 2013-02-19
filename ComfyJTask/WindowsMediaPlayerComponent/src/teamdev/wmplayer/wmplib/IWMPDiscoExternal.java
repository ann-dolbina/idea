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
 * Represents Java interface for COM interface IWMPDiscoExternal.
 */
public interface IWMPDiscoExternal extends IWMPSubscriptionServiceExternal {
    public static final String INTERFACE_IDENTIFIER = "{A915CEA2-72DF-41E1-A576-EF0BAE5E5169}";

    /**
     *
     */
    void attemptLogin()
            throws ComException;

    /**
     *
     */
    void changeView(
            BStr /*[in]*/ bstrLibraryLocationType,
            BStr /*[in]*/ bstrLibraryLocationID,
            BStr /*[in]*/ bstrFilter,
            BStr /*[in]*/ bstrViewParams)
            throws ComException;

    /**
     *
     */
    void changeViewOnlineList(
            BStr /*[in]*/ bstrLibraryLocationType,
            BStr /*[in]*/ bstrLibraryLocationID,
            BStr /*[in]*/ bstrParams,
            BStr /*[in]*/ bstrFriendlyName,
            BStr /*[in]*/ bstrListType,
            BStr /*[in]*/ bstrViewMode)
            throws ComException;

    /**
     *
     */
    void cancelNavigate()
            throws ComException;

    /**
     *
     */
    void showPopup(
            Int32 /*[in]*/ lPopupIndex,
            BStr /*[in]*/ bstrParameters)
            throws ComException;

    /**
     *
     */
    void addToBasket(
            BStr /*[in]*/ bstrViewType,
            BStr /*[in]*/ bstrViewIDs)
            throws ComException;

    /**
     *
     */
    void play(
            BStr /*[in]*/ bstrLibraryLocationType,
            BStr /*[in]*/ bstrLibraryLocationIDs)
            throws ComException;

    /**
     *
     */
    void download(
            BStr /*[in]*/ bstrViewType,
            BStr /*[in]*/ bstrViewIDs)
            throws ComException;

    /**
     *
     */
    void buy(
            BStr /*[in]*/ bstrViewType,
            BStr /*[in]*/ bstrViewIDs)
            throws ComException;

    /**
     *
     */
    void saveCurrentViewToLibrary(
            BStr /*[in]*/ bstrFriendlyListType,
            VariantBool /*[in]*/ fDynamic)
            throws ComException;

    /**
     *
     */
    void authenticate(
            Int32 /*[in]*/ lAuthenticationIndex)
            throws ComException;

    /**
     *
     */
    void sendMessage(
            BStr /*[in]*/ bstrMsg,
            BStr /*[in]*/ bstrParam)
            throws ComException;

    /**
     *
     */
    void setOnLoginChange(
            IDispatch /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    VariantBool getUserLoggedIn()
            throws ComException;

    /**
     *
     */
    BStr getAccountType()
            throws ComException;

    /**
     *
     */
    void setOnViewChange(
            IDispatch /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    BStr getLibraryLocationType()
            throws ComException;

    /**
     *
     */
    BStr getLibraryLocationID()
            throws ComException;

    /**
     *
     */
    BStr getSelectedItemType()
            throws ComException;

    /**
     *
     */
    BStr getSelectedItemID()
            throws ComException;

    /**
     *
     */
    BStr getFilter()
            throws ComException;

    /**
     *
     */
    BStr getTask()
            throws ComException;

    /**
     *
     */
    BStr getViewParameters()
            throws ComException;

    /**
     *
     */
    BStr getBasketTitle()
            throws ComException;

    /**
     *
     */
    void setOnSendMessageComplete(
            IDispatch /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    void setIgnoreIEHistory(
            VariantBool /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    VariantBool getPluginRunning()
            throws ComException;

    /**
     *
     */
    VariantBool getTemplateBeingDisplayedInLocalLibrary()
            throws ComException;

    /**
     *
     */
    void setOnChangeViewError(
            IDispatch /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    void setOnChangeViewOnlineListError(
            IDispatch /*[in]*/ param1)
            throws ComException;
}
