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
 * Represents COM interface IWMPEventObject.
 */
public class IWMPEventObjectImpl extends IDispatchImpl
        implements IWMPEventObject {
    public static final String INTERFACE_IDENTIFIER = IWMPEventObject.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEventObjectImpl() {
    }

    protected IWMPEventObjectImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEventObjectImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEventObjectImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEventObjectImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public IDispatch getSrcElement()
            throws ComException {
        IDispatchImpl p = new IDispatchImpl();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer((Parameter) p)
                }
        );
        return p;
    }

    /**
     *
     */
    public VariantBool getAltKey()
            throws ComException {
        VariantBool p = new VariantBool();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public VariantBool getCtrlKey()
            throws ComException {
        VariantBool p = new VariantBool();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public VariantBool getShiftKey()
            throws ComException {
        VariantBool p = new VariantBool();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public IDispatch getFromElement()
            throws ComException {
        IDispatchImpl p = new IDispatchImpl();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer((Parameter) p)
                }
        );
        return p;
    }

    /**
     *
     */
    public IDispatch getToElement()
            throws ComException {
        IDispatchImpl p = new IDispatchImpl();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer((Parameter) p)
                }
        );
        return p;
    }

    /**
     *
     */
    public void setKeyCode(
            Int32 /*[in]*/ p)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p
                }
        );
    }

    /**
     *
     */
    public Int32 getKeyCode()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getButton()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getX()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getY()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getClientX()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getClientY()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getOffsetX()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getOffsetY()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getScreenX()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getScreenY()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getScreenWidth()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public Int32 getScreenHeight()
            throws ComException {
        Int32 p = new Int32();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    /**
     *
     */
    public VariantBool getPenOrTouch()
            throws ComException {
        VariantBool p = new VariantBool();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer(p)
                }
        );
        return p;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEventObjectImpl(this);
    }
}
