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
 * Represents COM interface IWMPError.
 */
public class IWMPErrorImpl extends IDispatchImpl
        implements IWMPError {
    public static final String INTERFACE_IDENTIFIER = IWMPError.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPErrorImpl() {
    }

    protected IWMPErrorImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPErrorImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPErrorImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPErrorImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Clears the error queue
     */
    public void clearErrorQueue()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Launches WebHelp
     */
    public void webHelp()
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Returns the number of error items
     */
    public Int32 getErrorCount()
            throws ComException {
        Int32 plNumErrors = new Int32();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plNumErrors == null ? (Parameter) PTR_NULL : new Pointer(plNumErrors)
                }
        );
        return plNumErrors;
    }

    /**
     * Returns an error item object
     */
    public IWMPErrorItem getItem(
            Int32 /*[in]*/ dwIndex)
            throws ComException {
        IWMPErrorItemImpl ppErrorItem = new IWMPErrorItemImpl();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        dwIndex,
                        ppErrorItem == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppErrorItem)
                }
        );
        return ppErrorItem;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPErrorImpl(this);
    }
}
