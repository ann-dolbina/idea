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
 * Represents Java interface for COM interface IWMPControls3.
 */
public interface IWMPControls3 extends IWMPControls2 {
    public static final String INTERFACE_IDENTIFIER = "{A1D1110E-D545-476A-9A78-AC3E4CB1E6BD}";

    /**
     * Returns the LCID corresponding to the index
     */
    Int32 getAudioLanguageID(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the desription corresponding to the index
     */
    BStr getAudioLanguageDescription(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     * Returns the human-readable name of language specified by LCID
     */
    BStr getLanguageName(
            Int32 /*[in]*/ lLangID)
            throws ComException;

    /**
     * Returns the count of supported audio languages
     */
    Int32 getAudioLanguageCount()
            throws ComException;

    /**
     * Gets the current audio language setting for playback
     */
    Int32 getCurrentAudioLanguage()
            throws ComException;

    /**
     * Gets the current audio language setting for playback
     */
    void setCurrentAudioLanguage(
            Int32 /*[in]*/ plLangID)
            throws ComException;

    /**
     * Gets the current audio language index setting for playback
     */
    Int32 getCurrentAudioLanguageIndex()
            throws ComException;

    /**
     * Gets the current audio language index setting for playback
     */
    void setCurrentAudioLanguageIndex(
            Int32 /*[in]*/ plIndex)
            throws ComException;

    /**
     * Returns the current timecode position in media
     */
    BStr getCurrentPositionTimecode()
            throws ComException;

    /**
     * Returns the current timecode position in media
     */
    void setCurrentPositionTimecode(
            BStr /*[in]*/ bstrTimecode)
            throws ComException;
}
