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
 * Represents COM interface IWMPPlayer2.
 */
public class IWMPPlayer2Impl extends IWMPCoreImpl
        implements IWMPPlayer2 {
    public static final String INTERFACE_IDENTIFIER = IWMPPlayer2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlayer2Impl() {
    }

    protected IWMPPlayer2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlayer2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlayer2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlayer2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns a boolen value specifying whether or not the control is enabled
     */
    public VariantBool getEnabled()
            throws ComException {
        VariantBool pbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pbEnabled)
                }
        );
        return pbEnabled;
    }

    /**
     * Returns a boolen value specifying whether or not the control is enabled
     */
    public void setEnabled(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException {
        invokeStandardVirtualMethod(
                29,
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
                30,
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
                31,
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
                32,
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
                33,
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
                34,
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
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrMode)
                }
        );
        return pbstrMode;
    }

    /**
     * Returns a boolen value specifying whether or not video is stretched
     */
    public VariantBool getStretchToFit()
            throws ComException {
        VariantBool pbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pbEnabled)
                }
        );
        return pbEnabled;
    }

    /**
     * Returns a boolen value specifying whether or not video is stretched
     */
    public void setStretchToFit(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled
                }
        );
    }

    /**
     * Returns a boolen value specifying whether or not video is windowless
     */
    public VariantBool getWindowlessVideo()
            throws ComException {
        VariantBool pbEnabled = new VariantBool();
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled == null ? (Parameter) PTR_NULL : new Pointer(pbEnabled)
                }
        );
        return pbEnabled;
    }

    /**
     * Returns a boolen value specifying whether or not video is windowless
     */
    public void setWindowlessVideo(
            VariantBool /*[in]*/ pbEnabled)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbEnabled
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlayer2Impl(this);
    }
}
