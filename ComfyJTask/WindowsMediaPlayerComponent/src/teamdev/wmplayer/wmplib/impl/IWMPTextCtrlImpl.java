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
 * Represents COM interface IWMPTextCtrl.
 */
public class IWMPTextCtrlImpl extends IDispatchImpl
        implements IWMPTextCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPTextCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPTextCtrlImpl() {
    }

    protected IWMPTextCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPTextCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPTextCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPTextCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * property backgroundColor
     */
    public BStr getBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
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
     * property backgroundColor
     */
    public void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property fontFace
     */
    public BStr getFontFace()
            throws ComException {
        BStr pVal = new BStr();
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
     * property fontFace
     */
    public void setFontFace(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property fontStyle
     */
    public BStr getFontStyle()
            throws ComException {
        BStr pVal = new BStr();
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
     * property fontStyle
     */
    public void setFontStyle(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property fontSize
     */
    public Int32 getFontSize()
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
     * property fontSize
     */
    public void setFontSize(
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

    /**
     * property foregroundColor
     */
    public BStr getForegroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property foregroundColor
     */
    public void setForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property hoverBackgroundColor
     */
    public BStr getHoverBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property hoverBackgroundColor
     */
    public void setHoverBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property hoverForegroundColor
     */
    public BStr getHoverForegroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property hoverForegroundColor
     */
    public void setHoverForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property hoverFontStyle
     */
    public BStr getHoverFontStyle()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property hoverFontStyle
     */
    public void setHoverFontStyle(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property value
     */
    public BStr getValue()
            throws ComException {
        BStr pVal = new BStr();
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
     * property value
     */
    public void setValue(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property toolTip
     */
    public BStr getToolTip()
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
     * property toolTip
     */
    public void setToolTip(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property disabledFontStyle
     */
    public BStr getDisabledFontStyle()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property disabledFontStyle
     */
    public void setDisabledFontStyle(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property disabledForegroundColor
     */
    public BStr getDisabledForegroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property disabledForegroundColor
     */
    public void setDisabledForegroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property disabledBackgroundColor
     */
    public BStr getDisabledBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
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
     * property disabledBackgroundColor
     */
    public void setDisabledBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property fontSmoothing
     */
    public VariantBool getFontSmoothing()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property fontSmoothing
     */
    public void setFontSmoothing(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property justification
     */
    public BStr getJustification()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property justification
     */
    public void setJustification(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property wordWrap
     */
    public VariantBool getWordWrap()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property wordWrap
     */
    public void setWordWrap(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property cursor
     */
    public BStr getCursor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property cursor
     */
    public void setCursor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property scrolling
     */
    public VariantBool getScrolling()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property scrolling
     */
    public void setScrolling(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property scrollingDirection
     */
    public BStr getScrollingDirection()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property scrollingDirection
     */
    public void setScrollingDirection(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property scrollingDelay
     */
    public Int getScrollingDelay()
            throws ComException {
        Int pVal = new Int();
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property scrollingDelay
     */
    public void setScrollingDelay(
            Int /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property scrollingAmount
     */
    public Int getScrollingAmount()
            throws ComException {
        Int pVal = new Int();
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property scrollingAmount
     */
    public void setScrollingAmount(
            Int /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property textWidth
     */
    public Int getTextWidth()
            throws ComException {
        Int pVal = new Int();
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property onGlass
     */
    public VariantBool getOnGlass()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property onGlass
     */
    public void setOnGlass(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property disableGlassBlurBackground
     */
    public VariantBool getDisableGlassBlurBackground()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property disableGlassBlurBackground
     */
    public void setDisableGlassBlurBackground(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                53,
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
        return new IWMPTextCtrlImpl(this);
    }
}
