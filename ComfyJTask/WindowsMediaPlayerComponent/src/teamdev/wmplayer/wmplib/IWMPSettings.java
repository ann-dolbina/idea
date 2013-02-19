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
 * Represents Java interface for COM interface IWMPSettings.
 */
public interface IWMPSettings extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{9104D1AB-80C9-4FED-ABF0-2E6417A6DF14}";

    /**
     * Returns the mode of the playlist
     */
    VariantBool getMode(
            BStr /*[in]*/ bstrMode)
            throws ComException;

    /**
     * Sets the mode of the playlist
     */
    void setMode(
            BStr /*[in]*/ bstrMode,
            VariantBool /*[in]*/ varfMode)
            throws ComException;

    /**
     * Returns whether or not the specified media functionality is available
     */
    VariantBool getIsAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     * Returns whether media should automatically begin playing
     */
    VariantBool getAutoStart()
            throws ComException;

    /**
     * Returns whether media should automatically begin playing
     */
    void setAutoStart(
            VariantBool /*[in]*/ pfAutoStart)
            throws ComException;

    /**
     * Returns the base URL used for relative path resolution
     */
    BStr getBaseURL()
            throws ComException;

    /**
     * Returns the base URL used for relative path resolution
     */
    void setBaseURL(
            BStr /*[in]*/ pbstrBaseURL)
            throws ComException;

    /**
     * Returns the frame location that changes when a URL flip occurs
     */
    BStr getDefaultFrame()
            throws ComException;

    /**
     * Returns the frame location that changes when a URL flip occurs
     */
    void setDefaultFrame(
            BStr /*[in]*/ pbstrDefaultFrame)
            throws ComException;

    /**
     * Returns whether URL events should spawn a browser.
     */
    VariantBool getInvokeURLs()
            throws ComException;

    /**
     * Returns whether URL events should spawn a browser.
     */
    void setInvokeURLs(
            VariantBool /*[in]*/ pfInvokeURLs)
            throws ComException;

    /**
     * Returns whether audio should be muted.
     */
    VariantBool getMute()
            throws ComException;

    /**
     * Returns whether audio should be muted.
     */
    void setMute(
            VariantBool /*[in]*/ pfMute)
            throws ComException;

    /**
     * Returns how many times media should play
     */
    Int32 getPlayCount()
            throws ComException;

    /**
     * Returns how many times media should play
     */
    void setPlayCount(
            Int32 /*[in]*/ plCount)
            throws ComException;

    /**
     * Returns current playback rate
     */
    DoubleFloat getRate()
            throws ComException;

    /**
     * Returns current playback rate
     */
    void setRate(
            DoubleFloat /*[in]*/ pdRate)
            throws ComException;

    /**
     * Returns current audio Balance
     */
    Int32 getBalance()
            throws ComException;

    /**
     * Returns current audio Balance
     */
    void setBalance(
            Int32 /*[in]*/ plBalance)
            throws ComException;

    /**
     * Returns current audio volume
     */
    Int32 getVolume()
            throws ComException;

    /**
     * Returns current audio volume
     */
    void setVolume(
            Int32 /*[in]*/ plVolume)
            throws ComException;

    /**
     * Returns whether error dialogs are shown by default when embedded
     */
    VariantBool getEnableErrorDialogs()
            throws ComException;

    /**
     * Returns whether error dialogs are shown by default when embedded
     */
    void setEnableErrorDialogs(
            VariantBool /*[in]*/ pfEnableErrorDialogs)
            throws ComException;
}
