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
 * Represents COM interface IWMPDVD.
 */
public class IWMPDVDImpl extends IDispatchImpl
        implements IWMPDVD {
    public static final String INTERFACE_IDENTIFIER = IWMPDVD.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDVDImpl() {
    }

    protected IWMPDVDImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDVDImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDVDImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDVDImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Displays the top menu of the DVD
     */
    public void topMenu()
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Displays the title menu of the current DVD title
     */
    public void titleMenu()
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Navigates back one menu
     */
    public void back()
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Removes the menu from the screen and returns to playing the DVD
     */
    public void resume()
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Returns whether or not the specified DVD functionality is available
     */
    public VariantBool getIsAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException {
        VariantBool pIsAvailable = new VariantBool();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItem == null ? (Parameter) PTR_NULL : bstrItem,
                        pIsAvailable == null ? (Parameter) PTR_NULL : new Pointer(pIsAvailable)
                }
        );
        return pIsAvailable;
    }

    /**
     * Returns the current DVD domain
     */
    public BStr getDomain()
            throws ComException {
        BStr strDomain = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        strDomain == null ? (Parameter) PTR_NULL : new Pointer(strDomain)
                }
        );
        return strDomain;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDVDImpl(this);
    }
}
