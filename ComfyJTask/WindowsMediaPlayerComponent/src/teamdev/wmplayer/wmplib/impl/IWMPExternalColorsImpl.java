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
 * Represents COM interface IWMPExternalColors.
 */
public class IWMPExternalColorsImpl extends IWMPExternalImpl
        implements IWMPExternalColors {
    public static final String INTERFACE_IDENTIFIER = IWMPExternalColors.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPExternalColorsImpl() {
    }

    protected IWMPExternalColorsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPExternalColorsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPExternalColorsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPExternalColorsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr getAppColorMedium()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     *
     */
    public BStr getAppColorDark()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     *
     */
    public BStr getAppColorButtonHighlight()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     *
     */
    public BStr getAppColorButtonShadow()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     *
     */
    public BStr getAppColorButtonHoverFace()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPExternalColorsImpl(this);
    }
}
