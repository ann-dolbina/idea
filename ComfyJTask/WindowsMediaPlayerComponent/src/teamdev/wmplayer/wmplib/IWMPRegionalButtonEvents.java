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
 * Represents Java interface for COM interface IWMPRegionalButtonEvents.
 */
public interface IWMPRegionalButtonEvents extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{50FC8D31-67AC-11D3-BD4C-00C04F6EA5AE}";

    public static final int DISPID_onblur = 5360;
    public static final int DISPID_onfocus = 5361;
    public static final int DISPID_onclick = 5362;
    public static final int DISPID_ondblclick = 5363;
    public static final int DISPID_onmousedown = 5364;
    public static final int DISPID_onmouseup = 5365;
    public static final int DISPID_onmousemove = 5366;
    public static final int DISPID_onmouseover = 5367;
    public static final int DISPID_onmouseout = 5368;
    public static final int DISPID_onkeypress = 5369;
    public static final int DISPID_onkeydown = 5370;
    public static final int DISPID_onkeyup = 5371;


    /**
     * event onblur
     */
    void onblur()
            throws ComException;

    /**
     * event onfocus
     */
    void onfocus()
            throws ComException;

    /**
     * event onclick
     */
    void onclick()
            throws ComException;

    /**
     * event ondblclick
     */
    void ondblclick()
            throws ComException;

    /**
     * event onmousedown
     */
    void onmousedown()
            throws ComException;

    /**
     * event onmouseup
     */
    void onmouseup()
            throws ComException;

    /**
     * event onmousemove
     */
    void onmousemove()
            throws ComException;

    /**
     * event onmouseover
     */
    void onmouseover()
            throws ComException;

    /**
     * event onmouseout
     */
    void onmouseout()
            throws ComException;

    /**
     * event onkeypress
     */
    void onkeypress()
            throws ComException;

    /**
     * event onkeydown
     */
    void onkeydown()
            throws ComException;

    /**
     * event onkeyup
     */
    void onkeyup()
            throws ComException;
}
