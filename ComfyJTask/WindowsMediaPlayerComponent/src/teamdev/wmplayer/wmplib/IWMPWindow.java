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
 * Represents Java interface for COM interface IWMPWindow.
 */
public interface IWMPWindow extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{43D5AE92-4332-477C-8883-E0B3B063C5D2}";

    /**
     * method setWindowPos
     */
    void setWindowPos(
            Int32 /*[in]*/ x,
            Int32 /*[in]*/ y,
            Int32 /*[in]*/ height,
            Int32 /*[in]*/ width)
            throws ComException;

    /**
     *
     */
    void openViewAlwaysOnTop(
            BStr /*[in]*/ bstrViewID)
            throws ComException;

    /**
     *
     */
    Int32 getFrameRate()
            throws ComException;

    /**
     *
     */
    void setFrameRate(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    Int32 getMouseX()
            throws ComException;

    /**
     *
     */
    Int32 getMouseY()
            throws ComException;

    /**
     *
     */
    void setOnsizing(
            IDispatch /*[in]*/ param1)
            throws ComException;
}
