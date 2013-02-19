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
 * Represents COM interface IAppDispatch.
 */
public class IAppDispatchImpl extends IDispatchImpl
        implements IAppDispatch {
    public static final String INTERFACE_IDENTIFIER = IAppDispatch.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IAppDispatchImpl() {
    }

    protected IAppDispatchImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IAppDispatchImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IAppDispatchImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IAppDispatchImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void breadcrumbItemClick(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex
                }
        );
    }

    /**
     *
     */
    public void gotoSkinMode()
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void gotoPlayerMode()
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void gotoLibraryMode(
            Int32 /*[in]*/ lButton)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lButton
                }
        );
    }

    /**
     *
     */
    public void navigatePrevious()
            throws ComException {
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void navigateNext()
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void goFullScreen()
            throws ComException {
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void serviceLogin()
            throws ComException {
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void serviceLogout()
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void navigateToAddress(
            BStr /*[in]*/ address)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        address == null ? (Parameter) PTR_NULL : address
                }
        );
    }

    /**
     *
     */
    public void adjustLeft(
            Int32 /*[in]*/ nDistance)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nDistance
                }
        );
    }

    /**
     *
     */
    public void previous()
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void configurePlugins(
            Int32 /*[in]*/ nType)
            throws ComException {
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nType
                }
        );
    }

    /**
     * method getTimeString
     */
    public BStr getTimeString(
            DoubleFloat /*[in]*/ dTime)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        dTime,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public void setWindowPos(
            Int32 /*[in]*/ lTop,
            Int32 /*[in]*/ lLeft,
            Int32 /*[in]*/ lWidth,
            Int32 /*[in]*/ lHeight)
            throws ComException {
        invokeStandardVirtualMethod(
                62,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lTop,
                        lLeft,
                        lWidth,
                        lHeight
                }
        );
    }

    /**
     *
     */
    public void logData(
            BStr /*[in]*/ ID,
            BStr /*[in]*/ data)
            throws ComException {
        invokeStandardVirtualMethod(
                63,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ID == null ? (Parameter) PTR_NULL : ID,
                        data == null ? (Parameter) PTR_NULL : data
                }
        );
    }

    /**
     *
     */
    public void navigateNamespace(
            BStr /*[in]*/ address)
            throws ComException {
        invokeStandardVirtualMethod(
                65,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        address == null ? (Parameter) PTR_NULL : address
                }
        );
    }

    /**
     *
     */
    public VariantBool getTitlebarVisible()
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
     *
     */
    public void setTitlebarVisible(
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
     *
     */
    public VariantBool getTitlebarAutoHide()
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
    public void setTitlebarAutoHide(
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
    public BStr getCurrentTask()
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
     *
     */
    public void setCurrentTask(
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
     *
     */
    public Int32 getLibraryBasketMode()
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
     *
     */
    public void setLibraryBasketMode(
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
     *
     */
    public Int32 getLibraryBasketWidth()
            throws ComException {
        Int32 pVal = new Int32();
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
    public Int32 getBreadcrumbItemCount()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                16,
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
    public BStr getBreadcrumbItemName(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getBreadcrumbItemHasMenu(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     *
     */
    public VariantBool getSettingsVisible()
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
     *
     */
    public void setSettingsVisible(
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
     *
     */
    public VariantBool getPlaylistVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     *
     */
    public void setPlaylistVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public VariantBool getFullScreenEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                30,
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
    public VariantBool getServiceLoginVisible()
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
    public VariantBool getServiceLoginSignedIn()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                32,
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
    public Variant getServiceGetInfo(
            BStr /*[in]*/ bstrItem)
            throws ComException {
        Variant pValue = new Variant();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItem == null ? (Parameter) PTR_NULL : bstrItem,
                        pValue == null ? (Parameter) PTR_NULL : new Pointer(pValue)
                }
        );
        return pValue;
    }

    /**
     *
     */
    public VariantBool getNavigatePreviousEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                36,
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
    public VariantBool getNavigateNextEnabled()
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
     *
     */
    public VariantBool getGlassEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     *
     */
    public VariantBool getInVistaPlus()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                40,
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
    public VariantBool getTaskbarVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                42,
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
    public void setTaskbarVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getDPI()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                44,
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
    public VariantBool getPreviousEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     *
     */
    public VariantBool getPlayLibraryItemEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                46,
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
    public VariantBool getTitlebarCurrentlyVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                48,
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
    public VariantBool getMenubarCurrentlyVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
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
     *
     */
    public VariantBool getBgPluginRunning()
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
     *
     */
    public VariantBool getMaximized()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                53,
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
    public Int32 getTop()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                54,
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
    public void setTop(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getLeft()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                56,
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
    public void setLeft(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                58,
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
    public void setWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public Int32 getHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                60,
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
    public void setHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                61,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     *
     */
    public BStr getPowerPersonality()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                64,
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
    public BStr getExclusiveService()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                66,
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
    public void setWindowText(
            BStr /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                67,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : param1
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IAppDispatchImpl(this);
    }
}
