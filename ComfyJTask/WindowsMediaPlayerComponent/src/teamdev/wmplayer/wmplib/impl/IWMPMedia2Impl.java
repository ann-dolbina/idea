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
 * Represents COM interface IWMPMedia2.
 */
public class IWMPMedia2Impl extends IWMPMediaImpl
        implements IWMPMedia2 {
    public static final String INTERFACE_IDENTIFIER = IWMPMedia2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMedia2Impl() {
    }

    protected IWMPMedia2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMedia2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMedia2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMedia2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns an error item pointer for a media specific error
     */
    public IWMPErrorItem getError()
            throws ComException {
        IWMPErrorItemImpl ppIWMPErrorItem = new IWMPErrorItemImpl();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppIWMPErrorItem == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppIWMPErrorItem)
                }
        );
        return ppIWMPErrorItem;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMedia2Impl(this);
    }
}
