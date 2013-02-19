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
 * Represents COM interface IWMPGraphEventHandler.
 */
public class IWMPGraphEventHandlerImpl extends IDispatchImpl
        implements IWMPGraphEventHandler {
    public static final String INTERFACE_IDENTIFIER = IWMPGraphEventHandler.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPGraphEventHandlerImpl() {
    }

    protected IWMPGraphEventHandlerImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPGraphEventHandlerImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPGraphEventHandlerImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPGraphEventHandlerImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Notifies graph state changes
     */
    public void notifyGraphStateChange(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lGraphState)
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        lGraphState
                }
        );
    }

    /**
     * Notifies graph state changes asynchronously
     */
    public void asyncNotifyGraphStateChange(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lGraphState)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        lGraphState
                }
        );
    }

    /**
     * Notifies changes in playback rate
     */
    public void notifyRateChange(
            ULONG_PTR /*[in]*/ punkGraph,
            DoubleFloat /*[in]*/ dRate)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        dRate
                }
        );
    }

    /**
     * Notifies the end of playback
     */
    public void notifyPlaybackEnd(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrQueuedUrl,
            ULONG_PTR /*[in]*/ dwCurrentContext)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        bstrQueuedUrl == null ? (Parameter) PTR_NULL : bstrQueuedUrl,
                        dwCurrentContext
                }
        );
    }

    /**
     * Notifies the end of a stream
     */
    public void notifyStreamEnd(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    /**
     * Notifies that a script command was encountered
     */
    public void notifyScriptCommand(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrCommand,
            BStr /*[in]*/ bstrParam)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        bstrCommand == null ? (Parameter) PTR_NULL : bstrCommand,
                        bstrParam == null ? (Parameter) PTR_NULL : bstrParam
                }
        );
    }

    /**
     * Notifies that a script command was encountered
     */
    public void notifyEarlyScriptCommand(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrCommand,
            BStr /*[in]*/ bstrParam,
            DoubleFloat /*[in]*/ dTime)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        bstrCommand == null ? (Parameter) PTR_NULL : bstrCommand,
                        bstrParam == null ? (Parameter) PTR_NULL : bstrParam,
                        dTime
                }
        );
    }

    /**
     * Notifies that a marker was encountered
     */
    public void notifyMarkerHit(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lMarker)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        lMarker
                }
        );
    }

    /**
     * Notifies that an error has occurred
     */
    public void notifyGraphError(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lErrMajor,
            Int32 /*[in]*/ lErrMinor,
            Int32 /*[in]*/ lCondition,
            BStr /*[in]*/ bstrInfo,
            IUnknown /*[in]*/ punkGraphData)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        lErrMajor,
                        lErrMinor,
                        lCondition,
                        bstrInfo == null ? (Parameter) PTR_NULL : bstrInfo,
                        punkGraphData == null ? (Parameter) PTR_NULL : (Parameter) punkGraphData
                }
        );
    }

    /**
     * Spawns the Acquire Credentials dialog
     */
    public void notifyAcquireCredentials(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrRealm,
            BStr /*[in]*/ bstrSite,
            BStr /*[in,out]*/ bstrUser,
            BStr /*[in,out]*/ bstrPassword,
            UInt32 /*[in,out]*/ pdwFlags,
            VariantBool /*[out]*/ pfCancel)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        bstrRealm == null ? (Parameter) PTR_NULL : bstrRealm,
                        bstrSite == null ? (Parameter) PTR_NULL : bstrSite,
                        bstrUser == null ? (Parameter) PTR_NULL : bstrUser,
                        bstrPassword == null ? (Parameter) PTR_NULL : bstrPassword,
                        pdwFlags == null ? (Parameter) PTR_NULL : new Pointer(pdwFlags),
                        pfCancel == null ? (Parameter) PTR_NULL : new Pointer(pfCancel)
                }
        );
    }

    /**
     * Spawns the untrusted license dialog
     */
    public void notifyUntrustedLicense(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrURL,
            VariantBool /*[out]*/ pfCancel)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        pfCancel == null ? (Parameter) PTR_NULL : new Pointer(pfCancel)
                }
        );
    }

    /**
     * Notifies a communication with the license dialog
     */
    public void notifyLicenseDialog(
            ULONG_PTR /*[in]*/ punkGraph,
            BStr /*[in]*/ bstrURL,
            BStr /*[in]*/ bstrContent,
            UInt8 /*[in]*/ pPostData,
            UInt32 /*[in]*/ dwPostDataSize,
            Int32 /*[in]*/ lResult)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        bstrContent == null ? (Parameter) PTR_NULL : bstrContent,
                        pPostData == null ? (Parameter) PTR_NULL : new Pointer.Const(pPostData),
                        dwPostDataSize,
                        lResult
                }
        );
    }

    /**
     * Notifies a communication with the Individualization dialog
     */
    public void notifyNeedsIndividualization(
            ULONG_PTR /*[in]*/ punkGraph,
            VariantBool /*[out]*/ pfResult)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        pfResult == null ? (Parameter) PTR_NULL : new Pointer(pfResult)
                }
        );
    }

    /**
     * Notifies that new metadata is avail
     */
    public void notifyNewMetadata(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    /**
     * Notifies that new capabilities are avail
     */
    public void notifyNewMediaCaps(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    /**
     * Notifies that the graph's connection to the media has been lost.
     */
    public void notifyDisconnect(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lResult)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        lResult
                }
        );
    }

    /**
     * Notifies that the graph save operation started/stopped.
     */
    public void notifySave(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ fStarted,
            Int32 /*[in]*/ lResult)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        fStarted,
                        lResult
                }
        );
    }

    /**
     * Notifies if the close call needs to be delayed.
     */
    public void notifyDelayClose(
            ULONG_PTR /*[in]*/ punkGraph,
            VariantBool /*[in]*/ fDelay)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        fDelay
                }
        );
    }

    /**
     * Notifies when domain changes, parental control and region needs to be handled.
     */
    public void notifyDVD(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ lEventCode,
            Int32 /*[in]*/ lParam1,
            Int32 /*[in]*/ lParam2)
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        lEventCode,
                        lParam1,
                        lParam2
                }
        );
    }

    /**
     * Requests a callback into the graph on the apps thread
     */
    public void notifyRequestAppThreadAction(
            ULONG_PTR /*[in]*/ punkGraph,
            UInt32 /*[in]*/ dwAction)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        dwAction
                }
        );
    }

    /**
     * Notifies that a prerolled graph is ready to play with no more buffering
     */
    public void notifyPrerollReady(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    /**
     * Notifies core that our DirectShow filters have new icons to display
     */
    public void notifyNewIcons(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    /**
     * Notifies core that our step operation has completed
     */
    public void notifyStepComplete(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    /**
     * Notifies core that our bitrate has changed
     */
    public void notifyNewBitrate(
            ULONG_PTR /*[in]*/ punkGraph,
            UInt32 /*[in]*/ dwBitrate)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        dwBitrate
                }
        );
    }

    /**
     *
     */
    public void notifyGraphCreationPreRender(
            ULONG_PTR /*[in]*/ punkGraph,
            ULONG_PTR /*[in]*/ punkFilterGraph,
            ULONG_PTR /*[in]*/ punkCardeaEncConfig,
            ULONG_PTR /*[in]*/ phrContinue,
            ULONG_PTR /*[in]*/ hEventToSet)
            throws ComException {
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        punkFilterGraph,
                        punkCardeaEncConfig,
                        phrContinue,
                        hEventToSet
                }
        );
    }

    /**
     *
     */
    public void notifyGraphCreationPostRender(
            ULONG_PTR /*[in]*/ punkGraph,
            ULONG_PTR /*[in]*/ punkFilterGraph,
            ULONG_PTR /*[in]*/ phrContinue,
            ULONG_PTR /*[in]*/ hEventToSet)
            throws ComException {
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        punkFilterGraph,
                        phrContinue,
                        hEventToSet
                }
        );
    }

    /**
     * Signals a user event from the renderer
     */
    public void notifyGraphUserEvent(
            ULONG_PTR /*[in]*/ punkGraph,
            Int32 /*[in]*/ EventCode)
            throws ComException {
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        EventCode
                }
        );
    }

    /**
     * Notifies a communication with the Revocation dialog
     */
    public void notifyRevocation(
            ULONG_PTR /*[in]*/ punkGraph,
            VariantBool /*[out]*/ pfResult)
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        pfResult == null ? (Parameter) PTR_NULL : new Pointer(pfResult)
                }
        );
    }

    /**
     * Notifies a communication with the Individualization dialog
     */
    public void notifyNeedsWMGraphIndividualization(
            ULONG_PTR /*[in]*/ punkGraph,
            ULONG_PTR /*[in]*/ phWnd,
            ULONG_PTR /*[in]*/ hIndivEvent,
            VariantBool /*[out]*/ pfCancel,
            VariantBool /*[out]*/ pfResult)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph,
                        phWnd,
                        hIndivEvent,
                        pfCancel == null ? (Parameter) PTR_NULL : new Pointer(pfCancel),
                        pfResult == null ? (Parameter) PTR_NULL : new Pointer(pfResult)
                }
        );
    }

    /**
     * Notifies core that the content requires fullscreen mode
     */
    public void notifyNeedsFullscreen(
            ULONG_PTR /*[in]*/ punkGraph)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkGraph
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPGraphEventHandlerImpl(this);
    }
}
