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
 * Represents Java interface for COM interface IWMPError.
 */
public interface IWMPError extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{A12DCF7D-14AB-4C1B-A8CD-63909F06025B}";

    /**
     * Clears the error queue
     */
    void clearErrorQueue()
            throws ComException;

    /**
     * Launches WebHelp
     */
    void webHelp()
            throws ComException;

    /**
     * Returns the number of error items
     */
    Int32 getErrorCount()
            throws ComException;

    /**
     * Returns an error item object
     */
    IWMPErrorItem getItem(
            Int32 /*[in]*/ dwIndex)
            throws ComException;
}
