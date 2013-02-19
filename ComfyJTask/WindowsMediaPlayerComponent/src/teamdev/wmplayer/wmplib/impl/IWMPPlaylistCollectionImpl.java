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
 * Represents COM interface IWMPPlaylistCollection.
 */
public class IWMPPlaylistCollectionImpl extends IDispatchImpl
        implements IWMPPlaylistCollection {
    public static final String INTERFACE_IDENTIFIER = IWMPPlaylistCollection.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlaylistCollectionImpl() {
    }

    protected IWMPPlaylistCollectionImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlaylistCollectionImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlaylistCollectionImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlaylistCollectionImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Creates a new playlist object
     */
    public IWMPPlaylist newPlaylist(
            BStr /*[in]*/ bstrName)
            throws ComException {
        IWMPPlaylistImpl ppItem = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        ppItem == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppItem)
                }
        );
        return ppItem;
    }

    /**
     * Returns a playlist array with all the playlists
     */
    public IWMPPlaylistArray getAll()
            throws ComException {
        IWMPPlaylistArrayImpl ppPlaylistArray = new IWMPPlaylistArrayImpl();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPlaylistArray == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylistArray)
                }
        );
        return ppPlaylistArray;
    }

    /**
     * Returns a playlist array with playlists matching the given name
     */
    public IWMPPlaylistArray getByName(
            BStr /*[in]*/ bstrName)
            throws ComException {
        IWMPPlaylistArrayImpl ppPlaylistArray = new IWMPPlaylistArrayImpl();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        ppPlaylistArray == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylistArray)
                }
        );
        return ppPlaylistArray;
    }

    /**
     * Removes an item from the playlist collection
     */
    public void remove(
            IWMPPlaylist /*[in]*/ pItem)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem
                }
        );
    }

    /**
     * Sets the deleted flag on a playlist object
     */
    public void setDeleted(
            IWMPPlaylist /*[in]*/ pItem,
            VariantBool /*[in]*/ varfIsDeleted)
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem,
                        varfIsDeleted
                }
        );
    }

    /**
     * Gets the deleted flag on a playlist object
     */
    public VariantBool isDeleted(
            IWMPPlaylist /*[in]*/ pItem)
            throws ComException {
        VariantBool pvarfIsDeleted = new VariantBool();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem,
                        pvarfIsDeleted == null ? (Parameter) PTR_NULL : new Pointer(pvarfIsDeleted)
                }
        );
        return pvarfIsDeleted;
    }

    /**
     * Imports a playlist object into the library
     */
    public IWMPPlaylist importPlaylist(
            IWMPPlaylist /*[in]*/ pItem)
            throws ComException {
        IWMPPlaylistImpl ppImportedItem = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem,
                        ppImportedItem == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppImportedItem)
                }
        );
        return ppImportedItem;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlaylistCollectionImpl(this);
    }
}
