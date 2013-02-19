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
 * Represents Java interface for COM interface IBattery.
 */
public interface IBattery extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{F8578BFA-CD8F-4CE1-A684-5B7E85FCA7DC}";

    /**
     *
     */
    Int32 getPresetCount()
            throws ComException;

    /**
     *
     */
    IDispatch getPreset(
            Int32 /*[in]*/ nIndex)
            throws ComException;
}
