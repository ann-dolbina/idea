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
 * Represents COM interface IWMPWindow.
 */
public class IWMPWindowImpl extends IDispatchImpl
        implements IWMPWindow {
    public static final String INTERFACE_IDENTIFIER = IWMPWindow.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPWindowImpl() {
    }

    protected IWMPWindowImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPWindowImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPWindowImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPWindowImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method setWindowPos
     */
    public void setWindowPos(
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y,
            Int32 /*[in]*/ height,
            Int32 /*[in]*/ width)
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        x,
                        y,
                        height,
                        width
                }
        );
    }

    /**
     *
     */
    public void openViewAlwaysOnTop(
            BStr /*[in]*/ bstrViewID)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrViewID == null ? (Parameter) PTR_NULL : bstrViewID
                }
        );
    }

    /**
     *
     */
    public Int32 getFrameRate()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                8,
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
    public void setFrameRate(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getMouseX()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                10,
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
    public Int32 getMouseY()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                11,
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
    public void setOnsizing(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPWindowImpl(this);
    }
}
