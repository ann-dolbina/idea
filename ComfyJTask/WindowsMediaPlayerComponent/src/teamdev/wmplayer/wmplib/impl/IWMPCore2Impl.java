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
 * Represents COM interface IWMPCore2.
 */
public class IWMPCore2Impl extends IWMPCoreImpl
        implements IWMPCore2 {
    public static final String INTERFACE_IDENTIFIER = IWMPCore2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCore2Impl() {
    }

    protected IWMPCore2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCore2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCore2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCore2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the DVD handler
     */
    public IWMPDVD getDvd()
            throws ComException {
        IWMPDVDImpl ppDVD = new IWMPDVDImpl();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppDVD == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppDVD)
                }
        );
        return ppDVD;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCore2Impl(this);
    }
}
