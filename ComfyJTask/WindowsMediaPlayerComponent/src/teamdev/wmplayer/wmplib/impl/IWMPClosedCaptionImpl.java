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
 * Represents COM interface IWMPClosedCaption.
 */
public class IWMPClosedCaptionImpl extends IDispatchImpl
        implements IWMPClosedCaption {
    public static final String INTERFACE_IDENTIFIER = IWMPClosedCaption.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPClosedCaptionImpl() {
    }

    protected IWMPClosedCaptionImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPClosedCaptionImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPClosedCaptionImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPClosedCaptionImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the previously set SAMI style
     */
    public BStr getSAMIStyle()
            throws ComException {
        BStr pbstrSAMIStyle = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSAMIStyle == null ? (Parameter) PTR_NULL : new Pointer(pbstrSAMIStyle)
                }
        );
        return pbstrSAMIStyle;
    }

    /**
     * Returns the previously set SAMI style
     */
    public void setSAMIStyle(
            BStr /*[in]*/ pbstrSAMIStyle)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSAMIStyle == null ? (Parameter) PTR_NULL : pbstrSAMIStyle
                }
        );
    }

    /**
     * Returns the previously set SAMI language
     */
    public BStr getSAMILang()
            throws ComException {
        BStr pbstrSAMILang = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSAMILang == null ? (Parameter) PTR_NULL : new Pointer(pbstrSAMILang)
                }
        );
        return pbstrSAMILang;
    }

    /**
     * Returns the previously set SAMI language
     */
    public void setSAMILang(
            BStr /*[in]*/ pbstrSAMILang)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSAMILang == null ? (Parameter) PTR_NULL : pbstrSAMILang
                }
        );
    }

    /**
     * Returns the previously set SAMI file name
     */
    public BStr getSAMIFileName()
            throws ComException {
        BStr pbstrSAMIFileName = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSAMIFileName == null ? (Parameter) PTR_NULL : new Pointer(pbstrSAMIFileName)
                }
        );
        return pbstrSAMIFileName;
    }

    /**
     * Returns the previously set SAMI file name
     */
    public void setSAMIFileName(
            BStr /*[in]*/ pbstrSAMIFileName)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSAMIFileName == null ? (Parameter) PTR_NULL : pbstrSAMIFileName
                }
        );
    }

    /**
     * Returns the previously set Captioning ID
     */
    public BStr getCaptioningId()
            throws ComException {
        BStr pbstrCaptioningID = new BStr();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCaptioningID == null ? (Parameter) PTR_NULL : new Pointer(pbstrCaptioningID)
                }
        );
        return pbstrCaptioningID;
    }

    /**
     * Returns the previously set Captioning ID
     */
    public void setCaptioningId(
            BStr /*[in]*/ pbstrCaptioningID)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCaptioningID == null ? (Parameter) PTR_NULL : pbstrCaptioningID
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPClosedCaptionImpl(this);
    }
}
