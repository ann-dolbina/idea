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
 * Represents Java interface for COM interface IWMPTheme.
 */
public interface IWMPTheme extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{6FCAE13D-E492-4584-9C21-D2C052A2A33A}";

    /**
     * method showErrorDialog
     */
    void showErrorDialog()
            throws ComException;

    /**
     * method logString
     */
    void logString(
            BStr /*[in]*/ stringVal)
            throws ComException;

    /**
     * method openView
     */
    void openView(
            BStr /*[in]*/ viewID)
            throws ComException;

    /**
     * method openView
     */
    IDispatch openViewRelative(
            BStr /*[in]*/ viewID,
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y)
            throws ComException;

    /**
     * method closeView
     */
    void closeView(
            BStr /*[in]*/ viewID)
            throws ComException;

    /**
     * method openDialog
     */
    BStr openDialog(
            BStr /*[in]*/ dialogType,
            BStr /*[in]*/ paramParameters)
            throws ComException;

    /**
     * method loadString
     */
    BStr loadString(
            BStr /*[in]*/ bstrString)
            throws ComException;

    /**
     * method loadPreference
     */
    BStr loadPreference(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * method savePreference
     */
    void savePreference(
            BStr /*[in]*/ bstrName,
            BStr /*[in]*/ bstrValue)
            throws ComException;

    /**
     * method playSound
     */
    void playSound(
            BStr /*[in]*/ bstrFilename)
            throws ComException;

    /**
     * Microsoft internal use only
     */
    IDispatch openViewRelativeInternal(
            BStr /*[in]*/ viewID,
            Int32 /*[in]*/ nIndex,
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y,
            Int32 /*[in]*/ nWidth,
            Int32 /*[in]*/ nHeight,
            BStr /*[in]*/ bstrHorizontalAlignment,
            BStr /*[in]*/ bstrVerticalAlignment)
            throws ComException;

    /**
     * Microsoft internal use only
     */
    void setViewPosition(
            BStr /*[in]*/ viewID,
            Int32 /*[in]*/ nIndex,
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y,
            Int32 /*[in]*/ nWidth,
            Int32 /*[in]*/ nHeight,
            BStr /*[in]*/ bstrHorizontalAlignment,
            BStr /*[in]*/ bstrVerticalAlignment)
            throws ComException;

    /**
     * property title
     */
    BStr getTitle()
            throws ComException;

    /**
     * property version
     */
    SingleFloat getVersion()
            throws ComException;

    /**
     * property authorVersion
     */
    BStr getAuthorVersion()
            throws ComException;

    /**
     * property author
     */
    BStr getAuthor()
            throws ComException;

    /**
     * property copyright
     */
    BStr getCopyright()
            throws ComException;

    /**
     * property title
     */
    BStr getCurrentViewID()
            throws ComException;

    /**
     * property title
     */
    void setCurrentViewID(
            BStr /*[in]*/ pVal)
            throws ComException;
}
