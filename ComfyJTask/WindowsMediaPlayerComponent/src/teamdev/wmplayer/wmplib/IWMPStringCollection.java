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
 * Represents Java interface for COM interface IWMPStringCollection.
 */
public interface IWMPStringCollection extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{4A976298-8C0D-11D3-B389-00C04F68574B}";

    /**
     * Returns the string at the given index
     */
    BStr item(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the number of items in the string collection
     */
    Int32 getCount()
            throws ComException;
}
