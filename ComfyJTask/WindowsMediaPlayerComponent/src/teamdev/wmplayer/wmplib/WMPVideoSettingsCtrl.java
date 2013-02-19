package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPVideoSettingsCtrl.
 */
public class WMPVideoSettingsCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{AE7BFAFE-DCC8-4A73-92C8-CC300CA88859}");

    public WMPVideoSettingsCtrl() {
    }

    public WMPVideoSettingsCtrl(WMPVideoSettingsCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPVideoSettingsCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPVideoSettingsCtrlImpl intf = new IWMPVideoSettingsCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPVideoSettingsCtrl</code> interface from IUnknown instance.
     */
    public static IWMPVideoSettingsCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPVideoSettingsCtrlImpl result = new IWMPVideoSettingsCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPVideoSettingsCtrl(this);
    }
}