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
 * Represents Java interface for COM interface IWMPSkinList.
 */
public interface IWMPSkinList extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{8CEA03A2-D0C5-4E97-9C38-A676A639A51D}";

    /**
     * property basketVisible
     */
    void updateBasketColumns()
            throws ComException;

    /**
     * property highContrastChange
     */
    void highContrastChange()
            throws ComException;
}
