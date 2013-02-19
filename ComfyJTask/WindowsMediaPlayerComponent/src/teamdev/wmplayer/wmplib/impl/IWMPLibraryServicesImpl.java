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
 * Represents COM interface IWMPLibraryServices.
 */
public class IWMPLibraryServicesImpl extends IUnknownImpl
        implements IWMPLibraryServices {
    public static final String INTERFACE_IDENTIFIER = IWMPLibraryServices.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLibraryServicesImpl() {
    }

    protected IWMPLibraryServicesImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLibraryServicesImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLibraryServicesImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLibraryServicesImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public Int32 getCountByType(
            WMPLibraryType /*[in]*/ wmplt)
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        wmplt,
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     *
     */
    public IWMPLibrary getLibraryByType(
            WMPLibraryType /*[in]*/ wmplt,
            Int32 /*[in]*/ lIndex)
            throws ComException {
        IWMPLibraryImpl ppIWMPLibrary = new IWMPLibraryImpl();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        wmplt,
                        lIndex,
                        ppIWMPLibrary == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppIWMPLibrary)
                }
        );
        return ppIWMPLibrary;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPLibraryServicesImpl(this);
    }
}
