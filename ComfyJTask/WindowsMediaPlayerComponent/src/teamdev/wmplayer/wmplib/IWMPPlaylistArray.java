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
 * Represents Java interface for COM interface IWMPPlaylistArray.
 */
public interface IWMPPlaylistArray extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{679409C0-99F7-11D3-9FB7-00105AA620BB}";

    /**
     * Returns the playlist object at the given index
     */
    IWMPPlaylist item(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the number of items in the playlist array
     */
    Int32 getCount()
            throws ComException;
}
