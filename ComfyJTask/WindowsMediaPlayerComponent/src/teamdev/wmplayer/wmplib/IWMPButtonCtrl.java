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
 * Represents Java interface for COM interface IWMPButtonCtrl.
 */
public interface IWMPButtonCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{87291B50-0C8E-11D3-BB2A-00A0C93CA73A}";

    /**
     *
     */
    BStr getImage()
            throws ComException;

    /**
     *
     */
    void setImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getHoverImage()
            throws ComException;

    /**
     *
     */
    void setHoverImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getDownImage()
            throws ComException;

    /**
     *
     */
    void setDownImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getDisabledImage()
            throws ComException;

    /**
     *
     */
    void setDisabledImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getHoverDownImage()
            throws ComException;

    /**
     *
     */
    void setHoverDownImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getTiled()
            throws ComException;

    /**
     *
     */
    void setTiled(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getTransparencyColor()
            throws ComException;

    /**
     *
     */
    void setTransparencyColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getDown()
            throws ComException;

    /**
     *
     */
    void setDown(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getSticky()
            throws ComException;

    /**
     *
     */
    void setSticky(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getUpToolTip()
            throws ComException;

    /**
     *
     */
    void setUpToolTip(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getDownToolTip()
            throws ComException;

    /**
     *
     */
    void setDownToolTip(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    BStr getCursor()
            throws ComException;

    /**
     *
     */
    void setCursor(
            BStr /*[in]*/ pVal)
            throws ComException;
}
