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
 * Represents COM interface IWMPVideoCtrl.
 */
public class IWMPVideoCtrlImpl extends IDispatchImpl
        implements IWMPVideoCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPVideoCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPVideoCtrlImpl() {
    }

    protected IWMPVideoCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPVideoCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPVideoCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPVideoCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void setWindowless(
            VariantBool /*[in]*/ pbClipped)
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbClipped
                }
        );
    }

    /**
     *
     */
    public VariantBool getWindowless()
            throws ComException {
        VariantBool pbClipped = new VariantBool();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbClipped == null ? (Parameter) PTR_NULL : new Pointer(pbClipped)
                }
        );
        return pbClipped;
    }

    /**
     *
     */
    public void setCursor(
            BStr /*[in]*/ pbstrCursor)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCursor == null ? (Parameter) PTR_NULL : pbstrCursor
                }
        );
    }

    /**
     *
     */
    public BStr getCursor()
            throws ComException {
        BStr pbstrCursor = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCursor == null ? (Parameter) PTR_NULL : new Pointer(pbstrCursor)
                }
        );
        return pbstrCursor;
    }

    /**
     *
     */
    public void setBackgroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     *
     */
    public BStr getBackgroundColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     *
     */
    public void setMaintainAspectRatio(
            VariantBool /*[in]*/ pbMaintainAspectRatio)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbMaintainAspectRatio
                }
        );
    }

    /**
     *
     */
    public VariantBool getMaintainAspectRatio()
            throws ComException {
        VariantBool pbMaintainAspectRatio = new VariantBool();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbMaintainAspectRatio == null ? (Parameter) PTR_NULL : new Pointer(pbMaintainAspectRatio)
                }
        );
        return pbMaintainAspectRatio;
    }

    /**
     *
     */
    public void setToolTip(
            BStr /*[in]*/ bstrToolTip)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrToolTip == null ? (Parameter) PTR_NULL : bstrToolTip
                }
        );
    }

    /**
     *
     */
    public BStr getToolTip()
            throws ComException {
        BStr bstrToolTip = new BStr();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrToolTip == null ? (Parameter) PTR_NULL : new Pointer(bstrToolTip)
                }
        );
        return bstrToolTip;
    }

    /**
     *
     */
    public VariantBool getFullScreen()
            throws ComException {
        VariantBool pbFullScreen = new VariantBool();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen == null ? (Parameter) PTR_NULL : new Pointer(pbFullScreen)
                }
        );
        return pbFullScreen;
    }

    /**
     *
     */
    public void setFullScreen(
            VariantBool /*[in]*/ pbFullScreen)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen
                }
        );
    }

    /**
     *
     */
    public void setShrinkToFit(
            VariantBool /*[in]*/ pbShrinkToFit)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbShrinkToFit
                }
        );
    }

    /**
     *
     */
    public VariantBool getShrinkToFit()
            throws ComException {
        VariantBool pbShrinkToFit = new VariantBool();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbShrinkToFit == null ? (Parameter) PTR_NULL : new Pointer(pbShrinkToFit)
                }
        );
        return pbShrinkToFit;
    }

    /**
     *
     */
    public void setStretchToFit(
            VariantBool /*[in]*/ pbStretchToFit)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbStretchToFit
                }
        );
    }

    /**
     *
     */
    public VariantBool getStretchToFit()
            throws ComException {
        VariantBool pbStretchToFit = new VariantBool();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbStretchToFit == null ? (Parameter) PTR_NULL : new Pointer(pbStretchToFit)
                }
        );
        return pbStretchToFit;
    }

    /**
     *
     */
    public void setZoom(
            Int32 /*[in]*/ pzoom)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pzoom
                }
        );
    }

    /**
     *
     */
    public Int32 getZoom()
            throws ComException {
        Int32 pzoom = new Int32();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pzoom == null ? (Parameter) PTR_NULL : new Pointer(pzoom)
                }
        );
        return pzoom;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPVideoCtrlImpl(this);
    }
}
