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
 * Represents COM interface IWMPPluginUIHost.
 */
public class IWMPPluginUIHostImpl extends IDispatchImpl
        implements IWMPPluginUIHost {
    public static final String INTERFACE_IDENTIFIER = IWMPPluginUIHost.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPluginUIHostImpl() {
    }

    protected IWMPPluginUIHostImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPluginUIHostImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPluginUIHostImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPluginUIHostImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method getProperty
     */
    public Variant getProperty(
            BStr /*[in]*/ bstrName)
            throws ComException {
        Variant pVal = new Variant();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * method setProperty
     */
    public void setProperty(
            BStr /*[in]*/ bstrName,
            Variant /*[in]*/ newVal)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrName == null ? (Parameter) PTR_NULL : bstrName,
                        newVal
                }
        );
    }

    /**
     * property backgroundColor
     */
    public BStr getBackgroundColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property backgroundColor
     */
    public void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property objectID
     */
    public BStr getObjectID()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property objectID
     */
    public void setObjectID(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPluginUIHostImpl(this);
    }
}
