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
 * Represents Java interface for COM interface IWMPDMRConnectionManagerService.
 */
public interface IWMPDMRConnectionManagerService extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{FB61CD38-8DE7-4479-8B76-A8D097C20C70}";

    /**
     * Method GetProtocolInfo
     */
    void getProtocolInfo(
            BStr /*[in,out]*/ pbstrSource,
            BStr /*[in,out]*/ pbstrSink)
            throws ComException;

    /**
     * Method GetCurrentConnectionIDs
     */
    void getCurrentConnectionIDs(
            BStr /*[in,out]*/ pbstrConnectionIDs)
            throws ComException;

    /**
     * Method GetCurrentConnectionInfo
     */
    void getCurrentConnectionInfo(
            Int32 /*[in]*/ lConnectionID,
            Int32 /*[in,out]*/ plResID,
            Int32 /*[in,out]*/ plAVTransportID,
            BStr /*[in,out]*/ pbstrProtocolInfo,
            BStr /*[in,out]*/ pbstrPeerConnectionManager,
            Int32 /*[in,out]*/ plPeerConnectionID,
            BStr /*[in,out]*/ pbstrDirection,
            BStr /*[in,out]*/ pbstrStatus)
            throws ComException;

    /**
     * Property SourceProtocolInfo
     */
    BStr getSourceProtocolInfo()
            throws ComException;

    /**
     * Property SinkProtocolInfo
     */
    BStr getSinkProtocolInfo()
            throws ComException;

    /**
     * Property CurrentConnectionIDs
     */
    BStr getCurrentConnectionIDsProperty()
            throws ComException;

    /**
     * Property A_ARG_TYPE_ConnectionStatus
     */
    BStr getA_ARG_TYPE_ConnectionStatus()
            throws ComException;

    /**
     * Property A_ARG_TYPE_ConnectionManager
     */
    BStr getA_ARG_TYPE_ConnectionManager()
            throws ComException;

    /**
     * Property A_ARG_TYPE_Direction
     */
    BStr getA_ARG_TYPE_Direction()
            throws ComException;

    /**
     * Property A_ARG_TYPE_ProtocolInfo
     */
    BStr getA_ARG_TYPE_ProtocolInfo()
            throws ComException;

    /**
     * Property A_ARG_TYPE_ConnectionID
     */
    Int32 getA_ARG_TYPE_ConnectionID()
            throws ComException;

    /**
     * Property A_ARG_TYPE_AVTransportID
     */
    Int32 getA_ARG_TYPE_AVTransportID()
            throws ComException;

    /**
     * Property A_ARG_TYPE_RcsID
     */
    Int32 getA_ARG_TYPE_RcsID()
            throws ComException;
}
