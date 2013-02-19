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
 * Represents COM interface IWMPMediaCollection2.
 */
public class IWMPMediaCollection2Impl extends IWMPMediaCollectionImpl
        implements IWMPMediaCollection2 {
    public static final String INTERFACE_IDENTIFIER = IWMPMediaCollection2.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMediaCollection2Impl() {
    }

    protected IWMPMediaCollection2Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMediaCollection2Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMediaCollection2Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMediaCollection2Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Creates an empty query object
     */
    public IWMPQuery createQuery()
            throws ComException {
        IWMPQueryImpl ppQuery = new IWMPQueryImpl();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppQuery == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppQuery)
                }
        );
        return ppQuery;
    }

    /**
     * Creates a playlist from a query
     */
    public IWMPPlaylist getPlaylistByQuery(
            IWMPQuery /*[in]*/ pQuery,
            BStr /*[in]*/ bstrMediaType,
            BStr /*[in]*/ bstrSortAttribute,
            VariantBool /*[in]*/ fSortAscending)
            throws ComException {
        IWMPPlaylistImpl ppPlaylist = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pQuery == null ? (Parameter) PTR_NULL : (Parameter) pQuery,
                        bstrMediaType == null ? (Parameter) PTR_NULL : bstrMediaType,
                        bstrSortAttribute == null ? (Parameter) PTR_NULL : bstrSortAttribute,
                        fSortAscending,
                        ppPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylist)
                }
        );
        return ppPlaylist;
    }

    /**
     * Creates a string collection from a query
     */
    public IWMPStringCollection getStringCollectionByQuery(
            BStr /*[in]*/ bstrAttribute,
            IWMPQuery /*[in]*/ pQuery,
            BStr /*[in]*/ bstrMediaType,
            BStr /*[in]*/ bstrSortAttribute,
            VariantBool /*[in]*/ fSortAscending)
            throws ComException {
        IWMPStringCollectionImpl ppStringCollection = new IWMPStringCollectionImpl();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAttribute == null ? (Parameter) PTR_NULL : bstrAttribute,
                        pQuery == null ? (Parameter) PTR_NULL : (Parameter) pQuery,
                        bstrMediaType == null ? (Parameter) PTR_NULL : bstrMediaType,
                        bstrSortAttribute == null ? (Parameter) PTR_NULL : bstrSortAttribute,
                        fSortAscending,
                        ppStringCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppStringCollection)
                }
        );
        return ppStringCollection;
    }

    /**
     * Returns a collection of items with the given attribute and media type
     */
    public IWMPPlaylist getByAttributeAndMediaType(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrValue,
            BStr /*[in]*/ bstrMediaType)
            throws ComException {
        IWMPPlaylistImpl ppMediaItems = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAttribute == null ? (Parameter) PTR_NULL : bstrAttribute,
                        bstrValue == null ? (Parameter) PTR_NULL : bstrValue,
                        bstrMediaType == null ? (Parameter) PTR_NULL : bstrMediaType,
                        ppMediaItems == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaItems)
                }
        );
        return ppMediaItems;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMediaCollection2Impl(this);
    }
}
