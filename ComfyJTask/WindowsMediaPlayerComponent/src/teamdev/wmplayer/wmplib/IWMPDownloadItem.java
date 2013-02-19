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
 * Represents Java interface for COM interface IWMPDownloadItem.
 */
public interface IWMPDownloadItem extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{C9470E8E-3F6B-46A9-A0A9-452815C34297}";

    /**
     * Pauses the download
     */
    void pause()
            throws ComException;

    /**
     * Resumes the download
     */
    void resume()
            throws ComException;

    /**
     * Cancels the download
     */
    void cancel()
            throws ComException;

    /**
     * Returns the source URL of the download
     */
    BStr getSourceURL()
            throws ComException;

    /**
     * Returns the size of the download
     */
    Int32 getSize()
            throws ComException;

    /**
     * Returns the type of the download
     */
    BStr getType()
            throws ComException;

    /**
     * Returns the progress (in bytes) of the download
     */
    Int32 getProgress()
            throws ComException;

    /**
     * Returns the state of the download
     */
    WMPSubscriptionDownloadState getDownloadState()
            throws ComException;
}
