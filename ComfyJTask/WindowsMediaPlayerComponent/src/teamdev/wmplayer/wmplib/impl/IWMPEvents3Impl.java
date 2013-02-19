package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPEvents3.
 */
public class IWMPEvents3Impl extends IWMPEvents2Impl
        implements IWMPEvents3 {
    public static final String INTERFACE_IDENTIFIER = IWMPEvents3.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEvents3Impl() {
    }

    protected IWMPEvents3Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEvents3Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEvents3Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEvents3Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Occurs when ripping state changes
     */
    public void cdromRipStateChange(
            IWMPCdromRip /*[in]*/ pCdromRip,
            WMPRipState /*[in]*/ wmprs) {
        invokeVirtualMethod(
                54,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pCdromRip == null ? (Parameter) PTR_NULL : (Parameter) pCdromRip,
                        wmprs
                }
        );
    }

    /**
     * Occurs when an error happens while ripping a media
     */
    public void cdromRipMediaError(
            IWMPCdromRip /*[in]*/ pCdromRip,
            IDispatch /*[in]*/ pMedia) {
        invokeVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pCdromRip == null ? (Parameter) PTR_NULL : (Parameter) pCdromRip,
                        pMedia == null ? (Parameter) PTR_NULL : (Parameter) pMedia
                }
        );
    }

    /**
     * Occurs when burning state changes
     */
    public void cdromBurnStateChange(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            WMPBurnState /*[in]*/ wmpbs) {
        invokeVirtualMethod(
                56,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pCdromBurn == null ? (Parameter) PTR_NULL : (Parameter) pCdromBurn,
                        wmpbs
                }
        );
    }

    /**
     * Occurs when an error happens while burning a media
     */
    public void cdromBurnMediaError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            IDispatch /*[in]*/ pMedia) {
        invokeVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pCdromBurn == null ? (Parameter) PTR_NULL : (Parameter) pCdromBurn,
                        pMedia == null ? (Parameter) PTR_NULL : (Parameter) pMedia
                }
        );
    }

    /**
     * Occurs when a generic error happens while burning
     */
    public void cdromBurnError(
            IWMPCdromBurn /*[in]*/ pCdromBurn,
            HResult /*[in]*/ hrError) {
        invokeVirtualMethod(
                58,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pCdromBurn == null ? (Parameter) PTR_NULL : (Parameter) pCdromBurn,
                        hrError
                }
        );
    }

    /**
     * Occurs when a library is connected
     */
    public void libraryConnect(
            IWMPLibrary /*[in]*/ pLibrary) {
        invokeVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pLibrary == null ? (Parameter) PTR_NULL : (Parameter) pLibrary
                }
        );
    }

    /**
     * Occurs when a library is disconnected
     */
    public void libraryDisconnect(
            IWMPLibrary /*[in]*/ pLibrary) {
        invokeVirtualMethod(
                60,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pLibrary == null ? (Parameter) PTR_NULL : (Parameter) pLibrary
                }
        );
    }

    /**
     * Occurs when a folder scan state changes
     */
    public void folderScanStateChange(
            WMPFolderScanState /*[in]*/ wmpfss) {
        invokeVirtualMethod(
                61,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        wmpfss
                }
        );
    }

    /**
     * Sent when a string collection changes
     */
    public void stringCollectionChange(
            IDispatch /*[in]*/ pdispStringCollection,
            WMPStringCollectionChangeEventType /*[in]*/ change,
            Int32 /*[in]*/ lCollectionIndex) {
        invokeVirtualMethod(
                62,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pdispStringCollection == null ? (Parameter) PTR_NULL : (Parameter) pdispStringCollection,
                        change,
                        lCollectionIndex
                }
        );
    }

    /**
     * Sent when a media is added to the local library
     */
    public void mediaCollectionMediaAdded(
            IDispatch /*[in]*/ pdispMedia) {
        invokeVirtualMethod(
                63,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pdispMedia == null ? (Parameter) PTR_NULL : (Parameter) pdispMedia
                }
        );
    }

    /**
     * Sent when a media is removed from the local library
     */
    public void mediaCollectionMediaRemoved(
            IDispatch /*[in]*/ pdispMedia) {
        invokeVirtualMethod(
                64,
                Function.STDCALL_CALLING_CONVENTION,
                null,
                new Parameter[]{
                        pdispMedia == null ? (Parameter) PTR_NULL : (Parameter) pdispMedia
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEvents3Impl(this);
    }
}
