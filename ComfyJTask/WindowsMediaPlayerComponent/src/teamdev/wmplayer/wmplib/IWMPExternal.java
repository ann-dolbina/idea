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
 * Represents Java interface for COM interface IWMPExternal.
 */
public interface IWMPExternal extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{E2CC638C-FD2C-409B-A1EA-5DDB72DC8E84}";

    /**
     *
     */
    BStr getVersion()
            throws ComException;

    /**
     *
     */
    BStr getAppColorLight()
            throws ComException;

    /**
     *
     */
    void setOnColorChange(
            IDispatch /*[in]*/ param1)
            throws ComException;
}
