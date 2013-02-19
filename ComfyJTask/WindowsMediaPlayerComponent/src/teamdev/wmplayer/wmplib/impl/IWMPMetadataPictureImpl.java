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
 * Represents COM interface IWMPMetadataPicture.
 */
public class IWMPMetadataPictureImpl extends IDispatchImpl
        implements IWMPMetadataPicture {
    public static final String INTERFACE_IDENTIFIER = IWMPMetadataPicture.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMetadataPictureImpl() {
    }

    protected IWMPMetadataPictureImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMetadataPictureImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMetadataPictureImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMetadataPictureImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr getMimeType()
            throws ComException {
        BStr pbstrMimeType = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrMimeType == null ? (Parameter) PTR_NULL : new Pointer(pbstrMimeType)
                }
        );
        return pbstrMimeType;
    }

    /**
     *
     */
    public BStr getPictureType()
            throws ComException {
        BStr pbstrPictureType = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrPictureType == null ? (Parameter) PTR_NULL : new Pointer(pbstrPictureType)
                }
        );
        return pbstrPictureType;
    }

    /**
     *
     */
    public BStr getDescription()
            throws ComException {
        BStr pbstrDescription = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDescription == null ? (Parameter) PTR_NULL : new Pointer(pbstrDescription)
                }
        );
        return pbstrDescription;
    }

    /**
     *
     */
    public BStr getURL()
            throws ComException {
        BStr pbstrURL = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrURL == null ? (Parameter) PTR_NULL : new Pointer(pbstrURL)
                }
        );
        return pbstrURL;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMetadataPictureImpl(this);
    }
}
