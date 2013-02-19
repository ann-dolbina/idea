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
 * Represents Java interface for COM interface IWMPClosedCaption2.
 */
public interface IWMPClosedCaption2 extends IWMPClosedCaption {
    public static final String INTERFACE_IDENTIFIER = "{350BA78B-6BC8-4113-A5F5-312056934EB6}";

    /**
     * Returns the name of a SAMI language by index
     */
    BStr getSAMILangName(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * Returns the ID of a SAMI language by index
     */
    Int32 getSAMILangID(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * Returns the name of a SAMI style by index
     */
    BStr getSAMIStyleName(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * Returns the count of SAMI languages
     */
    Int32 getSAMILangCount()
            throws ComException;

    /**
     * Returns the count of SAMI styles
     */
    Int32 getSAMIStyleCount()
            throws ComException;
}
