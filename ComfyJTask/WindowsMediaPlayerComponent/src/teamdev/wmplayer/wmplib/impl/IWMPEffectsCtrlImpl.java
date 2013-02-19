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
 * Represents COM interface IWMPEffectsCtrl.
 */
public class IWMPEffectsCtrlImpl extends IDispatchImpl
        implements IWMPEffectsCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPEffectsCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEffectsCtrlImpl() {
    }

    protected IWMPEffectsCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEffectsCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEffectsCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEffectsCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method next
     */
    public void next()
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method previous
     */
    public void previous()
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method settings
     */
    public void settings()
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method nextEffect
     */
    public void nextEffect()
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method previousEffect
     */
    public void previousEffect()
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method nextPreset
     */
    public void nextPreset()
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method previousPreset
     */
    public void previousPreset()
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property windowed
     */
    public VariantBool getWindowed()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property windowed
     */
    public void setWindowed(
            VariantBool /*[in]*/ pVal)
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
     * property allowAll
     */
    public VariantBool getAllowAll()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property allowAll
     */
    public void setAllowAll(
            VariantBool /*[in]*/ pVal)
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
     * property currentEffectType
     */
    public void setCurrentEffectType(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property currentEffectType
     */
    public BStr getCurrentEffectType()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property currentEffectTitle
     */
    public BStr getCurrentEffectTitle()
            throws ComException {
        BStr pVal = new BStr();
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
     * property currentEffect
     */
    public IDispatch getCurrentEffect()
            throws ComException {
        IDispatchImpl p = new IDispatchImpl();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : new Pointer((Parameter) p)
                }
        );
        return p;
    }

    /**
     * property currentEffect
     */
    public void setCurrentEffect(
            IDispatch /*[in]*/ p)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        p == null ? (Parameter) PTR_NULL : (Parameter) p
                }
        );
    }

    /**
     * property currentPreset
     */
    public Int32 getCurrentPreset()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property currentPreset
     */
    public void setCurrentPreset(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property currentPresetTitle
     */
    public BStr getCurrentPresetTitle()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property currentEffectPresetCount
     */
    public Int32 getCurrentEffectPresetCount()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property fullScreen
     */
    public VariantBool getFullScreen()
            throws ComException {
        VariantBool pbFullScreen = new VariantBool();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen == null ? (Parameter) PTR_NULL : new Pointer(pbFullScreen)
                }
        );
        return pbFullScreen;
    }

    /**
     * property fullScreen
     */
    public void setFullScreen(
            VariantBool /*[in]*/ pbFullScreen)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen
                }
        );
    }

    /**
     * property canGoFullScreen
     */
    public VariantBool getEffectCanGoFullScreen()
            throws ComException {
        VariantBool pbFullScreen = new VariantBool();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen == null ? (Parameter) PTR_NULL : new Pointer(pbFullScreen)
                }
        );
        return pbFullScreen;
    }

    /**
     * property canGoFullScreen
     */
    public VariantBool getEffectHasPropertyPage()
            throws ComException {
        VariantBool pbPropertyPage = new VariantBool();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbPropertyPage == null ? (Parameter) PTR_NULL : new Pointer(pbPropertyPage)
                }
        );
        return pbPropertyPage;
    }

    /**
     * property effectCount
     */
    public Int32 getEffectCount()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property effectTitle(index)
     */
    public BStr getEffectTitle(
            Int32 /*[in]*/ index)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        index,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property effectType(index)
     */
    public BStr getEffectType(
            Int32 /*[in]*/ index)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        index,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEffectsCtrlImpl(this);
    }
}
