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
 * Represents COM interface IBatterySavedPreset.
 */
public class IBatterySavedPresetImpl extends IBatteryPresetImpl
        implements IBatterySavedPreset {
    public static final String INTERFACE_IDENTIFIER = IBatterySavedPreset.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IBatterySavedPresetImpl() {
    }

    protected IBatterySavedPresetImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IBatterySavedPresetImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IBatterySavedPresetImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IBatterySavedPresetImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IBatterySavedPresetImpl(this);
    }
}
