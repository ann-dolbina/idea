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
 * Represents COM interface IWMPSettings2.
 */
public class IWMPSettings2Impl extends IWMPSettingsImpl
        implements IWMPSettings2 {
    public static final String INTERFACE_IDENTIFIER = IWMPSettings2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSettings2Impl() {
    }

    protected IWMPSettings2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSettings2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSettings2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSettings2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public VariantBool requestMediaAccessRights(
            BStr /*[in]*/ bstrDesiredAccess)
            throws ComException {
        VariantBool pvbAccepted = new VariantBool();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrDesiredAccess == null ? (Parameter) PTR_NULL : bstrDesiredAccess,
                        pvbAccepted == null ? (Parameter) PTR_NULL : new Pointer(pvbAccepted)
                }
        );
        return pvbAccepted;
    }

    /**
     * Returns the LCID of default audio language
     */
    public Int32 getDefaultAudioLanguage()
            throws ComException {
        Int32 plLangID = new Int32();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plLangID == null ? (Parameter) PTR_NULL : new Pointer(plLangID)
                }
        );
        return plLangID;
    }

    /**
     *
     */
    public BStr getMediaAccessRights()
            throws ComException {
        BStr pbstrRights = new BStr();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrRights == null ? (Parameter) PTR_NULL : new Pointer(pbstrRights)
                }
        );
        return pbstrRights;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSettings2Impl(this);
    }
}
