package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPRegionalButtonCtrl.
 */
public class WMPRegionalButtonCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{AE3B6831-25A9-11D3-BD41-00C04F6EA5AE}");

    public WMPRegionalButtonCtrl() {
    }

    public WMPRegionalButtonCtrl(WMPRegionalButtonCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPRegionalButtonCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPRegionalButtonCtrlImpl intf = new IWMPRegionalButtonCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPRegionalButtonCtrl</code> interface from IUnknown instance.
     */
    public static IWMPRegionalButtonCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPRegionalButtonCtrlImpl result = new IWMPRegionalButtonCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPRegionalButtonCtrl(this);
    }
}