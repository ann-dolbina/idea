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
 * Represents COM interface IWMPBrandDispatch.
 */
public class IWMPBrandDispatchImpl extends IDispatchImpl
        implements IWMPBrandDispatch {
    public static final String INTERFACE_IDENTIFIER = IWMPBrandDispatch.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPBrandDispatchImpl() {
    }

    protected IWMPBrandDispatchImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPBrandDispatchImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPBrandDispatchImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPBrandDispatchImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method setNavigateProps
     */
    public void setNavigateProps(
            BStr /*[in]*/ bstrPane,
            Int32 /*[in]*/ lDispid,
            BStr /*[in]*/ bstrParams)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrPane == null ? (Parameter) PTR_NULL : bstrPane,
                        lDispid,
                        bstrParams == null ? (Parameter) PTR_NULL : bstrParams
                }
        );
    }

    /**
     * method getMediaParams
     */
    public BStr getMediaParams(
            IUnknown /*[in]*/ pObject,
            BStr /*[in]*/ bstrURL)
            throws ComException {
        BStr pbstrResult = new BStr();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pObject == null ? (Parameter) PTR_NULL : (Parameter) pObject,
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        pbstrResult == null ? (Parameter) PTR_NULL : new Pointer(pbstrResult)
                }
        );
        return pbstrResult;
    }

    /**
     * property fullServiceName
     */
    public BStr getFullServiceName()
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
     * property friendlyName
     */
    public BStr getFriendlyName()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property guideButtonText
     */
    public BStr getGuideButtonText()
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
     * property guideButtonTip
     */
    public BStr getGuideButtonTip()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property guideMenuText
     */
    public BStr getGuideMenuText()
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
     * property guideAccText
     */
    public BStr getGuideAccText()
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
     * property task1ButtonText
     */
    public BStr getTask1ButtonText()
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
     * property task1ButtonTip
     */
    public BStr getTask1ButtonTip()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property task1MenuText
     */
    public BStr getTask1MenuText()
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
     * property task1AccText
     */
    public BStr getTask1AccText()
            throws ComException {
        BStr pVal = new BStr();
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
     * property guideUrl
     */
    public BStr getGuideUrl()
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
     * property task1Url
     */
    public BStr getTask1Url()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property imageLargeUrl
     */
    public BStr getImageLargeUrl()
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
     * property imageSmallUrl
     */
    public BStr getImageSmallUrl()
            throws ComException {
        BStr pVal = new BStr();
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
     * property imageMenuUrl
     */
    public BStr getImageMenuUrl()
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
     * property infoCenterUrl
     */
    public BStr getInfoCenterUrl()
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
     * property albumInfoUrl
     */
    public BStr getAlbumInfoUrl()
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
     * property buyCDUrl
     */
    public BStr getBuyCDUrl()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property htmlViewUrl
     */
    public BStr getHtmlViewUrl()
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
     * property navigateUrl
     */
    public BStr getNavigateUrl()
            throws ComException {
        BStr pVal = new BStr();
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
     * property cookieUrl
     */
    public BStr getCookieUrl()
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
     * property downloadStatusUrl
     */
    public BStr getDownloadStatusUrl()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property colorPlayer
     */
    public BStr getColorPlayer()
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
     * property colorPlayerText
     */
    public BStr getColorPlayerText()
            throws ComException {
        BStr pVal = new BStr();
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
     * property navigateDispid
     */
    public Int32 getNavigateDispid()
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
     * property navigateParams
     */
    public BStr getNavigateParams()
            throws ComException {
        BStr pVal = new BStr();
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
     * property navigatePane
     */
    public BStr getNavigatePane()
            throws ComException {
        BStr pVal = new BStr();
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
     * property selectedPane
     */
    public BStr getSelectedPane()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property selectedPane
     */
    public void setSelectedPane(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property selectedTask
     */
    public void setSelectedTask(
            Int32 /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1
                }
        );
    }

    /**
     * property contentPartnerSelected
     */
    public VariantBool getContentPartnerSelected()
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

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPBrandDispatchImpl(this);
    }
}
