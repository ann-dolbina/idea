package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPButtonCtrl.
 */
public class WMPButtonCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{87291B51-0C8E-11D3-BB2A-00A0C93CA73A}");

    public WMPButtonCtrl() {
    }

    public WMPButtonCtrl(WMPButtonCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPButtonCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPButtonCtrlImpl intf = new IWMPButtonCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPButtonCtrl</code> interface from IUnknown instance.
     */
    public static IWMPButtonCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPButtonCtrlImpl result = new IWMPButtonCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPButtonCtrl(this);
    }
}