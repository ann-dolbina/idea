package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPLibraryTreeCtrl.
 */
public class WMPLibraryTreeCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{D9DE732A-AEE9-4503-9D11-5605589977A8}");

    public WMPLibraryTreeCtrl() {
    }

    public WMPLibraryTreeCtrl(WMPLibraryTreeCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPLibraryTreeCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPLibraryTreeCtrlImpl intf = new IWMPLibraryTreeCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPLibraryTreeCtrl</code> interface from IUnknown instance.
     */
    public static IWMPLibraryTreeCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPLibraryTreeCtrlImpl result = new IWMPLibraryTreeCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPLibraryTreeCtrl(this);
    }
}