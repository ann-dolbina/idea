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
 * Represents COM interface IWMPEditCtrl.
 */
public class IWMPEditCtrlImpl extends IDispatchImpl
        implements IWMPEditCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPEditCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPEditCtrlImpl() {
    }

    protected IWMPEditCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPEditCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPEditCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPEditCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method getLine
     */
    public BStr getLine(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method getSelectionStart
     */
    public Int32 getSelectionStart()
            throws ComException {
        Int32 pnStart = new Int32();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pnStart == null ? (Parameter) PTR_NULL : new Pointer(pnStart)
                }
        );
        return pnStart;
    }

    /**
     * method getSelectionEnd
     */
    public Int32 getSelectionEnd()
            throws ComException {
        Int32 pnEnd = new Int32();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pnEnd == null ? (Parameter) PTR_NULL : new Pointer(pnEnd)
                }
        );
        return pnEnd;
    }

    /**
     * method setSelection
     */
    public void setSelection(
            Int32 /*[in]*/ nStart,
            Int32 /*[in]*/ nEnd)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStart,
                        nEnd
                }
        );
    }

    /**
     * method replaceSelection
     */
    public void replaceSelection(
            BStr /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newVal == null ? (Parameter) PTR_NULL : newVal
                }
        );
    }

    /**
     * method getLineIndex
     */
    public Int32 getLineIndex(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        Int32 pnPosition = new Int32();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        pnPosition == null ? (Parameter) PTR_NULL : new Pointer(pnPosition)
                }
        );
        return pnPosition;
    }

    /**
     * method getLineFromChar
     */
    public Int32 getLineFromChar(
            Int32 /*[in]*/ nPosition)
            throws ComException {
        Int32 pnLine = new Int32();
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nPosition,
                        pnLine == null ? (Parameter) PTR_NULL : new Pointer(pnLine)
                }
        );
        return pnLine;
    }

    /**
     * property value
     */
    public BStr getValue()
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
     * property value
     */
    public void setValue(
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
     * property border
     */
    public VariantBool getBorder()
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
     * property border
     */
    public void setBorder(
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
     * property justification
     */
    public BStr getJustification()
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
     * property justification
     */
    public void setJustification(
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
     * property editStyle
     */
    public BStr getEditStyle()
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
     * property editStyle
     */
    public void setEditStyle(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
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
                15,
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
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property readOnly
     */
    public VariantBool getReadOnly()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     * property readOnly
     */
    public void setReadOnly(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
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
                19,
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
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property backgroundColor
     */
    public BStr getBackgroundColor()
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
     * property backgroundColor
     */
    public void setBackgroundColor(
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
     * property fontSize
     */
    public Int32 getFontSize()
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
     * property fontSize
     */
    public void setFontSize(
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
     * property fontStyle
     */
    public BStr getFontStyle()
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
     * property fontStyle
     */
    public void setFontStyle(
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
     * property fontFace
     */
    public BStr getFontFace()
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
     * property fontFace
     */
    public void setFontFace(
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
     * property textLimit
     */
    public Int32 getTextLimit()
            throws ComException {
        Int32 pVal = new Int32();
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
     * property textLimit
     */
    public void setTextLimit(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property lineCount
     */
    public Int32 getLineCount()
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

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPEditCtrlImpl(this);
    }
}
