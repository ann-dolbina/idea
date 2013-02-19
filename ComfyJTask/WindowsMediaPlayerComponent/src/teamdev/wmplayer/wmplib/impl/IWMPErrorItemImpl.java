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
 * Represents COM interface IWMPErrorItem.
 */
public class IWMPErrorItemImpl extends IDispatchImpl
        implements IWMPErrorItem {
    public static final String INTERFACE_IDENTIFIER = IWMPErrorItem.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPErrorItemImpl() {
    }

    protected IWMPErrorItemImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPErrorItemImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPErrorItemImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPErrorItemImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the error code
     */
    public Int32 getErrorCode()
            throws ComException {
        Int32 phr = new Int32();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        phr == null ? (Parameter) PTR_NULL : new Pointer(phr)
                }
        );
        return phr;
    }

    /**
     * Returns a description of the error
     */
    public BStr getErrorDescription()
            throws ComException {
        BStr pbstrDescription = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDescription == null ? (Parameter) PTR_NULL : new Pointer(pbstrDescription)
                }
        );
        return pbstrDescription;
    }

    /**
     * Returns context information for the error
     */
    public Variant getErrorContext()
            throws ComException {
        Variant pvarContext = new Variant();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pvarContext == null ? (Parameter) PTR_NULL : new Pointer(pvarContext)
                }
        );
        return pvarContext;
    }

    /**
     * Returns remedy code for the error
     */
    public Int32 getRemedy()
            throws ComException {
        Int32 plRemedy = new Int32();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plRemedy == null ? (Parameter) PTR_NULL : new Pointer(plRemedy)
                }
        );
        return plRemedy;
    }

    /**
     * Returns a custom url for this error (if avail)
     */
    public BStr getCustomUrl()
            throws ComException {
        BStr pbstrCustomUrl = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCustomUrl == null ? (Parameter) PTR_NULL : new Pointer(pbstrCustomUrl)
                }
        );
        return pbstrCustomUrl;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPErrorItemImpl(this);
    }
}
