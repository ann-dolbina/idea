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
 * Represents Java interface for COM interface IWMPNetwork.
 */
public interface IWMPNetwork extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{EC21B779-EDEF-462D-BBA4-AD9DDE2B29A7}";

    /**
     * Returns the proxy settings for the specified protocol
     */
    Int32 getProxySettings(
            BStr /*[in]*/ bstrProtocol)
            throws ComException;

    /**
     * Sets the proxy settings for the specified protocol
     */
    void setProxySettings(
            BStr /*[in]*/ bstrProtocol,
            Int32 /*[in]*/ lProxySetting)
            throws ComException;

    /**
     * Returns the proxy name for the specified protocol
     */
    BStr getProxyName(
            BStr /*[in]*/ bstrProtocol)
            throws ComException;

    /**
     * Sets the proxy name for the specified protocol
     */
    void setProxyName(
            BStr /*[in]*/ bstrProtocol,
            BStr /*[in]*/ bstrProxyName)
            throws ComException;

    /**
     * Returns the proxy port for the specified protocol
     */
    Int32 getProxyPort(
            BStr /*[in]*/ bstrProtocol)
            throws ComException;

    /**
     * Sets the proxy port for the specified protocol
     */
    void setProxyPort(
            BStr /*[in]*/ bstrProtocol,
            Int32 /*[in]*/ lProxyPort)
            throws ComException;

    /**
     * Returns the proxy exception list for the specified protocol
     */
    BStr getProxyExceptionList(
            BStr /*[in]*/ bstrProtocol)
            throws ComException;

    /**
     * Sets the proxy exception list for the specified protocol
     */
    void setProxyExceptionList(
            BStr /*[in]*/ bstrProtocol,
            BStr /*[in]*/ pbstrExceptionList)
            throws ComException;

    /**
     * Returns whether or not to bypass the proxy for local addresses
     */
    VariantBool getProxyBypassForLocal(
            BStr /*[in]*/ bstrProtocol)
            throws ComException;

    /**
     * Sets whether or not to by pass the proxy for local addresses
     */
    void setProxyBypassForLocal(
            BStr /*[in]*/ bstrProtocol,
            VariantBool /*[in]*/ fBypassForLocal)
            throws ComException;

    /**
     * Returns the current bandwidth of the clip.
     */
    Int32 getBandWidth()
            throws ComException;

    /**
     * Returns the number of recovered packets
     */
    Int32 getRecoveredPackets()
            throws ComException;

    /**
     * Returns the source protocol used to receive data.
     */
    BStr getSourceProtocol()
            throws ComException;

    /**
     * Returns the number of packets received.
     */
    Int32 getReceivedPackets()
            throws ComException;

    /**
     * Returns the number of packets lost.
     */
    Int32 getLostPackets()
            throws ComException;

    /**
     * Returns the percentage of packets received in the last 15 seconds.
     */
    Int32 getReceptionQuality()
            throws ComException;

    /**
     * Returns the number of times buffering occurred during clip playback.
     */
    Int32 getBufferingCount()
            throws ComException;

    /**
     * Returns the percentage of buffering completed.
     */
    Int32 getBufferingProgress()
            throws ComException;

    /**
     * Returns the number of seconds allocated for buffering for this media type.
     */
    Int32 getBufferingTime()
            throws ComException;

    /**
     * Returns the number of seconds allocated for buffering for this media type.
     */
    void setBufferingTime(
            Int32 /*[in]*/ plBufferingTime)
            throws ComException;

    /**
     * Current video frame rate in frames/second
     */
    Int32 getFrameRate()
            throws ComException;

    /**
     * Maximum possible video bit rate
     */
    Int32 getMaxBitRate()
            throws ComException;

    /**
     * Current video bit rate
     */
    Int32 getBitRate()
            throws ComException;

    /**
     * Returns or sets maximum allowed bandwidth
     */
    Int32 getMaxBandwidth()
            throws ComException;

    /**
     * Returns or sets maximum allowed bandwidth
     */
    void setMaxBandwidth(
            Int32 /*[in]*/ lMaxBandwidth)
            throws ComException;

    /**
     * Returns the percentage of download completed.
     */
    Int32 getDownloadProgress()
            throws ComException;

    /**
     * Returns the video frame rate, in frames/second, that the file was encoded in
     */
    Int32 getEncodedFrameRate()
            throws ComException;

    /**
     * Returns the number of skipped frames
     */
    Int32 getFramesSkipped()
            throws ComException;
}
