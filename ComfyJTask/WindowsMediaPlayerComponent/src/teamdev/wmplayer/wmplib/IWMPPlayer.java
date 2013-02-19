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
 * Represents Java interface for COM interface IWMPPlayer.
 */
public interface IWMPPlayer extends IWMPCore {
    public static final String INTERFACE_IDENTIFIER = "{6BF52A4F-394A-11D3-B153-00C04F79FAA6}";

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
}
