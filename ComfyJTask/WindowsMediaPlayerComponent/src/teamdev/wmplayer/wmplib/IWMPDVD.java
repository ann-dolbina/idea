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
 * Represents Java interface for COM interface IWMPDVD.
 */
public interface IWMPDVD extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{8DA61686-4668-4A5C-AE5D-803193293DBE}";

    /**
     * Displays the top menu of the DVD
     */
    void topMenu()
            throws ComException;

    /**
     * Displays the title menu of the current DVD title
     */
    void titleMenu()
            throws ComException;

    /**
     * Navigates back one menu
     */
    void back()
            throws ComException;

    /**
     * Removes the menu from the screen and returns to playing the DVD
     */
    void resume()
            throws ComException;

    /**
     * Returns whether or not the specified DVD functionality is available
     */
    VariantBool getIsAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     * Returns the current DVD domain
     */
    BStr getDomain()
            throws ComException;
}
