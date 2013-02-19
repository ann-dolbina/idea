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
 * Represents Java interface for COM interface IWMPControls2.
 */
public interface IWMPControls2 extends IWMPControls {
    public static final String INTERFACE_IDENTIFIER = "{6F030D25-0890-480F-9775-1F7E40AB5B8E}";

    /**
     * Advances the video one frame
     */
    void step(
            Int32 /*[in]*/ lStep)
            throws ComException;
}
