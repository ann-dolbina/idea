package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WMPSkinList.
 */
public class WMPSkinList extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{A8A55FAC-82EA-4BD7-BD7B-11586A4D99E4}");

    public WMPSkinList() {
    }

    public WMPSkinList(WMPSkinList that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPSkinList create(ClsCtx dwClsContext) throws ComException {
        final IWMPSkinListImpl intf = new IWMPSkinListImpl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPSkinList</code> interface from IUnknown instance.
     */
    public static IWMPSkinList queryInterface(IUnknown unknown) throws ComException {
        final IWMPSkinListImpl result = new IWMPSkinListImpl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WMPSkinList(this);
    }
}