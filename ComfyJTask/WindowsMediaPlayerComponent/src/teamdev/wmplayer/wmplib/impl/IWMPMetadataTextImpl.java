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
 * Represents COM interface IWMPMetadataText.
 */
public class IWMPMetadataTextImpl extends IDispatchImpl
        implements IWMPMetadataText {
    public static final String INTERFACE_IDENTIFIER = IWMPMetadataText.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMetadataTextImpl() {
    }

    protected IWMPMetadataTextImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMetadataTextImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMetadataTextImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMetadataTextImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr getDescription()
            throws ComException {
        BStr pbstrDescription = new BStr();
        invokeStandardVirtualMethod(
                7,
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
    public BStr getText()
            throws ComException {
        BStr pbstrText = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrText == null ? (Parameter) PTR_NULL : new Pointer(pbstrText)
                }
        );
        return pbstrText;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMetadataTextImpl(this);
    }
}
