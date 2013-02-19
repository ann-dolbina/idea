package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPEvents3.
 */
public interface IWMPEvents3 extends IWMPEvents2 {
    public static final String INTERFACE_IDENTIFIER = "{1F504270-A66B-4223-8E96-26A06C63D69F}";

    /**
     * Occurs when ripping state changes
     */
    void cdromRipStateChange(
            IWMPCdromRip /*[in]*/ pCdromRip,
            WMPRipState /*[in]*/ wmprs);

    /**
     * Occurs when an error happens while ripping a media
     */
    void cdromRipMediaError(
            IWMPCdromRip /*[in]*/ pCdromRip,
            IDispatch /*[in]*/ pMedia);

    /**
     * Occurs when burning state changes
     */
    void cdromBurnStateChange(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            WMPBurnState /*[in]*/ wmpbs);

    /**
     * Occurs when an error happens while burning a media
     */
    void cdromBurnMediaError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            IDispatch /*[in]*/ pMedia);

    /**
     * Occurs when a generic error happens while burning
     */
    void cdromBurnError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            HResult /*[in]*/ hrError);

    /**
     * Occurs when a library is connected
     */
    void libraryConnect(
            IWMPLibrary /*[in]*/ pLibrary);

    /**
     * Occurs when a library is disconnected
     */
    void libraryDisconnect(
            IWMPLibrary /*[in]*/ pLibrary);

    /**
     * Occurs when a folder scan state changes
     */
    void folderScanStateChange(
            WMPFolderScanState /*[in]*/ wmpfss);

    /**
     * Sent when a string collection changes
     */
    void stringCollectionChange(
            IDispatch /*[in]*/ pdispStringCollection,
            WMPStringCollectionChangeEventType /*[in]*/ change,
            Int32 /*[in]*/ lCollectionIndex);

    /**
     * Sent when a media is added to the local library
     */
    void mediaCollectionMediaAdded(
            IDispatch /*[in]*/ pdispMedia);

    /**
     * Sent when a media is removed from the local library
     */
    void mediaCollectionMediaRemoved(
            IDispatch /*[in]*/ pdispMedia);
}
