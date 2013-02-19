package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.ole.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents COM coclass WindowsMediaPlayer.
 */
public class WindowsMediaPlayer extends CoClass {
    public static final CLSID CLASS_ID = CLSID.create("{6BF52A52-394A-11D3-B153-00C04F79FAA6}");

    public WindowsMediaPlayer() {
    }

    public WindowsMediaPlayer(WindowsMediaPlayer that) {
        super(that);
    }

    /**
     * Creates coclass and returns its default interface.
     */
    public static IWMPPlayer4 create(ClsCtx dwClsContext) throws ComException {
        final IWMPPlayer4Impl intf = new IWMPPlayer4Impl(CLASS_ID, dwClsContext);
        OleFunctions.oleRun(intf);
        return intf;
    }

    /**
     * Queries the <code>IWMPPlayer4</code> interface from IUnknown instance.
     */
    public static IWMPPlayer4 queryInterface(IUnknown unknown) throws ComException {
        final IWMPPlayer4Impl result = new IWMPPlayer4Impl();
        unknown.queryInterface(result.getIID(), result);
        return result;
    }

    public CLSID getCLSID() {
        return CLASS_ID;
    }

    public Object clone() {
        return new WindowsMediaPlayer(this);
    }
}