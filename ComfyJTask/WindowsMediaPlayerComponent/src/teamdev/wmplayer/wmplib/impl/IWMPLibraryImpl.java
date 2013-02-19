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
 * Represents COM interface IWMPLibrary.
 */
public class IWMPLibraryImpl extends IUnknownImpl
        implements IWMPLibrary {
    public static final String INTERFACE_IDENTIFIER = IWMPLibrary.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLibraryImpl() {
    }

    protected IWMPLibraryImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLibraryImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLibraryImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLibraryImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public VariantBool isIdentical(
            IWMPLibrary /*[in]*/ pIWMPLibrary)
            throws ComException {
        VariantBool pvbool = new VariantBool();
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPLibrary == null ? (Parameter) PTR_NULL : (Parameter) pIWMPLibrary,
                        pvbool == null ? (Parameter) PTR_NULL : new Pointer(pvbool)
                }
        );
        return pvbool;
    }

    /**
     *
     */
    public BStr getName()
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     *
     */
    public WMPLibraryType getType()
            throws ComException {
        WMPLibraryType pwmplt = new WMPLibraryType();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmplt == null ? (Parameter) PTR_NULL : new Pointer(pwmplt)
                }
        );
        return pwmplt;
    }

    /**
     *
     */
    public IWMPMediaCollection getMediaCollection()
            throws ComException {
        IWMPMediaCollectionImpl ppIWMPMediaCollection = new IWMPMediaCollectionImpl();
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppIWMPMediaCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppIWMPMediaCollection)
                }
        );
        return ppIWMPMediaCollection;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPLibraryImpl(this);
    }
}
