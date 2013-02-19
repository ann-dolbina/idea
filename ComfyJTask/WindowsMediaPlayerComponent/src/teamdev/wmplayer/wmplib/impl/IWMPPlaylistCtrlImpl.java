package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPPlaylistCtrl.
 */
public class IWMPPlaylistCtrlImpl extends IDispatchImpl
        implements IWMPPlaylistCtrl {
    public static final String INTERFACE_IDENTIFIER = IWMPPlaylistCtrl.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlaylistCtrlImpl() {
    }

    protected IWMPPlaylistCtrlImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlaylistCtrlImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlaylistCtrlImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlaylistCtrlImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method copy
     */
    public void copy()
            throws ComException {
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method abortCopy
     */
    public void abortCopy()
            throws ComException {
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method deleteSelected
     */
    public void deleteSelected()
            throws ComException {
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method deleteSelectedFromLibrary
     */
    public void deleteSelectedFromLibrary()
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method moveSelectedUp
     */
    public void moveSelectedUp()
            throws ComException {
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method moveSelectedDown
     */
    public void moveSelectedDown()
            throws ComException {
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * method addSelectedToPlaylist
     */
    public void addSelectedToPlaylist(
            IWMPPlaylist /*[in]*/ pdispPlaylist)
            throws ComException {
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pdispPlaylist == null ? (Parameter) PTR_NULL : (Parameter) pdispPlaylist
                }
        );
    }

    /**
     * method getNextSelectedItem
     */
    public Int32 getNextSelectedItem(
            Int32 /*[in]*/ nStartIndex)
            throws ComException {
        Int32 pnSelected = new Int32();
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStartIndex,
                        pnSelected == null ? (Parameter) PTR_NULL : new Pointer(pnSelected)
                }
        );
        return pnSelected;
    }

    /**
     * method getNextCheckedItem
     */
    public Int32 getNextCheckedItem(
            Int32 /*[in]*/ nStartIndex)
            throws ComException {
        Int32 pnChecked = new Int32();
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStartIndex,
                        pnChecked == null ? (Parameter) PTR_NULL : new Pointer(pnChecked)
                }
        );
        return pnChecked;
    }

    /**
     * method setSelectedState
     */
    public void setSelectedState(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbSelected)
            throws ComException {
        invokeStandardVirtualMethod(
                53,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        vbSelected
                }
        );
    }

    /**
     * method setCheckedState
     */
    public void setCheckedState(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbChecked)
            throws ComException {
        invokeStandardVirtualMethod(
                54,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        vbChecked
                }
        );
    }

    /**
     * method sortColumn
     */
    public void sortColumn(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        invokeStandardVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex
                }
        );
    }

    /**
     * method setColumnResizeMode
     */
    public void setColumnResizeMode(
            Int32 /*[in]*/ nIndex,
            BStr /*[in]*/ newMode)
            throws ComException {
        invokeStandardVirtualMethod(
                56,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        newMode == null ? (Parameter) PTR_NULL : newMode
                }
        );
    }

    /**
     * method setColumnWidth
     */
    public void setColumnWidth(
            Int32 /*[in]*/ nIndex,
            Int32 /*[in]*/ nWidth)
            throws ComException {
        invokeStandardVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        nWidth
                }
        );
    }

    /**
     * method getNextSelectedItem2
     */
    public Int32 getNextSelectedItem2(
            Int32 /*[in]*/ nStartIndex)
            throws ComException {
        Int32 pnSelected = new Int32();
        invokeStandardVirtualMethod(
                63,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStartIndex,
                        pnSelected == null ? (Parameter) PTR_NULL : new Pointer(pnSelected)
                }
        );
        return pnSelected;
    }

    /**
     * method getNextCheckedItem2
     */
    public Int32 getNextCheckedItem2(
            Int32 /*[in]*/ nStartIndex)
            throws ComException {
        Int32 pnChecked = new Int32();
        invokeStandardVirtualMethod(
                64,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nStartIndex,
                        pnChecked == null ? (Parameter) PTR_NULL : new Pointer(pnChecked)
                }
        );
        return pnChecked;
    }

    /**
     * method setSelectedState2
     */
    public void setSelectedState2(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbSelected)
            throws ComException {
        invokeStandardVirtualMethod(
                65,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        vbSelected
                }
        );
    }

    /**
     * method setCheckedState2
     */
    public void setCheckedState2(
            Int32 /*[in]*/ nIndex,
            VariantBool /*[in]*/ vbChecked)
            throws ComException {
        invokeStandardVirtualMethod(
                66,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        vbChecked
                }
        );
    }

    /**
     * property playlist
     */
    public IWMPPlaylist getPlaylist()
            throws ComException {
        IWMPPlaylistImpl ppdispPlaylist = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppdispPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppdispPlaylist)
                }
        );
        return ppdispPlaylist;
    }

    /**
     * property playlist
     */
    public void setPlaylist(
            IWMPPlaylist /*[in]*/ ppdispPlaylist)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppdispPlaylist == null ? (Parameter) PTR_NULL : (Parameter) ppdispPlaylist
                }
        );
    }

    /**
     * property columns
     */
    public BStr getColumns()
            throws ComException {
        BStr pbstrColumns = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColumns == null ? (Parameter) PTR_NULL : new Pointer(pbstrColumns)
                }
        );
        return pbstrColumns;
    }

    /**
     * property columns
     */
    public void setColumns(
            BStr /*[in]*/ pbstrColumns)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColumns == null ? (Parameter) PTR_NULL : pbstrColumns
                }
        );
    }

    /**
     * property columnCount
     */
    public Int32 getColumnCount()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property columnOrder
     */
    public BStr getColumnOrder()
            throws ComException {
        BStr pbstrColumnOrder = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColumnOrder == null ? (Parameter) PTR_NULL : new Pointer(pbstrColumnOrder)
                }
        );
        return pbstrColumnOrder;
    }

    /**
     * property columnOrder
     */
    public void setColumnOrder(
            BStr /*[in]*/ pbstrColumnOrder)
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColumnOrder == null ? (Parameter) PTR_NULL : pbstrColumnOrder
                }
        );
    }

    /**
     * property columnsVisible
     */
    public VariantBool getColumnsVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property columnsVisible
     */
    public void setColumnsVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property dropDownVisible
     */
    public VariantBool getDropDownVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property dropDownVisible
     */
    public void setDropDownVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property playlistItemsVisible
     */
    public VariantBool getPlaylistItemsVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property playlistItemsVisible
     */
    public void setPlaylistItemsVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property checkboxesVisible
     */
    public VariantBool getCheckboxesVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property checkboxesVisible
     */
    public void setCheckboxesVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property backgroundColor
     */
    public BStr getBackgroundColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property backgroundColor
     */
    public void setBackgroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property foregroundColor
     */
    public BStr getForegroundColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property foregroundColor
     */
    public void setForegroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property disabledItemColor
     */
    public BStr getDisabledItemColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property disabledItemColor
     */
    public void setDisabledItemColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property itemPlayingColor
     */
    public BStr getItemPlayingColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property itemPlayingColor
     */
    public void setItemPlayingColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property itemPlayingBackgroundColor
     */
    public BStr getItemPlayingBackgroundColor()
            throws ComException {
        BStr pbstrBackgroundColor = new BStr();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrBackgroundColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrBackgroundColor)
                }
        );
        return pbstrBackgroundColor;
    }

    /**
     * property itemPlayingBackgroundColor
     */
    public void setItemPlayingBackgroundColor(
            BStr /*[in]*/ pbstrBackgroundColor)
            throws ComException {
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrBackgroundColor == null ? (Parameter) PTR_NULL : pbstrBackgroundColor
                }
        );
    }

    /**
     * property backgroundImage
     */
    public BStr getBackgroundImage()
            throws ComException {
        BStr pbstrImage = new BStr();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrImage == null ? (Parameter) PTR_NULL : new Pointer(pbstrImage)
                }
        );
        return pbstrImage;
    }

    /**
     * property backgroundImage
     */
    public void setBackgroundImage(
            BStr /*[in]*/ pbstrImage)
            throws ComException {
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrImage == null ? (Parameter) PTR_NULL : pbstrImage
                }
        );
    }

    /**
     * property allowItemEditing
     */
    public VariantBool getAllowItemEditing()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property allowItemEditing
     */
    public void setAllowItemEditing(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property allowColumnSorting
     */
    public VariantBool getAllowColumnSorting()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property allowColumnSorting
     */
    public void setAllowColumnSorting(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property dropDownList
     */
    public BStr getDropDownList()
            throws ComException {
        BStr pbstrList = new BStr();
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrList == null ? (Parameter) PTR_NULL : new Pointer(pbstrList)
                }
        );
        return pbstrList;
    }

    /**
     * property dropDownList
     */
    public void setDropDownList(
            BStr /*[in]*/ pbstrList)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrList == null ? (Parameter) PTR_NULL : pbstrList
                }
        );
    }

    /**
     * property dropDownToolTip
     */
    public BStr getDropDownToolTip()
            throws ComException {
        BStr pbstrToolTip = new BStr();
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrToolTip == null ? (Parameter) PTR_NULL : new Pointer(pbstrToolTip)
                }
        );
        return pbstrToolTip;
    }

    /**
     * property dropDownToolTip
     */
    public void setDropDownToolTip(
            BStr /*[in]*/ pbstrToolTip)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrToolTip == null ? (Parameter) PTR_NULL : pbstrToolTip
                }
        );
    }

    /**
     * property copying
     */
    public VariantBool getCopying()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property copying
     */
    public void setCopying(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property itemErrorColor
     */
    public BStr getItemErrorColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                58,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property itemErrorColor
     */
    public void setItemErrorColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                59,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property itemCount
     */
    public Int32 getItemCount()
            throws ComException {
        Int32 pnItemCount = new Int32();
        invokeStandardVirtualMethod(
                60,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pnItemCount == null ? (Parameter) PTR_NULL : new Pointer(pnItemCount)
                }
        );
        return pnItemCount;
    }

    /**
     * property itemMedia
     */
    public IWMPMedia getItemMedia(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        IWMPMediaImpl ppMedia = new IWMPMediaImpl();
        invokeStandardVirtualMethod(
                61,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        ppMedia == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMedia)
                }
        );
        return ppMedia;
    }

    /**
     * property itemPlaylist
     */
    public IWMPPlaylist getItemPlaylist(
            Int32 /*[in]*/ nIndex)
            throws ComException {
        IWMPPlaylistImpl ppPlaylist = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                62,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        nIndex,
                        ppPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylist)
                }
        );
        return ppPlaylist;
    }

    /**
     * property leftStatus
     */
    public BStr getLeftStatus()
            throws ComException {
        BStr pbstrStatus = new BStr();
        invokeStandardVirtualMethod(
                67,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrStatus)
                }
        );
        return pbstrStatus;
    }

    /**
     * property leftStatus
     */
    public void setLeftStatus(
            BStr /*[in]*/ pbstrStatus)
            throws ComException {
        invokeStandardVirtualMethod(
                68,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrStatus == null ? (Parameter) PTR_NULL : pbstrStatus
                }
        );
    }

    /**
     * property rightStatus
     */
    public BStr getRightStatus()
            throws ComException {
        BStr pbstrStatus = new BStr();
        invokeStandardVirtualMethod(
                69,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrStatus)
                }
        );
        return pbstrStatus;
    }

    /**
     * property rightStatus
     */
    public void setRightStatus(
            BStr /*[in]*/ pbstrStatus)
            throws ComException {
        invokeStandardVirtualMethod(
                70,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrStatus == null ? (Parameter) PTR_NULL : pbstrStatus
                }
        );
    }

    /**
     * property editButtonVisible
     */
    public VariantBool getEditButtonVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                71,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property editButtonVisible
     */
    public void setEditButtonVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                72,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property dropDownImage
     */
    public BStr getDropDownImage()
            throws ComException {
        BStr pbstrImage = new BStr();
        invokeStandardVirtualMethod(
                73,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrImage == null ? (Parameter) PTR_NULL : new Pointer(pbstrImage)
                }
        );
        return pbstrImage;
    }

    /**
     * property dropDownImage
     */
    public void setDropDownImage(
            BStr /*[in]*/ pbstrImage)
            throws ComException {
        invokeStandardVirtualMethod(
                74,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrImage == null ? (Parameter) PTR_NULL : pbstrImage
                }
        );
    }

    /**
     * property dropDownBackgroundImage
     */
    public BStr getDropDownBackgroundImage()
            throws ComException {
        BStr pbstrImage = new BStr();
        invokeStandardVirtualMethod(
                75,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrImage == null ? (Parameter) PTR_NULL : new Pointer(pbstrImage)
                }
        );
        return pbstrImage;
    }

    /**
     * property dropDownBackgroundImage
     */
    public void setDropDownBackgroundImage(
            BStr /*[in]*/ pbstrImage)
            throws ComException {
        invokeStandardVirtualMethod(
                76,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrImage == null ? (Parameter) PTR_NULL : pbstrImage
                }
        );
    }

    /**
     * property hueShift
     */
    public SingleFloat getHueShift()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                77,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property hueShift
     */
    public void setHueShift(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                78,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property saturation
     */
    public SingleFloat getSaturation()
            throws ComException {
        SingleFloat pVal = new SingleFloat();
        invokeStandardVirtualMethod(
                79,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property saturation
     */
    public void setSaturation(
            SingleFloat /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                80,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property statusColor
     */
    public BStr getStatusColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                81,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property statusColor
     */
    public void setStatusColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                82,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property toolbarVisible
     */
    public VariantBool getToolbarVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                83,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property toolbarVisible
     */
    public void setToolbarVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                84,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property itemSelectedColor
     */
    public BStr getItemSelectedColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                85,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property itemSelectedColor
     */
    public void setItemSelectedColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                86,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property itemSelectedFocusLostColor
     */
    public BStr getItemSelectedFocusLostColor()
            throws ComException {
        BStr pbstrFocusLostColor = new BStr();
        invokeStandardVirtualMethod(
                87,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFocusLostColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrFocusLostColor)
                }
        );
        return pbstrFocusLostColor;
    }

    /**
     * property itemSelectedFocusLostColor
     */
    public void setItemSelectedFocusLostColor(
            BStr /*[in]*/ pbstrFocusLostColor)
            throws ComException {
        invokeStandardVirtualMethod(
                88,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFocusLostColor == null ? (Parameter) PTR_NULL : pbstrFocusLostColor
                }
        );
    }

    /**
     * property itemSelectedBackgroundColor
     */
    public BStr getItemSelectedBackgroundColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                89,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property itemSelectedBackgroundColor
     */
    public void setItemSelectedBackgroundColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                90,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property itemSelectedBackgroundFocusLostColor
     */
    public BStr getItemSelectedBackgroundFocusLostColor()
            throws ComException {
        BStr pbstrFocusLostColor = new BStr();
        invokeStandardVirtualMethod(
                91,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFocusLostColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrFocusLostColor)
                }
        );
        return pbstrFocusLostColor;
    }

    /**
     * property itemSelectedBackgroundFocusLostColor
     */
    public void setItemSelectedBackgroundFocusLostColor(
            BStr /*[in]*/ pbstrFocusLostColor)
            throws ComException {
        invokeStandardVirtualMethod(
                92,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFocusLostColor == null ? (Parameter) PTR_NULL : pbstrFocusLostColor
                }
        );
    }

    /**
     * property backgroundSplitColor
     */
    public BStr getBackgroundSplitColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                93,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property backgroundSplitColor
     */
    public void setBackgroundSplitColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                94,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    /**
     * property statusTextColor
     */
    public BStr getStatusTextColor()
            throws ComException {
        BStr pbstrColor = new BStr();
        invokeStandardVirtualMethod(
                95,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : new Pointer(pbstrColor)
                }
        );
        return pbstrColor;
    }

    /**
     * property statusTextColor
     */
    public void setStatusTextColor(
            BStr /*[in]*/ pbstrColor)
            throws ComException {
        invokeStandardVirtualMethod(
                96,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrColor == null ? (Parameter) PTR_NULL : pbstrColor
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlaylistCtrlImpl(this);
    }
}
