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
 * Represents Java interface for COM interface IWMPCdromBurn.
 */
public interface IWMPCdromBurn extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{BD94DBEB-417F-4928-AA06-087D56ED9B59}";

    /**
     *
     */
    VariantBool isAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     *
     */
    BStr getItemInfo(
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     *
     */
    void refreshStatus()
            throws ComException;

    /**
     *
     */
    void startBurn()
            throws ComException;

    /**
     *
     */
    void stopBurn()
            throws ComException;

    /**
     *
     */
    void erase()
            throws ComException;

    /**
     *
     */
    BStr getLabel()
            throws ComException;

    /**
     *
     */
    void setLabel(
            BStr /*[in]*/ pbstrLabel)
            throws ComException;

    /**
     *
     */
    WMPBurnFormat getBurnFormat()
            throws ComException;

    /**
     *
     */
    void setBurnFormat(
            WMPBurnFormat /*[in]*/ pwmpbf)
            throws ComException;

    /**
     *
     */
    IWMPPlaylist getBurnPlaylist()
            throws ComException;

    /**
     *
     */
    void setBurnPlaylist(
            IWMPPlaylist /*[in]*/ ppPlaylist)
            throws ComException;

    /**
     *
     */
    WMPBurnState getBurnState()
            throws ComException;

    /**
     *
     */
    Int32 getBurnProgress()
            throws ComException;
}
