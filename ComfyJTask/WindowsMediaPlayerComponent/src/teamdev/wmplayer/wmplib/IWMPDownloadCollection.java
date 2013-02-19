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
 * Represents Java interface for COM interface IWMPDownloadCollection.
 */
public interface IWMPDownloadCollection extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{0A319C7F-85F9-436C-B88E-82FD88000E1C}";

    /**
     * Returns a pending download object
     */
    IWMPDownloadItem2 item(
            Int32 /*[in]*/ lItem)
            throws ComException;

    /**
     * Queues a download
     */
    IWMPDownloadItem2 startDownload(
            BStr /*[in]*/ bstrSourceURL,
            BStr /*[in]*/ bstrType)
            throws ComException;

    /**
     * Remove a download from the collection. Cancel if in progress.
     */
    void removeItem(
            Int32 /*[in]*/ lItem)
            throws ComException;

    /**
     * Clear the download collection
     */
    void clear()
            throws ComException;

    /**
     * Returns the unique identifier of the collection
     */
    Int32 getID()
            throws ComException;

    /**
     * Returns the number of pending downloads
     */
    Int32 getCount()
            throws ComException;
}
