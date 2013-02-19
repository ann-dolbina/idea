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
 * Represents Java interface for COM interface IWMPRemoteMediaServices.
 */
public interface IWMPRemoteMediaServices extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{CBB92747-741F-44FE-AB5B-F1A48F3B2A59}";

    /**
     *
     */
    void getServiceType(
            BStr /*[out]*/ pbstrType)
            throws ComException;

    /**
     *
     */
    void getApplicationName(
            BStr /*[out]*/ pbstrName)
            throws ComException;

    /**
     *
     */
    void getScriptableObject(
            BStr /*[out]*/ pbstrName,
            IDispatch /*[out]*/ ppDispatch)
            throws ComException;

    /**
     *
     */
    void getCustomUIMode(
            BStr /*[out]*/ pbstrFile)
            throws ComException;
}
