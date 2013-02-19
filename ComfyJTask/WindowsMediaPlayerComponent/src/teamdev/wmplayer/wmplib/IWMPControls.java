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
 * Represents Java interface for COM interface IWMPControls.
 */
public interface IWMPControls extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{74C09E02-F828-11D2-A74B-00A0C905F36E}";

    /**
     * Begins playing media
     */
    void play()
            throws ComException;

    /**
     * Stops play of media
     */
    void stop()
            throws ComException;

    /**
     * Pauses play of media
     */
    void pause()
            throws ComException;

    /**
     * Fast play of media in forward direction
     */
    void fastForward()
            throws ComException;

    /**
     * Fast play of media in reverse direction
     */
    void fastReverse()
            throws ComException;

    /**
     * Sets the current item to the next item in the playlist
     */
    void next()
            throws ComException;

    /**
     * Sets the current item to the previous item in the playlist
     */
    void previous()
            throws ComException;

    /**
     * Sets the current item and plays it
     */
    void playItem(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException;

    /**
     * Returns whether or not the specified media functionality is available
     */
    VariantBool getIsAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     * Returns the current position in media
     */
    DoubleFloat getCurrentPosition()
            throws ComException;

    /**
     * Returns the current position in media
     */
    void setCurrentPosition(
            DoubleFloat /*[in]*/ pdCurrentPosition)
            throws ComException;

    /**
     * Returns the current position in media as a string
     */
    BStr getCurrentPositionString()
            throws ComException;

    /**
     * Returns/Sets the play item
     */
    IWMPMedia getCurrentItem()
            throws ComException;

    /**
     * Returns/Sets the play item
     */
    void setCurrentItem(
            IWMPMedia /*[in]*/ ppIWMPMedia)
            throws ComException;

    /**
     * Returns the current marker
     */
    Int32 getCurrentMarker()
            throws ComException;

    /**
     * Returns the current marker
     */
    void setCurrentMarker(
            Int32 /*[in]*/ plMarker)
            throws ComException;
}
