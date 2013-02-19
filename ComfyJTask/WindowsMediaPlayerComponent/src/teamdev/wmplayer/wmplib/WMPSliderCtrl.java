package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPSliderCtrl.
 */
public class WMPSliderCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{F2BF2C90-405F-11D3-BB39-00A0C93CA73A}");

    public WMPSliderCtrl() {
    }

    public WMPSliderCtrl(WMPSliderCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPSliderCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPSliderCtrlImpl intf = new IWMPSliderCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPSliderCtrl</code> interface from IUnknown instance.
     */
    public static IWMPSliderCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPSliderCtrlImpl result = new IWMPSliderCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPSliderCtrl(this);
    }
}