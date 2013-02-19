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
 * Represents Java interface for COM interface IWMPPlaylistCollection.
 */
public interface IWMPPlaylistCollection extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{10A13217-23A7-439B-B1C0-D847C79B7774}";

    /**
     * Creates a new playlist object
     */
    IWMPPlaylist newPlaylist(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * Returns a playlist array with all the playlists
     */
    IWMPPlaylistArray getAll()
            throws ComException;

    /**
     * Returns a playlist array with playlists matching the given name
     */
    IWMPPlaylistArray getByName(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * Removes an item from the playlist collection
     */
    void remove(
            IWMPPlaylist /*[in]*/ pItem)
            throws ComException;

    /**
     * Sets the deleted flag on a playlist object
     */
    void setDeleted(
            IWMPPlaylist /*[in]*/ pItem,
            VariantBool /*[in]*/ varfIsDeleted)
            throws ComException;

    /**
     * Gets the deleted flag on a playlist object
     */
    VariantBool isDeleted(
            IWMPPlaylist /*[in]*/ pItem)
            throws ComException;

    /**
     * Imports a playlist object into the library
     */
    IWMPPlaylist importPlaylist(
            IWMPPlaylist /*[in]*/ pItem)
            throws ComException;
}
