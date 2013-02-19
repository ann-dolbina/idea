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
 * Represents COM interface IWMPDiscoExternal.
 */
public class IWMPDiscoExternalImpl extends IWMPSubscriptionServiceExternalImpl
        implements IWMPDiscoExternal {
    public static final String INTERFACE_IDENTIFIER = IWMPDiscoExternal.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDiscoExternalImpl() {
    }

    protected IWMPDiscoExternalImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDiscoExternalImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDiscoExternalImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDiscoExternalImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void attemptLogin()
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void changeView(
            BStr /*[in]*/ bstrLibraryLocationType,
            BStr /*[in]*/ bstrLibraryLocationID,
            BStr /*[in]*/ bstrFilter,
            BStr /*[in]*/ bstrViewParams)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrLibraryLocationType == null ? (Parameter) PTR_NULL : bstrLibraryLocationType,
                        bstrLibraryLocationID == null ? (Parameter) PTR_NULL : bstrLibraryLocationID,
                        bstrFilter == null ? (Parameter) PTR_NULL : bstrFilter,
                        bstrViewParams == null ? (Parameter) PTR_NULL : bstrViewParams
                }
        );
    }

    /**
     *
     */
    public void changeViewOnlineList(
            BStr /*[in]*/ bstrLibraryLocationType,
            BStr /*[in]*/ bstrLibraryLocationID,
            BStr /*[in]*/ bstrParams,
            BStr /*[in]*/ bstrFriendlyName,
            BStr /*[in]*/ bstrListType,
            BStr /*[in]*/ bstrViewMode)
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrLibraryLocationType == null ? (Parameter) PTR_NULL : bstrLibraryLocationType,
                        bstrLibraryLocationID == null ? (Parameter) PTR_NULL : bstrLibraryLocationID,
                        bstrParams == null ? (Parameter) PTR_NULL : bstrParams,
                        bstrFriendlyName == null ? (Parameter) PTR_NULL : bstrFriendlyName,
                        bstrListType == null ? (Parameter) PTR_NULL : bstrListType,
                        bstrViewMode == null ? (Parameter) PTR_NULL : bstrViewMode
                }
        );
    }

    /**
     *
     */
    public void cancelNavigate()
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
    public void showPopup(
            Int32 /*[in]*/ lPopupIndex,
            BStr /*[in]*/ bstrParameters)
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lPopupIndex,
                        bstrParameters == null ? (Parameter) PTR_NULL : bstrParameters
                }
        );
    }

    /**
     *
     */
    public void addToBasket(
            BStr /*[in]*/ bstrViewType,
            BStr /*[in]*/ bstrViewIDs)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrViewType == null ? (Parameter) PTR_NULL : bstrViewType,
                        bstrViewIDs == null ? (Parameter) PTR_NULL : bstrViewIDs
                }
        );
    }

    /**
     *
     */
    public void play(
            BStr /*[in]*/ bstrLibraryLocationType,
            BStr /*[in]*/ bstrLibraryLocationIDs)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrLibraryLocationType == null ? (Parameter) PTR_NULL : bstrLibraryLocationType,
                        bstrLibraryLocationIDs == null ? (Parameter) PTR_NULL : bstrLibraryLocationIDs
                }
        );
    }

    /**
     *
     */
    public void download(
            BStr /*[in]*/ bstrViewType,
            BStr /*[in]*/ bstrViewIDs)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrViewType == null ? (Parameter) PTR_NULL : bstrViewType,
                        bstrViewIDs == null ? (Parameter) PTR_NULL : bstrViewIDs
                }
        );
    }

    /**
     *
     */
    public void buy(
            BStr /*[in]*/ bstrViewType,
            BStr /*[in]*/ bstrViewIDs)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrViewType == null ? (Parameter) PTR_NULL : bstrViewType,
                        bstrViewIDs == null ? (Parameter) PTR_NULL : bstrViewIDs
                }
        );
    }

    /**
     *
     */
    public void saveCurrentViewToLibrary(
            BStr /*[in]*/ bstrFriendlyListType,
            VariantBool /*[in]*/ fDynamic)
            throws ComException {
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrFriendlyListType == null ? (Parameter) PTR_NULL : bstrFriendlyListType,
                        fDynamic
                }
        );
    }

    /**
     *
     */
    public void authenticate(
            Int32 /*[in]*/ lAuthenticationIndex)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lAuthenticationIndex
                }
        );
    }

    /**
     *
     */
    public void sendMessage(
            BStr /*[in]*/ bstrMsg,
            BStr /*[in]*/ bstrParam)
            throws ComException {
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrMsg == null ? (Parameter) PTR_NULL : bstrMsg,
                        bstrParam == null ? (Parameter) PTR_NULL : bstrParam
                }
        );
    }

    /**
     *
     */
    public void setOnLoginChange(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    /**
     *
     */
    public VariantBool getUserLoggedIn()
            throws ComException {
        VariantBool pvbLoggedIn = new VariantBool();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pvbLoggedIn == null ? (Parameter) PTR_NULL : new Pointer(pvbLoggedIn)
                }
        );
        return pvbLoggedIn;
    }

    /**
     *
     */
    public BStr getAccountType()
            throws ComException {
        BStr pbstrAcctType = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrAcctType == null ? (Parameter) PTR_NULL : new Pointer(pbstrAcctType)
                }
        );
        return pbstrAcctType;
    }

    /**
     *
     */
    public void setOnViewChange(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    /**
     *
     */
    public BStr getLibraryLocationType()
            throws ComException {
        BStr pbstrLibraryLocationType = new BStr();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLibraryLocationType == null ? (Parameter) PTR_NULL : new Pointer(pbstrLibraryLocationType)
                }
        );
        return pbstrLibraryLocationType;
    }

    /**
     *
     */
    public BStr getLibraryLocationID()
            throws ComException {
        BStr pbstrLibraryLocationID = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLibraryLocationID == null ? (Parameter) PTR_NULL : new Pointer(pbstrLibraryLocationID)
                }
        );
        return pbstrLibraryLocationID;
    }

    /**
     *
     */
    public BStr getSelectedItemType()
            throws ComException {
        BStr pbstrSelectedItemType = new BStr();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSelectedItemType == null ? (Parameter) PTR_NULL : new Pointer(pbstrSelectedItemType)
                }
        );
        return pbstrSelectedItemType;
    }

    /**
     *
     */
    public BStr getSelectedItemID()
            throws ComException {
        BStr pbstrLibraryLocationID = new BStr();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLibraryLocationID == null ? (Parameter) PTR_NULL : new Pointer(pbstrLibraryLocationID)
                }
        );
        return pbstrLibraryLocationID;
    }

    /**
     *
     */
    public BStr getFilter()
            throws ComException {
        BStr pbstrFilter = new BStr();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFilter == null ? (Parameter) PTR_NULL : new Pointer(pbstrFilter)
                }
        );
        return pbstrFilter;
    }

    /**
     *
     */
    public BStr getTask()
            throws ComException {
        BStr pbstrTask = new BStr();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrTask == null ? (Parameter) PTR_NULL : new Pointer(pbstrTask)
                }
        );
        return pbstrTask;
    }

    /**
     *
     */
    public BStr getViewParameters()
            throws ComException {
        BStr pbstrViewParameters = new BStr();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrViewParameters == null ? (Parameter) PTR_NULL : new Pointer(pbstrViewParameters)
                }
        );
        return pbstrViewParameters;
    }

    /**
     *
     */
    public BStr getBasketTitle()
            throws ComException {
        BStr bstrParams = new BStr();
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrParams == null ? (Parameter) PTR_NULL : new Pointer(bstrParams)
                }
        );
        return bstrParams;
    }

    /**
     *
     */
    public void setOnSendMessageComplete(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    /**
     *
     */
    public void setIgnoreIEHistory(
            VariantBool /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1
                }
        );
    }

    /**
     *
     */
    public VariantBool getPluginRunning()
            throws ComException {
        VariantBool pfPluginRunning = new VariantBool();
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfPluginRunning == null ? (Parameter) PTR_NULL : new Pointer(pfPluginRunning)
                }
        );
        return pfPluginRunning;
    }

    /**
     *
     */
    public VariantBool getTemplateBeingDisplayedInLocalLibrary()
            throws ComException {
        VariantBool pfTemplateDisplayed = new VariantBool();
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfTemplateDisplayed == null ? (Parameter) PTR_NULL : new Pointer(pfTemplateDisplayed)
                }
        );
        return pfTemplateDisplayed;
    }

    /**
     *
     */
    public void setOnChangeViewError(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    /**
     *
     */
    public void setOnChangeViewOnlineListError(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : (Parameter) param1
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDiscoExternalImpl(this);
    }
}
