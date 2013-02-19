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
 * Represents Java interface for COM interface IWMPListBoxItem.
 */
public interface IWMPListBoxItem extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{D255DFB8-C22A-42CF-B8B7-F15D7BCF65D6}";

    /**
     * property value
     */
    void setValue(
            BStr /*[in]*/ param1)
            throws ComException;
}
