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
 * Represents COM interface IWMPOfflineExternal.
 */
public class IWMPOfflineExternalImpl extends IWMPExternalImpl
        implements IWMPOfflineExternal {
    public static final String INTERFACE_IDENTIFIER = IWMPOfflineExternal.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPOfflineExternalImpl() {
    }

    protected IWMPOfflineExternalImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPOfflineExternalImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPOfflineExternalImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPOfflineExternalImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void forceOnline()
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPOfflineExternalImpl(this);
    }
}
