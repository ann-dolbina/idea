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
 * Represents COM interface IBattery.
 */
public class IBatteryImpl extends IDispatchImpl
        implements IBattery {
    public static final String INTERFACE_IDENTIFIER = IBattery.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IBatteryImpl() {
    }

    protected IBatteryImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IBatteryImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IBatteryImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IBatteryImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public Int32 getPresetCount()
            throws ComException {
        Int32 pVal = new Int32();
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
    public IDispatch getPreset(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        IDispatchImpl ppDispatch = new IDispatchImpl();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        ppDispatch == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDispatch)
                }
        );
        return ppDispatch;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IBatteryImpl(this);
    }
}
