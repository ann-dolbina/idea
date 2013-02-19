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
 * Represents Java interface for COM interface IWMPPlayer4.
 */
public interface IWMPPlayer4 extends IWMPCore3 {
    public static final String INTERFACE_IDENTIFIER = "{6C497D62-8919-413C-82DB-E935FB3EC584}";

    /**
     * Opens the player with the specified URL
     */
    void openPlayer(
            BStr /*[in]*/ bstrURL)
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the control is enabled
     */
    VariantBool getEnabled()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the control is enabled
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
     * Returns a boolean value specifying whether or not video is stretched
     */
    VariantBool getStretchToFit()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not video is stretched
     */
    void setStretchToFit(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not video is windowless
     */
    VariantBool getWindowlessVideo()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not video is windowless
     */
    void setWindowlessVideo(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException;

    /**
     * Indicates whether the player is running remotely
     */
    VariantBool getIsRemote()
            throws ComException;

    /**
     * Returns the player application handler
     */
    IWMPPlayerApplication getPlayerApplication()
            throws ComException;
}
