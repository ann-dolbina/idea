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
 * Represents COM interface IWMPCore3.
 */
public class IWMPCore3Impl extends IWMPCore2Impl
        implements IWMPCore3 {
    public static final String INTERFACE_IDENTIFIER = IWMPCore3.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCore3Impl() {
    }

    protected IWMPCore3Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCore3Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCore3Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCore3Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Creates a new playlist object
     */
    public IWMPPlaylist newPlaylist(
            BStr /*[in]*/ bstrName,
            BStr /*[in]*/ bstrURL)
            throws ComException {
        IWMPPlaylistImpl ppPlaylist = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        ppPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylist)
                }
        );
        return ppPlaylist;
    }

    /**
     * Creates a new media object
     */
    public IWMPMedia newMedia(
            BStr /*[in]*/ bstrURL)
            throws ComException {
        IWMPMediaImpl ppMedia = new IWMPMediaImpl();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        ppMedia == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMedia)
                }
        );
        return ppMedia;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCore3Impl(this);
    }
}
