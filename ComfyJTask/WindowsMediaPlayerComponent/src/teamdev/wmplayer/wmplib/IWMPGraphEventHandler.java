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
 * Represents Java interface for COM interface IWMPGraphEventHandler.
 */
public interface IWMPGraphEventHandler extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{6B550945-018F-11D3-B14A-00C04F79FAA6}";

    /**
     * Notifies graph state changes
     */
    void notifyGraphStateChange(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lGraphState)
            throws ComException;

    /**
     * Notifies graph state changes asynchronously
     */
    void asyncNotifyGraphStateChange(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lGraphState)
            throws ComException;

    /**
     * Notifies changes in playback rate
     */
    void notifyRateChange(
            ULONG_PTR /*[in]*/ punkGraph,
            DoubleFloat /*[in]*/ dRate)
            throws ComException;

    /**
     * Notifies the end of playback
     */
    void notifyPlaybackEnd(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrQueuedUrl,
            ULONG_PTR /*[in]*/ dwCurrentContext)
            throws ComException;

    /**
     * Notifies the end of a stream
     */
    void notifyStreamEnd(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;

    /**
     * Notifies that a script command was encountered
     */
    void notifyScriptCommand(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrCommand,
            BStr /*[in]*/ bstrParam)
            throws ComException;

    /**
     * Notifies that a script command was encountered
     */
    void notifyEarlyScriptCommand(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrCommand,
            BStr /*[in]*/ bstrParam,
            DoubleFloat /*[in]*/ dTime)
            throws ComException;

    /**
     * Notifies that a marker was encountered
     */
    void notifyMarkerHit(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lMarker)
            throws ComException;

    /**
     * Notifies that an error has occurred
     */
    void notifyGraphError(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lErrMajor,
            Int32 /*[in]*/ lErrMinor,
            Int32 /*[in]*/ lCondition,
            BStr /*[in]*/ bstrInfo,
            IUnknown /*[in]*/ punkGraphData)
            throws ComException;

    /**
     * Spawns the Acquire Credentials dialog
     */
    void notifyAcquireCredentials(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrRealm,
            BStr /*[in]*/ bstrSite,
            BStr /*[in,out]*/ bstrUser,
            BStr /*[in,out]*/ bstrPassword,
            UInt32 /*[in,out]*/ pdwFlags,
            VariantBool /*[out]*/ pfCancel)
            throws ComException;

    /**
     * Spawns the untrusted license dialog
     */
    void notifyUntrustedLicense(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrURL,
            VariantBool /*[out]*/ pfCancel)
            throws ComException;

    /**
     * Notifies a communication with the license dialog
     */
    void notifyLicenseDialog(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrURL,
            BStr /*[in]*/ bstrContent,
            UInt8 /*[in]*/ pPostData,
            UInt32 /*[in]*/ dwPostDataSize,
            Int32 /*[in]*/ lResult)
            throws ComException;

    /**
     * Notifies a communication with the Individualization dialog
     */
    void notifyNeedsIndividualization(
            ULONG_PTR /*[in]*/ punkGraph,
            VariantBool /*[out]*/ pfResult)
            throws ComException;

    /**
     * Notifies that new metadata is avail
     */
    void notifyNewMetadata(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;

    /**
     * Notifies that new capabilities are avail
     */
    void notifyNewMediaCaps(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;

    /**
     * Notifies that the graph's connection to the media has been lost.
     */
    void notifyDisconnect(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lResult)
            throws ComException;

    /**
     * Notifies that the graph save operation started/stopped.
     */
    void notifySave(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ fStarted,
            Int32 /*[in]*/ lResult)
            throws ComException;

    /**
     * Notifies if the close call needs to be delayed.
     */
    void notifyDelayClose(
            ULONG_PTR /*[in]*/ punkGraph,
            VariantBool /*[in]*/ fDelay)
            throws ComException;

    /**
     * Notifies when domain changes, parental control and region needs to be handled.
     */
    void notifyDVD(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lEventCode,
            Int32 /*[in]*/ lParam1,
            Int32 /*[in]*/ lParam2)
            throws ComException;

    /**
     * Requests a callback into the graph on the apps thread
     */
    void notifyRequestAppThreadAction(
            ULONG_PTR /*[in]*/ punkGraph,
            UInt32 /*[in]*/ dwAction)
            throws ComException;

    /**
     * Notifies that a prerolled graph is ready to play with no more buffering
     */
    void notifyPrerollReady(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;

    /**
     * Notifies core that our DirectShow filters have new icons to display
     */
    void notifyNewIcons(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;

    /**
     * Notifies core that our step operation has completed
     */
    void notifyStepComplete(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;

    /**
     * Notifies core that our bitrate has changed
     */
    void notifyNewBitrate(
            ULONG_PTR /*[in]*/ punkGraph,
            UInt32 /*[in]*/ dwBitrate)
            throws ComException;

    /**
     *
     */
    void notifyGraphCreationPreRender(
            ULONG_PTR /*[in]*/ punkGraph,
            ULONG_PTR /*[in]*/ punkFilterGraph,
            ULONG_PTR /*[in]*/ punkCardeaEncConfig,
            ULONG_PTR /*[in]*/ phrContinue,
            ULONG_PTR /*[in]*/ hEventToSet)
            throws ComException;

    /**
     *
     */
    void notifyGraphCreationPostRender(
            ULONG_PTR /*[in]*/ punkGraph,
            ULONG_PTR /*[in]*/ punkFilterGraph,
            ULONG_PTR /*[in]*/ phrContinue,
            ULONG_PTR /*[in]*/ hEventToSet)
            throws ComException;

    /**
     * Signals a user event from the renderer
     */
    void notifyGraphUserEvent(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ EventCode)
            throws ComException;

    /**
     * Notifies a communication with the Revocation dialog
     */
    void notifyRevocation(
            ULONG_PTR /*[in]*/ punkGraph,
            VariantBool /*[out]*/ pfResult)
            throws ComException;

    /**
     * Notifies a communication with the Individualization dialog
     */
    void notifyNeedsWMGraphIndividualization(
            ULONG_PTR /*[in]*/ punkGraph,
            ULONG_PTR /*[in]*/ phWnd,
            ULONG_PTR /*[in]*/ hIndivEvent,
            VariantBool /*[out]*/ pfCancel,
            VariantBool /*[out]*/ pfResult)
            throws ComException;

    /**
     * Notifies core that the content requires fullscreen mode
     */
    void notifyNeedsFullscreen(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException;
}
