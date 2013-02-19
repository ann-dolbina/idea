package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPPlaylistCtrl.
 */
public class WMPPlaylistCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{5F9CFD93-8CAD-11D3-9A7E-00C04F8EFB70}");

    public WMPPlaylistCtrl() {
    }

    public WMPPlaylistCtrl(WMPPlaylistCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPPlaylistCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPPlaylistCtrlImpl intf = new IWMPPlaylistCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPPlaylistCtrl</code> interface from IUnknown instance.
     */
    public static IWMPPlaylistCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPPlaylistCtrlImpl result = new IWMPPlaylistCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPPlaylistCtrl(this);
    }
}