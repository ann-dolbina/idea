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
 * Represents Java interface for COM interface _WMPCoreEvents.
 */
public interface _WMPCoreEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{D84CCA96-CCE2-11D2-9ECC-0000F8085981}";

    public static final int DISPID_openStateChange = 5001;
    public static final int DISPID_statusChange = 5002;
    public static final int DISPID_playStateChange = 5101;
    public static final int DISPID_audioLanguageChange = 5102;
    public static final int DISPID_endOfStream = 5201;
    public static final int DISPID_positionChange = 5202;
    public static final int DISPID_markerHit = 5203;
    public static final int DISPID_durationUnitChange = 5204;
    public static final int DISPID_scriptCommand = 5301;
    public static final int DISPID_disconnect = 5401;
    public static final int DISPID_buffering = 5402;
    public static final int DISPID_newStream = 5403;
    public static final int DISPID_error = 5501;
    public static final int DISPID_warning = 5601;
    public static final int DISPID_cdromMediaChange = 5701;
    public static final int DISPID_playlistChange = 5801;
    public static final int DISPID_mediaChange = 5802;
    public static final int DISPID_currentMediaItemAvailable = 5803;
    public static final int DISPID_currentPlaylistChange = 5804;
    public static final int DISPID_currentPlaylistItemAvailable = 5805;
    public static final int DISPID_currentItemChange = 5806;
    public static final int DISPID_mediaCollectionChange = 5807;
    public static final int DISPID_mediaCollectionAttributeStringAdded = 5808;
    public static final int DISPID_mediaCollectionAttributeStringRemoved = 5809;
    public static final int DISPID_playlistCollectionChange = 5810;
    public static final int DISPID_playlistCollectionPlaylistAdded = 5811;
    public static final int DISPID_playlistCollectionPlaylistRemoved = 5812;
    public static final int DISPID_playlistCollectionPlaylistSetAsDeleted = 5818;
    public static final int DISPID_modeChange = 5819;
    public static final int DISPID_mediaCollectionAttributeStringChanged = 5820;
    public static final int DISPID_mediaError = 5821;
    public static final int DISPID_domainChange = 5822;
    public static final int DISPID_openPlaylistSwitch = 5823;
    public static final int DISPID_stringCollectionChange = 5824;
    public static final int DISPID_mediaCollectionMediaAdded = 5825;
    public static final int DISPID_mediaCollectionMediaRemoved = 5826;


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
     * Sent when a string collection changes
     */
    void stringCollectionChange(
            IDispatch /*[in]*/ pdispStringCollection,
            WMPStringCollectionChangeEventType /*[in]*/ change,
            Int32 /*[in]*/ lCollectionIndex);

    /**
     * Sent when a media is added to the local library
     */
    void mediaCollectionMediaAdded(
            IDispatch /*[in]*/ pdispMedia);

    /**
     * Sent when a media is removed from the local library
     */
    void mediaCollectionMediaRemoved(
            IDispatch /*[in]*/ pdispMedia);
}
