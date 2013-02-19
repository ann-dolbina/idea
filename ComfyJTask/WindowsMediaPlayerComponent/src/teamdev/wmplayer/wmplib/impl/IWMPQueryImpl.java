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
 * Represents COM interface IWMPQuery.
 */
public class IWMPQueryImpl extends IDispatchImpl
        implements IWMPQuery {
    public static final String INTERFACE_IDENTIFIER = IWMPQuery.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPQueryImpl() {
    }

    protected IWMPQueryImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPQueryImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPQueryImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPQueryImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Adds a single AND query parameter to existing group
     */
    public void addCondition(
            BStr /*[in]*/ bstrAttribute,
            BStr /*[in]*/ bstrOperator,
            BStr /*[in]*/ bstrValue)
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrAttribute == null ? (Parameter) PTR_NULL : bstrAttribute,
                        bstrOperator == null ? (Parameter) PTR_NULL : bstrOperator,
                        bstrValue == null ? (Parameter) PTR_NULL : bstrValue
                }
        );
    }

    /**
     * Starts a new OR query group
     */
    public void beginNextGroup()
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPQueryImpl(this);
    }
}
