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
 * Represents COM interface IWMPSettings.
 */
public class IWMPSettingsImpl extends IDispatchImpl
        implements IWMPSettings {
    public static final String INTERFACE_IDENTIFIER = IWMPSettings.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSettingsImpl() {
    }

    protected IWMPSettingsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSettingsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSettingsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSettingsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the mode of the playlist
     */
    public VariantBool getMode(
            BStr /*[in]*/ bstrMode)
            throws ComException {
        VariantBool pvarfMode = new VariantBool();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrMode == null ? (Parameter) PTR_NULL : bstrMode,
                        pvarfMode == null ? (Parameter) PTR_NULL : new Pointer(pvarfMode)
                }
        );
        return pvarfMode;
    }

    /**
     * Sets the mode of the playlist
     */
    public void setMode(
            BStr /*[in]*/ bstrMode,
            VariantBool /*[in]*/ varfMode)
            throws ComException {
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrMode == null ? (Parameter) PTR_NULL : bstrMode,
                        varfMode
                }
        );
    }

    /**
     * Returns whether or not the specified media functionality is available
     */
    public VariantBool getIsAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException {
        VariantBool pIsAvailable = new VariantBool();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItem == null ? (Parameter) PTR_NULL : bstrItem,
                        pIsAvailable == null ? (Parameter) PTR_NULL : new Pointer(pIsAvailable)
                }
        );
        return pIsAvailable;
    }

    /**
     * Returns whether media should automatically begin playing
     */
    public VariantBool getAutoStart()
            throws ComException {
        VariantBool pfAutoStart = new VariantBool();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfAutoStart == null ? (Parameter) PTR_NULL : new Pointer(pfAutoStart)
                }
        );
        return pfAutoStart;
    }

    /**
     * Returns whether media should automatically begin playing
     */
    public void setAutoStart(
            VariantBool /*[in]*/ pfAutoStart)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfAutoStart
                }
        );
    }

    /**
     * Returns the base URL used for relative path resolution
     */
    public BStr getBaseURL()
            throws ComException {
        BStr pbstrBaseURL = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrBaseURL == null ? (Parameter) PTR_NULL : new Pointer(pbstrBaseURL)
                }
        );
        return pbstrBaseURL;
    }

    /**
     * Returns the base URL used for relative path resolution
     */
    public void setBaseURL(
            BStr /*[in]*/ pbstrBaseURL)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrBaseURL == null ? (Parameter) PTR_NULL : pbstrBaseURL
                }
        );
    }

    /**
     * Returns the frame location that changes when a URL flip occurs
     */
    public BStr getDefaultFrame()
            throws ComException {
        BStr pbstrDefaultFrame = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDefaultFrame == null ? (Parameter) PTR_NULL : new Pointer(pbstrDefaultFrame)
                }
        );
        return pbstrDefaultFrame;
    }

    /**
     * Returns the frame location that changes when a URL flip occurs
     */
    public void setDefaultFrame(
            BStr /*[in]*/ pbstrDefaultFrame)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDefaultFrame == null ? (Parameter) PTR_NULL : pbstrDefaultFrame
                }
        );
    }

    /**
     * Returns whether URL events should spawn a browser.
     */
    public VariantBool getInvokeURLs()
            throws ComException {
        VariantBool pfInvokeURLs = new VariantBool();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfInvokeURLs == null ? (Parameter) PTR_NULL : new Pointer(pfInvokeURLs)
                }
        );
        return pfInvokeURLs;
    }

    /**
     * Returns whether URL events should spawn a browser.
     */
    public void setInvokeURLs(
            VariantBool /*[in]*/ pfInvokeURLs)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfInvokeURLs
                }
        );
    }

    /**
     * Returns whether audio should be muted.
     */
    public VariantBool getMute()
            throws ComException {
        VariantBool pfMute = new VariantBool();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfMute == null ? (Parameter) PTR_NULL : new Pointer(pfMute)
                }
        );
        return pfMute;
    }

    /**
     * Returns whether audio should be muted.
     */
    public void setMute(
            VariantBool /*[in]*/ pfMute)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfMute
                }
        );
    }

    /**
     * Returns how many times media should play
     */
    public Int32 getPlayCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     * Returns how many times media should play
     */
    public void setPlayCount(
            Int32 /*[in]*/ plCount)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount
                }
        );
    }

    /**
     * Returns current playback rate
     */
    public DoubleFloat getRate()
            throws ComException {
        DoubleFloat pdRate = new DoubleFloat();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pdRate == null ? (Parameter) PTR_NULL : new Pointer(pdRate)
                }
        );
        return pdRate;
    }

    /**
     * Returns current playback rate
     */
    public void setRate(
            DoubleFloat /*[in]*/ pdRate)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pdRate
                }
        );
    }

    /**
     * Returns current audio Balance
     */
    public Int32 getBalance()
            throws ComException {
        Int32 plBalance = new Int32();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBalance == null ? (Parameter) PTR_NULL : new Pointer(plBalance)
                }
        );
        return plBalance;
    }

    /**
     * Returns current audio Balance
     */
    public void setBalance(
            Int32 /*[in]*/ plBalance)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBalance
                }
        );
    }

    /**
     * Returns current audio volume
     */
    public Int32 getVolume()
            throws ComException {
        Int32 plVolume = new Int32();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plVolume == null ? (Parameter) PTR_NULL : new Pointer(plVolume)
                }
        );
        return plVolume;
    }

    /**
     * Returns current audio volume
     */
    public void setVolume(
            Int32 /*[in]*/ plVolume)
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plVolume
                }
        );
    }

    /**
     * Returns whether error dialogs are shown by default when embedded
     */
    public VariantBool getEnableErrorDialogs()
            throws ComException {
        VariantBool pfEnableErrorDialogs = new VariantBool();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfEnableErrorDialogs == null ? (Parameter) PTR_NULL : new Pointer(pfEnableErrorDialogs)
                }
        );
        return pfEnableErrorDialogs;
    }

    /**
     * Returns whether error dialogs are shown by default when embedded
     */
    public void setEnableErrorDialogs(
            VariantBool /*[in]*/ pfEnableErrorDialogs)
            throws ComException {
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfEnableErrorDialogs
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSettingsImpl(this);
    }
}
