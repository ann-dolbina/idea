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
 * Represents Java interface for COM interface IWMPDownloadItem2.
 */
public interface IWMPDownloadItem2 extends IWMPDownloadItem {
    public static final String INTERFACE_IDENTIFIER = "{9FBB3336-6DA3-479D-B8FF-67D46E20A987}";

    /**
     * Returns the value of specified attribute for this download item
     */
    BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException;
}
