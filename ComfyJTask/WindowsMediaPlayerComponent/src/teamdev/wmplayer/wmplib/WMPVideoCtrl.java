package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPVideoCtrl.
 */
public class WMPVideoCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{61CECF11-FC3A-11D2-A1CD-005004602752}");

    public WMPVideoCtrl() {
    }

    public WMPVideoCtrl(WMPVideoCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPVideoCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPVideoCtrlImpl intf = new IWMPVideoCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPVideoCtrl</code> interface from IUnknown instance.
     */
    public static IWMPVideoCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPVideoCtrlImpl result = new IWMPVideoCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPVideoCtrl(this);
    }
}