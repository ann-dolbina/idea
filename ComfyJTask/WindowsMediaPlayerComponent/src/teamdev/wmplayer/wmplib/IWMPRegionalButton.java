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
 * Represents Java interface for COM interface IWMPRegionalButton.
 */
public interface IWMPRegionalButton extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{58D507B2-2354-11D3-BD41-00C04F6EA5AE}";

    /**
     * method Click
     */
    void click()
            throws ComException;

    /**
     * property UpToolTip
     */
    BStr getUpToolTip()
            throws ComException;

    /**
     * property UpToolTip
     */
    void setUpToolTip(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property DownToolTip
     */
    BStr getDownToolTip()
            throws ComException;

    /**
     * property DownToolTip
     */
    void setDownToolTip(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property MappingColor
     */
    BStr getMappingColor()
            throws ComException;

    /**
     * property MappingColor
     */
    void setMappingColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property Enabled
     */
    VariantBool getEnabled()
            throws ComException;

    /**
     * property Enabled
     */
    void setEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property Sticky
     */
    VariantBool getSticky()
            throws ComException;

    /**
     * property Sticky
     */
    void setSticky(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property Down
     */
    VariantBool getDown()
            throws ComException;

    /**
     * property Down
     */
    void setDown(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property Index
     */
    Int32 getIndex()
            throws ComException;

    /**
     * property TabStop
     */
    VariantBool getTabStop()
            throws ComException;

    /**
     * property TabStop
     */
    void setTabStop(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property Cursor
     */
    BStr getCursor()
            throws ComException;

    /**
     * property Cursor
     */
    void setCursor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property AccName
     */
    BStr getAccName()
            throws ComException;

    /**
     * property AccName
     */
    void setAccName(
            BStr /*[in]*/ pszName)
            throws ComException;

    /**
     * property AccDescription
     */
    BStr getAccDescription()
            throws ComException;

    /**
     * property AccDescription
     */
    void setAccDescription(
            BStr /*[in]*/ pszDescription)
            throws ComException;

    /**
     * property accKeyboardShortcut
     */
    BStr getAccKeyboardShortcut()
            throws ComException;

    /**
     * property accKeyboardShortcut
     */
    void setAccKeyboardShortcut(
            BStr /*[in]*/ pszShortcut)
            throws ComException;
}
