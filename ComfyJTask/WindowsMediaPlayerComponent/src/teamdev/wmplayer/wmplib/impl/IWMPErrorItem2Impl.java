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
 * Represents COM interface IWMPErrorItem2.
 */
public class IWMPErrorItem2Impl extends IWMPErrorItemImpl
        implements IWMPErrorItem2 {
    public static final String INTERFACE_IDENTIFIER = IWMPErrorItem2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPErrorItem2Impl() {
    }

    protected IWMPErrorItem2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPErrorItem2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPErrorItem2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPErrorItem2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns condition for the error
     */
    public Int32 getCondition()
            throws ComException {
        Int32 plCondition = new Int32();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCondition == null ? (Parameter) PTR_NULL : new Pointer(plCondition)
                }
        );
        return plCondition;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPErrorItem2Impl(this);
    }
}
