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
 * Represents COM interface IWMPSkinList.
 */
public class IWMPSkinListImpl extends IDispatchImpl
        implements IWMPSkinList {
    public static final String INTERFACE_IDENTIFIER = IWMPSkinList.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPSkinListImpl() {
    }

    protected IWMPSkinListImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPSkinListImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPSkinListImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPSkinListImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * property basketVisible
     */
    public void updateBasketColumns()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * property highContrastChange
     */
    public void highContrastChange()
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
        return new IWMPSkinListImpl(this);
    }
}
