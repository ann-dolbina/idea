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
 * Represents Java interface for COM interface IWMPLibrary2.
 */
public interface IWMPLibrary2 extends IWMPLibrary {
    public static final String INTERFACE_IDENTIFIER = "{DD578A4E-79B1-426C-BF8F-3ADD9072500B}";

    /**
     *
     */
    BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException;
}
