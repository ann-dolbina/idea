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
 * Represents COM dispinterface _WMPOCXEvents.
 */
public class _WMPOCXEventsImpl extends IDispatchImpl
        implements _WMPOCXEvents {
    public static final String INTERFACE_IDENTIFIER = "{6BF52A51-394A-11D3-B153-00C04F79FAA6}";
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public _WMPOCXEventsImpl() {
    }

    protected _WMPOCXEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public _WMPOCXEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public _WMPOCXEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public _WMPOCXEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
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
     * Sent when display switches to player application
     */
    public void switchedToPlayerApplication() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "SwitchedToPlayerApplication", parameters, void.class);
    }

    /**
     * Sent when display switches to control
     */
    public void switchedToControl() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "SwitchedToControl", parameters, void.class);
    }

    /**
     * Sent when the player docks or undocks
     */
    public void playerDockedStateChange() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "PlayerDockedStateChange", parameters, void.class);
    }

    /**
     * Sent when the OCX reconnects to the player
     */
    public void playerReconnect() {

        Parameter[] parameters = new Parameter[0];

        Automation.invokeDispatch(this, "PlayerReconnect", parameters, void.class);
    }

    /**
     * Occurs when a user clicks the mouse
     */
    public void click(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {

        Parameter[] parameters = new Parameter[]{
                nButton,
                nShiftState,
                fX,
                fY
        };

        Automation.invokeDispatch(this, "Click", parameters, void.class);
    }

    /**
     * Occurs when a user double-clicks the mouse
     */
    public void doubleClick(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {

        Parameter[] parameters = new Parameter[]{
                nButton,
                nShiftState,
                fX,
                fY
        };

        Automation.invokeDispatch(this, "DoubleClick", parameters, void.class);
    }

    /**
     * Occurs when a key is pressed
     */
    public void keyDown(
            Int16 /*[in]*/ nKeyCode,
            Int16 /*[in]*/ nShiftState) {

        Parameter[] parameters = new Parameter[]{
                nKeyCode,
                nShiftState
        };

        Automation.invokeDispatch(this, "KeyDown", parameters, void.class);
    }

    /**
     * Occurs when a key is pressed and released
     */
    public void keyPress(
            Int16 /*[in]*/ nKeyAscii) {

        Parameter[] parameters = new Parameter[]{
                nKeyAscii
        };

        Automation.invokeDispatch(this, "KeyPress", parameters, void.class);
    }

    /**
     * Occurs when a key is released
     */
    public void keyUp(
            Int16 /*[in]*/ nKeyCode,
            Int16 /*[in]*/ nShiftState) {

        Parameter[] parameters = new Parameter[]{
                nKeyCode,
                nShiftState
        };

        Automation.invokeDispatch(this, "KeyUp", parameters, void.class);
    }

    /**
     * Occurs when a mouse button is pressed
     */
    public void mouseDown(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {

        Parameter[] parameters = new Parameter[]{
                nButton,
                nShiftState,
                fX,
                fY
        };

        Automation.invokeDispatch(this, "MouseDown", parameters, void.class);
    }

    /**
     * Occurs when a mouse pointer is moved
     */
    public void mouseMove(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {

        Parameter[] parameters = new Parameter[]{
                nButton,
                nShiftState,
                fX,
                fY
        };

        Automation.invokeDispatch(this, "MouseMove", parameters, void.class);
    }

    /**
     * Occurs when a mouse button is released
     */
    public void mouseUp(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {

        Parameter[] parameters = new Parameter[]{
                nButton,
                nShiftState,
                fX,
                fY
        };

        Automation.invokeDispatch(this, "MouseUp", parameters, void.class);
    }

    /**
     * Occurs when a device is connected
     */
    public void deviceConnect(
            IWMPSyncDevice /*[in]*/ pDevice) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice
        };

        Automation.invokeDispatch(this, "DeviceConnect", parameters, void.class);
    }

    /**
     * Occurs when a device is disconnected
     */
    public void deviceDisconnect(
            IWMPSyncDevice /*[in]*/ pDevice) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice
        };

        Automation.invokeDispatch(this, "DeviceDisconnect", parameters, void.class);
    }

    /**
     * Occurs when a device status changes
     */
    public void deviceStatusChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPDeviceStatus /*[in]*/ NewStatus) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                NewStatus
        };

        Automation.invokeDispatch(this, "DeviceStatusChange", parameters, void.class);
    }

    /**
     * Occurs when a device sync state changes
     */
    public void deviceSyncStateChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPSyncState /*[in]*/ NewState) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                NewState
        };

        Automation.invokeDispatch(this, "DeviceSyncStateChange", parameters, void.class);
    }

    /**
     * Occurs when a device's media has an error
     */
    public void deviceSyncError(
            IWMPSyncDevice /*[in]*/ pDevice,
            IDispatch /*[in]*/ pMedia) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                pMedia == null ? (Parameter) PTR_NULL : (Parameter) pMedia
        };

        Automation.invokeDispatch(this, "DeviceSyncError", parameters, void.class);
    }

    /**
     * Occurs when createPartnership call completes
     */
    public void createPartnershipComplete(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                hrResult
        };

        Automation.invokeDispatch(this, "CreatePartnershipComplete", parameters, void.class);
    }

    /**
     * Occurs when the sync estimation completed
     */
    public void deviceEstimation(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult,
            Int64 /*[in]*/ qwEstimatedUsedSpace,
            Int64 /*[in]*/ qwEstimatedSpace) {

        Parameter[] parameters = new Parameter[]{
                pDevice == null ? (Parameter) PTR_NULL : (Parameter) pDevice,
                hrResult,
                qwEstimatedUsedSpace,
                qwEstimatedSpace
        };

        Automation.invokeDispatch(this, "DeviceEstimation", parameters, void.class);
    }

    /**
     * Occurs when ripping state changes
     */
    public void cdromRipStateChange(
            IWMPCdromRip /*[in]*/ pCdromRip,
            WMPRipState /*[in]*/ wmprs) {

        Parameter[] parameters = new Parameter[]{
                pCdromRip == null ? (Parameter) PTR_NULL : (Parameter) pCdromRip,
                wmprs
        };

        Automation.invokeDispatch(this, "CdromRipStateChange", parameters, void.class);
    }

    /**
     * Occurs when an error happens while ripping a media
     */
    public void cdromRipMediaError(
            IWMPCdromRip /*[in]*/ pCdromRip,
            IDispatch /*[in]*/ pMedia) {

        Parameter[] parameters = new Parameter[]{
                pCdromRip == null ? (Parameter) PTR_NULL : (Parameter) pCdromRip,
                pMedia == null ? (Parameter) PTR_NULL : (Parameter) pMedia
        };

        Automation.invokeDispatch(this, "CdromRipMediaError", parameters, void.class);
    }

    /**
     * Occurs when burning state changes
     */
    public void cdromBurnStateChange(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            WMPBurnState /*[in]*/ wmpbs) {

        Parameter[] parameters = new Parameter[]{
                pCdromBurn == null ? (Parameter) PTR_NULL : (Parameter) pCdromBurn,
                wmpbs
        };

        Automation.invokeDispatch(this, "CdromBurnStateChange", parameters, void.class);
    }

    /**
     * Occurs when an error happens while burning a media
     */
    public void cdromBurnMediaError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            IDispatch /*[in]*/ pMedia) {

        Parameter[] parameters = new Parameter[]{
                pCdromBurn == null ? (Parameter) PTR_NULL : (Parameter) pCdromBurn,
                pMedia == null ? (Parameter) PTR_NULL : (Parameter) pMedia
        };

        Automation.invokeDispatch(this, "CdromBurnMediaError", parameters, void.class);
    }

    /**
     * Occurs when a generic error happens while burning
     */
    public void cdromBurnError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            HResult /*[in]*/ hrError) {

        Parameter[] parameters = new Parameter[]{
                pCdromBurn == null ? (Parameter) PTR_NULL : (Parameter) pCdromBurn,
                hrError
        };

        Automation.invokeDispatch(this, "CdromBurnError", parameters, void.class);
    }

    /**
     * Occurs when a library is connected
     */
    public void libraryConnect(
            IWMPLibrary /*[in]*/ pLibrary) {

        Parameter[] parameters = new Parameter[]{
                pLibrary == null ? (Parameter) PTR_NULL : (Parameter) pLibrary
        };

        Automation.invokeDispatch(this, "LibraryConnect", parameters, void.class);
    }

    /**
     * Occurs when a library is disconnected
     */
    public void libraryDisconnect(
            IWMPLibrary /*[in]*/ pLibrary) {

        Parameter[] parameters = new Parameter[]{
                pLibrary == null ? (Parameter) PTR_NULL : (Parameter) pLibrary
        };

        Automation.invokeDispatch(this, "LibraryDisconnect", parameters, void.class);
    }

    /**
     * Occurs when a folder scan state changes
     */
    public void folderScanStateChange(
            WMPFolderScanState /*[in]*/ wmpfss) {

        Parameter[] parameters = new Parameter[]{
                wmpfss
        };

        Automation.invokeDispatch(this, "FolderScanStateChange", parameters, void.class);
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
        return new _WMPOCXEventsImpl(this);
    }
}
