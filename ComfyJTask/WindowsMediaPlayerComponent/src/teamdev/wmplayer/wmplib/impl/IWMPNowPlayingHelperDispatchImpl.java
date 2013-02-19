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
 * Represents COM interface IWMPNowPlayingHelperDispatch.
 */
public class IWMPNowPlayingHelperDispatchImpl extends IDispatchImpl
        implements IWMPNowPlayingHelperDispatch {
    public static final String INTERFACE_IDENTIFIER = IWMPNowPlayingHelperDispatch.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPNowPlayingHelperDispatchImpl() {
    }

    protected IWMPNowPlayingHelperDispatchImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPNowPlayingHelperDispatchImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPNowPlayingHelperDispatchImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPNowPlayingHelperDispatchImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method resolveDisplayView
     */
    public BStr resolveDisplayView(
            VariantBool /*[in]*/ fSafe)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        fSafe,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     * method isValidDisplayView
     */
    public VariantBool isValidDisplayView(
            BStr /*[in]*/ bstrView)
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrView == null ? (Parameter) PTR_NULL : bstrView,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method getSkinFile
     */
    public BStr getSkinFile()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method getCurrentArtID
     */
    public Int32 getCurrentArtID(
            VariantBool /*[in]*/ fLargeArt)
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        fLargeArt,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method getTimeString
     */
    public BStr getTimeString(
            DoubleFloat /*[in]*/ dTime)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        dTime,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method getCurrentScriptCommand
     */
    public BStr getCurrentScriptCommand(
            BStr /*[in]*/ bstrType)
            throws ComException {
        BStr pbstrCommand = new BStr();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrType == null ? (Parameter) PTR_NULL : bstrType,
                        pbstrCommand == null ? (Parameter) PTR_NULL : new Pointer(pbstrCommand)
                }
        );
        return pbstrCommand;
    }

    /**
     * method calcLayout
     */
    public void calcLayout(
            Int32 /*[in]*/ lWidth,
            Int32 /*[in]*/ lHeight,
            VariantBool /*[in]*/ vbCaptions,
            VariantBool /*[in]*/ vbBanner)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lWidth,
                        lHeight,
                        vbCaptions,
                        vbBanner
                }
        );
    }

    /**
     * method getLayoutSize
     */
    public Int32 getLayoutSize(
            Int32 /*[in]*/ nProp)
            throws ComException {
        Int32 plValue = new Int32();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nProp,
                        plValue == null ? (Parameter) PTR_NULL : new Pointer(plValue)
                }
        );
        return plValue;
    }

    /**
     * method getRootPlaylist
     */
    public IDispatch getRootPlaylist(
            IDispatch /*[in]*/ pPlaylist)
            throws ComException {
        IDispatchImpl ppRootPlaylist = new IDispatchImpl();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pPlaylist == null ? (Parameter) PTR_NULL : (Parameter) pPlaylist,
                        ppRootPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppRootPlaylist)
                }
        );
        return ppRootPlaylist;
    }

    /**
     * method getHTMLViewURL
     */
    public BStr getHTMLViewURL()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method getStatusString
     */
    public BStr getStatusString(
            BStr /*[in]*/ bstrStatusId)
            throws ComException {
        BStr pbstrStatus = new BStr();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrStatusId == null ? (Parameter) PTR_NULL : bstrStatusId,
                        pbstrStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrStatus)
                }
        );
        return pbstrStatus;
    }

    /**
     * method getStatusPct
     */
    public Int32 getStatusPct(
            BStr /*[in]*/ bstrStatusId)
            throws ComException {
        Int32 pvResult = new Int32();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrStatusId == null ? (Parameter) PTR_NULL : bstrStatusId,
                        pvResult == null ? (Parameter) PTR_NULL : new Pointer(pvResult)
                }
        );
        return pvResult;
    }

    /**
     * method getStatusResult
     */
    public Int32 getStatusResult(
            BStr /*[in]*/ bstrStatusId)
            throws ComException {
        Int32 pvResult = new Int32();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrStatusId == null ? (Parameter) PTR_NULL : bstrStatusId,
                        pvResult == null ? (Parameter) PTR_NULL : new Pointer(pvResult)
                }
        );
        return pvResult;
    }

    /**
     * method getStatusIcon
     */
    public Int32 getStatusIcon(
            BStr /*[in]*/ bstrStatusId)
            throws ComException {
        Int32 pvResult = new Int32();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrStatusId == null ? (Parameter) PTR_NULL : bstrStatusId,
                        pvResult == null ? (Parameter) PTR_NULL : new Pointer(pvResult)
                }
        );
        return pvResult;
    }

    /**
     * method getStatusIdList
     */
    public BStr getStatusIdList()
            throws ComException {
        BStr pbstrStatus = new BStr();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrStatus)
                }
        );
        return pbstrStatus;
    }

    /**
     * clear all user color info
     */
    public void clearColors()
            throws ComException {
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void initRipHelper()
            throws ComException {
        invokeStandardVirtualMethod(
                58,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void startRip()
            throws ComException {
        invokeStandardVirtualMethod(
                67,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void stopRip()
            throws ComException {
        invokeStandardVirtualMethod(
                68,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void nextPlaylist()
            throws ComException {
        invokeStandardVirtualMethod(
                81,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void previousPlaylist()
            throws ComException {
        invokeStandardVirtualMethod(
                82,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void playOffsetMedia(
            Int32 /*[in]*/ iOffset)
            throws ComException {
        invokeStandardVirtualMethod(
                83,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        iOffset
                }
        );
    }

    /**
     *
     */
    public void setGestureStatus(
            IDispatch /*[in]*/ pObject,
            Int32 /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                99,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pObject == null ? (Parameter) PTR_NULL : (Parameter) pObject,
                        newVal
                }
        );
    }

    /**
     *
     */
    public void syncToAlbumArt(
            IDispatch /*[in]*/ pObject,
            Int32 /*[in]*/ iOffsetFromCurrentMedia,
            BStr /*[in]*/ bstrFallbackImage)
            throws ComException {
        invokeStandardVirtualMethod(
                105,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pObject == null ? (Parameter) PTR_NULL : (Parameter) pObject,
                        iOffsetFromCurrentMedia,
                        bstrFallbackImage == null ? (Parameter) PTR_NULL : bstrFallbackImage
                }
        );
    }

    /**
     * property viewFriendlyName
     */
    public BStr getViewFriendlyName(
            BStr /*[in]*/ bstrView)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrView == null ? (Parameter) PTR_NULL : bstrView,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property viewPresetCount
     */
    public Int32 getViewPresetCount(
            BStr /*[in]*/ bstrView)
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrView == null ? (Parameter) PTR_NULL : bstrView,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method viewPresetName
     */
    public BStr getViewPresetName(
            BStr /*[in]*/ bstrView,
            Int32 /*[in]*/ nPresetIndex)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrView == null ? (Parameter) PTR_NULL : bstrView,
                        nPresetIndex,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property effectFriendlyName
     */
    public BStr getEffectFriendlyName(
            BStr /*[in]*/ bstrEffect)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrEffect == null ? (Parameter) PTR_NULL : bstrEffect,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method effectPresetName
     */
    public BStr getEffectPresetName(
            BStr /*[in]*/ bstrEffect,
            Int32 /*[in]*/ nPresetIndex)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrEffect == null ? (Parameter) PTR_NULL : bstrEffect,
                        nPresetIndex,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method captionsAvailable
     */
    public VariantBool getCaptionsAvailable()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property linkAvailable
     */
    public Int32 getLinkAvailable()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property linkRequest
     */
    public Int32 getLinkRequest()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property linkRequest
     */
    public void setLinkRequest(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property linkRequestParams
     */
    public BStr getLinkRequestParams()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property linkRequestParams
     */
    public void setLinkRequestParams(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     *
     */
    public IUnknown getEditObj()
            throws ComException {
        IUnknownImpl ppVal = new IUnknownImpl();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppVal == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppVal)
                }
        );
        return ppVal;
    }

    /**
     *
     */
    public void setEditObj(
            IUnknown /*[in]*/ ppVal)
            throws ComException {
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppVal == null ? (Parameter) PTR_NULL : (Parameter) ppVal
                }
        );
    }

    /**
     *
     */
    public BStr getNotificationString()
            throws ComException {
        BStr pbstrNotificationString = new BStr();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrNotificationString == null ? (Parameter) PTR_NULL : new Pointer(pbstrNotificationString)
                }
        );
        return pbstrNotificationString;
    }

    /**
     *
     */
    public BStr getHtmlViewBaseURL()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setHtmlViewBaseURL(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     *
     */
    public BStr getHtmlViewFullURL()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setHtmlViewFullURL(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getHtmlViewSecureLock()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setHtmlViewSecureLock(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getHtmlViewBusy()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setHtmlViewBusy(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getHtmlViewShowCert()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setHtmlViewShowCert(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getPreviousEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setPreviousEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getDoPreviousNow()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setDoPreviousNow(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getDPI()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getLastMessage()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setLastMessage(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                53,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getInVistaPlus()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                54,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getIsBidi()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getIsOCX()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                56,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getHoverTransportsEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getIsAudioCD()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setIsAudioCD(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                60,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getCanRip()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                61,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setCanRip(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                62,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getIsRipping()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                63,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setIsRipping(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                64,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public BStr getCurrentDrive()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                65,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setCurrentDrive(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                66,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getShowMMO()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                69,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setShowMMO(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                70,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getMMOVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                71,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getSuggestionsVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                72,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getSuggestionsTextColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                73,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getFontFace()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                74,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public Int32 getFontSize()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                75,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                76,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public Int32 getDoubleClickTime()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                77,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getPlayAgain()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                78,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getPreviousPlaylistAvailable()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                79,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getNextPlaylistAvailable()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                80,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getBasketVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                84,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setBasketVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                85,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public BStr getMmoTextColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                86,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getBackgroundVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                87,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setBackgroundEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                88,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getBackgroundEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                89,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setBackgroundIndex(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                90,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getBackgroundIndex()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                91,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getUpNext()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                92,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getPlaybackOverlayVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                93,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getRemoted()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                94,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getGlassEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                95,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getHighContrast()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                96,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setTestHighContrast(
            BStr /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                97,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : param1
                }
        );
    }

    /**
     *
     */
    public void getSessionPlaylistCount(
            Int32 /*[out]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                98,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
    }

    /**
     *
     */
    public BStr getMetadataString()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                100,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setMetadataString(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                101,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getAlbumArtAlpha()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                102,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getPlayerModeAlbumArtSelected()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                103,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getInFullScreen()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                104,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPNowPlayingHelperDispatchImpl(this);
    }
}
