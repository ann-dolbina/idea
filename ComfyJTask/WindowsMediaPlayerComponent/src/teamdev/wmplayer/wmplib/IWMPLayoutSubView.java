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
 * Represents Java interface for COM interface IWMPLayoutSubView.
 */
public interface IWMPLayoutSubView extends IWMPObjectExtendedProps {
    public static final String INTERFACE_IDENTIFIER = "{72F486B1-0D43-11D3-BD3F-00C04F6EA5AE}";

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
     * property backgroundTiled
     */
    VariantBool getBackgroundTiled()
            throws ComException;

    /**
     * property backgroundTiled
     */
    void setBackgroundTiled(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property hueShift
     */
    SingleFloat getBackgroundImageHueShift()
            throws ComException;

    /**
     * property hueShift
     */
    void setBackgroundImageHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property saturation
     */
    SingleFloat getBackgroundImageSaturation()
            throws ComException;

    /**
     * property saturation
     */
    void setBackgroundImageSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property resizeBackgroundImage
     */
    VariantBool getResizeBackgroundImage()
            throws ComException;

    /**
     * property resizeBackgroundImage
     */
    void setResizeBackgroundImage(
            VariantBool /*[in]*/ pVal)
            throws ComException;
}
