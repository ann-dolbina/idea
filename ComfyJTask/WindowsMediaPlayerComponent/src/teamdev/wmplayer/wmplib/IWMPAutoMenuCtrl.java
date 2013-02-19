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
 * Represents Java interface for COM interface IWMPAutoMenuCtrl.
 */
public interface IWMPAutoMenuCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{1AD13E0B-4F3A-41DF-9BE2-F9E6FE0A7875}";

    /**
     * method show
     */
    void show(
            BStr /*[in]*/ newVal)
            throws ComException;
}
