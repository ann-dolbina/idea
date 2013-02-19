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
 * Represents Java interface for COM interface IWMPListBoxCtrl.
 */
public interface IWMPListBoxCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{FC1880CE-83B9-43A7-A066-C44CE8C82583}";

    /**
     * method getItem
     */
    BStr getItem(
            Int32 /*[in]*/ nPos)
            throws ComException;

    /**
     * method insertItem
     */
    void insertItem(
            Int32 /*[in]*/ nPos,
            BStr /*[in]*/ newVal)
            throws ComException;

    /**
     * method appendItem
     */
    void appendItem(
            BStr /*[in]*/ newVal)
            throws ComException;

    /**
     * method replaceItem
     */
    void replaceItem(
            Int32 /*[in]*/ nPos,
            BStr /*[in]*/ newVal)
            throws ComException;

    /**
     * method deleteItem
     */
    void deleteItem(
            Int32 /*[in]*/ nPos)
            throws ComException;

    /**
     * method deleteAll
     */
    void deleteAll()
            throws ComException;

    /**
     * method findItem
     */
    Int32 findItem(
            Int32 /*[in]*/ nStartIndex,
            BStr /*[in]*/ newVal)
            throws ComException;

    /**
     * method getNextSelectedItem
     */
    Int32 getNextSelectedItem(
            Int32 /*[in]*/ nStartIndex)
            throws ComException;

    /**
     * method setSelectedState
     */
    void setSelectedState(
            Int32 /*[in]*/ nPos,
            VariantBool /*[in]*/ vbSelected)
            throws ComException;

    /**
     * method show
     */
    void show()
            throws ComException;

    /**
     * method dismiss
     */
    void dismiss()
            throws ComException;

    /**
     *
     */
    Int32 getSelectedItem()
            throws ComException;

    /**
     *
     */
    void setSelectedItem(
            Int32 /*[in]*/ pnPos)
            throws ComException;

    /**
     *
     */
    VariantBool getSorted()
            throws ComException;

    /**
     *
     */
    void setSorted(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getMultiselect()
            throws ComException;

    /**
     *
     */
    void setMultiselect(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getReadOnly()
            throws ComException;

    /**
     *
     */
    void setReadOnly(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getForegroundColor()
            throws ComException;

    /**
     *
     */
    void setForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     *
     */
    void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getFontSize()
            throws ComException;

    /**
     *
     */
    void setFontSize(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getFontStyle()
            throws ComException;

    /**
     *
     */
    void setFontStyle(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getFontFace()
            throws ComException;

    /**
     *
     */
    void setFontFace(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getItemCount()
            throws ComException;

    /**
     *
     */
    Int32 getFirstVisibleItem()
            throws ComException;

    /**
     *
     */
    void setFirstVisibleItem(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    void setPopUp(
            VariantBool /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    Int32 getFocusItem()
            throws ComException;

    /**
     *
     */
    void setFocusItem(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getBorder()
            throws ComException;

    /**
     *
     */
    void setBorder(
            VariantBool /*[in]*/ pVal)
            throws ComException;
}
