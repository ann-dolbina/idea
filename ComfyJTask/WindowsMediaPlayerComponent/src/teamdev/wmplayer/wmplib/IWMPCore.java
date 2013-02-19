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
 * Represents Java interface for COM interface IWMPCore.
 */
public interface IWMPCore extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{D84CCA99-CCE2-11D2-9ECC-0000F8085981}";

    /**
     * Closes the media
     */
    void close()
            throws ComException;

    /**
     *
     */
    void launchURL(
            BStr /*[in]*/ bstrURL)
            throws ComException;

    /**
     * Returns or sets the URL
     */
    BStr getURL()
            throws ComException;

    /**
     * Returns or sets the URL
     */
    void setURL(
            BStr /*[in]*/ pbstrURL)
            throws ComException;

    /**
     * Returns the open state of the player
     */
    WMPOpenState getOpenState()
            throws ComException;

    /**
     * Returns the play state of the player
     */
    WMPPlayState getPlayState()
            throws ComException;

    /**
     * Returns the control handler
     */
    IWMPControls getControls()
            throws ComException;

    /**
     * Returns the settings handler
     */
    IWMPSettings getSettings()
            throws ComException;

    /**
     * Returns or sets the current media object
     */
    IWMPMedia getCurrentMedia()
            throws ComException;

    /**
     * Returns or sets the current media object
     */
    void setCurrentMedia(
            IWMPMedia /*[in]*/ ppMedia)
            throws ComException;

    /**
     * Returns the media collection handler
     */
    IWMPMediaCollection getMediaCollection()
            throws ComException;

    /**
     * Returns the playlist collection handler
     */
    IWMPPlaylistCollection getPlaylistCollection()
            throws ComException;

    /**
     * Returns the version information for the player
     */
    BStr getVersionInfo()
            throws ComException;

    /**
     * Returns the network information handler
     */
    IWMPNetwork getNetwork()
            throws ComException;

    /**
     * Returns/sets the current playlist
     */
    IWMPPlaylist getCurrentPlaylist()
            throws ComException;

    /**
     * Returns/sets the current playlist
     */
    void setCurrentPlaylist(
            IWMPPlaylist /*[in]*/ ppPL)
            throws ComException;

    /**
     * Get the CDROM drive collection
     */
    IWMPCdromCollection getCdromCollection()
            throws ComException;

    /**
     * Returns the closed caption handler
     */
    IWMPClosedCaption getClosedCaption()
            throws ComException;

    /**
     * Returns whether the machine is online.
     */
    VariantBool getIsOnline()
            throws ComException;

    /**
     * Returns the error object
     */
    IWMPError getError()
            throws ComException;

    /**
     * Returns status string
     */
    BStr getStatus()
            throws ComException;
}
