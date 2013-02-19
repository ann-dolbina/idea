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
 * Represents COM interface IWMPVideoSettingsCtrl.
 */
public class IWMPVideoSettingsCtrlImpl extends IDispatchImpl
        implements IWMPVideoSettingsCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPVideoSettingsCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPVideoSettingsCtrlImpl() {
    }

    protected IWMPVideoSettingsCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPVideoSettingsCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPVideoSettingsCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPVideoSettingsCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method reset
     */
    public void reset()
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property brightness
     */
    public Int32 getBrightness()
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
     * property brightness
     */
    public void setBrightness(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property contrast
     */
    public Int32 getContrast()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property contrast
     */
    public void setContrast(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property hue
     */
    public Int32 getHue()
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
     * property hue
     */
    public void setHue(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property saturation
     */
    public Int32 getSaturation()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property saturation
     */
    public void setSaturation(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPVideoSettingsCtrlImpl(this);
    }
}
