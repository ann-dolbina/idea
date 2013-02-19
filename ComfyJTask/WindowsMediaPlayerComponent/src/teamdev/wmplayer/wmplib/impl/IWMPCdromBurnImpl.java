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
 * Represents COM interface IWMPCdromBurn.
 */
public class IWMPCdromBurnImpl extends IUnknownImpl
        implements IWMPCdromBurn {
    public static final String INTERFACE_IDENTIFIER = IWMPCdromBurn.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCdromBurnImpl() {
    }

    protected IWMPCdromBurnImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCdromBurnImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCdromBurnImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCdromBurnImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public VariantBool isAvailable(
            BStr /*[in]*/ bstrItem)
            throws ComException {
        VariantBool pIsAvailable = new VariantBool();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItem == null ? (Parameter) PTR_NULL : bstrItem,
                        pIsAvailable == null ? (Parameter) PTR_NULL : new Pointer(pIsAvailable)
                }
        );
        return pIsAvailable;
    }

    /**
     *
     */
    public BStr getItemInfo(
            BStr /*[in]*/ bstrItem)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItem == null ? (Parameter) PTR_NULL : bstrItem,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     *
     */
    public void refreshStatus()
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void startBurn()
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void stopBurn()
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void erase()
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public BStr getLabel()
            throws ComException {
        BStr pbstrLabel = new BStr();
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLabel == null ? (Parameter) PTR_NULL : new Pointer(pbstrLabel)
                }
        );
        return pbstrLabel;
    }

    /**
     *
     */
    public void setLabel(
            BStr /*[in]*/ pbstrLabel)
            throws ComException {
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLabel == null ? (Parameter) PTR_NULL : pbstrLabel
                }
        );
    }

    /**
     *
     */
    public WMPBurnFormat getBurnFormat()
            throws ComException {
        WMPBurnFormat pwmpbf = new WMPBurnFormat();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpbf == null ? (Parameter) PTR_NULL : new Pointer(pwmpbf)
                }
        );
        return pwmpbf;
    }

    /**
     *
     */
    public void setBurnFormat(
            WMPBurnFormat /*[in]*/ pwmpbf)
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpbf
                }
        );
    }

    /**
     *
     */
    public IWMPPlaylist getBurnPlaylist()
            throws ComException {
        IWMPPlaylistImpl ppPlaylist = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPlaylist == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylist)
                }
        );
        return ppPlaylist;
    }

    /**
     *
     */
    public void setBurnPlaylist(
            IWMPPlaylist /*[in]*/ ppPlaylist)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPlaylist == null ? (Parameter) PTR_NULL : (Parameter) ppPlaylist
                }
        );
    }

    /**
     *
     */
    public WMPBurnState getBurnState()
            throws ComException {
        WMPBurnState pwmpbs = new WMPBurnState();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpbs == null ? (Parameter) PTR_NULL : new Pointer(pwmpbs)
                }
        );
        return pwmpbs;
    }

    /**
     *
     */
    public Int32 getBurnProgress()
            throws ComException {
        Int32 plProgress = new Int32();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plProgress == null ? (Parameter) PTR_NULL : new Pointer(plProgress)
                }
        );
        return plProgress;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCdromBurnImpl(this);
    }
}
