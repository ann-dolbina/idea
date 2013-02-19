package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPLibrarySharingServices.
 */
public interface IWMPLibrarySharingServices extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{82CBA86B-9F04-474B-A365-D6DD1466E541}";

    /**
     *
     */
    VariantBool isLibraryShared()
            throws ComException;

    /**
     *
     */
    VariantBool isLibrarySharingEnabled()
            throws ComException;

    /**
     *
     */
    void showLibrarySharing()
            throws ComException;
}
