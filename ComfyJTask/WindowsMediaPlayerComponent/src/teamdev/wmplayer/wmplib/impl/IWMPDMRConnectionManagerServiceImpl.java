package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPDMRConnectionManagerService.
 */
public class IWMPDMRConnectionManagerServiceImpl extends IDispatchImpl
        implements IWMPDMRConnectionManagerService {
    public static final String INTERFACE_IDENTIFIER = IWMPDMRConnectionManagerService.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDMRConnectionManagerServiceImpl() {
    }

    protected IWMPDMRConnectionManagerServiceImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDMRConnectionManagerServiceImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDMRConnectionManagerServiceImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDMRConnectionManagerServiceImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Method GetProtocolInfo
     */
    public void getProtocolInfo(
            BStr /*[in,out]*/ pbstrSource,
            BStr /*[in,out]*/ pbstrSink)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSource == null ? (Parameter) PTR_NULL : new Pointer(pbstrSource),
                        pbstrSink == null ? (Parameter) PTR_NULL : new Pointer(pbstrSink)
                }
        );
    }

    /**
     * Method GetCurrentConnectionIDs
     */
    public void getCurrentConnectionIDs(
            BStr /*[in,out]*/ pbstrConnectionIDs)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrConnectionIDs == null ? (Parameter) PTR_NULL : new Pointer(pbstrConnectionIDs)
                }
        );
    }

    /**
     * Method GetCurrentConnectionInfo
     */
    public void getCurrentConnectionInfo(
            Int32 /*[in]*/ lConnectionID,
            Int32 /*[in,out]*/ plResID,
            Int32 /*[in,out]*/ plAVTransportID,
            BStr /*[in,out]*/ pbstrProtocolInfo,
            BStr /*[in,out]*/ pbstrPeerConnectionManager,
            Int32 /*[in,out]*/ plPeerConnectionID,
            BStr /*[in,out]*/ pbstrDirection,
            BStr /*[in,out]*/ pbstrStatus)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lConnectionID,
                        plResID == null ? (Parameter) PTR_NULL : new Pointer(plResID),
                        plAVTransportID == null ? (Parameter) PTR_NULL : new Pointer(plAVTransportID),
                        pbstrProtocolInfo == null ? (Parameter) PTR_NULL : new Pointer(pbstrProtocolInfo),
                        pbstrPeerConnectionManager == null ? (Parameter) PTR_NULL : new Pointer(pbstrPeerConnectionManager),
                        plPeerConnectionID == null ? (Parameter) PTR_NULL : new Pointer(plPeerConnectionID),
                        pbstrDirection == null ? (Parameter) PTR_NULL : new Pointer(pbstrDirection),
                        pbstrStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrStatus)
                }
        );
    }

    /**
     * Property SourceProtocolInfo
     */
    public BStr getSourceProtocolInfo()
            throws ComException {
        BStr pbstrSourceProtocolInfo = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSourceProtocolInfo == null ? (Parameter) PTR_NULL : new Pointer(pbstrSourceProtocolInfo)
                }
        );
        return pbstrSourceProtocolInfo;
    }

    /**
     * Property SinkProtocolInfo
     */
    public BStr getSinkProtocolInfo()
            throws ComException {
        BStr pbstrSinkProtocolInfo = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSinkProtocolInfo == null ? (Parameter) PTR_NULL : new Pointer(pbstrSinkProtocolInfo)
                }
        );
        return pbstrSinkProtocolInfo;
    }

    /**
     * Property CurrentConnectionIDs
     */
    public BStr getCurrentConnectionIDsProperty()
            throws ComException {
        BStr pbstrCurrentConnectionIDs = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentConnectionIDs == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentConnectionIDs)
                }
        );
        return pbstrCurrentConnectionIDs;
    }

    /**
     * Property A_ARG_TYPE_ConnectionStatus
     */
    public BStr getA_ARG_TYPE_ConnectionStatus()
            throws ComException {
        BStr pbstrA_ARG_TYPE_ConnectionStatus = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrA_ARG_TYPE_ConnectionStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrA_ARG_TYPE_ConnectionStatus)
                }
        );
        return pbstrA_ARG_TYPE_ConnectionStatus;
    }

    /**
     * Property A_ARG_TYPE_ConnectionManager
     */
    public BStr getA_ARG_TYPE_ConnectionManager()
            throws ComException {
        BStr pbstrA_ARG_TYPE_ConnectionManager = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrA_ARG_TYPE_ConnectionManager == null ? (Parameter) PTR_NULL : new Pointer(pbstrA_ARG_TYPE_ConnectionManager)
                }
        );
        return pbstrA_ARG_TYPE_ConnectionManager;
    }

    /**
     * Property A_ARG_TYPE_Direction
     */
    public BStr getA_ARG_TYPE_Direction()
            throws ComException {
        BStr pbstrA_ARG_TYPE_Direction = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrA_ARG_TYPE_Direction == null ? (Parameter) PTR_NULL : new Pointer(pbstrA_ARG_TYPE_Direction)
                }
        );
        return pbstrA_ARG_TYPE_Direction;
    }

    /**
     * Property A_ARG_TYPE_ProtocolInfo
     */
    public BStr getA_ARG_TYPE_ProtocolInfo()
            throws ComException {
        BStr pbstrA_ARG_TYPE_ProtocolInfo = new BStr();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrA_ARG_TYPE_ProtocolInfo == null ? (Parameter) PTR_NULL : new Pointer(pbstrA_ARG_TYPE_ProtocolInfo)
                }
        );
        return pbstrA_ARG_TYPE_ProtocolInfo;
    }

    /**
     * Property A_ARG_TYPE_ConnectionID
     */
    public Int32 getA_ARG_TYPE_ConnectionID()
            throws ComException {
        Int32 plA_ARG_TYPE_ConnectionID = new Int32();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plA_ARG_TYPE_ConnectionID == null ? (Parameter) PTR_NULL : new Pointer(plA_ARG_TYPE_ConnectionID)
                }
        );
        return plA_ARG_TYPE_ConnectionID;
    }

    /**
     * Property A_ARG_TYPE_AVTransportID
     */
    public Int32 getA_ARG_TYPE_AVTransportID()
            throws ComException {
        Int32 plA_ARG_TYPE_AVTransportID = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plA_ARG_TYPE_AVTransportID == null ? (Parameter) PTR_NULL : new Pointer(plA_ARG_TYPE_AVTransportID)
                }
        );
        return plA_ARG_TYPE_AVTransportID;
    }

    /**
     * Property A_ARG_TYPE_RcsID
     */
    public Int32 getA_ARG_TYPE_RcsID()
            throws ComException {
        Int32 plA_ARG_TYPE_RcsID = new Int32();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plA_ARG_TYPE_RcsID == null ? (Parameter) PTR_NULL : new Pointer(plA_ARG_TYPE_RcsID)
                }
        );
        return plA_ARG_TYPE_RcsID;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDMRConnectionManagerServiceImpl(this);
    }
}
