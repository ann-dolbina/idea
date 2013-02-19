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
 * Represents COM interface IWMPTheme.
 */
public class IWMPThemeImpl extends IDispatchImpl
        implements IWMPTheme {
    public static final String INTERFACE_IDENTIFIER = IWMPTheme.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPThemeImpl() {
    }

    protected IWMPThemeImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPThemeImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPThemeImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPThemeImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method showErrorDialog
     */
    public void showErrorDialog()
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method logString
     */
    public void logString(
            BStr /*[in]*/ stringVal)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        stringVal == null ? (Parameter) PTR_NULL : stringVal
                }
        );
    }

    /**
     * method openView
     */
    public void openView(
            BStr /*[in]*/ viewID)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        viewID == null ? (Parameter) PTR_NULL : viewID
                }
        );
    }

    /**
     * method openView
     */
    public IDispatch openViewRelative(
            BStr /*[in]*/ viewID,
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y)
            throws ComException {
        IDispatchImpl ppView = new IDispatchImpl();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        viewID == null ? (Parameter) PTR_NULL : viewID,
                        x,
                        y,
                        ppView == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppView)
                }
        );
        return ppView;
    }

    /**
     * method closeView
     */
    public void closeView(
            BStr /*[in]*/ viewID)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        viewID == null ? (Parameter) PTR_NULL : viewID
                }
        );
    }

    /**
     * method openDialog
     */
    public BStr openDialog(
            BStr /*[in]*/ dialogType,
            BStr /*[in]*/ paramParameters)
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        dialogType == null ? (Parameter) PTR_NULL : dialogType,
                        paramParameters == null ? (Parameter) PTR_NULL : paramParameters,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method loadString
     */
    public BStr loadString(
            BStr /*[in]*/ bstrString)
            throws ComException {
        BStr pbstrReturn = new BStr();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrString == null ? (Parameter) PTR_NULL : bstrString,
                        pbstrReturn == null ? (Parameter) PTR_NULL : new Pointer(pbstrReturn)
                }
        );
        return pbstrReturn;
    }

    /**
     * method loadPreference
     */
    public BStr loadPreference(
            BStr /*[in]*/ bstrName)
            throws ComException {
        BStr pbstrValue = new BStr();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        pbstrValue == null ? (Parameter) PTR_NULL : new Pointer(pbstrValue)
                }
        );
        return pbstrValue;
    }

    /**
     * method savePreference
     */
    public void savePreference(
            BStr /*[in]*/ bstrName,
            BStr /*[in]*/ bstrValue)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        bstrValue == null ? (Parameter) PTR_NULL : bstrValue
                }
        );
    }

    /**
     * method playSound
     */
    public void playSound(
            BStr /*[in]*/ bstrFilename)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrFilename == null ? (Parameter) PTR_NULL : bstrFilename
                }
        );
    }

    /**
     * Microsoft internal use only
     */
    public IDispatch openViewRelativeInternal(
            BStr /*[in]*/ viewID,
            Int32 /*[in]*/ nIndex,
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y,
            Int32 /*[in]*/ nWidth,
            Int32 /*[in]*/ nHeight,
            BStr /*[in]*/ bstrHorizontalAlignment,
            BStr /*[in]*/ bstrVerticalAlignment)
            throws ComException {
        IDispatchImpl ppView = new IDispatchImpl();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        viewID == null ? (Parameter) PTR_NULL : viewID,
                        nIndex,
                        x,
                        y,
                        nWidth,
                        nHeight,
                        bstrHorizontalAlignment == null ? (Parameter) PTR_NULL : bstrHorizontalAlignment,
                        bstrVerticalAlignment == null ? (Parameter) PTR_NULL : bstrVerticalAlignment,
                        ppView == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppView)
                }
        );
        return ppView;
    }

    /**
     * Microsoft internal use only
     */
    public void setViewPosition(
            BStr /*[in]*/ viewID,
            Int32 /*[in]*/ nIndex,
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y,
            Int32 /*[in]*/ nWidth,
            Int32 /*[in]*/ nHeight,
            BStr /*[in]*/ bstrHorizontalAlignment,
            BStr /*[in]*/ bstrVerticalAlignment)
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        viewID == null ? (Parameter) PTR_NULL : viewID,
                        nIndex,
                        x,
                        y,
                        nWidth,
                        nHeight,
                        bstrHorizontalAlignment == null ? (Parameter) PTR_NULL : bstrHorizontalAlignment,
                        bstrVerticalAlignment == null ? (Parameter) PTR_NULL : bstrVerticalAlignment
                }
        );
    }

    /**
     * property title
     */
    public BStr getTitle()
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
     * property version
     */
    public SingleFloat getVersion()
            throws ComException {
        SingleFloat pfVersion = new SingleFloat();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVersion == null ? (Parameter) PTR_NULL : new Pointer(pfVersion)
                }
        );
        return pfVersion;
    }

    /**
     * property authorVersion
     */
    public BStr getAuthorVersion()
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
     * property author
     */
    public BStr getAuthor()
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
     * property copyright
     */
    public BStr getCopyright()
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
     * property title
     */
    public BStr getCurrentViewID()
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
     * property title
     */
    public void setCurrentViewID(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPThemeImpl(this);
    }
}
