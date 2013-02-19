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
 * Represents Java interface for COM interface IWMPCustomSlider.
 */
public interface IWMPCustomSlider extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{95F45AA2-ED0A-11D2-BA67-0000F80855E6}";

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
     * property positionImage
     */
    BStr getPositionImage()
            throws ComException;

    /**
     * property positionImage
     */
    void setPositionImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property image
     */
    BStr getImage()
            throws ComException;

    /**
     * property image
     */
    void setImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property hoverImage
     */
    BStr getHoverImage()
            throws ComException;

    /**
     * property hoverImage
     */
    void setHoverImage(
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
     * property downImage
     */
    BStr getDownImage()
            throws ComException;

    /**
     * property downImage
     */
    void setDownImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property transparancyColor
     */
    BStr getTransparencyColor()
            throws ComException;

    /**
     * property transparancyColor
     */
    void setTransparencyColor(
            BStr /*[in]*/ pVal)
            throws ComException;
}
