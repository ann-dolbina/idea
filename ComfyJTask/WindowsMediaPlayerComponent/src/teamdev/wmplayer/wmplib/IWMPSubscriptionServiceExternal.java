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
 * Represents Java interface for COM interface IWMPSubscriptionServiceExternal.
 */
public interface IWMPSubscriptionServiceExternal extends IWMPSubscriptionServiceLimited {
    public static final String INTERFACE_IDENTIFIER = "{2E922378-EE70-4CEB-BBAB-CE7CE4A04816}";

    /**
     *
     */
    IWMPDownloadManager getDownloadManager()
            throws ComException;
}
