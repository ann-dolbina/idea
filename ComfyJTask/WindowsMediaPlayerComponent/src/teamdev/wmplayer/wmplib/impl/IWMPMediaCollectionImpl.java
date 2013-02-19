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
 * Represents COM interface IWMPMediaCollection.
 */
public class IWMPMediaCollectionImpl extends IDispatchImpl
        implements IWMPMediaCollection {
    public static final String INTERFACE_IDENTIFIER = IWMPMediaCollection.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMediaCollectionImpl() {
    }

    protected IWMPMediaCollectionImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMediaCollectionImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMediaCollectionImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMediaCollectionImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Creates a new media object
     */
    public IWMPMedia add(
            BStr /*[in]*/ bstrURL)
            throws ComException {
        IWMPMediaImpl ppItem = new IWMPMediaImpl();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        ppItem == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppItem)
                }
        );
        return ppItem;
    }

    /**
     * Returns a collection of all the items
     */
    public IWMPPlaylist getAll()
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    /**
     * Returns a collection of items with the given name
     */
    public IWMPPlaylist getByName(
            BStr /*[in]*/ bstrName)
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    /**
     * Returns a collection of items with the given genre
     */
    public IWMPPlaylist getByGenre(
            BStr /*[in]*/ bstrGenre)
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrGenre == null ? (Parameter) PTR_NULL : bstrGenre,
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    /**
     * Returns a collection of items by a given author
     */
    public IWMPPlaylist getByAuthor(
            BStr /*[in]*/ bstrAuthor)
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAuthor == null ? (Parameter) PTR_NULL : bstrAuthor,
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    /**
     * Returns a collection of items from the given album
     */
    public IWMPPlaylist getByAlbum(
            BStr /*[in]*/ bstrAlbum)
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAlbum == null ? (Parameter) PTR_NULL : bstrAlbum,
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    /**
     * Returns a collection of items with the given attribute
     */
    public IWMPPlaylist getByAttribute(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrValue)
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAttribute == null ? (Parameter) PTR_NULL : bstrAttribute,
                        bstrValue == null ? (Parameter) PTR_NULL : bstrValue,
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    /**
     * Removes an item from the media collection
     */
    public void remove(
            IWMPMedia /*[in]*/ pItem,
            VariantBool /*[in]*/ varfDeleteFile)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem,
                        varfDeleteFile
                }
        );
    }

    /**
     * Returns the string collection associated with an attribute
     */
    public IWMPStringCollection getAttributeStringCollection(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrMediaType)
            throws ComException {
        IWMPStringCollectionImpl ppStringCollection = new IWMPStringCollectionImpl();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAttribute == null ? (Parameter) PTR_NULL : bstrAttribute,
                        bstrMediaType == null ? (Parameter) PTR_NULL : bstrMediaType,
                        ppStringCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppStringCollection)
                }
        );
        return ppStringCollection;
    }

    /**
     * Gets an atom associated with an item name which can be requested from an IWMPMedia out of this collection via getItemInfoByAtom
     */
    public Int32 getMediaAtom(
            BStr /*[in]*/ bstrItemName)
            throws ComException {
        Int32 plAtom = new Int32();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        plAtom == null ? (Parameter) PTR_NULL : new Pointer(plAtom)
                }
        );
        return plAtom;
    }

    /**
     * Sets the deleted flag on a media object
     */
    public void setDeleted(
            IWMPMedia /*[in]*/ pItem,
            VariantBool /*[in]*/ varfIsDeleted)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem,
                        varfIsDeleted
                }
        );
    }

    /**
     * Gets the deleted flag on a media object
     */
    public VariantBool isDeleted(
            IWMPMedia /*[in]*/ pItem)
            throws ComException {
        VariantBool pvarfIsDeleted = new VariantBool();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pItem == null ? (Parameter) PTR_NULL : (Parameter) pItem,
                        pvarfIsDeleted == null ? (Parameter) PTR_NULL : new Pointer(pvarfIsDeleted)
                }
        );
        return pvarfIsDeleted;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMediaCollectionImpl(this);
    }
}
