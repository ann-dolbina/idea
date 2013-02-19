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
 * Represents Java interface for COM interface IWMPMedia.
 */
public interface IWMPMedia extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{94D55E95-3FAC-11D3-B155-00C04F79FAA6}";

    /**
     * Returns the time of a marker
     */
    DoubleFloat getMarkerTime(
            Int32 /*[in]*/ MarkerNum)
            throws ComException;

    /**
     * Returns the name of a marker
     */
    BStr getMarkerName(
            Int32 /*[in]*/ MarkerNum)
            throws ComException;

    /**
     * Returns the name of the attribute whose index has been specified
     */
    BStr getAttributeName(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the value of specified attribute for this media
     */
    BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException;

    /**
     * Sets the value of specified attribute for this media
     */
    void setItemInfo(
            BStr /*[in]*/ bstrItemName,
            BStr /*[in]*/ bstrVal)
            throws ComException;

    /**
     * Gets an item info by atom
     */
    BStr getItemInfoByAtom(
            Int32 /*[in]*/ lAtom)
            throws ComException;

    /**
     * Is the media a member of the given playlist
     */
    VariantBool isMemberOf(
            IWMPPlaylist /*[in]*/ pPlaylist)
            throws ComException;

    /**
     * Is the attribute read only
     */
    VariantBool isReadOnlyItem(
            BStr /*[in]*/ bstrItemName)
            throws ComException;

    /**
     * Determines if the supplied object is the same as the this one
     */
    VariantBool getIsIdentical(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException;

    /**
     * Returns the media URL
     */
    BStr getSourceURL()
            throws ComException;

    /**
     * Returns the name of the media
     */
    BStr getName()
            throws ComException;

    /**
     * Returns the name of the media
     */
    void setName(
            BStr /*[in]*/ pbstrName)
            throws ComException;

    /**
     * Returns the original width of the source images
     */
    Int32 getImageSourceWidth()
            throws ComException;

    /**
     * Returns the original height of the source images
     */
    Int32 getImageSourceHeight()
            throws ComException;

    /**
     * Returns the number of markers in the file
     */
    Int32 getMarkerCount()
            throws ComException;

    /**
     * Returns duration of current media
     */
    DoubleFloat getDuration()
            throws ComException;

    /**
     * Returns duration of current media as a string
     */
    BStr getDurationString()
            throws ComException;

    /**
     * Returns the count of the attributes associated with this media
     */
    Int32 getAttributeCount()
            throws ComException;
}
