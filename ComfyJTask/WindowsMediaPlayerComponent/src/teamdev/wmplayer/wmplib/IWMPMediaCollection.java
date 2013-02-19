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
 * Represents Java interface for COM interface IWMPMediaCollection.
 */
public interface IWMPMediaCollection extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{8363BC22-B4B4-4B19-989D-1CD765749DD1}";

    /**
     * Creates a new media object
     */
    IWMPMedia add(
            BStr /*[in]*/ bstrURL)
            throws ComException;

    /**
     * Returns a collection of all the items
     */
    IWMPPlaylist getAll()
            throws ComException;

    /**
     * Returns a collection of items with the given name
     */
    IWMPPlaylist getByName(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * Returns a collection of items with the given genre
     */
    IWMPPlaylist getByGenre(
            BStr /*[in]*/ bstrGenre)
            throws ComException;

    /**
     * Returns a collection of items by a given author
     */
    IWMPPlaylist getByAuthor(
            BStr /*[in]*/ bstrAuthor)
            throws ComException;

    /**
     * Returns a collection of items from the given album
     */
    IWMPPlaylist getByAlbum(
            BStr /*[in]*/ bstrAlbum)
            throws ComException;

    /**
     * Returns a collection of items with the given attribute
     */
    IWMPPlaylist getByAttribute(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrValue)
            throws ComException;

    /**
     * Removes an item from the media collection
     */
    void remove(
            IWMPMedia /*[in]*/ pItem,
            VariantBool /*[in]*/ varfDeleteFile)
            throws ComException;

    /**
     * Returns the string collection associated with an attribute
     */
    IWMPStringCollection getAttributeStringCollection(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrMediaType)
            throws ComException;

    /**
     * Gets an atom associated with an item name which can be requested from an IWMPMedia out of this collection via getItemInfoByAtom
     */
    Int32 getMediaAtom(
            BStr /*[in]*/ bstrItemName)
            throws ComException;

    /**
     * Sets the deleted flag on a media object
     */
    void setDeleted(
            IWMPMedia /*[in]*/ pItem,
            VariantBool /*[in]*/ varfIsDeleted)
            throws ComException;

    /**
     * Gets the deleted flag on a media object
     */
    VariantBool isDeleted(
            IWMPMedia /*[in]*/ pItem)
            throws ComException;
}
