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
 * Represents Java interface for COM interface IWMPVideoSettingsCtrl.
 */
public interface IWMPVideoSettingsCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{07EC23DA-EF73-4BDE-A40F-F269E0B7AFD6}";

    /**
     * method reset
     */
    void reset()
            throws ComException;

    /**
     * property brightness
     */
    Int32 getBrightness()
            throws ComException;

    /**
     * property brightness
     */
    void setBrightness(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property contrast
     */
    Int32 getContrast()
            throws ComException;

    /**
     * property contrast
     */
    void setContrast(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property hue
     */
    Int32 getHue()
            throws ComException;

    /**
     * property hue
     */
    void setHue(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property saturation
     */
    Int32 getSaturation()
            throws ComException;

    /**
     * property saturation
     */
    void setSaturation(
            Int32 /*[in]*/ pVal)
            throws ComException;
}
