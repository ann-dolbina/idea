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
 * Represents COM interface IWMPAutoMenuCtrl.
 */
public class IWMPAutoMenuCtrlImpl extends IDispatchImpl
        implements IWMPAutoMenuCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPAutoMenuCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPAutoMenuCtrlImpl() {
    }

    protected IWMPAutoMenuCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPAutoMenuCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPAutoMenuCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPAutoMenuCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method show
     */
    public void show(
            BStr /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newVal == null ? (Parameter) PTR_NULL : newVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPAutoMenuCtrlImpl(this);
    }
}
