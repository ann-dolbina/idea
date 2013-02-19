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
 * Represents COM interface ITaskCntrCtrl.
 */
public class ITaskCntrCtrlImpl extends IDispatchImpl
        implements ITaskCntrCtrl {
    public static final String INTERFACE_IDENTIFIER = ITaskCntrCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public ITaskCntrCtrlImpl() {
    }

    protected ITaskCntrCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public ITaskCntrCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public ITaskCntrCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public ITaskCntrCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void activate()
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public IUnknown getCurrentContainer()
            throws ComException {
        IUnknownImpl ppUnk = new IUnknownImpl();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppUnk == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppUnk)
                }
        );
        return ppUnk;
    }

    /**
     *
     */
    public void setCurrentContainer(
            IUnknown /*[in]*/ ppUnk)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppUnk == null ? (Parameter) PTR_NULL : (Parameter) ppUnk
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new ITaskCntrCtrlImpl(this);
    }
}
