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
 * Represents Java interface for COM interface IWMPMenuCtrl.
 */
public interface IWMPMenuCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{158A7ADC-33DA-4039-A553-BDDBBE389F5C}";

    /**
     * method deleteAllItems
     */
    void deleteAllItems()
            throws ComException;

    /**
     * method appendItem
     */
    void appendItem(
            Int32 /*[in]*/ nID,
            BStr /*[in]*/ bstrItem)
            throws ComException;

    /**
     * method appendSeparator
     */
    void appendSeparator()
            throws ComException;

    /**
     * property enableItem
     */
    void enableItem(
            Int32 /*[in]*/ nID,
            VariantBool /*[in]*/ newVal)
            throws ComException;

    /**
     * property checkItem
     */
    void checkItem(
            Int32 /*[in]*/ nID,
            VariantBool /*[in]*/ newVal)
            throws ComException;

    /**
     * property checkRadioItem
     */
    void checkRadioItem(
            Int32 /*[in]*/ nID,
            VariantBool /*[in]*/ newVal)
            throws ComException;

    /**
     * method show
     */
    Int32 show()
            throws ComException;

    /**
     * method showEx
     */
    void showEx(
            Int32 /*[in]*/ nID)
            throws ComException;

    /**
     * property showFlags
     */
    Int32 getShowFlags()
            throws ComException;

    /**
     * property showFlags
     */
    void setShowFlags(
            Int32 /*[in]*/ pVal)
            throws ComException;
}
