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
 * Represents COM interface IWMPLayoutSubView.
 */
public class IWMPLayoutSubViewImpl extends IWMPObjectExtendedPropsImpl
        implements IWMPLayoutSubView {
    public static final String INTERFACE_IDENTIFIER = IWMPLayoutSubView.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPLayoutSubViewImpl() {
    }

    protected IWMPLayoutSubViewImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPLayoutSubViewImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPLayoutSubViewImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPLayoutSubViewImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * property transparencyColor
     */
    public BStr getTransparencyColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property transparencyColor
     */
    public void setTransparencyColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                60,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property backgroundColor
     */
    public BStr getBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                61,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property backgroundColor
     */
    public void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                62,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property backgroundImage
     */
    public BStr getBackgroundImage()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                63,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property backgroundImage
     */
    public void setBackgroundImage(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                64,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property backgroundTiled
     */
    public VariantBool getBackgroundTiled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                65,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property backgroundTiled
     */
    public void setBackgroundTiled(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                66,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property hueShift
     */
    public SingleFloat getBackgroundImageHueShift()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                67,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property hueShift
     */
    public void setBackgroundImageHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                68,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property saturation
     */
    public SingleFloat getBackgroundImageSaturation()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                69,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property saturation
     */
    public void setBackgroundImageSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                70,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property resizeBackgroundImage
     */
    public VariantBool getResizeBackgroundImage()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                71,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property resizeBackgroundImage
     */
    public void setResizeBackgroundImage(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                72,
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
        return new IWMPLayoutSubViewImpl(this);
    }
}
