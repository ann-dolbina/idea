package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPCdromRip.
 */
public class IWMPCdromRipImpl extends IUnknownImpl
        implements IWMPCdromRip {
    public static final String INTERFACE_IDENTIFIER = IWMPCdromRip.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCdromRipImpl() {
    }

    protected IWMPCdromRipImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCdromRipImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCdromRipImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCdromRipImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void startRip()
            throws ComException {
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void stopRip()
            throws ComException {
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public WMPRipState getRipState()
            throws ComException {
        WMPRipState pwmprs = new WMPRipState();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmprs == null ? (Parameter) PTR_NULL : new Pointer(pwmprs)
                }
        );
        return pwmprs;
    }

    /**
     *
     */
    public Int32 getRipProgress()
            throws ComException {
        Int32 plProgress = new Int32();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plProgress == null ? (Parameter) PTR_NULL : new Pointer(plProgress)
                }
        );
        return plProgress;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCdromRipImpl(this);
    }
}
