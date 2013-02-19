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
 * Represents COM interface IWMPPlayer4.
 */
public class IWMPPlayer4Impl extends IWMPCore3Impl
        implements IWMPPlayer4 {
    public static final String INTERFACE_IDENTIFIER = IWMPPlayer4.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlayer4Impl() {
    }

    protected IWMPPlayer4Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlayer4Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlayer4Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlayer4Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Opens the player with the specified URL
     */
    public void openPlayer(
            BStr /*[in]*/ bstrURL)
            throws ComException {
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL
                }
        );
    }

    /**
     * Returns a boolean value specifying whether or not the control is enabled
     */
    public VariantBool getEnabled()
            throws ComException {
        VariantBool pbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pbEnabled)
                }
        );
        return pbEnabled;
    }

    /**
     * Returns a boolean value specifying whether or not the control is enabled
     */
    public void setEnabled(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException {
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled
                }
        );
    }

    /**
     * Returns a boolean value specifying whether or not the control is in full screen mode
     */
    public VariantBool getFullScreen()
            throws ComException {
        VariantBool pbFullScreen = new VariantBool();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen == null ? (Parameter) PTR_NULL : new Pointer(pbFullScreen)
                }
        );
        return pbFullScreen;
    }

    /**
     * Returns a boolean value specifying whether or not the control is in full screen mode
     */
    public void setFullScreen(
            VariantBool /*[in]*/ pbFullScreen)
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbFullScreen
                }
        );
    }

    /**
     * Returns a boolean value specifying whether or not the context menu is enabled on the control
     */
    public VariantBool getEnableContextMenu()
            throws ComException {
        VariantBool pbEnableContextMenu = new VariantBool();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnableContextMenu == null ? (Parameter) PTR_NULL : new Pointer(pbEnableContextMenu)
                }
        );
        return pbEnableContextMenu;
    }

    /**
     * Returns a boolean value specifying whether or not the context menu is enabled on the control
     */
    public void setEnableContextMenu(
            VariantBool /*[in]*/ pbEnableContextMenu)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnableContextMenu
                }
        );
    }

    /**
     * Specifies the ui mode to select
     */
    public void setUiMode(
            BStr /*[in]*/ pbstrMode)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrMode == null ? (Parameter) PTR_NULL : pbstrMode
                }
        );
    }

    /**
     * Specifies the ui mode to select
     */
    public BStr getUiMode()
            throws ComException {
        BStr pbstrMode = new BStr();
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrMode)
                }
        );
        return pbstrMode;
    }

    /**
     * Returns a boolean value specifying whether or not video is stretched
     */
    public VariantBool getStretchToFit()
            throws ComException {
        VariantBool pbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pbEnabled)
                }
        );
        return pbEnabled;
    }

    /**
     * Returns a boolean value specifying whether or not video is stretched
     */
    public void setStretchToFit(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException {
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled
                }
        );
    }

    /**
     * Returns a boolean value specifying whether or not video is windowless
     */
    public VariantBool getWindowlessVideo()
            throws ComException {
        VariantBool pbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pbEnabled)
                }
        );
        return pbEnabled;
    }

    /**
     * Returns a boolean value specifying whether or not video is windowless
     */
    public void setWindowlessVideo(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException {
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled
                }
        );
    }

    /**
     * Indicates whether the player is running remotely
     */
    public VariantBool getIsRemote()
            throws ComException {
        VariantBool pvarfIsRemote = new VariantBool();
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pvarfIsRemote == null ? (Parameter) PTR_NULL : new Pointer(pvarfIsRemote)
                }
        );
        return pvarfIsRemote;
    }

    /**
     * Returns the player application handler
     */
    public IWMPPlayerApplication getPlayerApplication()
            throws ComException {
        IWMPPlayerApplicationImpl ppIWMPPlayerApplication = new IWMPPlayerApplicationImpl();
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppIWMPPlayerApplication == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppIWMPPlayerApplication)
                }
        );
        return ppIWMPPlayerApplication;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlayer4Impl(this);
    }
}
