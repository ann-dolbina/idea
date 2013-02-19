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
 * Represents COM interface IWMPPlaylist.
 */
public class IWMPPlaylistImpl extends IDispatchImpl
        implements IWMPPlaylist {
    public static final String INTERFACE_IDENTIFIER = IWMPPlaylist.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlaylistImpl() {
    }

    protected IWMPPlaylistImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlaylistImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlaylistImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlaylistImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the value of a playlist attribute
     */
    public BStr getItemInfo(
            BStr /*[in]*/ bstrName)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     * Sets the value of a playlist attribute
     */
    public void setItemInfo(
            BStr /*[in]*/ bstrName,
            BStr /*[in]*/ bstrValue)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        bstrValue == null ? (Parameter) PTR_NULL : bstrValue
                }
        );
    }

    /**
     * Removes all items from the playlist
     */
    public void clear()
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Inserts an item into the playlist at the specified location
     */
    public void insertItem(
            Int32 /*[in]*/ lIndex,
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pIWMPMedia == null ? (Parameter) PTR_NULL : (Parameter) pIWMPMedia
                }
        );
    }

    /**
     * Adds an item to the end of the playlist
     */
    public void appendItem(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPMedia == null ? (Parameter) PTR_NULL : (Parameter) pIWMPMedia
                }
        );
    }

    /**
     * Removes the specified item from the playlist
     */
    public void removeItem(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPMedia == null ? (Parameter) PTR_NULL : (Parameter) pIWMPMedia
                }
        );
    }

    /**
     * Changes the location of an item in the playlist
     */
    public void moveItem(
            Int32 /*[in]*/ lIndexOld,
            Int32 /*[in]*/ lIndexNew)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndexOld,
                        lIndexNew
                }
        );
    }

    /**
     * Returns the number of items in the playlist
     */
    public Int32 getCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     * Returns the name of the playlist
     */
    public BStr getName()
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     * Returns the name of the playlist
     */
    public void setName(
            BStr /*[in]*/ pbstrName)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : pbstrName
                }
        );
    }

    /**
     * Returns the number of attributes associated with the playlist
     */
    public Int32 getAttributeCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     * Returns the name of an attribute specified by an index
     */
    public BStr getAttributeName(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        BStr pbstrAttributeName = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pbstrAttributeName == null ? (Parameter) PTR_NULL : new Pointer(pbstrAttributeName)
                }
        );
        return pbstrAttributeName;
    }

    /**
     * Returns the item at the specified index
     */
    public IWMPMedia getItem(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        IWMPMediaImpl ppIWMPMedia = new IWMPMediaImpl();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        ppIWMPMedia == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppIWMPMedia)
                }
        );
        return ppIWMPMedia;
    }

    /**
     * Determines if the supplied object is the same as the this one
     */
    public VariantBool getIsIdentical(
            IWMPPlaylist /*[in]*/ pIWMPPlaylist)
            throws ComException {
        VariantBool pvbool = new VariantBool();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPPlaylist == null ? (Parameter) PTR_NULL : (Parameter) pIWMPPlaylist,
                        pvbool == null ? (Parameter) PTR_NULL : new Pointer(pvbool)
                }
        );
        return pvbool;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlaylistImpl(this);
    }
}
