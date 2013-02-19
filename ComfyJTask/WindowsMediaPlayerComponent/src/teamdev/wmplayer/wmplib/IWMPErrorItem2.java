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
 * Represents Java interface for COM interface IWMPErrorItem2.
 */
public interface IWMPErrorItem2 extends IWMPErrorItem {
    public static final String INTERFACE_IDENTIFIER = "{F75CCEC0-C67C-475C-931E-8719870BEE7D}";

    /**
     * Returns condition for the error
     */
    Int32 getCondition()
            throws ComException;
}
