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
 * Represents Java interface for COM interface _WMPOCXEvents.
 */
public interface _WMPOCXEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{6BF52A51-394A-11D3-B153-00C04F79FAA6}";

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
    public static final int DISPID_switchedToPlayerApplication = 6501;
    public static final int DISPID_switchedToControl = 6502;
    public static final int DISPID_playerDockedStateChange = 6503;
    public static final int DISPID_playerReconnect = 6504;
    public static final int DISPID_click = 6505;
    public static final int DISPID_doubleClick = 6506;
    public static final int DISPID_keyDown = 6507;
    public static final int DISPID_keyPress = 6508;
    public static final int DISPID_keyUp = 6509;
    public static final int DISPID_mouseDown = 6510;
    public static final int DISPID_mouseMove = 6511;
    public static final int DISPID_mouseUp = 6512;
    public static final int DISPID_deviceConnect = 6513;
    public static final int DISPID_deviceDisconnect = 6514;
    public static final int DISPID_deviceStatusChange = 6515;
    public static final int DISPID_deviceSyncStateChange = 6516;
    public static final int DISPID_deviceSyncError = 6517;
    public static final int DISPID_createPartnershipComplete = 6518;
    public static final int DISPID_cdromRipStateChange = 6519;
    public static final int DISPID_cdromRipMediaError = 6520;
    public static final int DISPID_cdromBurnStateChange = 6521;
    public static final int DISPID_cdromBurnMediaError = 6522;
    public static final int DISPID_cdromBurnError = 6523;
    public static final int DISPID_libraryConnect = 6524;
    public static final int DISPID_libraryDisconnect = 6525;
    public static final int DISPID_folderScanStateChange = 6526;
    public static final int DISPID_deviceEstimation = 6527;


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

    /**
     * Occurs when a device is connected
     */
    void deviceConnect(
            IWMPSyncDevice /*[in]*/ pDevice);

    /**
     * Occurs when a device is disconnected
     */
    void deviceDisconnect(
            IWMPSyncDevice /*[in]*/ pDevice);

    /**
     * Occurs when a device status changes
     */
    void deviceStatusChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPDeviceStatus /*[in]*/ NewStatus);

    /**
     * Occurs when a device sync state changes
     */
    void deviceSyncStateChange(
            IWMPSyncDevice /*[in]*/ pDevice,
            WMPSyncState /*[in]*/ NewState);

    /**
     * Occurs when a device's media has an error
     */
    void deviceSyncError(
            IWMPSyncDevice /*[in]*/ pDevice,
            IDispatch /*[in]*/ pMedia);

    /**
     * Occurs when createPartnership call completes
     */
    void createPartnershipComplete(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult);

    /**
     * Occurs when the sync estimation completed
     */
    void deviceEstimation(
            IWMPSyncDevice /*[in]*/ pDevice,
            HResult /*[in]*/ hrResult,
            Int64 /*[in]*/ qwEstimatedUsedSpace,
            Int64 /*[in]*/ qwEstimatedSpace);

    /**
     * Occurs when ripping state changes
     */
    void cdromRipStateChange(
            IWMPCdromRip /*[in]*/ pCdromRip,
            WMPRipState /*[in]*/ wmprs);

    /**
     * Occurs when an error happens while ripping a media
     */
    void cdromRipMediaError(
            IWMPCdromRip /*[in]*/ pCdromRip,
            IDispatch /*[in]*/ pMedia);

    /**
     * Occurs when burning state changes
     */
    void cdromBurnStateChange(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            WMPBurnState /*[in]*/ wmpbs);

    /**
     * Occurs when an error happens while burning a media
     */
    void cdromBurnMediaError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            IDispatch /*[in]*/ pMedia);

    /**
     * Occurs when a generic error happens while burning
     */
    void cdromBurnError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            HResult /*[in]*/ hrError);

    /**
     * Occurs when a library is connected
     */
    void libraryConnect(
            IWMPLibrary /*[in]*/ pLibrary);

    /**
     * Occurs when a library is disconnected
     */
    void libraryDisconnect(
            IWMPLibrary /*[in]*/ pLibrary);

    /**
     * Occurs when a folder scan state changes
     */
    void folderScanStateChange(
            WMPFolderScanState /*[in]*/ wmpfss);

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
