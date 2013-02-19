package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPEditCtrl.
 */
public class WMPEditCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{6342FCED-25EA-4033-BDDB-D049A14382D3}");

    public WMPEditCtrl() {
    }

    public WMPEditCtrl(WMPEditCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPEditCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPEditCtrlImpl intf = new IWMPEditCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPEditCtrl</code> interface from IUnknown instance.
     */
    public static IWMPEditCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPEditCtrlImpl result = new IWMPEditCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPEditCtrl(this);
    }
}