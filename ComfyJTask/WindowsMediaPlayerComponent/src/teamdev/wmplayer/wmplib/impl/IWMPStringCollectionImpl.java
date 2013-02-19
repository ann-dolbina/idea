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
 * Represents COM interface IWMPStringCollection.
 */
public class IWMPStringCollectionImpl extends IDispatchImpl
        implements IWMPStringCollection {
    public static final String INTERFACE_IDENTIFIER = IWMPStringCollection.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPStringCollectionImpl() {
    }

    protected IWMPStringCollectionImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPStringCollectionImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPStringCollectionImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPStringCollectionImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the string at the given index
     */
    public BStr item(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        BStr pbstrString = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pbstrString == null ? (Parameter) PTR_NULL : new Pointer(pbstrString)
                }
        );
        return pbstrString;
    }

    /**
     * Returns the number of items in the string collection
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
        return new IWMPStringCollectionImpl(this);
    }
}
