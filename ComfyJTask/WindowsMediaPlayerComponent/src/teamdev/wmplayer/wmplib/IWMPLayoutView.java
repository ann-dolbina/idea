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
 * Represents Java interface for COM interface IWMPLayoutView.
 */
public interface IWMPLayoutView extends IWMPLayoutSubView {
    public static final String INTERFACE_IDENTIFIER = "{172E905D-80D9-4C2F-B7CE-2CCB771787A2}";

    /**
     * method close
     */
    void close()
            throws ComException;

    /**
     * method minimize
     */
    void minimize()
            throws ComException;

    /**
     * method maximize
     */
    void maximize()
            throws ComException;

    /**
     * method restore
     */
    void restore()
            throws ComException;

    /**
     * method size
     */
    void size(
            BStr /*[in]*/ bstrDirection)
            throws ComException;

    /**
     * method returnToMediaCenter
     */
    void returnToMediaCenter()
            throws ComException;

    /**
     * method updateWindow
     */
    void updateWindow()
            throws ComException;

    /**
     * property title
     */
    BStr getTitle()
            throws ComException;

    /**
     * property title
     */
    void setTitle(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property category
     */
    BStr getCategory()
            throws ComException;

    /**
     * property category
     */
    void setCategory(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property focusObjectID
     */
    BStr getFocusObjectID()
            throws ComException;

    /**
     * property focusObjectID
     */
    void setFocusObjectID(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property titleBar
     */
    VariantBool getTitleBar()
            throws ComException;

    /**
     * property resizable
     */
    VariantBool getResizable()
            throws ComException;

    /**
     * property timerInterval
     */
    Int32 getTimerInterval()
            throws ComException;

    /**
     * property timerInterval
     */
    void setTimerInterval(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property minWidth
     */
    Int32 getMinWidth()
            throws ComException;

    /**
     * property minWidth
     */
    void setMinWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property maxWidth
     */
    Int32 getMaxWidth()
            throws ComException;

    /**
     * property maxWidth
     */
    void setMaxWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property minHeight
     */
    Int32 getMinHeight()
            throws ComException;

    /**
     * property minHeight
     */
    void setMinHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property maxHeight
     */
    Int32 getMaxHeight()
            throws ComException;

    /**
     * property maxHeight
     */
    void setMaxHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     *
     */
    VariantBool getMaximized()
            throws ComException;

    /**
     *
     */
    VariantBool getMinimized()
            throws ComException;
}
