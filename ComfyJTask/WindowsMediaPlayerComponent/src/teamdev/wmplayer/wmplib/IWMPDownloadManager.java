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
 * Represents Java interface for COM interface IWMPDownloadManager.
 */
public interface IWMPDownloadManager extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{E15E9AD1-8F20-4CC4-9EC7-1A328CA86A0D}";

    /**
     * Returns a specific download collection
     */
    IWMPDownloadCollection getDownloadCollection(
            Int32 /*[in]*/ lCollectionId)
            throws ComException;

    /**
     * Creates a download collection
     */
    IWMPDownloadCollection createDownloadCollection()
            throws ComException;
}
