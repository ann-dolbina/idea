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
 * Represents Java interface for COM interface IWMPPlayerApplication.
 */
public interface IWMPPlayerApplication extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{40897764-CEAB-47BE-AD4A-8E28537F9BBF}";

    /**
     * Switches the display to player application
     */
    void switchToPlayerApplication()
            throws ComException;

    /**
     * Switches the display to control
     */
    void switchToControl()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the player is docked
     */
    VariantBool getPlayerDocked()
            throws ComException;

    /**
     * Returns a boolean value specifying whether or not the control has display
     */
    VariantBool getHasDisplay()
            throws ComException;
}
