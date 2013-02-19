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
 * Represents Java interface for COM interface IWMPErrorItem.
 */
public interface IWMPErrorItem extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{3614C646-3B3B-4DE7-A81E-930E3F2127B3}";

    /**
     * Returns the error code
     */
    Int32 getErrorCode()
            throws ComException;

    /**
     * Returns a description of the error
     */
    BStr getErrorDescription()
            throws ComException;

    /**
     * Returns context information for the error
     */
    Variant getErrorContext()
            throws ComException;

    /**
     * Returns remedy code for the error
     */
    Int32 getRemedy()
            throws ComException;

    /**
     * Returns a custom url for this error (if avail)
     */
    BStr getCustomUrl()
            throws ComException;
}
