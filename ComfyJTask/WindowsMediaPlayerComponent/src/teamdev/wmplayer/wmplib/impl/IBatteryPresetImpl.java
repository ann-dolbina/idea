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
 * Represents COM interface IBatteryPreset.
 */
public class IBatteryPresetImpl extends IDispatchImpl
        implements IBatteryPreset {
    public static final String INTERFACE_IDENTIFIER = IBatteryPreset.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IBatteryPresetImpl() {
    }

    protected IBatteryPresetImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IBatteryPresetImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IBatteryPresetImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IBatteryPresetImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
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
    public void setTitle(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IBatteryPresetImpl(this);
    }
}
