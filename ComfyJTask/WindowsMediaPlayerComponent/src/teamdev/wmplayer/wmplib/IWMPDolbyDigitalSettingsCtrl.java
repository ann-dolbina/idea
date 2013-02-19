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
 * Represents Java interface for COM interface IWMPDolbyDigitalSettingsCtrl.
 */
public interface IWMPDolbyDigitalSettingsCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{BBD6801A-A1D4-4D05-9F2D-29E0024C3FD9}";

    /**
     *
     */
    void reset()
            throws ComException;

    /**
     *
     */
    Int32 getCurrentPreset()
            throws ComException;

    /**
     *
     */
    void setCurrentPreset(
            Int32 /*[in]*/ plCurrentPreset)
            throws ComException;
}
