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
 * Represents COM interface IWMPListBoxItem.
 */
public class IWMPListBoxItemImpl extends IDispatchImpl
        implements IWMPListBoxItem {
    public static final String INTERFACE_IDENTIFIER = IWMPListBoxItem.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPListBoxItemImpl() {
    }

    protected IWMPListBoxItemImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPListBoxItemImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPListBoxItemImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPListBoxItemImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * property value
     */
    public void setValue(
            BStr /*[in]*/ param1)
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        param1 == null ? (Parameter) PTR_NULL : param1
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPListBoxItemImpl(this);
    }
}
