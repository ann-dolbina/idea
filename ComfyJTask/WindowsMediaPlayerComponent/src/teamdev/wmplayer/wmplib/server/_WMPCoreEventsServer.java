package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Adapter for server implementation of _WMPCoreEvents
 */
public class _WMPCoreEventsServer extends IDispatchServer
        implements _WMPCoreEvents {
    public _WMPCoreEventsServer(CoClassMetaInfo classImpl) {
        super(classImpl);

        registerMethods(_WMPCoreEvents.class);
    }

    /**
     * Sent when the control changes OpenState
     */
    public void openStateChange(
            Int32 /*[in]*/ NewState) {
    }

    /**
     * Sent when the control changes PlayState
     */
    public void playStateChange(
            Int32 /*[in]*/ NewState) {
    }

    /**
     * Sent when the current audio language has changed
     */
    public void audioLanguageChange(
            Int32 /*[in]*/ LangID) {
    }

    /**
     * Sent when the status string changes
     */
    public void statusChange() {
    }

    /**
     * Sent when a synchronized command or URL is received
     */
    public void scriptCommand(
            BStr /*[in]*/ scType,
            BStr /*[in]*/ Param) {
    }

    /**
     * Sent when a new stream is started in a channel
     */
    public void newStream() {
    }

    /**
     * Sent when the control is disconnected from the server
     */
    public void disconnect(
            Int32 /*[in]*/ Result) {
    }

    /**
     * Sent when the control begins or ends buffering
     */
    public void buffering(
            VariantBool /*[in]*/ Start) {
    }

    /**
     * Sent when the control has an error condition
     */
    public void error() {
    }

    /**
     * Sent when the control encounters a problem
     */
    public void warning(
            Int32 /*[in]*/ WarningType,
            Int32 /*[in]*/ Param,
            BStr /*[in]*/ Description) {
    }

    /**
     * Sent when the end of file is reached
     */
    public void endOfStream(
            Int32 /*[in]*/ Result) {
    }

    /**
     * Indicates that the current position of the movie has changed
     */
    public void positionChange(
            DoubleFloat /*[in]*/ oldPosition,
            DoubleFloat /*[in]*/ newPosition) {
    }

    /**
     * Sent when a marker is reached
     */
    public void markerHit(
            Int32 /*[in]*/ MarkerNum) {
    }

    /**
     * Indicates that the unit used to express duration and position has changed
     */
    public void durationUnitChange(
            Int32 /*[in]*/ NewDurationUnit) {
    }

    /**
     * Indicates that the CD ROM media has changed
     */
    public void cdromMediaChange(
            Int32 /*[in]*/ CdromNum) {
    }

    /**
     * Sent when a playlist changes
     */
    public void playlistChange(
            IDispatch /*[in]*/ Playlist,
            WMPPlaylistChangeEventType /*[in]*/ change) {
    }

    /**
     * Sent when the current playlist changes
     */
    public void currentPlaylistChange(
            WMPPlaylistChangeEventType /*[in]*/ change) {
    }

    /**
     * Sent when a current playlist item becomes available
     */
    public void currentPlaylistItemAvailable(
            BStr /*[in]*/ bstrItemName) {
    }

    /**
     * Sent when a media object changes
     */
    public void mediaChange(
            IDispatch /*[in]*/ Item) {
    }

    /**
     * Sent when a current media item becomes available
     */
    public void currentMediaItemAvailable(
            BStr /*[in]*/ bstrItemName) {
    }

    /**
     * Sent when the item selection on the current playlist changes
     */
    public void currentItemChange(
            IDispatch /*[in]*/ pdispMedia) {
    }

    /**
     * Sent when the media collection needs to be requeried
     */
    public void mediaCollectionChange() {
    }

    /**
     * Sent when an attribute string is added in the media collection
     */
    public void mediaCollectionAttributeStringAdded(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal) {
    }

    /**
     * Sent when an attribute string is removed from the media collection
     */
    public void mediaCollectionAttributeStringRemoved(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal) {
    }

    /**
     * Sent when an attribute string is changed in the media collection
     */
    public void mediaCollectionAttributeStringChanged(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrOldAttribVal,
            BStr /*[in]*/ bstrNewAttribVal) {
    }

    /**
     * Sent when playlist collection needs to be requeried
     */
    public void playlistCollectionChange() {
    }

    /**
     * Sent when a playlist is added to the playlist collection
     */
    public void playlistCollectionPlaylistAdded(
            BStr /*[in]*/ bstrPlaylistName) {
    }

    /**
     * Sent when a playlist is removed from the playlist collection
     */
    public void playlistCollectionPlaylistRemoved(
            BStr /*[in]*/ bstrPlaylistName) {
    }

    /**
     * Sent when a playlist has been set or reset as deleted
     */
    public void playlistCollectionPlaylistSetAsDeleted(
            BStr /*[in]*/ bstrPlaylistName,
            VariantBool /*[in]*/ varfIsDeleted) {
    }

    /**
     * Playlist playback mode has changed
     */
    public void modeChange(
            BStr /*[in]*/ ModeName,
            VariantBool /*[in]*/ NewValue) {
    }

    /**
     * Sent when the media object has an error condition
     */
    public void mediaError(
            IDispatch /*[in]*/ pMediaObject) {
    }

    /**
     * Current playlist switch with no open state change
     */
    public void openPlaylistSwitch(
            IDispatch /*[in]*/ pItem) {
    }

    /**
     * Send a current domain
     */
    public void domainChange(
            BStr /*[in]*/ strDomain) {
    }

    /**
     * Sent when a string collection changes
     */
    public void stringCollectionChange(
            IDispatch /*[in]*/ pdispStringCollection,
            WMPStringCollectionChangeEventType /*[in]*/ change,
            Int32 /*[in]*/ lCollectionIndex) {
    }

    /**
     * Sent when a media is added to the local library
     */
    public void mediaCollectionMediaAdded(
            IDispatch /*[in]*/ pdispMedia) {
    }

    /**
     * Sent when a media is removed from the local library
     */
    public void mediaCollectionMediaRemoved(
            IDispatch /*[in]*/ pdispMedia) {
    }

}