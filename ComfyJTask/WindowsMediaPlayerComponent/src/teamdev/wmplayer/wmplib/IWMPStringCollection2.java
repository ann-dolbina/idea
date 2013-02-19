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
 * Represents Java interface for COM interface IWMPStringCollection2.
 */
public interface IWMPStringCollection2 extends IWMPStringCollection {
    public static final String INTERFACE_IDENTIFIER = "{46AD648D-53F1-4A74-92E2-2A1B68D63FD4}";

    /**
     * Determines if the supplied object is the same as this one
     */
    VariantBool isIdentical(
            IWMPStringCollection2 /*[in]*/ pIWMPStringCollection2)
            throws ComException;

    /**
     * Gets an attribute from a string collection backing object
     */
    BStr getItemInfo(
            Int32 /*[in]*/ lCollectionIndex,
            BStr /*[in]*/ bstrItemName)
            throws ComException;

    /**
     * Gets count of values for a particular attribute
     */
    Int32 getAttributeCountByType(
            Int32 /*[in]*/ lCollectionIndex,
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage)
            throws ComException;

    /**
     * Gets one value of an attribute from a string collection backing object
     */
    Variant getItemInfoByType(
            Int32 /*[in]*/ lCollectionIndex,
            BStr /*[in]*/ bstrType,
            BStr /*[in]*/ bstrLanguage,
            Int32 /*[in]*/ lAttributeIndex)
            throws ComException;
}
