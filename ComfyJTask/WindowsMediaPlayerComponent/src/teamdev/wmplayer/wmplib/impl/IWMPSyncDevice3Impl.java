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
 * Represents COM interface IWMPSyncDevice3.
 */
public class IWMPSyncDevice3Impl extends IWMPSyncDevice2Impl
        implements IWMPSyncDevice3 {
    public static final String INTERFACE_IDENTIFIER = IWMPSyncDevice3.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSyncDevice3Impl() {
    }

    protected IWMPSyncDevice3Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSyncDevice3Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSyncDevice3Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSyncDevice3Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void estimateSyncSize(
            IWMPPlaylist /*[in]*/ pNonRulePlaylist,
            IWMPPlaylist /*[in]*/ pRulesPlaylist)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pNonRulePlaylist == null ? (Parameter) PTR_NULL : (Parameter) pNonRulePlaylist,
                        pRulesPlaylist == null ? (Parameter) PTR_NULL : (Parameter) pRulesPlaylist
                }
        );
    }

    /**
     *
     */
    public void cancelEstimation()
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPSyncDevice3Impl(this);
    }
}
