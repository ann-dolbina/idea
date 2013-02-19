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
 * Represents Java interface for COM interface IWMPButtonCtrlEvents.
 */
public interface IWMPButtonCtrlEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{BB17FFF7-1692-4555-918A-6AF7BFACEDD2}";

    public static final int DISPID_onclick = 5120;


    /**
     * event ondragbegin
     */
    void onclick()
            throws ComException;
}
