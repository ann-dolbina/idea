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
 * Represents COM interface IWMPLayoutView.
 */
public class IWMPLayoutViewImpl extends IWMPLayoutSubViewImpl
        implements IWMPLayoutView {
    public static final String INTERFACE_IDENTIFIER = IWMPLayoutView.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLayoutViewImpl() {
    }

    protected IWMPLayoutViewImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLayoutViewImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLayoutViewImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLayoutViewImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method close
     */
    public void close()
            throws ComException {
        invokeStandardVirtualMethod(
                91,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method minimize
     */
    public void minimize()
            throws ComException {
        invokeStandardVirtualMethod(
                92,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method maximize
     */
    public void maximize()
            throws ComException {
        invokeStandardVirtualMethod(
                93,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method restore
     */
    public void restore()
            throws ComException {
        invokeStandardVirtualMethod(
                94,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method size
     */
    public void size(
            BStr /*[in]*/ bstrDirection)
            throws ComException {
        invokeStandardVirtualMethod(
                95,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrDirection == null ? (Parameter) PTR_NULL : bstrDirection
                }
        );
    }

    /**
     * method returnToMediaCenter
     */
    public void returnToMediaCenter()
            throws ComException {
        invokeStandardVirtualMethod(
                96,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method updateWindow
     */
    public void updateWindow()
            throws ComException {
        invokeStandardVirtualMethod(
                97,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property title
     */
    public BStr getTitle()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                73,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property title
     */
    public void setTitle(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                74,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property category
     */
    public BStr getCategory()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                75,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property category
     */
    public void setCategory(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                76,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property focusObjectID
     */
    public BStr getFocusObjectID()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                77,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property focusObjectID
     */
    public void setFocusObjectID(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                78,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property titleBar
     */
    public VariantBool getTitleBar()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                79,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property resizable
     */
    public VariantBool getResizable()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                80,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property timerInterval
     */
    public Int32 getTimerInterval()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                81,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property timerInterval
     */
    public void setTimerInterval(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                82,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property minWidth
     */
    public Int32 getMinWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                83,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property minWidth
     */
    public void setMinWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                84,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property maxWidth
     */
    public Int32 getMaxWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                85,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property maxWidth
     */
    public void setMaxWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                86,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property minHeight
     */
    public Int32 getMinHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                87,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property minHeight
     */
    public void setMinHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                88,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property maxHeight
     */
    public Int32 getMaxHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                89,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property maxHeight
     */
    public void setMaxHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                90,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getMaximized()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                98,
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
    public VariantBool getMinimized()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                99,
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
        return new IWMPLayoutViewImpl(this);
    }
}
