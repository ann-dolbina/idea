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
 * Represents COM interface IWMPPlayerApplication.
 */
public class IWMPPlayerApplicationImpl extends IDispatchImpl
        implements IWMPPlayerApplication {
    public static final String INTERFACE_IDENTIFIER = IWMPPlayerApplication.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPPlayerApplicationImpl() {
    }

    protected IWMPPlayerApplicationImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPPlayerApplicationImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPPlayerApplicationImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPPlayerApplicationImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Switches the display to player application
     */
    public void switchToPlayerApplication()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Switches the display to control
     */
    public void switchToControl()
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Returns a boolean value specifying whether or not the player is docked
     */
    public VariantBool getPlayerDocked()
            throws ComException {
        VariantBool pbPlayerDocked = new VariantBool();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbPlayerDocked == null ? (Parameter) PTR_NULL : new Pointer(pbPlayerDocked)
                }
        );
        return pbPlayerDocked;
    }

    /**
     * Returns a boolean value specifying whether or not the control has display
     */
    public VariantBool getHasDisplay()
            throws ComException {
        VariantBool pbHasDisplay = new VariantBool();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbHasDisplay == null ? (Parameter) PTR_NULL : new Pointer(pbHasDisplay)
                }
        );
        return pbHasDisplay;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPPlayerApplicationImpl(this);
    }
}
