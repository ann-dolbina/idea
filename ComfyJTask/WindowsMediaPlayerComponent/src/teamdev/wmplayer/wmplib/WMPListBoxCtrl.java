package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPListBoxCtrl.
 */
public class WMPListBoxCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{FC1880CF-83B9-43A7-A066-C44CE8C82583}");

    public WMPListBoxCtrl() {
    }

    public WMPListBoxCtrl(WMPListBoxCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPListBoxCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPListBoxCtrlImpl intf = new IWMPListBoxCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPListBoxCtrl</code> interface from IUnknown instance.
     */
    public static IWMPListBoxCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPListBoxCtrlImpl result = new IWMPListBoxCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPListBoxCtrl(this);
    }
}