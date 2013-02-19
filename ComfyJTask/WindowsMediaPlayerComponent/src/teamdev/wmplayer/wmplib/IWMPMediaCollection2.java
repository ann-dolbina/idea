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
 * Represents Java interface for COM interface IWMPMediaCollection2.
 */
public interface IWMPMediaCollection2 extends IWMPMediaCollection {
    public static final String INTERFACE_IDENTIFIER = "{8BA957F5-FD8C-4791-B82D-F840401EE474}";

    /**
     * Creates an empty query object
     */
    IWMPQuery createQuery()
            throws ComException;

    /**
     * Creates a playlist from a query
     */
    IWMPPlaylist getPlaylistByQuery(
            IWMPQuery /*[in]*/ pQuery,
            BStr /*[in]*/ bstrMediaType,
            BStr /*[in]*/ bstrSortAttribute,
            VariantBool /*[in]*/ fSortAscending)
            throws ComException;

    /**
     * Creates a string collection from a query
     */
    IWMPStringCollection getStringCollectionByQuery(
            BStr /*[in]*/ bstrAttribute,
            IWMPQuery /*[in]*/ pQuery,
            BStr /*[in]*/ bstrMediaType,
            BStr /*[in]*/ bstrSortAttribute,
            VariantBool /*[in]*/ fSortAscending)
            throws ComException;

    /**
     * Returns a collection of items with the given attribute and media type
     */
    IWMPPlaylist getByAttributeAndMediaType(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrValue,
            BStr /*[in]*/ bstrMediaType)
            throws ComException;
}
