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
 * Represents Java interface for COM interface IWMPSliderCtrl.
 */
public interface IWMPSliderCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{F2BF2C8F-405F-11D3-BB39-00A0C93CA73A}";

    /**
     * property direction
     */
    BStr getDirection()
            throws ComException;

    /**
     * property direction
     */
    void setDirection(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property slide
     */
    VariantBool getSlide()
            throws ComException;

    /**
     * property slide
     */
    void setSlide(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property tiled
     */
    VariantBool getTiled()
            throws ComException;

    /**
     * property tiled
     */
    void setTiled(
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
     * property foregroundEndColor
     */
    BStr getForegroundEndColor()
            throws ComException;

    /**
     * property foregroundEndColor
     */
    void setForegroundEndColor(
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
     * property backgroundEndColor
     */
    BStr getBackgroundEndColor()
            throws ComException;

    /**
     * property backgroundEndColor
     */
    void setBackgroundEndColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property disabledColor
     */
    BStr getDisabledColor()
            throws ComException;

    /**
     * property disabledColor
     */
    void setDisabledColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property transparencyColor
     */
    BStr getTransparencyColor()
            throws ComException;

    /**
     * property transparencyColor
     */
    void setTransparencyColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property foregroundImage
     */
    BStr getForegroundImage()
            throws ComException;

    /**
     * property foregroundImage
     */
    void setForegroundImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property backgroundImage
     */
    BStr getBackgroundImage()
            throws ComException;

    /**
     * property backgroundImage
     */
    void setBackgroundImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property backgroundHoverImage
     */
    BStr getBackgroundHoverImage()
            throws ComException;

    /**
     * property backgroundHoverImage
     */
    void setBackgroundHoverImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property disabledImage
     */
    BStr getDisabledImage()
            throws ComException;

    /**
     * property disabledImage
     */
    void setDisabledImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property thumbImage
     */
    BStr getThumbImage()
            throws ComException;

    /**
     * property thumbImage
     */
    void setThumbImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property thumbHoverImage
     */
    BStr getThumbHoverImage()
            throws ComException;

    /**
     * property thumbHoverImage
     */
    void setThumbHoverImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property thumbDownImage
     */
    BStr getThumbDownImage()
            throws ComException;

    /**
     * property thumbDownImage
     */
    void setThumbDownImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property thumbDisabledImage
     */
    BStr getThumbDisabledImage()
            throws ComException;

    /**
     * property thumbDisabledImage
     */
    void setThumbDisabledImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property min
     */
    SingleFloat getMin()
            throws ComException;

    /**
     * property min
     */
    void setMin(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property max
     */
    SingleFloat getMax()
            throws ComException;

    /**
     * property max
     */
    void setMax(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property value
     */
    SingleFloat getValue()
            throws ComException;

    /**
     * property value
     */
    void setValue(
            SingleFloat /*[in]*/ pVal)
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
     * property borderSize
     */
    Int getBorderSize()
            throws ComException;

    /**
     * property borderSize
     */
    void setBorderSize(
            Int /*[in]*/ pVal)
            throws ComException;

    /**
     * property foregroundHoverImage
     */
    BStr getForegroundHoverImage()
            throws ComException;

    /**
     * property foregroundHoverImage
     */
    void setForegroundHoverImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property foregroundValue
     */
    SingleFloat getForegroundProgress()
            throws ComException;

    /**
     * property foregroundValue
     */
    void setForegroundProgress(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property useForegroundValue
     */
    VariantBool getUseForegroundProgress()
            throws ComException;

    /**
     * property useForegroundValue
     */
    void setUseForegroundProgress(
            VariantBool /*[in]*/ pVal)
            throws ComException;
}
