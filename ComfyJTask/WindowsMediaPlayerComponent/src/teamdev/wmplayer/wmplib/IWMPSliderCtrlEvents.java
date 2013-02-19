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
 * Represents Java interface for COM interface IWMPSliderCtrlEvents.
 */
public interface IWMPSliderCtrlEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{CDAC14D2-8BE4-11D3-BB48-00A0C93CA73A}";

    public static final int DISPID_ondragbegin = 5430;
    public static final int DISPID_ondragend = 5431;
    public static final int DISPID_onpositionchange = 5432;


    /**
     * event ondragbegin
     */
    void ondragbegin()
            throws ComException;

    /**
     * event ondragend
     */
    void ondragend()
            throws ComException;

    /**
     * event onpositionchange
     */
    void onpositionchange()
            throws ComException;
}
