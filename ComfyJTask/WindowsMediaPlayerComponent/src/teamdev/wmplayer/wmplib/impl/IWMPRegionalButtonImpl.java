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
 * Represents COM interface IWMPRegionalButton.
 */
public class IWMPRegionalButtonImpl extends IDispatchImpl
        implements IWMPRegionalButton {
    public static final String INTERFACE_IDENTIFIER = IWMPRegionalButton.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPRegionalButtonImpl() {
    }

    protected IWMPRegionalButtonImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPRegionalButtonImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPRegionalButtonImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPRegionalButtonImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method Click
     */
    public void click()
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property UpToolTip
     */
    public BStr getUpToolTip()
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
     * property UpToolTip
     */
    public void setUpToolTip(
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
     * property DownToolTip
     */
    public BStr getDownToolTip()
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
     * property DownToolTip
     */
    public void setDownToolTip(
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
     * property MappingColor
     */
    public BStr getMappingColor()
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
     * property MappingColor
     */
    public void setMappingColor(
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
     * property Enabled
     */
    public VariantBool getEnabled()
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
     * property Enabled
     */
    public void setEnabled(
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
     * property Sticky
     */
    public VariantBool getSticky()
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
     * property Sticky
     */
    public void setSticky(
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
     * property Down
     */
    public VariantBool getDown()
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
     * property Down
     */
    public void setDown(
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
     * property Index
     */
    public Int32 getIndex()
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
     * property TabStop
     */
    public VariantBool getTabStop()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property TabStop
     */
    public void setTabStop(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property Cursor
     */
    public BStr getCursor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property Cursor
     */
    public void setCursor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property AccName
     */
    public BStr getAccName()
            throws ComException {
        BStr pszName = new BStr();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszName == null ? (Parameter) PTR_NULL : new Pointer(pszName)
                }
        );
        return pszName;
    }

    /**
     * property AccName
     */
    public void setAccName(
            BStr /*[in]*/ pszName)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszName == null ? (Parameter) PTR_NULL : pszName
                }
        );
    }

    /**
     * property AccDescription
     */
    public BStr getAccDescription()
            throws ComException {
        BStr pszDescription = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszDescription == null ? (Parameter) PTR_NULL : new Pointer(pszDescription)
                }
        );
        return pszDescription;
    }

    /**
     * property AccDescription
     */
    public void setAccDescription(
            BStr /*[in]*/ pszDescription)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszDescription == null ? (Parameter) PTR_NULL : pszDescription
                }
        );
    }

    /**
     * property accKeyboardShortcut
     */
    public BStr getAccKeyboardShortcut()
            throws ComException {
        BStr pszShortcut = new BStr();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszShortcut == null ? (Parameter) PTR_NULL : new Pointer(pszShortcut)
                }
        );
        return pszShortcut;
    }

    /**
     * property accKeyboardShortcut
     */
    public void setAccKeyboardShortcut(
            BStr /*[in]*/ pszShortcut)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszShortcut == null ? (Parameter) PTR_NULL : pszShortcut
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPRegionalButtonImpl(this);
    }
}
