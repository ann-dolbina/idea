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
 * Represents Java interface for COM interface IWMPNowDoingDispatch.
 */
public interface IWMPNowDoingDispatch extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{2A2E0DA3-19FA-4F82-BE18-CD7D7A3B977F}";

    /**
     * method buyContent
     */
    void buyContent()
            throws ComException;

    /**
     * method hideBasket
     */
    void hideBasket()
            throws ComException;

    /**
     * method burnNavigateToStatus
     */
    void burnNavigateToStatus()
            throws ComException;

    /**
     * method syncNavigateToStatus
     */
    void syncNavigateToStatus()
            throws ComException;

    /**
     * method logData
     */
    void logData(
            BStr /*[in]*/ ID,
            BStr /*[in]*/ data)
            throws ComException;

    /**
     * method formatTime
     */
    BStr formatTime(
            Int32 /*[in]*/ value)
            throws ComException;

    /**
     *
     */
    Int32 getDPI()
            throws ComException;

    /**
     * property mode
     */
    BStr getMode()
            throws ComException;

    /**
     * property burn_selectedDrive
     */
    void setBurn_selectedDrive(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property burn_selectedDrive
     */
    Int32 getBurn_selectedDrive()
            throws ComException;

    /**
     * property sync_selectedDevice
     */
    Int32 getSync_selectedDevice()
            throws ComException;

    /**
     * property sync_selectedDevice
     */
    void setSync_selectedDevice(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property burn_numDiscsSpanned
     */
    Int32 getBurn_numDiscsSpanned()
            throws ComException;

    /**
     * method editPlaylist
     */
    IDispatch getEditPlaylist()
            throws ComException;

    /**
     * property basketPlaylistName
     */
    BStr getBasketPlaylistName()
            throws ComException;

    /**
     * property isHighContrastMode
     */
    VariantBool getIsHighContrastMode()
            throws ComException;

    /**
     * property allowRating
     */
    VariantBool getAllowRating()
            throws ComException;

    /**
     * property allowShop
     */
    VariantBool getAllowShop()
            throws ComException;

    /**
     * property burn_mediaType
     */
    BStr getBurn_mediaType()
            throws ComException;

    /**
     * property burn_contentType
     */
    BStr getBurn_contentType()
            throws ComException;

    /**
     * property burn_freeSpace
     */
    Int32 getBurn_freeSpace()
            throws ComException;

    /**
     * property burn_totalSpace
     */
    Int32 getBurn_totalSpace()
            throws ComException;

    /**
     * property burn_driveName
     */
    BStr getBurn_driveName()
            throws ComException;

    /**
     * property burn_numDevices
     */
    Int32 getBurn_numDevices()
            throws ComException;

    /**
     * property burn_spaceToUse
     */
    Int32 getBurn_spaceToUse()
            throws ComException;

    /**
     * property burn_percentComplete
     */
    Int32 getBurn_percentComplete()
            throws ComException;

    /**
     * property sync_spaceToUse
     */
    Int32 getSync_spaceToUse()
            throws ComException;

    /**
     * property sync_spaceUsed
     */
    Int32 getSync_spaceUsed()
            throws ComException;

    /**
     * property sync_totalSpace
     */
    Int32 getSync_totalSpace()
            throws ComException;

    /**
     * property sync_deviceName
     */
    BStr getSync_deviceName()
            throws ComException;

    /**
     * property sync_numDevices
     */
    Int32 getSync_numDevices()
            throws ComException;

    /**
     * property sync_oemName
     */
    BStr getSync_oemName()
            throws ComException;

    /**
     * property sync_percentComplete
     */
    Int32 getSync_percentComplete()
            throws ComException;
}
