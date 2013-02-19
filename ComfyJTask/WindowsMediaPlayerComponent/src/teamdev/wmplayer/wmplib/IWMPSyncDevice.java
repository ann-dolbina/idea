package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPSyncDevice.
 */
public interface IWMPSyncDevice extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{82A2986C-0293-4FD0-B279-B21B86C058BE}";

    /**
     *
     */
    BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException;

    /**
     *
     */
    void createPartnership(
            VariantBool /*[in]*/ vbShowUI)
            throws ComException;

    /**
     *
     */
    void deletePartnership()
            throws ComException;

    /**
     *
     */
    void start()
            throws ComException;

    /**
     *
     */
    void stop()
            throws ComException;

    /**
     *
     */
    void showSettings()
            throws ComException;

    /**
     *
     */
    VariantBool isIdentical(
            IWMPSyncDevice /*[in]*/ pDevice)
            throws ComException;

    /**
     *
     */
    BStr getFriendlyName()
            throws ComException;

    /**
     *
     */
    void setFriendlyName(
            BStr /*[in]*/ pbstrName)
            throws ComException;

    /**
     *
     */
    BStr getDeviceName()
            throws ComException;

    /**
     *
     */
    BStr getDeviceId()
            throws ComException;

    /**
     *
     */
    Int32 getPartnershipIndex()
            throws ComException;

    /**
     *
     */
    VariantBool getConnected()
            throws ComException;

    /**
     *
     */
    WMPDeviceStatus getStatus()
            throws ComException;

    /**
     *
     */
    WMPSyncState getSyncState()
            throws ComException;

    /**
     *
     */
    Int32 getProgress()
            throws ComException;
}
