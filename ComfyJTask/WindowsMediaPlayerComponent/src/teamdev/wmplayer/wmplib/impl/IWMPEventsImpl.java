package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPEvents.
 */
public class IWMPEventsImpl extends IUnknownImpl
        implements IWMPEvents {
    public static final String INTERFACE_IDENTIFIER = IWMPEvents.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEventsImpl() {
    }

    protected IWMPEventsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEventsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEventsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEventsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Sent when the control changes OpenState
     */
    public void openStateChange(
            Int32 /*[in]*/ NewState) {
        invokeVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        NewState
                }
        );
    }

    /**
     * Sent when the control changes PlayState
     */
    public void playStateChange(
            Int32 /*[in]*/ NewState) {
        invokeVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        NewState
                }
        );
    }

    /**
     * Sent when the current audio language has changed
     */
    public void audioLanguageChange(
            Int32 /*[in]*/ LangID) {
        invokeVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        LangID
                }
        );
    }

    /**
     * Sent when the status string changes
     */
    public void statusChange() {
        invokeVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when a synchronized command or URL is received
     */
    public void scriptCommand(
            BStr /*[in]*/ scType,
            BStr /*[in]*/ Param) {
        invokeVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        scType == null ? (Parameter) PTR_NULL : scType,
                        Param == null ? (Parameter) PTR_NULL : Param
                }
        );
    }

    /**
     * Sent when a new stream is started in a channel
     */
    public void newStream() {
        invokeVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when the control is disconnected from the server
     */
    public void disconnect(
            Int32 /*[in]*/ Result) {
        invokeVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        Result
                }
        );
    }

    /**
     * Sent when the control begins or ends buffering
     */
    public void buffering(
            VariantBool /*[in]*/ Start) {
        invokeVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        Start
                }
        );
    }

    /**
     * Sent when the control has an error condition
     */
    public void error() {
        invokeVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when the control encounters a problem
     */
    public void warning(
            Int32 /*[in]*/ WarningType,
            Int32 /*[in]*/ Param,
            BStr /*[in]*/ Description) {
        invokeVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        WarningType,
                        Param,
                        Description == null ? (Parameter) PTR_NULL : Description
                }
        );
    }

    /**
     * Sent when the end of file is reached
     */
    public void endOfStream(
            Int32 /*[in]*/ Result) {
        invokeVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        Result
                }
        );
    }

    /**
     * Indicates that the current position of the movie has changed
     */
    public void positionChange(
            DoubleFloat /*[in]*/ oldPosition,
            DoubleFloat /*[in]*/ newPosition) {
        invokeVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        oldPosition,
                        newPosition
                }
        );
    }

    /**
     * Sent when a marker is reached
     */
    public void markerHit(
            Int32 /*[in]*/ MarkerNum) {
        invokeVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        MarkerNum
                }
        );
    }

    /**
     * Indicates that the unit used to express duration and position has changed
     */
    public void durationUnitChange(
            Int32 /*[in]*/ NewDurationUnit) {
        invokeVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        NewDurationUnit
                }
        );
    }

    /**
     * Indicates that the CD ROM media has changed
     */
    public void cdromMediaChange(
            Int32 /*[in]*/ CdromNum) {
        invokeVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        CdromNum
                }
        );
    }

    /**
     * Sent when a playlist changes
     */
    public void playlistChange(
            IDispatch /*[in]*/ Playlist,
            WMPPlaylistChangeEventType /*[in]*/ change) {
        invokeVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        Playlist == null ? (Parameter) PTR_NULL : (Parameter) Playlist,
                        change
                }
        );
    }

    /**
     * Sent when the current playlist changes
     */
    public void currentPlaylistChange(
            WMPPlaylistChangeEventType /*[in]*/ change) {
        invokeVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        change
                }
        );
    }

    /**
     * Sent when a current playlist item becomes available
     */
    public void currentPlaylistItemAvailable(
            BStr /*[in]*/ bstrItemName) {
        invokeVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName
                }
        );
    }

    /**
     * Sent when a media object changes
     */
    public void mediaChange(
            IDispatch /*[in]*/ Item) {
        invokeVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        Item == null ? (Parameter) PTR_NULL : (Parameter) Item
                }
        );
    }

    /**
     * Sent when a current media item becomes available
     */
    public void currentMediaItemAvailable(
            BStr /*[in]*/ bstrItemName) {
        invokeVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName
                }
        );
    }

    /**
     * Sent when the item selection on the current playlist changes
     */
    public void currentItemChange(
            IDispatch /*[in]*/ pdispMedia) {
        invokeVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pdispMedia == null ? (Parameter) PTR_NULL : (Parameter) pdispMedia
                }
        );
    }

    /**
     * Sent when the media collection needs to be requeried
     */
    public void mediaCollectionChange() {
        invokeVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when an attribute string is added in the media collection
     */
    public void mediaCollectionAttributeStringAdded(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal) {
        invokeVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrAttribName == null ? (Parameter) PTR_NULL : bstrAttribName,
                        bstrAttribVal == null ? (Parameter) PTR_NULL : bstrAttribVal
                }
        );
    }

    /**
     * Sent when an attribute string is removed from the media collection
     */
    public void mediaCollectionAttributeStringRemoved(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrAttribVal) {
        invokeVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrAttribName == null ? (Parameter) PTR_NULL : bstrAttribName,
                        bstrAttribVal == null ? (Parameter) PTR_NULL : bstrAttribVal
                }
        );
    }

    /**
     * Sent when an attribute string is changed in the media collection
     */
    public void mediaCollectionAttributeStringChanged(
            BStr /*[in]*/ bstrAttribName,
            BStr /*[in]*/ bstrOldAttribVal,
            BStr /*[in]*/ bstrNewAttribVal) {
        invokeVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrAttribName == null ? (Parameter) PTR_NULL : bstrAttribName,
                        bstrOldAttribVal == null ? (Parameter) PTR_NULL : bstrOldAttribVal,
                        bstrNewAttribVal == null ? (Parameter) PTR_NULL : bstrNewAttribVal
                }
        );
    }

    /**
     * Sent when playlist collection needs to be requeried
     */
    public void playlistCollectionChange() {
        invokeVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when a playlist is added to the playlist collection
     */
    public void playlistCollectionPlaylistAdded(
            BStr /*[in]*/ bstrPlaylistName) {
        invokeVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrPlaylistName == null ? (Parameter) PTR_NULL : bstrPlaylistName
                }
        );
    }

    /**
     * Sent when a playlist is removed from the playlist collection
     */
    public void playlistCollectionPlaylistRemoved(
            BStr /*[in]*/ bstrPlaylistName) {
        invokeVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrPlaylistName == null ? (Parameter) PTR_NULL : bstrPlaylistName
                }
        );
    }

    /**
     * Sent when a playlist has been set or reset as deleted
     */
    public void playlistCollectionPlaylistSetAsDeleted(
            BStr /*[in]*/ bstrPlaylistName,
            VariantBool /*[in]*/ varfIsDeleted) {
        invokeVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        bstrPlaylistName == null ? (Parameter) PTR_NULL : bstrPlaylistName,
                        varfIsDeleted
                }
        );
    }

    /**
     * Playlist playback mode has changed
     */
    public void modeChange(
            BStr /*[in]*/ ModeName,
            VariantBool /*[in]*/ NewValue) {
        invokeVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        ModeName == null ? (Parameter) PTR_NULL : ModeName,
                        NewValue
                }
        );
    }

    /**
     * Sent when the media object has an error condition
     */
    public void mediaError(
            IDispatch /*[in]*/ pMediaObject) {
        invokeVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pMediaObject == null ? (Parameter) PTR_NULL : (Parameter) pMediaObject
                }
        );
    }

    /**
     * Current playlist switch with no open state change
     */
    public void openPlaylistSwitch(
            IDispatch /*[in]*/ pItem) {
        invokeVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem
                }
        );
    }

    /**
     * Send a current domain
     */
    public void domainChange(
            BStr /*[in]*/ strDomain) {
        invokeVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        strDomain == null ? (Parameter) PTR_NULL : strDomain
                }
        );
    }

    /**
     * Sent when display switches to player application
     */
    public void switchedToPlayerApplication() {
        invokeVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when display switches to control
     */
    public void switchedToControl() {
        invokeVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when the player docks or undocks
     */
    public void playerDockedStateChange() {
        invokeVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Sent when the OCX reconnects to the player
     */
    public void playerReconnect() {
        invokeVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[0]
        );
    }

    /**
     * Occurs when a user clicks the mouse
     */
    public void click(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {
        invokeVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nButton,
                        nShiftState,
                        fX,
                        fY
                }
        );
    }

    /**
     * Occurs when a user double-clicks the mouse
     */
    public void doubleClick(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {
        invokeVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nButton,
                        nShiftState,
                        fX,
                        fY
                }
        );
    }

    /**
     * Occurs when a key is pressed
     */
    public void keyDown(
            Int16 /*[in]*/ nKeyCode,
            Int16 /*[in]*/ nShiftState) {
        invokeVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nKeyCode,
                        nShiftState
                }
        );
    }

    /**
     * Occurs when a key is pressed and released
     */
    public void keyPress(
            Int16 /*[in]*/ nKeyAscii) {
        invokeVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nKeyAscii
                }
        );
    }

    /**
     * Occurs when a key is released
     */
    public void keyUp(
            Int16 /*[in]*/ nKeyCode,
            Int16 /*[in]*/ nShiftState) {
        invokeVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nKeyCode,
                        nShiftState
                }
        );
    }

    /**
     * Occurs when a mouse button is pressed
     */
    public void mouseDown(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {
        invokeVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nButton,
                        nShiftState,
                        fX,
                        fY
                }
        );
    }

    /**
     * Occurs when a mouse pointer is moved
     */
    public void mouseMove(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {
        invokeVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nButton,
                        nShiftState,
                        fX,
                        fY
                }
        );
    }

    /**
     * Occurs when a mouse button is released
     */
    public void mouseUp(
            Int16 /*[in]*/ nButton,
            Int16 /*[in]*/ nShiftState,
            Int32 /*[in]*/ fX,
            Int32 /*[in]*/ fY) {
        invokeVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        nButton,
                        nShiftState,
                        fX,
                        fY
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEventsImpl(this);
    }
}
