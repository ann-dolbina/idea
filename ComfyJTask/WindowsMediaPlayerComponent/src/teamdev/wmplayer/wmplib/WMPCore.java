package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPCore.
 */
public class WMPCore extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{09428D37-E0B9-11D2-B147-00C04F79FAA6}");

    public WMPCore() {
    }

    public WMPCore(WMPCore that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPCore3 create(ClsCtx dwClsContext) throws ComException {
        final IWMPCore3Impl intf = new IWMPCore3Impl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPCore3</code> interface from IUnknown instance.
     */
    public static IWMPCore3 queryInterface(IUnknown unknown) throws ComException {
        final IWMPCore3Impl result = new IWMPCore3Impl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPCore(this);
    }
}