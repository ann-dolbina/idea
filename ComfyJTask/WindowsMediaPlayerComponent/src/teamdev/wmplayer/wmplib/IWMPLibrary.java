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
 * Represents Java interface for COM interface IWMPLibrary.
 */
public interface IWMPLibrary extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{3DF47861-7DF1-4C1F-A81B-4C26F0F7A7C6}";

    /**
     *
     */
    VariantBool isIdentical(
            IWMPLibrary /*[in]*/ pIWMPLibrary)
            throws ComException;

    /**
     *
     */
    BStr getName()
            throws ComException;

    /**
     *
     */
    WMPLibraryType getType()
            throws ComException;

    /**
     *
     */
    IWMPMediaCollection getMediaCollection()
            throws ComException;
}
