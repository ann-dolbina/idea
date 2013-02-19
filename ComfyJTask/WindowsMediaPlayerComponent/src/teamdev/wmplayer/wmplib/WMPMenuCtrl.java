package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPMenuCtrl.
 */
public class WMPMenuCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{BAB3768B-8883-4AEC-9F9B-E14C947913EF}");

    public WMPMenuCtrl() {
    }

    public WMPMenuCtrl(WMPMenuCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPMenuCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPMenuCtrlImpl intf = new IWMPMenuCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPMenuCtrl</code> interface from IUnknown instance.
     */
    public static IWMPMenuCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPMenuCtrlImpl result = new IWMPMenuCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPMenuCtrl(this);
    }
}