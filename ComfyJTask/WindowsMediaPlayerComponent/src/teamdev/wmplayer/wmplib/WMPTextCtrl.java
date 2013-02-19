package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPTextCtrl.
 */
public class WMPTextCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{DDDA102E-0E17-11D3-A2E2-00C04F79F88E}");

    public WMPTextCtrl() {
    }

    public WMPTextCtrl(WMPTextCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPTextCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPTextCtrlImpl intf = new IWMPTextCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPTextCtrl</code> interface from IUnknown instance.
     */
    public static IWMPTextCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPTextCtrlImpl result = new IWMPTextCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPTextCtrl(this);
    }
}