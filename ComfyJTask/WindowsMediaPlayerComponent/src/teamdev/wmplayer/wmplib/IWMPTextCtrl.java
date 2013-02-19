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
 * Represents Java interface for COM interface IWMPTextCtrl.
 */
public interface IWMPTextCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{237DAC8E-0E32-11D3-A2E2-00C04F79F88E}";

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
     * property hoverBackgroundColor
     */
    BStr getHoverBackgroundColor()
            throws ComException;

    /**
     * property hoverBackgroundColor
     */
    void setHoverBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property hoverForegroundColor
     */
    BStr getHoverForegroundColor()
            throws ComException;

    /**
     * property hoverForegroundColor
     */
    void setHoverForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property hoverFontStyle
     */
    BStr getHoverFontStyle()
            throws ComException;

    /**
     * property hoverFontStyle
     */
    void setHoverFontStyle(
            BStr /*[in]*/ pVal)
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
     * property toolTip
     */
    BStr getToolTip()
            throws ComException;

    /**
     * property toolTip
     */
    void setToolTip(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property disabledFontStyle
     */
    BStr getDisabledFontStyle()
            throws ComException;

    /**
     * property disabledFontStyle
     */
    void setDisabledFontStyle(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property disabledForegroundColor
     */
    BStr getDisabledForegroundColor()
            throws ComException;

    /**
     * property disabledForegroundColor
     */
    void setDisabledForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property disabledBackgroundColor
     */
    BStr getDisabledBackgroundColor()
            throws ComException;

    /**
     * property disabledBackgroundColor
     */
    void setDisabledBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property fontSmoothing
     */
    VariantBool getFontSmoothing()
            throws ComException;

    /**
     * property fontSmoothing
     */
    void setFontSmoothing(
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
     * property cursor
     */
    BStr getCursor()
            throws ComException;

    /**
     * property cursor
     */
    void setCursor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property scrolling
     */
    VariantBool getScrolling()
            throws ComException;

    /**
     * property scrolling
     */
    void setScrolling(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property scrollingDirection
     */
    BStr getScrollingDirection()
            throws ComException;

    /**
     * property scrollingDirection
     */
    void setScrollingDirection(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property scrollingDelay
     */
    Int getScrollingDelay()
            throws ComException;

    /**
     * property scrollingDelay
     */
    void setScrollingDelay(
            Int /*[in]*/ pVal)
            throws ComException;

    /**
     * property scrollingAmount
     */
    Int getScrollingAmount()
            throws ComException;

    /**
     * property scrollingAmount
     */
    void setScrollingAmount(
            Int /*[in]*/ pVal)
            throws ComException;

    /**
     * property textWidth
     */
    Int getTextWidth()
            throws ComException;

    /**
     * property onGlass
     */
    VariantBool getOnGlass()
            throws ComException;

    /**
     * property onGlass
     */
    void setOnGlass(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property disableGlassBlurBackground
     */
    VariantBool getDisableGlassBlurBackground()
            throws ComException;

    /**
     * property disableGlassBlurBackground
     */
    void setDisableGlassBlurBackground(
            VariantBool /*[in]*/ pVal)
            throws ComException;
}
