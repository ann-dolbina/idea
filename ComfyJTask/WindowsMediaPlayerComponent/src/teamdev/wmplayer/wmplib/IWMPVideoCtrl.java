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
 * Represents Java interface for COM interface IWMPVideoCtrl.
 */
public interface IWMPVideoCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{61CECF10-FC3A-11D2-A1CD-005004602752}";

    /**
     *
     */
    void setWindowless(
            VariantBool /*[in]*/ pbClipped)
            throws ComException;

    /**
     *
     */
    VariantBool getWindowless()
            throws ComException;

    /**
     *
     */
    void setCursor(
            BStr /*[in]*/ pbstrCursor)
            throws ComException;

    /**
     *
     */
    BStr getCursor()
            throws ComException;

    /**
     *
     */
    void setBackgroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     *
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     *
     */
    void setMaintainAspectRatio(
            VariantBool /*[in]*/ pbMaintainAspectRatio)
            throws ComException;

    /**
     *
     */
    VariantBool getMaintainAspectRatio()
            throws ComException;

    /**
     *
     */
    void setToolTip(
            BStr /*[in]*/ bstrToolTip)
            throws ComException;

    /**
     *
     */
    BStr getToolTip()
            throws ComException;

    /**
     *
     */
    VariantBool getFullScreen()
            throws ComException;

    /**
     *
     */
    void setFullScreen(
            VariantBool /*[in]*/ pbFullScreen)
            throws ComException;

    /**
     *
     */
    void setShrinkToFit(
            VariantBool /*[in]*/ pbShrinkToFit)
            throws ComException;

    /**
     *
     */
    VariantBool getShrinkToFit()
            throws ComException;

    /**
     *
     */
    void setStretchToFit(
            VariantBool /*[in]*/ pbStretchToFit)
            throws ComException;

    /**
     *
     */
    VariantBool getStretchToFit()
            throws ComException;

    /**
     *
     */
    void setZoom(
            Int32 /*[in]*/ pzoom)
            throws ComException;

    /**
     *
     */
    Int32 getZoom()
            throws ComException;
}
