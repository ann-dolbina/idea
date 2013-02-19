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
 * Represents Java interface for COM interface IWMPOfflineExternal.
 */
public interface IWMPOfflineExternal extends IWMPExternal {
    public static final String INTERFACE_IDENTIFIER = "{3148E685-B243-423D-8341-8480D6EFF674}";

    /**
     *
     */
    void forceOnline()
            throws ComException;
}
