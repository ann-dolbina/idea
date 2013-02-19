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
 * Represents Java interface for COM interface IWMPPlaylistCtrl.
 */
public interface IWMPPlaylistCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{5F9CFD92-8CAD-11D3-9A7E-00C04F8EFB70}";

    /**
     * method copy
     */
    void copy()
            throws ComException;

    /**
     * method abortCopy
     */
    void abortCopy()
            throws ComException;

    /**
     * method deleteSelected
     */
    void deleteSelected()
            throws ComException;

    /**
     * method deleteSelectedFromLibrary
     */
    void deleteSelectedFromLibrary()
            throws ComException;

    /**
     * method moveSelectedUp
     */
    void moveSelectedUp()
            throws ComException;

    /**
     * method moveSelectedDown
     */
    void moveSelectedDown()
            throws ComException;

    /**
     * method addSelectedToPlaylist
     */
    void addSelectedToPlaylist(
            IWMPPlaylist /*[in]*/ pdispPlaylist)
            throws ComException;

    /**
     * method getNextSelectedItem
     */
    Int32 getNextSelectedItem(
            Int32 /*[in]*/ nStartIndex)
            throws ComException;

    /**
     * method getNextCheckedItem
     */
    Int32 getNextCheckedItem(
            Int32 /*[in]*/ nStartIndex)
            throws ComException;

    /**
     * method setSelectedState
     */
    void setSelectedState(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbSelected)
            throws ComException;

    /**
     * method setCheckedState
     */
    void setCheckedState(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbChecked)
            throws ComException;

    /**
     * method sortColumn
     */
    void sortColumn(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * method setColumnResizeMode
     */
    void setColumnResizeMode(
            Int32 /*[in]*/ nIndex,
            BStr /*[in]*/ newMode)
            throws ComException;

    /**
     * method setColumnWidth
     */
    void setColumnWidth(
            Int32 /*[in]*/ nIndex,
            Int32 /*[in]*/ nWidth)
            throws ComException;

    /**
     * method getNextSelectedItem2
     */
    Int32 getNextSelectedItem2(
            Int32 /*[in]*/ nStartIndex)
            throws ComException;

    /**
     * method getNextCheckedItem2
     */
    Int32 getNextCheckedItem2(
            Int32 /*[in]*/ nStartIndex)
            throws ComException;

    /**
     * method setSelectedState2
     */
    void setSelectedState2(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbSelected)
            throws ComException;

    /**
     * method setCheckedState2
     */
    void setCheckedState2(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbChecked)
            throws ComException;

    /**
     * property playlist
     */
    IWMPPlaylist getPlaylist()
            throws ComException;

    /**
     * property playlist
     */
    void setPlaylist(
            IWMPPlaylist /*[in]*/ ppdispPlaylist)
            throws ComException;

    /**
     * property columns
     */
    BStr getColumns()
            throws ComException;

    /**
     * property columns
     */
    void setColumns(
            BStr /*[in]*/ pbstrColumns)
            throws ComException;

    /**
     * property columnCount
     */
    Int32 getColumnCount()
            throws ComException;

    /**
     * property columnOrder
     */
    BStr getColumnOrder()
            throws ComException;

    /**
     * property columnOrder
     */
    void setColumnOrder(
            BStr /*[in]*/ pbstrColumnOrder)
            throws ComException;

    /**
     * property columnsVisible
     */
    VariantBool getColumnsVisible()
            throws ComException;

    /**
     * property columnsVisible
     */
    void setColumnsVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property dropDownVisible
     */
    VariantBool getDropDownVisible()
            throws ComException;

    /**
     * property dropDownVisible
     */
    void setDropDownVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property playlistItemsVisible
     */
    VariantBool getPlaylistItemsVisible()
            throws ComException;

    /**
     * property playlistItemsVisible
     */
    void setPlaylistItemsVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property checkboxesVisible
     */
    VariantBool getCheckboxesVisible()
            throws ComException;

    /**
     * property checkboxesVisible
     */
    void setCheckboxesVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property backgroundColor
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     * property backgroundColor
     */
    void setBackgroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property foregroundColor
     */
    BStr getForegroundColor()
            throws ComException;

    /**
     * property foregroundColor
     */
    void setForegroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property disabledItemColor
     */
    BStr getDisabledItemColor()
            throws ComException;

    /**
     * property disabledItemColor
     */
    void setDisabledItemColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property itemPlayingColor
     */
    BStr getItemPlayingColor()
            throws ComException;

    /**
     * property itemPlayingColor
     */
    void setItemPlayingColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property itemPlayingBackgroundColor
     */
    BStr getItemPlayingBackgroundColor()
            throws ComException;

    /**
     * property itemPlayingBackgroundColor
     */
    void setItemPlayingBackgroundColor(
            BStr /*[in]*/ pbstrBackgroundColor)
            throws ComException;

    /**
     * property backgroundImage
     */
    BStr getBackgroundImage()
            throws ComException;

    /**
     * property backgroundImage
     */
    void setBackgroundImage(
            BStr /*[in]*/ pbstrImage)
            throws ComException;

    /**
     * property allowItemEditing
     */
    VariantBool getAllowItemEditing()
            throws ComException;

    /**
     * property allowItemEditing
     */
    void setAllowItemEditing(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property allowColumnSorting
     */
    VariantBool getAllowColumnSorting()
            throws ComException;

    /**
     * property allowColumnSorting
     */
    void setAllowColumnSorting(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property dropDownList
     */
    BStr getDropDownList()
            throws ComException;

    /**
     * property dropDownList
     */
    void setDropDownList(
            BStr /*[in]*/ pbstrList)
            throws ComException;

    /**
     * property dropDownToolTip
     */
    BStr getDropDownToolTip()
            throws ComException;

    /**
     * property dropDownToolTip
     */
    void setDropDownToolTip(
            BStr /*[in]*/ pbstrToolTip)
            throws ComException;

    /**
     * property copying
     */
    VariantBool getCopying()
            throws ComException;

    /**
     * property copying
     */
    void setCopying(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property itemErrorColor
     */
    BStr getItemErrorColor()
            throws ComException;

    /**
     * property itemErrorColor
     */
    void setItemErrorColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property itemCount
     */
    Int32 getItemCount()
            throws ComException;

    /**
     * property itemMedia
     */
    IWMPMedia getItemMedia(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * property itemPlaylist
     */
    IWMPPlaylist getItemPlaylist(
            Int32 /*[in]*/ nIndex)
            throws ComException;

    /**
     * property leftStatus
     */
    BStr getLeftStatus()
            throws ComException;

    /**
     * property leftStatus
     */
    void setLeftStatus(
            BStr /*[in]*/ pbstrStatus)
            throws ComException;

    /**
     * property rightStatus
     */
    BStr getRightStatus()
            throws ComException;

    /**
     * property rightStatus
     */
    void setRightStatus(
            BStr /*[in]*/ pbstrStatus)
            throws ComException;

    /**
     * property editButtonVisible
     */
    VariantBool getEditButtonVisible()
            throws ComException;

    /**
     * property editButtonVisible
     */
    void setEditButtonVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property dropDownImage
     */
    BStr getDropDownImage()
            throws ComException;

    /**
     * property dropDownImage
     */
    void setDropDownImage(
            BStr /*[in]*/ pbstrImage)
            throws ComException;

    /**
     * property dropDownBackgroundImage
     */
    BStr getDropDownBackgroundImage()
            throws ComException;

    /**
     * property dropDownBackgroundImage
     */
    void setDropDownBackgroundImage(
            BStr /*[in]*/ pbstrImage)
            throws ComException;

    /**
     * property hueShift
     */
    SingleFloat getHueShift()
            throws ComException;

    /**
     * property hueShift
     */
    void setHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property saturation
     */
    SingleFloat getSaturation()
            throws ComException;

    /**
     * property saturation
     */
    void setSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property statusColor
     */
    BStr getStatusColor()
            throws ComException;

    /**
     * property statusColor
     */
    void setStatusColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property toolbarVisible
     */
    VariantBool getToolbarVisible()
            throws ComException;

    /**
     * property toolbarVisible
     */
    void setToolbarVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property itemSelectedColor
     */
    BStr getItemSelectedColor()
            throws ComException;

    /**
     * property itemSelectedColor
     */
    void setItemSelectedColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property itemSelectedFocusLostColor
     */
    BStr getItemSelectedFocusLostColor()
            throws ComException;

    /**
     * property itemSelectedFocusLostColor
     */
    void setItemSelectedFocusLostColor(
            BStr /*[in]*/ pbstrFocusLostColor)
            throws ComException;

    /**
     * property itemSelectedBackgroundColor
     */
    BStr getItemSelectedBackgroundColor()
            throws ComException;

    /**
     * property itemSelectedBackgroundColor
     */
    void setItemSelectedBackgroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property itemSelectedBackgroundFocusLostColor
     */
    BStr getItemSelectedBackgroundFocusLostColor()
            throws ComException;

    /**
     * property itemSelectedBackgroundFocusLostColor
     */
    void setItemSelectedBackgroundFocusLostColor(
            BStr /*[in]*/ pbstrFocusLostColor)
            throws ComException;

    /**
     * property backgroundSplitColor
     */
    BStr getBackgroundSplitColor()
            throws ComException;

    /**
     * property backgroundSplitColor
     */
    void setBackgroundSplitColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;

    /**
     * property statusTextColor
     */
    BStr getStatusTextColor()
            throws ComException;

    /**
     * property statusTextColor
     */
    void setStatusTextColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException;
}
