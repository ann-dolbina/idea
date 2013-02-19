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
 * Represents COM interface IWMPLibrary2.
 */
public class IWMPLibrary2Impl extends IWMPLibraryImpl
        implements IWMPLibrary2 {
    public static final String INTERFACE_IDENTIFIER = IWMPLibrary2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLibrary2Impl() {
    }

    protected IWMPLibrary2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLibrary2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLibrary2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLibrary2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPLibrary2Impl(this);
    }
}
