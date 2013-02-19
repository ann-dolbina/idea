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
 * Represents COM interface IWMPExternal.
 */
public class IWMPExternalImpl extends IDispatchImpl
        implements IWMPExternal {
    public static final String INTERFACE_IDENTIFIER = IWMPExternal.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPExternalImpl() {
    }

    protected IWMPExternalImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPExternalImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPExternalImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPExternalImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr getVersion()
            throws ComException {
        BStr pBSTR = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pBSTR == null ? (Parameter) PTR_NULL : new Pointer(pBSTR)
                }
        );
        return pBSTR;
    }

    /**
     *
     */
    public BStr getAppColorLight()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                8,
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
    public void setOnColorChange(
            IDispatch /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
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
        return new IWMPExternalImpl(this);
    }
}
