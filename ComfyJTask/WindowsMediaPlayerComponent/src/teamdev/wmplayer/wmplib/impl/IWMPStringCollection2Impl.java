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
 * Represents COM interface IWMPStringCollection2.
 */
public class IWMPStringCollection2Impl extends IWMPStringCollectionImpl
        implements IWMPStringCollection2 {
    public static final String INTERFACE_IDENTIFIER = IWMPStringCollection2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPStringCollection2Impl() {
    }

    protected IWMPStringCollection2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPStringCollection2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPStringCollection2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPStringCollection2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Determines if the supplied object is the same as this one
     */
    public VariantBool isIdentical(
            IWMPStringCollection2 /*[in]*/ pIWMPStringCollection2)
            throws ComException {
        VariantBool pvbool = new VariantBool();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPStringCollection2 == null ? (Parameter) PTR_NULL : (Parameter) pIWMPStringCollection2,
                        pvbool == null ? (Parameter) PTR_NULL : new Pointer(pvbool)
                }
        );
        return pvbool;
    }

    /**
     * Gets an attribute from a string collection backing object
     */
    public BStr getItemInfo(
            Int32 /*[in]*/ lCollectionIndex,
            BStr /*[in]*/ bstrItemName)
            throws ComException {
        BStr pbstrValue = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lCollectionIndex,
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        pbstrValue == null ? (Parameter) PTR_NULL : new Pointer(pbstrValue)
                }
        );
        return pbstrValue;
    }

    /**
     * Gets count of values for a particular attribute
     */
    public Int32 getAttributeCountByType(
            Int32 /*[in]*/ lCollectionIndex,
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage)
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lCollectionIndex,
                        bstrType == null ? (Parameter) PTR_NULL : bstrType,
                        bstrLanguage == null ? (Parameter) PTR_NULL : bstrLanguage,
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     * Gets one value of an attribute from a string collection backing object
     */
    public Variant getItemInfoByType(
            Int32 /*[in]*/ lCollectionIndex,
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage,
            Int32 /*[in]*/ lAttributeIndex)
            throws ComException {
        Variant pvarValue = new Variant();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lCollectionIndex,
                        bstrType == null ? (Parameter) PTR_NULL : bstrType,
                        bstrLanguage == null ? (Parameter) PTR_NULL : bstrLanguage,
                        lAttributeIndex,
                        pvarValue == null ? (Parameter) PTR_NULL : new Pointer(pvarValue)
                }
        );
        return pvarValue;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPStringCollection2Impl(this);
    }
}
