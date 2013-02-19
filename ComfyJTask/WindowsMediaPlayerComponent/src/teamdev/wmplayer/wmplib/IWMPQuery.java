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
 * Represents Java interface for COM interface IWMPQuery.
 */
public interface IWMPQuery extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{A00918F3-A6B0-4BFB-9189-FD834C7BC5A5}";

    /**
     * Adds a single AND query parameter to existing group
     */
    void addCondition(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrOperator,
            BStr /*[in]*/ bstrValue)
            throws ComException;

    /**
     * Starts a new OR query group
     */
    void beginNextGroup()
            throws ComException;
}
