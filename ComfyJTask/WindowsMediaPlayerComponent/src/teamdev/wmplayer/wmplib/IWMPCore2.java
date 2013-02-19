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
 * Represents Java interface for COM interface IWMPCore2.
 */
public interface IWMPCore2 extends IWMPCore {
    public static final String INTERFACE_IDENTIFIER = "{BC17E5B7-7561-4C18-BB90-17D485775659}";

    /**
     * Returns the DVD handler
     */
    IWMPDVD getDvd()
            throws ComException;
}
