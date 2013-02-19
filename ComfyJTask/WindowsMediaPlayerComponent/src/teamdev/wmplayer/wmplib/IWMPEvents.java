package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPEvents.
 */
public interface IWMPEvents extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{19A6627B-DA9E-47C1-BB23-00B5E668236A}";

    /**
     * Sent when the control changes OpenState
     */
    void openStateChange(
            Int32 /*[in]*/ NewState);

    /**
     * Sent when the control changes PlayState
     */
    void playStateChange(
            Int32 /*[in]*/ NewState);

    /**
     * Sent when the current audio language has changed
     */
    void audioLanguageChange(
            Int32 /*[in]*/ LangID);

    /**
     * Sent when the status string changes
     */
    void statusChange();

    /**
     * Sent when a synchronized command or URL is received
     */
    void scriptCommand(
            BStr /*[in]*/ scType,
            BStr /*[in]*/ Param);

    /**
     * Sent when a new stream is started in a channel
     */
    void newStream();

    /**
     * Sent when the control is disconnected from the server
     */
    void disconnect(
            Int32 /*[in]*/ Result);

    /**
     * Sent when the control begins or ends buffering
     */
    void buffering(
            VariantBool /*[in]*/ Start);

    /**
     * Sent when the control has an error condition
     */
    void error();

    /**
     * Sent when the control encounters a problem
     */
    void warning(
            Int32 /*[in]*/ WarningType,
            Int32 /*[in]*/ Param,
            BStr /*[in]*/ Description);

    /**
     * Sent when the end of file is reached
     */
    void endOfStream(
            Int32 /*[in]*/ Result);

    /**
     * Indicates that the current position of the movie has changed
     */
    void positionChange(
            DoubleFloat /*[in]*/ oldPosition,
            DoubleFloat /*[in]*/ newPosition);

    /**
     * Sent when a marker is reached
     */
    void markerHit(
            Int32 /*[in]*/ MarkerNum);

    /**
     * Indicates that the unit used to express duration and position has changed
     */
    void durationUnitChange(
            Int32 /*[in]*/ NewDurationUnit);

    /**
     * Indicates that the CD ROM media has changed
     */
    void cdromMediaChange(
            Int32 /*[in]*/ CdromNum);

    /**
     * Sent when a playlist changes
     */
    void playlistChange(
            IDispatch /*[in]*/ Playlist,
            WMPPlaylistChangeEventType /*[in]*/ change);

    /**
     * Sent when the current playlist changes
     */
    void currentPlaylistChange(
            WMPPlaylistChangeEventType /*[in]*/ change);

    /**
     * Sent when a current playlist item becomes available
     */
    void currentPlaylistItemAvailable(
            BStr /*[in]*/ bstrItemName);

    /**
     * Sent when a media object changes
     */
    void mediaChange(
            IDispatch /*[in]*/ Item);

    /**
     * Sent when a current media item becomes available
     */
    void currentMediaItemAvailable(
            BStr /*[in]*/ bstrItemName);

    /**
     * Sent when the item selection on the current playlist changes
     */
    void currentItemChange(
            IDispatch /*[in]*/ pdispMedia);

    /**
     * Sent when the media collection needs to be requeried
     */
    void mediaCollectionChange();

    /**
     * Sent when an attribute string is added in the media collection
     */
    void mediaCollectionAttributeStringAdded(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal);

    /**
     * Sent when an attribute string is removed from the media collection
     */
    void mediaCollectionAttributeStringRemoved(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal);

    /**
     * Sent when an attribute string is changed in the media collection
     */
    void mediaCollectionAttributeStringChanged(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrOldAttribVal,
            BStr /*[in]*/ bstrNewAttribVal);

    /**
     * Sent when playlist collection needs to be requeried
     */
    void playlistCollectionChange();

    /**
     * Sent when a playlist is added to the playlist collection
     */
    void playlistCollectionPlaylistAdded(
            BStr /*[in]*/ bstrPlaylistName);

    /**
     * Sent when a playlist is removed from the playlist collection
     */
    void playlistCollectionPlaylistRemoved(
            BStr /*[in]*/ bstrPlaylistName);

    /**
     * Sent when a playlist has been set or reset as deleted
     */
    void playlistCollectionPlaylistSetAsDeleted(
            BStr /*[in]*/ bstrPlaylistName,
            VariantBool /*[in]*/ varfIsDeleted);

    /**
     * Playlist playback mode has changed
     */
    void modeChange(
            BStr /*[in]*/ ModeName,
            VariantBool /*[in]*/ NewValue);

    /**
     * Sent when the media object has an error condition
     */
    void mediaError(
            IDispatch /*[in]*/ pMediaObject);

    /**
     * Current playlist switch with no open state change
     */
    void openPlaylistSwitch(
            IDispatch /*[in]*/ pItem);

    /**
     * Send a current domain
     */
    void domainChange(
            BStr /*[in]*/ strDomain);

    /**
     * Sent when display switches to player application
     */
    void switchedToPlayerApplication();

    /**
     * Sent when display switches to control
     */
    void switchedToControl();

    /**
     * Sent when the player docks or undocks
     */
    void playerDockedStateChange();

    /**
     * Sent when the OCX reconnects to the player
     */
    void playerReconnect();

    /**
     * Occurs when a user clicks the mouse
     */
    void click(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY);

    /**
     * Occurs when a user double-clicks the mouse
     */
    void doubleClick(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY);

    /**
     * Occurs when a key is pressed
     */
    void keyDown(
            Int16 /*[in]*/ nKeyCode,
            Int16 /*[in]*/ nShiftState);

    /**
     * Occurs when a key is pressed and released
     */
    void keyPress(
            Int16 /*[in]*/ nKeyAscii);

    /**
     * Occurs when a key is released
     */
    void keyUp(
            Int16 /*[in]*/ nKeyCode,
            Int16 /*[in]*/ nShiftState);

    /**
     * Occurs when a mouse button is pressed
     */
    void mouseDown(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY);

    /**
     * Occurs when a mouse pointer is moved
     */
    void mouseMove(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY);

    /**
     * Occurs when a mouse button is released
     */
    void mouseUp(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY);
}
