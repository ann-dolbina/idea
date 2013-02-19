package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPCustomSliderCtrl.
 */
public class WMPCustomSliderCtrl extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{95F45AA3-ED0A-11D2-BA67-0000F80855E6}");

    public WMPCustomSliderCtrl() {
    }

    public WMPCustomSliderCtrl(WMPCustomSliderCtrl that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPCustomSlider create(ClsCtx dwClsContext) throws ComException {
        final IWMPCustomSliderImpl intf = new IWMPCustomSliderImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPCustomSlider</code> interface from IUnknown instance.
     */
    public static IWMPCustomSlider queryInterface(IUnknown unknown) throws ComException {
        final IWMPCustomSliderImpl result = new IWMPCustomSliderImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPCustomSliderCtrl(this);
    }
}