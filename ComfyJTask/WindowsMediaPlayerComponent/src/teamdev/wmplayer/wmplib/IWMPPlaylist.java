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
 * Represents Java interface for COM interface IWMPPlaylist.
 */
public interface IWMPPlaylist extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{D5F0F4F1-130C-11D3-B14E-00C04F79FAA6}";

    /**
     * Returns the value of a playlist attribute
     */
    BStr getItemInfo(
            BStr /*[in]*/ bstrName)
            throws ComException;

    /**
     * Sets the value of a playlist attribute
     */
    void setItemInfo(
            BStr /*[in]*/ bstrName,
            BStr /*[in]*/ bstrValue)
            throws ComException;

    /**
     * Removes all items from the playlist
     */
    void clear()
            throws ComException;

    /**
     * Inserts an item into the playlist at the specified location
     */
    void insertItem(
            Int32 /*[in]*/ lIndex,
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException;

    /**
     * Adds an item to the end of the playlist
     */
    void appendItem(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException;

    /**
     * Removes the specified item from the playlist
     */
    void removeItem(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException;

    /**
     * Changes the location of an item in the playlist
     */
    void moveItem(
            Int32 /*[in]*/ lIndexOld,
            Int32 /*[in]*/ lIndexNew)
            throws ComException;

    /**
     * Returns the number of items in the playlist
     */
    Int32 getCount()
            throws ComException;

    /**
     * Returns the name of the playlist
     */
    BStr getName()
            throws ComException;

    /**
     * Returns the name of the playlist
     */
    void setName(
            BStr /*[in]*/ pbstrName)
            throws ComException;

    /**
     * Returns the number of attributes associated with the playlist
     */
    Int32 getAttributeCount()
            throws ComException;

    /**
     * Returns the name of an attribute specified by an index
     */
    BStr getAttributeName(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the item at the specified index
     */
    IWMPMedia getItem(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Determines if the supplied object is the same as the this one
     */
    VariantBool getIsIdentical(
            IWMPPlaylist /*[in]*/ pIWMPPlaylist)
            throws ComException;
}
