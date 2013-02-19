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
 * Represents Java interface for COM interface IWMPClosedCaption.
 */
public interface IWMPClosedCaption extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{4F2DF574-C588-11D3-9ED0-00C04FB6E937}";

    /**
     * Returns the previously set SAMI style
     */
    BStr getSAMIStyle()
            throws ComException;

    /**
     * Returns the previously set SAMI style
     */
    void setSAMIStyle(
            BStr /*[in]*/ pbstrSAMIStyle)
            throws ComException;

    /**
     * Returns the previously set SAMI language
     */
    BStr getSAMILang()
            throws ComException;

    /**
     * Returns the previously set SAMI language
     */
    void setSAMILang(
            BStr /*[in]*/ pbstrSAMILang)
            throws ComException;

    /**
     * Returns the previously set SAMI file name
     */
    BStr getSAMIFileName()
            throws ComException;

    /**
     * Returns the previously set SAMI file name
     */
    void setSAMIFileName(
            BStr /*[in]*/ pbstrSAMIFileName)
            throws ComException;

    /**
     * Returns the previously set Captioning ID
     */
    BStr getCaptioningId()
            throws ComException;

    /**
     * Returns the previously set Captioning ID
     */
    void setCaptioningId(
            BStr /*[in]*/ pbstrCaptioningID)
            throws ComException;
}
