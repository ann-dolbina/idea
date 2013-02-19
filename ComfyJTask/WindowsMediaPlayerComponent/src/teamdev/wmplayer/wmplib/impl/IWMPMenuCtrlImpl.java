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
 * Represents COM interface IWMPMenuCtrl.
 */
public class IWMPMenuCtrlImpl extends IDispatchImpl
        implements IWMPMenuCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPMenuCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMenuCtrlImpl() {
    }

    protected IWMPMenuCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMenuCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMenuCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMenuCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method deleteAllItems
     */
    public void deleteAllItems()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method appendItem
     */
    public void appendItem(
            Int32 /*[in]*/ nID,
            BStr /*[in]*/ bstrItem)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nID,
                        bstrItem == null ? (Parameter) PTR_NULL : bstrItem
                }
        );
    }

    /**
     * method appendSeparator
     */
    public void appendSeparator()
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property enableItem
     */
    public void enableItem(
            Int32 /*[in]*/ nID,
            VariantBool /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nID,
                        newVal
                }
        );
    }

    /**
     * property checkItem
     */
    public void checkItem(
            Int32 /*[in]*/ nID,
            VariantBool /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nID,
                        newVal
                }
        );
    }

    /**
     * property checkRadioItem
     */
    public void checkRadioItem(
            Int32 /*[in]*/ nID,
            VariantBool /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nID,
                        newVal
                }
        );
    }

    /**
     * method show
     */
    public Int32 show()
            throws ComException {
        Int32 pnID = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pnID == null ? (Parameter) PTR_NULL : new Pointer(pnID)
                }
        );
        return pnID;
    }

    /**
     * method showEx
     */
    public void showEx(
            Int32 /*[in]*/ nID)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nID
                }
        );
    }

    /**
     * property showFlags
     */
    public Int32 getShowFlags()
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
     * property showFlags
     */
    public void setShowFlags(
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
        return new IWMPMenuCtrlImpl(this);
    }
}
