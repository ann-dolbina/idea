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
 * Represents COM interface IWMPCdrom.
 */
public class IWMPCdromImpl extends IDispatchImpl
        implements IWMPCdrom {
    public static final String INTERFACE_IDENTIFIER = IWMPCdrom.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCdromImpl() {
    }

    protected IWMPCdromImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCdromImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCdromImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCdromImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Eject the CD in the CDROM drive
     */
    public void eject()
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Returns the CDROM drive specifier
     */
    public BStr getDriveSpecifier()
            throws ComException {
        BStr pbstrDrive = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDrive == null ? (Parameter) PTR_NULL : new Pointer(pbstrDrive)
                }
        );
        return pbstrDrive;
    }

    /**
     * Returns the playlist of tracks currently in the CDROM drive
     */
    public IWMPPlaylist getPlaylist()
            throws ComException {
        IWMPPlaylistImpl ppPlaylist = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylist)
                }
        );
        return ppPlaylist;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCdromImpl(this);
    }
}
