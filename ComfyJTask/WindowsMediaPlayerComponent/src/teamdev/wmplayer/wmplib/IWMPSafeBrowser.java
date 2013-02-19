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
 * Represents Java interface for COM interface IWMPSafeBrowser.
 */
public interface IWMPSafeBrowser extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{EF870383-83AB-4EA9-BE48-56FA4251AF10}";

    /**
     * method showSAMIText
     */
    void showSAMIText(
            BStr /*[in]*/ samiText)
            throws ComException;

    /**
     * method showLyrics
     */
    void showLyrics(
            BStr /*[in]*/ lyrics)
            throws ComException;

    /**
     * loads one of our special pages by name
     */
    void loadSpecialPage(
            BStr /*[in]*/ pageName)
            throws ComException;

    /**
     * go back to the previous page
     */
    void goBack()
            throws ComException;

    /**
     * go forward through the current MRU
     */
    void goForward()
            throws ComException;

    /**
     * stop loading page
     */
    void stop()
            throws ComException;

    /**
     * refresh the page
     */
    void refresh()
            throws ComException;

    /**
     * show security certificate dialog
     */
    void showCert()
            throws ComException;

    /**
     *
     */
    BStr getURL()
            throws ComException;

    /**
     *
     */
    void setURL(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getStatus()
            throws ComException;

    /**
     *
     */
    Int32 getPendingDownloads()
            throws ComException;

    /**
     *
     */
    BStr getBaseURL()
            throws ComException;

    /**
     *
     */
    BStr getFullURL()
            throws ComException;

    /**
     *
     */
    Int32 getSecureLock()
            throws ComException;

    /**
     *
     */
    VariantBool getBusy()
            throws ComException;
}
