package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPAutoMenuCtrl.
 */
public class WMPAutoMenuCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{6B28F900-8D64-4B80-9963-CC52DDD1FBB4}");

    public WMPAutoMenuCtrl() {
    }

    public WMPAutoMenuCtrl(WMPAutoMenuCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPAutoMenuCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPAutoMenuCtrlImpl intf = new IWMPAutoMenuCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPAutoMenuCtrl</code> interface from IUnknown instance.
     */
    public static IWMPAutoMenuCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPAutoMenuCtrlImpl result = new IWMPAutoMenuCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPAutoMenuCtrl(this);
    }
}