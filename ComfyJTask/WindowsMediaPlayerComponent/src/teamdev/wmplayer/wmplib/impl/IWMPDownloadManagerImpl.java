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
 * Represents COM interface IWMPDownloadManager.
 */
public class IWMPDownloadManagerImpl extends IDispatchImpl
        implements IWMPDownloadManager {
    public static final String INTERFACE_IDENTIFIER = IWMPDownloadManager.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDownloadManagerImpl() {
    }

    protected IWMPDownloadManagerImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDownloadManagerImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDownloadManagerImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDownloadManagerImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns a specific download collection
     */
    public IWMPDownloadCollection getDownloadCollection(
            Int32 /*[in]*/ lCollectionId)
            throws ComException {
        IWMPDownloadCollectionImpl ppCollection = new IWMPDownloadCollectionImpl();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lCollectionId,
                        ppCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppCollection)
                }
        );
        return ppCollection;
    }

    /**
     * Creates a download collection
     */
    public IWMPDownloadCollection createDownloadCollection()
            throws ComException {
        IWMPDownloadCollectionImpl ppCollection = new IWMPDownloadCollectionImpl();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppCollection)
                }
        );
        return ppCollection;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDownloadManagerImpl(this);
    }
}
