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
 * Represents COM interface IWMPClosedCaption2.
 */
public class IWMPClosedCaption2Impl extends IWMPClosedCaptionImpl
        implements IWMPClosedCaption2 {
    public static final String INTERFACE_IDENTIFIER = IWMPClosedCaption2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPClosedCaption2Impl() {
    }

    protected IWMPClosedCaption2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPClosedCaption2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPClosedCaption2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPClosedCaption2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the name of a SAMI language by index
     */
    public BStr getSAMILangName(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     * Returns the ID of a SAMI language by index
     */
    public Int32 getSAMILangID(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        Int32 plLangID = new Int32();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        plLangID == null ? (Parameter) PTR_NULL : new Pointer(plLangID)
                }
        );
        return plLangID;
    }

    /**
     * Returns the name of a SAMI style by index
     */
    public BStr getSAMIStyleName(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     * Returns the count of SAMI languages
     */
    public Int32 getSAMILangCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     * Returns the count of SAMI styles
     */
    public Int32 getSAMIStyleCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                18,
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
        return new IWMPClosedCaption2Impl(this);
    }
}
