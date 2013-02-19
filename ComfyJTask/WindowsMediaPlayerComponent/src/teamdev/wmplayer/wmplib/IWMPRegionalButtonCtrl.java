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
 * Represents Java interface for COM interface IWMPRegionalButtonCtrl.
 */
public interface IWMPRegionalButtonCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{58D507B1-2354-11D3-BD41-00C04F6EA5AE}";

    /**
     * method CreateButton
     */
    IDispatch createButton()
            throws ComException;

    /**
     * method GetButton
     */
    IDispatch getButton(
            Int32 /*[in]*/ nButton)
            throws ComException;

    /**
     * method Click
     */
    void click(
            Int32 /*[in]*/ nButton)
            throws ComException;

    /**
     * property Image
     */
    BStr getImage()
            throws ComException;

    /**
     * property Image
     */
    void setImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property HoverImage
     */
    BStr getHoverImage()
            throws ComException;

    /**
     * property HoverImage
     */
    void setHoverImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property DownImage
     */
    BStr getDownImage()
            throws ComException;

    /**
     * property DownImage
     */
    void setDownImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property HoverDownImage
     */
    BStr getHoverDownImage()
            throws ComException;

    /**
     * property HoverDownImage
     */
    void setHoverDownImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property hoverHoverImage
     */
    BStr getHoverHoverImage()
            throws ComException;

    /**
     * property hoverHoverImage
     */
    void setHoverHoverImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property DisabledImage
     */
    BStr getDisabledImage()
            throws ComException;

    /**
     * property DisabledImage
     */
    void setDisabledImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property MappingImage
     */
    BStr getMappingImage()
            throws ComException;

    /**
     * property MappingImage
     */
    void setMappingImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property TransparencyColor
     */
    BStr getTransparencyColor()
            throws ComException;

    /**
     * property TransparencyColor
     */
    void setTransparencyColor(
            BStr /*[in]*/ pVal)
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
     * property ShowBackground
     */
    VariantBool getShowBackground()
            throws ComException;

    /**
     * property ShowBackground
     */
    void setShowBackground(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property Radio
     */
    VariantBool getRadio()
            throws ComException;

    /**
     * property Radio
     */
    void setRadio(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property ButtonCount
     */
    Int32 getButtonCount()
            throws ComException;

    /**
     * property hueShift
     */
    SingleFloat getHueShift()
            throws ComException;

    /**
     * property hueShift
     */
    void setHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property saturation
     */
    SingleFloat getSaturation()
            throws ComException;

    /**
     * property saturation
     */
    void setSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException;
}
