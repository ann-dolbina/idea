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
 * Represents COM interface IWMPDownloadItem.
 */
public class IWMPDownloadItemImpl extends IDispatchImpl
        implements IWMPDownloadItem {
    public static final String INTERFACE_IDENTIFIER = IWMPDownloadItem.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDownloadItemImpl() {
    }

    protected IWMPDownloadItemImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDownloadItemImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDownloadItemImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDownloadItemImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Pauses the download
     */
    public void pause()
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Resumes the download
     */
    public void resume()
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Cancels the download
     */
    public void cancel()
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Returns the source URL of the download
     */
    public BStr getSourceURL()
            throws ComException {
        BStr pbstrURL = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrURL == null ? (Parameter) PTR_NULL : new Pointer(pbstrURL)
                }
        );
        return pbstrURL;
    }

    /**
     * Returns the size of the download
     */
    public Int32 getSize()
            throws ComException {
        Int32 plSize = new Int32();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plSize == null ? (Parameter) PTR_NULL : new Pointer(plSize)
                }
        );
        return plSize;
    }

    /**
     * Returns the type of the download
     */
    public BStr getType()
            throws ComException {
        BStr pbstrType = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrType == null ? (Parameter) PTR_NULL : new Pointer(pbstrType)
                }
        );
        return pbstrType;
    }

    /**
     * Returns the progress (in bytes) of the download
     */
    public Int32 getProgress()
            throws ComException {
        Int32 plProgress = new Int32();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plProgress == null ? (Parameter) PTR_NULL : new Pointer(plProgress)
                }
        );
        return plProgress;
    }

    /**
     * Returns the state of the download
     */
    public WMPSubscriptionDownloadState getDownloadState()
            throws ComException {
        WMPSubscriptionDownloadState pwmpsdls = new WMPSubscriptionDownloadState();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpsdls == null ? (Parameter) PTR_NULL : new Pointer(pwmpsdls)
                }
        );
        return pwmpsdls;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDownloadItemImpl(this);
    }
}
