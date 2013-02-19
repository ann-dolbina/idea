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
 * Represents Java interface for COM interface IWMPCdromCollection.
 */
public interface IWMPCdromCollection extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{EE4C8FE2-34B2-11D3-A3BF-006097C9B344}";

    /**
     * Returns the CDROM object at the given index
     */
    IWMPCdrom item(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the CDROM object associated with a particular drive specifier, e.g. F:
     */
    IWMPCdrom getByDriveSpecifier(
            BStr /*[in]*/ bstrDriveSpecifier)
            throws ComException;

    /**
     * Returns the number of items in the cdrom collection
     */
    Int32 getCount()
            throws ComException;
}
