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
 * Represents COM interface IWMPMedia3.
 */
public class IWMPMedia3Impl extends IWMPMedia2Impl
        implements IWMPMedia3 {
    public static final String INTERFACE_IDENTIFIER = IWMPMedia3.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMedia3Impl() {
    }

    protected IWMPMedia3Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMedia3Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMedia3Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMedia3Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public Int32 getAttributeCountByType(
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage)
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrType == null ? (Parameter) PTR_NULL : bstrType,
                        bstrLanguage == null ? (Parameter) PTR_NULL : bstrLanguage,
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     *
     */
    public Variant getItemInfoByType(
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage,
            Int32 /*[in]*/ lIndex)
            throws ComException {
        Variant pvarValue = new Variant();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrType == null ? (Parameter) PTR_NULL : bstrType,
                        bstrLanguage == null ? (Parameter) PTR_NULL : bstrLanguage,
                        lIndex,
                        pvarValue == null ? (Parameter) PTR_NULL : new Pointer(pvarValue)
                }
        );
        return pvarValue;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMedia3Impl(this);
    }
}
