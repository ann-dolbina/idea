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
 * Represents COM interface IWMPDolbyDigitalSettingsCtrl.
 */
public class IWMPDolbyDigitalSettingsCtrlImpl extends IDispatchImpl
        implements IWMPDolbyDigitalSettingsCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPDolbyDigitalSettingsCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDolbyDigitalSettingsCtrlImpl() {
    }

    protected IWMPDolbyDigitalSettingsCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDolbyDigitalSettingsCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDolbyDigitalSettingsCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDolbyDigitalSettingsCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void reset()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public Int32 getCurrentPreset()
            throws ComException {
        Int32 plCurrentPreset = new Int32();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCurrentPreset == null ? (Parameter) PTR_NULL : new Pointer(plCurrentPreset)
                }
        );
        return plCurrentPreset;
    }

    /**
     *
     */
    public void setCurrentPreset(
            Int32 /*[in]*/ plCurrentPreset)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCurrentPreset
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDolbyDigitalSettingsCtrlImpl(this);
    }
}
