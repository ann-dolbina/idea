package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPFolderMonitorServices.
 */
public interface IWMPFolderMonitorServices extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{788C8743-E57F-439D-A468-5BC77F2E59C6}";

    /**
     *
     */
    BStr item(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     *
     */
    void add(
            BStr /*[in]*/ bstrFolder)
            throws ComException;

    /**
     *
     */
    void remove(
            Int32 /*[in]*/ lIndex)
            throws ComException;

    /**
     *
     */
    void startScan()
            throws ComException;

    /**
     *
     */
    void stopScan()
            throws ComException;

    /**
     *
     */
    Int32 getCount()
            throws ComException;

    /**
     *
     */
    WMPFolderScanState getScanState()
            throws ComException;

    /**
     *
     */
    BStr getCurrentFolder()
            throws ComException;

    /**
     *
     */
    Int32 getScannedFilesCount()
            throws ComException;

    /**
     *
     */
    Int32 getAddedFilesCount()
            throws ComException;

    /**
     *
     */
    Int32 getUpdateProgress()
            throws ComException;
}
