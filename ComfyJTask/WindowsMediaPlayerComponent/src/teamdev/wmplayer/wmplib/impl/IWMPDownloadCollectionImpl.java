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
 * Represents COM interface IWMPDownloadCollection.
 */
public class IWMPDownloadCollectionImpl extends IDispatchImpl
        implements IWMPDownloadCollection {
    public static final String INTERFACE_IDENTIFIER = IWMPDownloadCollection.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDownloadCollectionImpl() {
    }

    protected IWMPDownloadCollectionImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDownloadCollectionImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDownloadCollectionImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDownloadCollectionImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns a pending download object
     */
    public IWMPDownloadItem2 item(
            Int32 /*[in]*/ lItem)
            throws ComException {
        IWMPDownloadItem2Impl ppDownload = new IWMPDownloadItem2Impl();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lItem,
                        ppDownload == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDownload)
                }
        );
        return ppDownload;
    }

    /**
     * Queues a download
     */
    public IWMPDownloadItem2 startDownload(
            BStr /*[in]*/ bstrSourceURL,
            BStr /*[in]*/ bstrType)
            throws ComException {
        IWMPDownloadItem2Impl ppDownload = new IWMPDownloadItem2Impl();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrSourceURL == null ? (Parameter) PTR_NULL : bstrSourceURL,
                        bstrType == null ? (Parameter) PTR_NULL : bstrType,
                        ppDownload == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDownload)
                }
        );
        return ppDownload;
    }

    /**
     * Remove a download from the collection. Cancel if in progress.
     */
    public void removeItem(
            Int32 /*[in]*/ lItem)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lItem
                }
        );
    }

    /**
     * Clear the download collection
     */
    public void clear()
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Returns the unique identifier of the collection
     */
    public Int32 getID()
            throws ComException {
        Int32 plId = new Int32();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plId == null ? (Parameter) PTR_NULL : new Pointer(plId)
                }
        );
        return plId;
    }

    /**
     * Returns the number of pending downloads
     */
    public Int32 getCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDownloadCollectionImpl(this);
    }
}
