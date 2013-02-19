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
 * Represents Java interface for COM interface IWMPExternalColors.
 */
public interface IWMPExternalColors extends IWMPExternal {
    public static final String INTERFACE_IDENTIFIER = "{D10CCDFF-472D-498C-B5FE-3630E5405E0A}";

    /**
     *
     */
    BStr getAppColorMedium()
            throws ComException;

    /**
     *
     */
    BStr getAppColorDark()
            throws ComException;

    /**
     *
     */
    BStr getAppColorButtonHighlight()
            throws ComException;

    /**
     *
     */
    BStr getAppColorButtonShadow()
            throws ComException;

    /**
     *
     */
    BStr getAppColorButtonHoverFace()
            throws ComException;
}
