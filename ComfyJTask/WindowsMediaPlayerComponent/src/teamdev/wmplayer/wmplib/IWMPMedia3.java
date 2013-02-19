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
 * Represents Java interface for COM interface IWMPMedia3.
 */
public interface IWMPMedia3 extends IWMPMedia2 {
    public static final String INTERFACE_IDENTIFIER = "{F118EFC7-F03A-4FB4-99C9-1C02A5C1065B}";

    /**
     *
     */
    Int32 getAttributeCountByType(
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage)
            throws ComException;

    /**
     *
     */
    Variant getItemInfoByType(
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage,
            Int32 /*[in]*/ lIndex)
            throws ComException;
}
