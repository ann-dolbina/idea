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
 * Represents Java interface for COM interface IBatteryPreset.
 */
public interface IBatteryPreset extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{40C6BDE7-9C90-49D4-AD20-BEF81A6C5F22}";

    /**
     *
     */
    BStr getTitle()
            throws ComException;

    /**
     *
     */
    void setTitle(
            BStr /*[in]*/ pVal)
            throws ComException;
}
