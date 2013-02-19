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
 * Represents Java interface for COM interface IWMPMedia2.
 */
public interface IWMPMedia2 extends IWMPMedia {
    public static final String INTERFACE_IDENTIFIER = "{AB7C88BB-143E-4EA4-ACC3-E4350B2106C3}";

    /**
     * Returns an error item pointer for a media specific error
     */
    IWMPErrorItem getError()
            throws ComException;
}
