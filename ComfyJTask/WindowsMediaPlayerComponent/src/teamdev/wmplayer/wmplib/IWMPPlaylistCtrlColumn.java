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
 * Represents Java interface for COM interface IWMPPlaylistCtrlColumn.
 */
public interface IWMPPlaylistCtrlColumn extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{63D9D30F-AE4C-4678-8CA8-5720F4FE4419}";

    /**
     * property columnName
     */
    BStr getColumnName()
            throws ComException;

    /**
     * property columnName
     */
    void setColumnName(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property columnID
     */
    BStr getColumnID()
            throws ComException;

    /**
     * property columnID
     */
    void setColumnID(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property columnResizeMode
     */
    BStr getColumnResizeMode()
            throws ComException;

    /**
     * property columnResizeMode
     */
    void setColumnResizeMode(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property columnWidth
     */
    Int32 getColumnWidth()
            throws ComException;

    /**
     * property columnWidth
     */
    void setColumnWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;
}
