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
 * Represents Java interface for COM interface IWMPEventObject.
 */
public interface IWMPEventObject extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{5AF0BEC1-46AA-11D3-BD45-00C04F6EA5AE}";

    /**
     *
     */
    IDispatch getSrcElement()
            throws ComException;

    /**
     *
     */
    VariantBool getAltKey()
            throws ComException;

    /**
     *
     */
    VariantBool getCtrlKey()
            throws ComException;

    /**
     *
     */
    VariantBool getShiftKey()
            throws ComException;

    /**
     *
     */
    IDispatch getFromElement()
            throws ComException;

    /**
     *
     */
    IDispatch getToElement()
            throws ComException;

    /**
     *
     */
    void setKeyCode(
            Int32 /*[in]*/ p)
            throws ComException;

    /**
     *
     */
    Int32 getKeyCode()
            throws ComException;

    /**
     *
     */
    Int32 getButton()
            throws ComException;

    /**
     *
     */
    Int32 getX()
            throws ComException;

    /**
     *
     */
    Int32 getY()
            throws ComException;

    /**
     *
     */
    Int32 getClientX()
            throws ComException;

    /**
     *
     */
    Int32 getClientY()
            throws ComException;

    /**
     *
     */
    Int32 getOffsetX()
            throws ComException;

    /**
     *
     */
    Int32 getOffsetY()
            throws ComException;

    /**
     *
     */
    Int32 getScreenX()
            throws ComException;

    /**
     *
     */
    Int32 getScreenY()
            throws ComException;

    /**
     *
     */
    Int32 getScreenWidth()
            throws ComException;

    /**
     *
     */
    Int32 getScreenHeight()
            throws ComException;

    /**
     *
     */
    VariantBool getPenOrTouch()
            throws ComException;
}
