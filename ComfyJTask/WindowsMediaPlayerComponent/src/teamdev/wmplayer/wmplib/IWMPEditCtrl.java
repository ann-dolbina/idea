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
 * Represents Java interface for COM interface IWMPEditCtrl.
 */
public interface IWMPEditCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{70E1217C-C617-4CFD-BD8A-69CA2043E70B}";

    /**
     * method getLine
     */
    BStr getLine(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * method getSelectionStart
     */
    Int32 getSelectionStart()
            throws ComException;

    /**
     * method getSelectionEnd
     */
    Int32 getSelectionEnd()
            throws ComException;

    /**
     * method setSelection
     */
    void setSelection(
            Int32 /*[in]*/ nStart,
            Int32 /*[in]*/ nEnd)
            throws ComException;

    /**
     * method replaceSelection
     */
    void replaceSelection(
            BStr /*[in]*/ newVal)
            throws ComException;

    /**
     * method getLineIndex
     */
    Int32 getLineIndex(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * method getLineFromChar
     */
    Int32 getLineFromChar(
            Int32 /*[in]*/ nPosition)
            throws ComException;

    /**
     * property value
     */
    BStr getValue()
            throws ComException;

    /**
     * property value
     */
    void setValue(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property border
     */
    VariantBool getBorder()
            throws ComException;

    /**
     * property border
     */
    void setBorder(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property justification
     */
    BStr getJustification()
            throws ComException;

    /**
     * property justification
     */
    void setJustification(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property editStyle
     */
    BStr getEditStyle()
            throws ComException;

    /**
     * property editStyle
     */
    void setEditStyle(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property wordWrap
     */
    VariantBool getWordWrap()
            throws ComException;

    /**
     * property wordWrap
     */
    void setWordWrap(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property readOnly
     */
    VariantBool getReadOnly()
            throws ComException;

    /**
     * property readOnly
     */
    void setReadOnly(
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
     * property textLimit
     */
    Int32 getTextLimit()
            throws ComException;

    /**
     * property textLimit
     */
    void setTextLimit(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property lineCount
     */
    Int32 getLineCount()
            throws ComException;
}
