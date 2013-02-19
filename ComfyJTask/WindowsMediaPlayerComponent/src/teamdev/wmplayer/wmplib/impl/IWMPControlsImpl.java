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
 * Represents COM interface IWMPControls.
 */
public class IWMPControlsImpl extends IDispatchImpl
        implements IWMPControls {
    public static final String INTERFACE_IDENTIFIER = IWMPControls.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPControlsImpl() {
    }

    protected IWMPControlsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPControlsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPControlsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPControlsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Begins playing media
     */
    public void play()
            throws ComException {
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Stops play of media
     */
    public void stop()
            throws ComException {
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Pauses play of media
     */
    public void pause()
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Fast play of media in forward direction
     */
    public void fastForward()
            throws ComException {
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Fast play of media in reverse direction
     */
    public void fastReverse()
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Sets the current item to the next item in the playlist
     */
    public void next()
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Sets the current item to the previous item in the playlist
     */
    public void previous()
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     * Sets the current item and plays it
     */
    public void playItem(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPMedia == null ? (Parameter) PTR_NULL : (Parameter) pIWMPMedia
                }
        );
    }

    /**
     * Returns whether or not the specified media functionality is available
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
     * Returns the current position in media
     */
    public DoubleFloat getCurrentPosition()
            throws ComException {
        DoubleFloat pdCurrentPosition = new DoubleFloat();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pdCurrentPosition == null ? (Parameter) PTR_NULL : new Pointer(pdCurrentPosition)
                }
        );
        return pdCurrentPosition;
    }

    /**
     * Returns the current position in media
     */
    public void setCurrentPosition(
            DoubleFloat /*[in]*/ pdCurrentPosition)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pdCurrentPosition
                }
        );
    }

    /**
     * Returns the current position in media as a string
     */
    public BStr getCurrentPositionString()
            throws ComException {
        BStr pbstrCurrentPosition = new BStr();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentPosition == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentPosition)
                }
        );
        return pbstrCurrentPosition;
    }

    /**
     * Returns/Sets the play item
     */
    public IWMPMedia getCurrentItem()
            throws ComException {
        IWMPMediaImpl ppIWMPMedia = new IWMPMediaImpl();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppIWMPMedia == null ? (Parameter) PTR_NULL : new Pointer((Parameter) ppIWMPMedia)
                }
        );
        return ppIWMPMedia;
    }

    /**
     * Returns/Sets the play item
     */
    public void setCurrentItem(
            IWMPMedia /*[in]*/ ppIWMPMedia)
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppIWMPMedia == null ? (Parameter) PTR_NULL : (Parameter) ppIWMPMedia
                }
        );
    }

    /**
     * Returns the current marker
     */
    public Int32 getCurrentMarker()
            throws ComException {
        Int32 plMarker = new Int32();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plMarker == null ? (Parameter) PTR_NULL : new Pointer(plMarker)
                }
        );
        return plMarker;
    }

    /**
     * Returns the current marker
     */
    public void setCurrentMarker(
            Int32 /*[in]*/ plMarker)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plMarker
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPControlsImpl(this);
    }
}
