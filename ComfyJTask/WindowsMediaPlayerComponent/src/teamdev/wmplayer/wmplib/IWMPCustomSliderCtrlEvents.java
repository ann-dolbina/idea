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
 * Represents Java interface for COM interface IWMPCustomSliderCtrlEvents.
 */
public interface IWMPCustomSliderCtrlEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{95F45AA4-ED0A-11D2-BA67-0000F80855E6}";

    public static final int DISPID_ondragbegin = 5020;
    public static final int DISPID_ondragend = 5021;
    public static final int DISPID_onpositionchange = 5022;


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
