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
 * Represents COM interface IWMPHoverPreviewDispatch.
 */
public class IWMPHoverPreviewDispatchImpl extends IDispatchImpl
        implements IWMPHoverPreviewDispatch {
    public static final String INTERFACE_IDENTIFIER = IWMPHoverPreviewDispatch.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPHoverPreviewDispatchImpl() {
    }

    protected IWMPHoverPreviewDispatchImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPHoverPreviewDispatchImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPHoverPreviewDispatchImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPHoverPreviewDispatchImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void dismiss()
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public BStr getTitle()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getAlbum()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public BStr getURL()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setImage(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    /**
     *
     */
    public void setAutoClick(
            VariantBool /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1
                }
        );
    }

    /**
     *
     */
    public void setPreviewClick(
            VariantBool /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPHoverPreviewDispatchImpl(this);
    }
}
