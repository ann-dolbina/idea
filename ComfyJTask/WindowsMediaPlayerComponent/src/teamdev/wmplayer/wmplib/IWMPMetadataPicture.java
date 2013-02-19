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
 * Represents Java interface for COM interface IWMPMetadataPicture.
 */
public interface IWMPMetadataPicture extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{5C29BBE0-F87D-4C45-AA28-A70F0230FFA9}";

    /**
     *
     */
    BStr getMimeType()
            throws ComException;

    /**
     *
     */
    BStr getPictureType()
            throws ComException;

    /**
     *
     */
    BStr getDescription()
            throws ComException;

    /**
     *
     */
    BStr getURL()
            throws ComException;
}
