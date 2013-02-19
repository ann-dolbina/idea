package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPEffects.
 */
public class WMPEffects extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{47DEA830-D619-4154-B8D8-6B74845D6A2D}");

    public WMPEffects() {
    }

    public WMPEffects(WMPEffects that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPEffectsCtrl create(ClsCtx dwClsContext) throws ComException {
        final IWMPEffectsCtrlImpl intf = new IWMPEffectsCtrlImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPEffectsCtrl</code> interface from IUnknown instance.
     */
    public static IWMPEffectsCtrl queryInterface(IUnknown unknown) throws ComException {
        final IWMPEffectsCtrlImpl result = new IWMPEffectsCtrlImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPEffects(this);
    }
}