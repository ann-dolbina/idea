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
 * Represents COM interface IWMPNetwork.
 */
public class IWMPNetworkImpl extends IDispatchImpl
        implements IWMPNetwork {
    public static final String INTERFACE_IDENTIFIER = IWMPNetwork.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPNetworkImpl() {
    }

    protected IWMPNetworkImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPNetworkImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPNetworkImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPNetworkImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the proxy settings for the specified protocol
     */
    public Int32 getProxySettings(
            BStr /*[in]*/ bstrProtocol)
            throws ComException {
        Int32 plProxySetting = new Int32();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        plProxySetting == null ? (Parameter) PTR_NULL : new Pointer(plProxySetting)
                }
        );
        return plProxySetting;
    }

    /**
     * Sets the proxy settings for the specified protocol
     */
    public void setProxySettings(
            BStr /*[in]*/ bstrProtocol,
            Int32 /*[in]*/ lProxySetting)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        lProxySetting
                }
        );
    }

    /**
     * Returns the proxy name for the specified protocol
     */
    public BStr getProxyName(
            BStr /*[in]*/ bstrProtocol)
            throws ComException {
        BStr pbstrProxyName = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        pbstrProxyName == null ? (Parameter) PTR_NULL : new Pointer(pbstrProxyName)
                }
        );
        return pbstrProxyName;
    }

    /**
     * Sets the proxy name for the specified protocol
     */
    public void setProxyName(
            BStr /*[in]*/ bstrProtocol,
            BStr /*[in]*/ bstrProxyName)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        bstrProxyName == null ? (Parameter) PTR_NULL : bstrProxyName
                }
        );
    }

    /**
     * Returns the proxy port for the specified protocol
     */
    public Int32 getProxyPort(
            BStr /*[in]*/ bstrProtocol)
            throws ComException {
        Int32 lProxyPort = new Int32();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        lProxyPort == null ? (Parameter) PTR_NULL : new Pointer(lProxyPort)
                }
        );
        return lProxyPort;
    }

    /**
     * Sets the proxy port for the specified protocol
     */
    public void setProxyPort(
            BStr /*[in]*/ bstrProtocol,
            Int32 /*[in]*/ lProxyPort)
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        lProxyPort
                }
        );
    }

    /**
     * Returns the proxy exception list for the specified protocol
     */
    public BStr getProxyExceptionList(
            BStr /*[in]*/ bstrProtocol)
            throws ComException {
        BStr pbstrExceptionList = new BStr();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        pbstrExceptionList == null ? (Parameter) PTR_NULL : new Pointer(pbstrExceptionList)
                }
        );
        return pbstrExceptionList;
    }

    /**
     * Sets the proxy exception list for the specified protocol
     */
    public void setProxyExceptionList(
            BStr /*[in]*/ bstrProtocol,
            BStr /*[in]*/ pbstrExceptionList)
            throws ComException {
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        pbstrExceptionList == null ? (Parameter) PTR_NULL : pbstrExceptionList
                }
        );
    }

    /**
     * Returns whether or not to bypass the proxy for local addresses
     */
    public VariantBool getProxyBypassForLocal(
            BStr /*[in]*/ bstrProtocol)
            throws ComException {
        VariantBool pfBypassForLocal = new VariantBool();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        pfBypassForLocal == null ? (Parameter) PTR_NULL : new Pointer(pfBypassForLocal)
                }
        );
        return pfBypassForLocal;
    }

    /**
     * Sets whether or not to by pass the proxy for local addresses
     */
    public void setProxyBypassForLocal(
            BStr /*[in]*/ bstrProtocol,
            VariantBool /*[in]*/ fBypassForLocal)
            throws ComException {
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrProtocol == null ? (Parameter) PTR_NULL : bstrProtocol,
                        fBypassForLocal
                }
        );
    }

    /**
     * Returns the current bandwidth of the clip.
     */
    public Int32 getBandWidth()
            throws ComException {
        Int32 plBandwidth = new Int32();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBandwidth == null ? (Parameter) PTR_NULL : new Pointer(plBandwidth)
                }
        );
        return plBandwidth;
    }

    /**
     * Returns the number of recovered packets
     */
    public Int32 getRecoveredPackets()
            throws ComException {
        Int32 plRecoveredPackets = new Int32();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plRecoveredPackets == null ? (Parameter) PTR_NULL : new Pointer(plRecoveredPackets)
                }
        );
        return plRecoveredPackets;
    }

    /**
     * Returns the source protocol used to receive data.
     */
    public BStr getSourceProtocol()
            throws ComException {
        BStr pbstrSourceProtocol = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSourceProtocol == null ? (Parameter) PTR_NULL : new Pointer(pbstrSourceProtocol)
                }
        );
        return pbstrSourceProtocol;
    }

    /**
     * Returns the number of packets received.
     */
    public Int32 getReceivedPackets()
            throws ComException {
        Int32 plReceivedPackets = new Int32();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plReceivedPackets == null ? (Parameter) PTR_NULL : new Pointer(plReceivedPackets)
                }
        );
        return plReceivedPackets;
    }

    /**
     * Returns the number of packets lost.
     */
    public Int32 getLostPackets()
            throws ComException {
        Int32 plLostPackets = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plLostPackets == null ? (Parameter) PTR_NULL : new Pointer(plLostPackets)
                }
        );
        return plLostPackets;
    }

    /**
     * Returns the percentage of packets received in the last 15 seconds.
     */
    public Int32 getReceptionQuality()
            throws ComException {
        Int32 plReceptionQuality = new Int32();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plReceptionQuality == null ? (Parameter) PTR_NULL : new Pointer(plReceptionQuality)
                }
        );
        return plReceptionQuality;
    }

    /**
     * Returns the number of times buffering occurred during clip playback.
     */
    public Int32 getBufferingCount()
            throws ComException {
        Int32 plBufferingCount = new Int32();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBufferingCount == null ? (Parameter) PTR_NULL : new Pointer(plBufferingCount)
                }
        );
        return plBufferingCount;
    }

    /**
     * Returns the percentage of buffering completed.
     */
    public Int32 getBufferingProgress()
            throws ComException {
        Int32 plBufferingProgress = new Int32();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBufferingProgress == null ? (Parameter) PTR_NULL : new Pointer(plBufferingProgress)
                }
        );
        return plBufferingProgress;
    }

    /**
     * Returns the number of seconds allocated for buffering for this media type.
     */
    public Int32 getBufferingTime()
            throws ComException {
        Int32 plBufferingTime = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBufferingTime == null ? (Parameter) PTR_NULL : new Pointer(plBufferingTime)
                }
        );
        return plBufferingTime;
    }

    /**
     * Returns the number of seconds allocated for buffering for this media type.
     */
    public void setBufferingTime(
            Int32 /*[in]*/ plBufferingTime)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBufferingTime
                }
        );
    }

    /**
     * Current video frame rate in frames/second
     */
    public Int32 getFrameRate()
            throws ComException {
        Int32 plFrameRate = new Int32();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plFrameRate == null ? (Parameter) PTR_NULL : new Pointer(plFrameRate)
                }
        );
        return plFrameRate;
    }

    /**
     * Maximum possible video bit rate
     */
    public Int32 getMaxBitRate()
            throws ComException {
        Int32 plBitRate = new Int32();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBitRate == null ? (Parameter) PTR_NULL : new Pointer(plBitRate)
                }
        );
        return plBitRate;
    }

    /**
     * Current video bit rate
     */
    public Int32 getBitRate()
            throws ComException {
        Int32 plBitRate = new Int32();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plBitRate == null ? (Parameter) PTR_NULL : new Pointer(plBitRate)
                }
        );
        return plBitRate;
    }

    /**
     * Returns or sets maximum allowed bandwidth
     */
    public Int32 getMaxBandwidth()
            throws ComException {
        Int32 lMaxBandwidth = new Int32();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lMaxBandwidth == null ? (Parameter) PTR_NULL : new Pointer(lMaxBandwidth)
                }
        );
        return lMaxBandwidth;
    }

    /**
     * Returns or sets maximum allowed bandwidth
     */
    public void setMaxBandwidth(
            Int32 /*[in]*/ lMaxBandwidth)
            throws ComException {
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lMaxBandwidth
                }
        );
    }

    /**
     * Returns the percentage of download completed.
     */
    public Int32 getDownloadProgress()
            throws ComException {
        Int32 plDownloadProgress = new Int32();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plDownloadProgress == null ? (Parameter) PTR_NULL : new Pointer(plDownloadProgress)
                }
        );
        return plDownloadProgress;
    }

    /**
     * Returns the video frame rate, in frames/second, that the file was encoded in
     */
    public Int32 getEncodedFrameRate()
            throws ComException {
        Int32 plFrameRate = new Int32();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plFrameRate == null ? (Parameter) PTR_NULL : new Pointer(plFrameRate)
                }
        );
        return plFrameRate;
    }

    /**
     * Returns the number of skipped frames
     */
    public Int32 getFramesSkipped()
            throws ComException {
        Int32 plFrames = new Int32();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plFrames == null ? (Parameter) PTR_NULL : new Pointer(plFrames)
                }
        );
        return plFrames;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPNetworkImpl(this);
    }
}
