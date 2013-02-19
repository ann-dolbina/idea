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
 * Represents COM interface IWMPBaseExternal.
 */
public class IWMPBaseExternalImpl extends IWMPExternalImpl
        implements IWMPBaseExternal {
    public static final String INTERFACE_IDENTIFIER = IWMPBaseExternal.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPBaseExternalImpl() {
    }

    protected IWMPBaseExternalImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPBaseExternalImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPBaseExternalImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPBaseExternalImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPBaseExternalImpl(this);
    }
}
