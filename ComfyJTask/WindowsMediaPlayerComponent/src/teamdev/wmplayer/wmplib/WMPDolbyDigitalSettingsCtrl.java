package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPDolbyDigitalSettingsCtrl.
 */
public class WMPDolbyDigitalSettingsCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{1EA16D11-DCB1-41FE-BC17-42CDFBEF8F53}");

    public WMPDolbyDigitalSettingsCtrl() {
    }

    public WMPDolbyDigitalSettingsCtrl(WMPDolbyDigitalSettingsCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPDolbyDigitalSettingsCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPDolbyDigitalSettingsCtrlImpl intf = new IWMPDolbyDigitalSettingsCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPDolbyDigitalSettingsCtrl</code> interface from IUnknown instance.
     */
    public static IWMPDolbyDigitalSettingsCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPDolbyDigitalSettingsCtrlImpl result = new IWMPDolbyDigitalSettingsCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPDolbyDigitalSettingsCtrl(this);
    }
}