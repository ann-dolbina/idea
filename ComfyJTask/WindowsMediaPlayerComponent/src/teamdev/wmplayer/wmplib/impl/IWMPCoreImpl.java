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
 * Represents COM interface IWMPCore.
 */
public class IWMPCoreImpl extends IDispatchImpl
        implements IWMPCore {
    public static final String INTERFACE_IDENTIFIER = IWMPCore.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCoreImpl() {
    }

    protected IWMPCoreImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCoreImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCoreImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCoreImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Closes the media
     */
    public void close()
            throws ComException {
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void launchURL(
            BStr /*[in]*/ bstrURL)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrURL == null ? (Parameter) PTR_NULL : bstrURL
                }
        );
    }

    /**
     * Returns or sets the URL
     */
    public BStr getURL()
            throws ComException {
        BStr pbstrURL = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrURL == null ? (Parameter) PTR_NULL : new Pointer(pbstrURL)
                }
        );
        return pbstrURL;
    }

    /**
     * Returns or sets the URL
     */
    public void setURL(
            BStr /*[in]*/ pbstrURL)
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrURL == null ? (Parameter) PTR_NULL : pbstrURL
                }
        );
    }

    /**
     * Returns the open state of the player
     */
    public WMPOpenState getOpenState()
            throws ComException {
        WMPOpenState pwmpos = new WMPOpenState();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpos == null ? (Parameter) PTR_NULL : new Pointer(pwmpos)
                }
        );
        return pwmpos;
    }

    /**
     * Returns the play state of the player
     */
    public WMPPlayState getPlayState()
            throws ComException {
        WMPPlayState pwmpps = new WMPPlayState();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpps == null ? (Parameter) PTR_NULL : new Pointer(pwmpps)
                }
        );
        return pwmpps;
    }

    /**
     * Returns the control handler
     */
    public IWMPControls getControls()
            throws ComException {
        IWMPControlsImpl ppControl = new IWMPControlsImpl();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppControl == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppControl)
                }
        );
        return ppControl;
    }

    /**
     * Returns the settings handler
     */
    public IWMPSettings getSettings()
            throws ComException {
        IWMPSettingsImpl ppSettings = new IWMPSettingsImpl();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppSettings == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppSettings)
                }
        );
        return ppSettings;
    }

    /**
     * Returns or sets the current media object
     */
    public IWMPMedia getCurrentMedia()
            throws ComException {
        IWMPMediaImpl ppMedia = new IWMPMediaImpl();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppMedia == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMedia)
                }
        );
        return ppMedia;
    }

    /**
     * Returns or sets the current media object
     */
    public void setCurrentMedia(
            IWMPMedia /*[in]*/ ppMedia)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppMedia == null ? (Parameter) PTR_NULL : (Parameter) ppMedia
                }
        );
    }

    /**
     * Returns the media collection handler
     */
    public IWMPMediaCollection getMediaCollection()
            throws ComException {
        IWMPMediaCollectionImpl ppMediaCollection = new IWMPMediaCollectionImpl();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppMediaCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppMediaCollection)
                }
        );
        return ppMediaCollection;
    }

    /**
     * Returns the playlist collection handler
     */
    public IWMPPlaylistCollection getPlaylistCollection()
            throws ComException {
        IWMPPlaylistCollectionImpl ppPlaylistCollection = new IWMPPlaylistCollectionImpl();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPlaylistCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPlaylistCollection)
                }
        );
        return ppPlaylistCollection;
    }

    /**
     * Returns the version information for the player
     */
    public BStr getVersionInfo()
            throws ComException {
        BStr pbstrVersionInfo = new BStr();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrVersionInfo == null ? (Parameter) PTR_NULL : new Pointer(pbstrVersionInfo)
                }
        );
        return pbstrVersionInfo;
    }

    /**
     * Returns the network information handler
     */
    public IWMPNetwork getNetwork()
            throws ComException {
        IWMPNetworkImpl ppQNI = new IWMPNetworkImpl();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppQNI == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppQNI)
                }
        );
        return ppQNI;
    }

    /**
     * Returns/sets the current playlist
     */
    public IWMPPlaylist getCurrentPlaylist()
            throws ComException {
        IWMPPlaylistImpl ppPL = new IWMPPlaylistImpl();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPL == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppPL)
                }
        );
        return ppPL;
    }

    /**
     * Returns/sets the current playlist
     */
    public void setCurrentPlaylist(
            IWMPPlaylist /*[in]*/ ppPL)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppPL == null ? (Parameter) PTR_NULL : (Parameter) ppPL
                }
        );
    }

    /**
     * Get the CDROM drive collection
     */
    public IWMPCdromCollection getCdromCollection()
            throws ComException {
        IWMPCdromCollectionImpl ppCdromCollection = new IWMPCdromCollectionImpl();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppCdromCollection == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppCdromCollection)
                }
        );
        return ppCdromCollection;
    }

    /**
     * Returns the closed caption handler
     */
    public IWMPClosedCaption getClosedCaption()
            throws ComException {
        IWMPClosedCaptionImpl ppClosedCaption = new IWMPClosedCaptionImpl();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppClosedCaption == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppClosedCaption)
                }
        );
        return ppClosedCaption;
    }

    /**
     * Returns whether the machine is online.
     */
    public VariantBool getIsOnline()
            throws ComException {
        VariantBool pfOnline = new VariantBool();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfOnline == null ? (Parameter) PTR_NULL : new Pointer(pfOnline)
                }
        );
        return pfOnline;
    }

    /**
     * Returns the error object
     */
    public IWMPError getError()
            throws ComException {
        IWMPErrorImpl ppError = new IWMPErrorImpl();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppError == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppError)
                }
        );
        return ppError;
    }

    /**
     * Returns status string
     */
    public BStr getStatus()
            throws ComException {
        BStr pbstrStatus = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrStatus)
                }
        );
        return pbstrStatus;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCoreImpl(this);
    }
}
