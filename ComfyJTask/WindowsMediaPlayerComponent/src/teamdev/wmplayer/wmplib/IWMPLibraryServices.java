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
 * Represents Java interface for COM interface IWMPLibraryServices.
 */
public interface IWMPLibraryServices extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{39C2F8D5-1CF2-4D5E-AE09-D73492CF9EAA}";

    /**
     *
     */
    Int32 getCountByType(
            WMPLibraryType /*[in]*/ wmplt)
            throws ComException;

    /**
     *
     */
    IWMPLibrary getLibraryByType(
            WMPLibraryType /*[in]*/ wmplt,
            Int32 /*[in]*/ lIndex)
            throws ComException;
}
