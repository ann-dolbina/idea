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
 * Represents Java interface for COM interface IWMPLibraryTreeCtrl.
 */
public interface IWMPLibraryTreeCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{B738FCAE-F089-45DF-AED6-034B9E7DB632}";

    /**
     * property dropDownVisible
     */
    VariantBool getDropDownVisible()
            throws ComException;

    /**
     * property dropDownVisible
     */
    void setDropDownVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property foregroundColor
     */
    BStr getForegroundColor()
            throws ComException;

    /**
     * property foregroundColor
     */
    void setForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property backgroundColor
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     * property backgroundColor
     */
    void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property fontSize
     */
    Int32 getFontSize()
            throws ComException;

    /**
     * property fontSize
     */
    void setFontSize(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property fontStyle
     */
    BStr getFontStyle()
            throws ComException;

    /**
     * property fontStyle
     */
    void setFontStyle(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property fontFace
     */
    BStr getFontFace()
            throws ComException;

    /**
     * property fontFace
     */
    void setFontFace(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property filter
     */
    BStr getFilter()
            throws ComException;

    /**
     * property filter
     */
    void setFilter(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property expandState
     */
    BStr getExpandState()
            throws ComException;

    /**
     * property expandState
     */
    void setExpandState(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property playlist
     */
    IWMPPlaylist getPlaylist()
            throws ComException;

    /**
     * property playlist
     */
    void setPlaylist(
            IWMPPlaylist /*[in]*/ ppPlaylist)
            throws ComException;

    /**
     * property selectedPlaylist
     */
    IWMPPlaylist getSelectedPlaylist()
            throws ComException;

    /**
     * property selectedMedia
     */
    IWMPMedia getSelectedMedia()
            throws ComException;
}
