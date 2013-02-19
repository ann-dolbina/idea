package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPPlayerServices.
 */
public class IWMPPlayerServicesImpl extends IUnknownImpl
        implements IWMPPlayerServices {
    public static final String INTERFACE_IDENTIFIER = IWMPPlayerServices.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlayerServicesImpl() {
    }

    protected IWMPPlayerServicesImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlayerServicesImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlayerServicesImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlayerServicesImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void activateUIPlugin(
            BStr /*[in]*/ bstrPlugin)
            throws ComException {
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrPlugin == null ? (Parameter) PTR_NULL : bstrPlugin
                }
        );
    }

    /**
     *
     */
    public void setTaskPane(
            BStr /*[in]*/ bstrTaskPane)
            throws ComException {
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTaskPane == null ? (Parameter) PTR_NULL : bstrTaskPane
                }
        );
    }

    /**
     *
     */
    public void setTaskPaneURL(
            BStr /*[in]*/ bstrTaskPane,
            BStr /*[in]*/ bstrURL,
            BStr /*[in]*/ bstrFriendlyName)
            throws ComException {
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTaskPane == null ? (Parameter) PTR_NULL : bstrTaskPane,
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL,
                        bstrFriendlyName == null ? (Parameter) PTR_NULL : bstrFriendlyName
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlayerServicesImpl(this);
    }
}
