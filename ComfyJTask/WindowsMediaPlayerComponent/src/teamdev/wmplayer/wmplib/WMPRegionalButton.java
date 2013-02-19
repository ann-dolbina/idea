package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPRegionalButton.
 */
public class WMPRegionalButton extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{09AEFF11-69EF-11D3-BD4D-00C04F6EA5AE}");

    public WMPRegionalButton() {
    }

    public WMPRegionalButton(WMPRegionalButton that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPRegionalButton create(ClsCtx dwClsContext) throws ComException {
        final IWMPRegionalButtonImpl intf = new IWMPRegionalButtonImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPRegionalButton</code> interface from IUnknown instance.
     */
    public static IWMPRegionalButton queryInterface(IUnknown unknown) throws ComException {
        final IWMPRegionalButtonImpl result = new IWMPRegionalButtonImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPRegionalButton(this);
    }
}