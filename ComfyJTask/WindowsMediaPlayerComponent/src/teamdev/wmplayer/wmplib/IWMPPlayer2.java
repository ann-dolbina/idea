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
 * Represents Java interface for COM interface IWMPPlayer2.
 */
public interface IWMPPlayer2 extends IWMPCore {
    public static final String INTERFACE_IDENTIFIER = "{0E6B01D1-D407-4C85-BF5F-1C01F6150280}";

    /**
     * Returns a boolen value specifying whether or not the control is enabled
     */
    VariantBool getEnabled()
            throws ComException;

    /**
     * Returns a boolen value specifying whether or not the control is enabled
     */
    void setEnabled(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the control is in full screen mode
     */
    VariantBool getFullScreen()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the control is in full screen mode
     */
    void setFullScreen(
            VariantBool /*[in]*/ pbFullScreen)
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the context menu is enabled on the control
     */
    VariantBool getEnableContextMenu()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the context menu is enabled on the control
     */
    void setEnableContextMenu(
            VariantBool /*[in]*/ pbEnableContextMenu)
            throws ComException;

    /**
     * Specifies the ui mode to select
     */
    void setUiMode(
            BStr /*[in]*/ pbstrMode)
            throws ComException;

    /**
     * Specifies the ui mode to select
     */
    BStr getUiMode()
            throws ComException;

    /**
     * Returns a boolen value specifying whether or not video is stretched
     */
    VariantBool getStretchToFit()
            throws ComException;

    /**
     * Returns a boolen value specifying whether or not video is stretched
     */
    void setStretchToFit(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException;

    /**
     * Returns a boolen value specifying whether or not video is windowless
     */
    VariantBool getWindowlessVideo()
            throws ComException;

    /**
     * Returns a boolen value specifying whether or not video is windowless
     */
    void setWindowlessVideo(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException;
}
