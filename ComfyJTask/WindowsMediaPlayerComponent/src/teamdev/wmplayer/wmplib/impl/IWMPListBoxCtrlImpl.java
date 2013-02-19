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
 * Represents COM interface IWMPListBoxCtrl.
 */
public class IWMPListBoxCtrlImpl extends IDispatchImpl
        implements IWMPListBoxCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPListBoxCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPListBoxCtrlImpl() {
    }

    protected IWMPListBoxCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPListBoxCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPListBoxCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPListBoxCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method getItem
     */
    public BStr getItem(
            Int32 /*[in]*/ nPos)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nPos,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method insertItem
     */
    public void insertItem(
            Int32 /*[in]*/ nPos,
            BStr /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nPos,
                        newVal == null ? (Parameter) PTR_NULL : newVal
                }
        );
    }

    /**
     * method appendItem
     */
    public void appendItem(
            BStr /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newVal == null ? (Parameter) PTR_NULL : newVal
                }
        );
    }

    /**
     * method replaceItem
     */
    public void replaceItem(
            Int32 /*[in]*/ nPos,
            BStr /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nPos,
                        newVal == null ? (Parameter) PTR_NULL : newVal
                }
        );
    }

    /**
     * method deleteItem
     */
    public void deleteItem(
            Int32 /*[in]*/ nPos)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nPos
                }
        );
    }

    /**
     * method deleteAll
     */
    public void deleteAll()
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method findItem
     */
    public Int32 findItem(
            Int32 /*[in]*/ nStartIndex,
            BStr /*[in]*/ newVal)
            throws ComException {
        Int32 pnPos = new Int32();
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStartIndex,
                        newVal == null ? (Parameter) PTR_NULL : newVal,
                        pnPos == null ? (Parameter) PTR_NULL : new Pointer(pnPos)
                }
        );
        return pnPos;
    }

    /**
     * method getNextSelectedItem
     */
    public Int32 getNextSelectedItem(
            Int32 /*[in]*/ nStartIndex)
            throws ComException {
        Int32 pnSelected = new Int32();
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStartIndex,
                        pnSelected == null ? (Parameter) PTR_NULL : new Pointer(pnSelected)
                }
        );
        return pnSelected;
    }

    /**
     * method setSelectedState
     */
    public void setSelectedState(
            Int32 /*[in]*/ nPos,
            VariantBool /*[in]*/ vbSelected)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nPos,
                        vbSelected
                }
        );
    }

    /**
     * method show
     */
    public void show()
            throws ComException {
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method dismiss
     */
    public void dismiss()
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public Int32 getSelectedItem()
            throws ComException {
        Int32 pnPos = new Int32();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pnPos == null ? (Parameter) PTR_NULL : new Pointer(pnPos)
                }
        );
        return pnPos;
    }

    /**
     *
     */
    public void setSelectedItem(
            Int32 /*[in]*/ pnPos)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pnPos
                }
        );
    }

    /**
     *
     */
    public VariantBool getSorted()
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
     *
     */
    public void setSorted(
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
     *
     */
    public VariantBool getMultiselect()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
    public void setMultiselect(
            VariantBool /*[in]*/ pVal)
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
     *
     */
    public VariantBool getReadOnly()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     *
     */
    public void setReadOnly(
            VariantBool /*[in]*/ pVal)
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
     *
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
     *
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
     *
     */
    public BStr getBackgroundColor()
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
     *
     */
    public void setBackgroundColor(
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
     *
     */
    public Int32 getFontSize()
            throws ComException {
        Int32 pVal = new Int32();
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
     *
     */
    public void setFontSize(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public BStr getFontStyle()
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
     *
     */
    public void setFontStyle(
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
     *
     */
    public BStr getFontFace()
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
     *
     */
    public void setFontFace(
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
     *
     */
    public Int32 getItemCount()
            throws ComException {
        Int32 pVal = new Int32();
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
     *
     */
    public Int32 getFirstVisibleItem()
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
     *
     */
    public void setFirstVisibleItem(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public void setPopUp(
            VariantBool /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1
                }
        );
    }

    /**
     *
     */
    public Int32 getFocusItem()
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
     *
     */
    public void setFocusItem(
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
     *
     */
    public VariantBool getBorder()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     *
     */
    public void setBorder(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                32,
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
        return new IWMPListBoxCtrlImpl(this);
    }
}
