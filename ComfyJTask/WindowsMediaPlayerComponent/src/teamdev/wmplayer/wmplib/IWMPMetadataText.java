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
 * Represents Java interface for COM interface IWMPMetadataText.
 */
public interface IWMPMetadataText extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{769A72DB-13D2-45E2-9C48-53CA9D5B7450}";

    /**
     *
     */
    BStr getDescription()
            throws ComException;

    /**
     *
     */
    BStr getText()
            throws ComException;
}
