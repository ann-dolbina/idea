package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPVideoCtrlEvents.
 */
public interface IWMPVideoCtrlEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{A85C0477-714C-4A06-B9F6-7C8CA38B45DC}";

    public static final int DISPID_onvideostart = 5720;
    public static final int DISPID_onvideoend = 5721;


    /**
     * event onvideostart
     */
    void onvideostart()
            throws ComException;

    /**
     * event onvideostart
     */
    void onvideoend()
            throws ComException;
}
