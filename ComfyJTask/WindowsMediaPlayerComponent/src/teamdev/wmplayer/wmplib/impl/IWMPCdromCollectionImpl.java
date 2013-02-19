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
 * Represents COM interface IWMPCdromCollection.
 */
public class IWMPCdromCollectionImpl extends IDispatchImpl
        implements IWMPCdromCollection {
    public static final String INTERFACE_IDENTIFIER = IWMPCdromCollection.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCdromCollectionImpl() {
    }

    protected IWMPCdromCollectionImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCdromCollectionImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCdromCollectionImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCdromCollectionImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the CDROM object at the given index
     */
    public IWMPCdrom item(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        IWMPCdromImpl ppItem = new IWMPCdromImpl();
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
     * Returns the CDROM object associated with a particular drive specifier, e.g. F:
     */
    public IWMPCdrom getByDriveSpecifier(
            BStr /*[in]*/ bstrDriveSpecifier)
            throws ComException {
        IWMPCdromImpl ppCdrom = new IWMPCdromImpl();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrDriveSpecifier == null ? (Parameter) PTR_NULL : bstrDriveSpecifier,
                        ppCdrom == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppCdrom)
                }
        );
        return ppCdrom;
    }

    /**
     * Returns the number of items in the cdrom collection
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
        return new IWMPCdromCollectionImpl(this);
    }
}
