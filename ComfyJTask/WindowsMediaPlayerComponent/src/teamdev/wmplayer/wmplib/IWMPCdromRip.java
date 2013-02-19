package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPCdromRip.
 */
public interface IWMPCdromRip extends IUnknown {
    public static final String INTERFACE_IDENTIFIER = "{56E2294F-69ED-4629-A869-AEA72C0DCC2C}";

    /**
     *
     */
    void startRip()
            throws ComException;

    /**
     *
     */
    void stopRip()
            throws ComException;

    /**
     *
     */
    WMPRipState getRipState()
            throws ComException;

    /**
     *
     */
    Int32 getRipProgress()
            throws ComException;
}
