package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPEqualizerSettingsCtrl.
 */
public class WMPEqualizerSettingsCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{93EB32F5-87B1-45AD-ACC6-0F2483DB83BB}");

    public WMPEqualizerSettingsCtrl() {
    }

    public WMPEqualizerSettingsCtrl(WMPEqualizerSettingsCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPEqualizerSettingsCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPEqualizerSettingsCtrlImpl intf = new IWMPEqualizerSettingsCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPEqualizerSettingsCtrl</code> interface from IUnknown instance.
     */
    public static IWMPEqualizerSettingsCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPEqualizerSettingsCtrlImpl result = new IWMPEqualizerSettingsCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPEqualizerSettingsCtrl(this);
    }
}