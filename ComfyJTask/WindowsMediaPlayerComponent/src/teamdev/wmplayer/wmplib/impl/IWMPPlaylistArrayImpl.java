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
 * Represents COM interface IWMPPlaylistArray.
 */
public class IWMPPlaylistArrayImpl extends IDispatchImpl
        implements IWMPPlaylistArray {
    public static final String INTERFACE_IDENTIFIER = IWMPPlaylistArray.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlaylistArrayImpl() {
    }

    protected IWMPPlaylistArrayImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlaylistArrayImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlaylistArrayImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlaylistArrayImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the playlist object at the given index
     */
    public IWMPPlaylist item(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        IWMPPlaylistImpl ppItem = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        ppItem == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppItem)
                }
        );
        return ppItem;
    }

    /**
     * Returns the number of items in the playlist array
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

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlaylistArrayImpl(this);
    }
}
