package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM dispinterface _WMPCoreEvents.
 */
public class _WMPCoreEventsImpl extends IDispatchImpl
        implements _WMPCoreEvents {
    public static final String INTERFACE_IDENTIFIER = "{D84CCA96-CCE2-11D2-9ECC-0000F8085981}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public _WMPCoreEventsImpl() {
    }

    protected _WMPCoreEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public _WMPCoreEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public _WMPCoreEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public _WMPCoreEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Sent when the control changes OpenState
     */
    public void openStateChange(
            Int32 /*[in]*/ NewState) {

        Parameter[] parameters = new Parameter[]{
                NewState
        };

        Automation.invokeDispatch(this, "OpenStateChange", parameters, void.class);
    }

    /**
     * Sent when the control changes PlayState
     */
    public void playStateChange(
            Int32 /*[in]*/ NewState) {

        Parameter[] parameters = new Parameter[]{
                NewState
        };

        Automation.invokeDispatch(this, "PlayStateChange", parameters, void.class);
    }

    /**
     * Sent when the current audio language has changed
     */
    public void audioLanguageChange(
            Int32 /*[in]*/ LangID) {

        Parameter[] parameters = new Parameter[]{
                LangID
        };

        Automation.invokeDispatch(this, "AudioLanguageChange", parameters, void.class);
    }

    /**
     * Sent when the status string changes
     */
    public void statusChange() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "StatusChange", parameters, void.class);
    }

    /**
     * Sent when a synchronized command or URL is received
     */
    public void scriptCommand(
            BStr /*[in]*/ scType,
            BStr /*[in]*/ Param) {

        Parameter[] parameters = new Parameter[]{
                scType == null ? (Parameter) PTR_NULL : scType,
                Param == null ? (Parameter) PTR_NULL : Param
        };

        Automation.invokeDispatch(this, "ScriptCommand", parameters, void.class);
    }

    /**
     * Sent when a new stream is started in a channel
     */
    public void newStream() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "NewStream", parameters, void.class);
    }

    /**
     * Sent when the control is disconnected from the server
     */
    public void disconnect(
            Int32 /*[in]*/ Result) {

        Parameter[] parameters = new Parameter[]{
                Result
        };

        Automation.invokeDispatch(this, "Disconnect", parameters, void.class);
    }

    /**
     * Sent when the control begins or ends buffering
     */
    public void buffering(
            VariantBool /*[in]*/ Start) {

        Parameter[] parameters = new Parameter[]{
                Start
        };

        Automation.invokeDispatch(this, "Buffering", parameters, void.class);
    }

    /**
     * Sent when the control has an error condition
     */
    public void error() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "Error", parameters, void.class);
    }

    /**
     * Sent when the control encounters a problem
     */
    public void warning(
            Int32 /*[in]*/ WarningType,
            Int32 /*[in]*/ Param,
            BStr /*[in]*/ Description) {

        Parameter[] parameters = new Parameter[]{
                WarningType,
                Param,
                Description == null ? (Parameter) PTR_NULL : Description
        };

        Automation.invokeDispatch(this, "Warning", parameters, void.class);
    }

    /**
     * Sent when the end of file is reached
     */
    public void endOfStream(
            Int32 /*[in]*/ Result) {

        Parameter[] parameters = new Parameter[]{
                Result
        };

        Automation.invokeDispatch(this, "EndOfStream", parameters, void.class);
    }

    /**
     * Indicates that the current position of the movie has changed
     */
    public void positionChange(
            DoubleFloat /*[in]*/ oldPosition,
            DoubleFloat /*[in]*/ newPosition) {

        Parameter[] parameters = new Parameter[]{
                oldPosition,
                newPosition
        };

        Automation.invokeDispatch(this, "PositionChange", parameters, void.class);
    }

    /**
     * Sent when a marker is reached
     */
    public void markerHit(
            Int32 /*[in]*/ MarkerNum) {

        Parameter[] parameters = new Parameter[]{
                MarkerNum
        };

        Automation.invokeDispatch(this, "MarkerHit", parameters, void.class);
    }

    /**
     * Indicates that the unit used to express duration and position has changed
     */
    public void durationUnitChange(
            Int32 /*[in]*/ NewDurationUnit) {

        Parameter[] parameters = new Parameter[]{
                NewDurationUnit
        };

        Automation.invokeDispatch(this, "DurationUnitChange", parameters, void.class);
    }

    /**
     * Indicates that the CD ROM media has changed
     */
    public void cdromMediaChange(
            Int32 /*[in]*/ CdromNum) {

        Parameter[] parameters = new Parameter[]{
                CdromNum
        };

        Automation.invokeDispatch(this, "CdromMediaChange", parameters, void.class);
    }

    /**
     * Sent when a playlist changes
     */
    public void playlistChange(
            IDispatch /*[in]*/ Playlist,
            WMPPlaylistChangeEventType /*[in]*/ change) {

        Parameter[] parameters = new Parameter[]{
                Playlist == null ? (Parameter) PTR_NULL : (Parameter) Playlist,
                change
        };

        Automation.invokeDispatch(this, "PlaylistChange", parameters, void.class);
    }

    /**
     * Sent when the current playlist changes
     */
    public void currentPlaylistChange(
            WMPPlaylistChangeEventType /*[in]*/ change) {

        Parameter[] parameters = new Parameter[]{
                change
        };

        Automation.invokeDispatch(this, "CurrentPlaylistChange", parameters, void.class);
    }

    /**
     * Sent when a current playlist item becomes available
     */
    public void currentPlaylistItemAvailable(
            BStr /*[in]*/ bstrItemName) {

        Parameter[] parameters = new Parameter[]{
                bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName
        };

        Automation.invokeDispatch(this, "CurrentPlaylistItemAvailable", parameters, void.class);
    }

    /**
     * Sent when a media object changes
     */
    public void mediaChange(
            IDispatch /*[in]*/ Item) {

        Parameter[] parameters = new Parameter[]{
                Item == null ? (Parameter) PTR_NULL : (Parameter) Item
        };

        Automation.invokeDispatch(this, "MediaChange", parameters, void.class);
    }

    /**
     * Sent when a current media item becomes available
     */
    public void currentMediaItemAvailable(
            BStr /*[in]*/ bstrItemName) {

        Parameter[] parameters = new Parameter[]{
                bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName
        };

        Automation.invokeDispatch(this, "CurrentMediaItemAvailable", parameters, void.class);
    }

    /**
     * Sent when the item selection on the current playlist changes
     */
    public void currentItemChange(
            IDispatch /*[in]*/ pdispMedia) {

        Parameter[] parameters = new Parameter[]{
                pdispMedia == null ? (Parameter) PTR_NULL : (Parameter) pdispMedia
        };

        Automation.invokeDispatch(this, "CurrentItemChange", parameters, void.class);
    }

    /**
     * Sent when the media collection needs to be requeried
     */
    public void mediaCollectionChange() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "MediaCollectionChange", parameters, void.class);
    }

    /**
     * Sent when an attribute string is added in the media collection
     */
    public void mediaCollectionAttributeStringAdded(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal) {

        Parameter[] parameters = new Parameter[]{
                bstrAttribName == null ? (Parameter) PTR_NULL : bstrAttribName,
                bstrAttribVal == null ? (Parameter) PTR_NULL : bstrAttribVal
        };

        Automation.invokeDispatch(this, "MediaCollectionAttributeStringAdded", parameters, void.class);
    }

    /**
     * Sent when an attribute string is removed from the media collection
     */
    public void mediaCollectionAttributeStringRemoved(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal) {

        Parameter[] parameters = new Parameter[]{
                bstrAttribName == null ? (Parameter) PTR_NULL : bstrAttribName,
                bstrAttribVal == null ? (Parameter) PTR_NULL : bstrAttribVal
        };

        Automation.invokeDispatch(this, "MediaCollectionAttributeStringRemoved", parameters, void.class);
    }

    /**
     * Sent when an attribute string is changed in the media collection
     */
    public void mediaCollectionAttributeStringChanged(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrOldAttribVal,
            BStr /*[in]*/ bstrNewAttribVal) {

        Parameter[] parameters = new Parameter[]{
                bstrAttribName == null ? (Parameter) PTR_NULL : bstrAttribName,
                bstrOldAttribVal == null ? (Parameter) PTR_NULL : bstrOldAttribVal,
                bstrNewAttribVal == null ? (Parameter) PTR_NULL : bstrNewAttribVal
        };

        Automation.invokeDispatch(this, "MediaCollectionAttributeStringChanged", parameters, void.class);
    }

    /**
     * Sent when playlist collection needs to be requeried
     */
    public void playlistCollectionChange() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "PlaylistCollectionChange", parameters, void.class);
    }

    /**
     * Sent when a playlist is added to the playlist collection
     */
    public void playlistCollectionPlaylistAdded(
            BStr /*[in]*/ bstrPlaylistName) {

        Parameter[] parameters = new Parameter[]{
                bstrPlaylistName == null ? (Parameter) PTR_NULL : bstrPlaylistName
        };

        Automation.invokeDispatch(this, "PlaylistCollectionPlaylistAdded", parameters, void.class);
    }

    /**
     * Sent when a playlist is removed from the playlist collection
     */
    public void playlistCollectionPlaylistRemoved(
            BStr /*[in]*/ bstrPlaylistName) {

        Parameter[] parameters = new Parameter[]{
                bstrPlaylistName == null ? (Parameter) PTR_NULL : bstrPlaylistName
        };

        Automation.invokeDispatch(this, "PlaylistCollectionPlaylistRemoved", parameters, void.class);
    }

    /**
     * Sent when a playlist has been set or reset as deleted
     */
    public void playlistCollectionPlaylistSetAsDeleted(
            BStr /*[in]*/ bstrPlaylistName,
            VariantBool /*[in]*/ varfIsDeleted) {

        Parameter[] parameters = new Parameter[]{
                bstrPlaylistName == null ? (Parameter) PTR_NULL : bstrPlaylistName,
                varfIsDeleted
        };

        Automation.invokeDispatch(this, "PlaylistCollectionPlaylistSetAsDeleted", parameters, void.class);
    }

    /**
     * Playlist playback mode has changed
     */
    public void modeChange(
            BStr /*[in]*/ ModeName,
            VariantBool /*[in]*/ NewValue) {

        Parameter[] parameters = new Parameter[]{
                ModeName == null ? (Parameter) PTR_NULL : ModeName,
                NewValue
        };

        Automation.invokeDispatch(this, "ModeChange", parameters, void.class);
    }

    /**
     * Sent when the media object has an error condition
     */
    public void mediaError(
            IDispatch /*[in]*/ pMediaObject) {

        Parameter[] parameters = new Parameter[]{
                pMediaObject == null ? (Parameter) PTR_NULL : (Parameter) pMediaObject
        };

        Automation.invokeDispatch(this, "MediaError", parameters, void.class);
    }

    /**
     * Current playlist switch with no open state change
     */
    public void openPlaylistSwitch(
            IDispatch /*[in]*/ pItem) {

        Parameter[] parameters = new Parameter[]{
                pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem
        };

        Automation.invokeDispatch(this, "OpenPlaylistSwitch", parameters, void.class);
    }

    /**
     * Send a current domain
     */
    public void domainChange(
            BStr /*[in]*/ strDomain) {

        Parameter[] parameters = new Parameter[]{
                strDomain == null ? (Parameter) PTR_NULL : strDomain
        };

        Automation.invokeDispatch(this, "DomainChange", parameters, void.class);
    }

    /**
     * Sent when a string collection changes
     */
    public void stringCollectionChange(
            IDispatch /*[in]*/ pdispStringCollection,
            WMPStringCollectionChangeEventType /*[in]*/ change,
            Int32 /*[in]*/ lCollectionIndex) {

        Parameter[] parameters = new Parameter[]{
                pdispStringCollection == null ? (Parameter) PTR_NULL : (Parameter) pdispStringCollection,
                change,
                lCollectionIndex
        };

        Automation.invokeDispatch(this, "StringCollectionChange", parameters, void.class);
    }

    /**
     * Sent when a media is added to the local library
     */
    public void mediaCollectionMediaAdded(
            IDispatch /*[in]*/ pdispMedia) {

        Parameter[] parameters = new Parameter[]{
                pdispMedia == null ? (Parameter) PTR_NULL : (Parameter) pdispMedia
        };

        Automation.invokeDispatch(this, "MediaCollectionMediaAdded", parameters, void.class);
    }

    /**
     * Sent when a media is removed from the local library
     */
    public void mediaCollectionMediaRemoved(
            IDispatch /*[in]*/ pdispMedia) {

        Parameter[] parameters = new Parameter[]{
                pdispMedia == null ? (Parameter) PTR_NULL : (Parameter) pdispMedia
        };

        Automation.invokeDispatch(this, "MediaCollectionMediaRemoved", parameters, void.class);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new _WMPCoreEventsImpl(this);
    }
}
