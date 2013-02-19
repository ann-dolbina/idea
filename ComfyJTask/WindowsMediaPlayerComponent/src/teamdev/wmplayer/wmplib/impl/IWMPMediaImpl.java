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
 * Represents COM interface IWMPMedia.
 */
public class IWMPMediaImpl extends IDispatchImpl
        implements IWMPMedia {
    public static final String INTERFACE_IDENTIFIER = IWMPMedia.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPMediaImpl() {
    }

    protected IWMPMediaImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPMediaImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPMediaImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPMediaImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the time of a marker
     */
    public DoubleFloat getMarkerTime(
            Int32 /*[in]*/ MarkerNum)
            throws ComException {
        DoubleFloat pMarkerTime = new DoubleFloat();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        MarkerNum,
                        pMarkerTime == null ? (Parameter) PTR_NULL : new Pointer(pMarkerTime)
                }
        );
        return pMarkerTime;
    }

    /**
     * Returns the name of a marker
     */
    public BStr getMarkerName(
            Int32 /*[in]*/ MarkerNum)
            throws ComException {
        BStr pbstrMarkerName = new BStr();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        MarkerNum,
                        pbstrMarkerName == null ? (Parameter) PTR_NULL : new Pointer(pbstrMarkerName)
                }
        );
        return pbstrMarkerName;
    }

    /**
     * Returns the name of the attribute whose index has been specified
     */
    public BStr getAttributeName(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        BStr pbstrItemName = new BStr();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pbstrItemName == null ? (Parameter) PTR_NULL : new Pointer(pbstrItemName)
                }
        );
        return pbstrItemName;
    }

    /**
     * Returns the value of specified attribute for this media
     */
    public BStr getItemInfo(
            BStr /*[in]*/ bstrItemName)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     * Sets the value of specified attribute for this media
     */
    public void setItemInfo(
            BStr /*[in]*/ bstrItemName,
            BStr /*[in]*/ bstrVal)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        bstrVal == null ? (Parameter) PTR_NULL : bstrVal
                }
        );
    }

    /**
     * Gets an item info by atom
     */
    public BStr getItemInfoByAtom(
            Int32 /*[in]*/ lAtom)
            throws ComException {
        BStr pbstrVal = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lAtom,
                        pbstrVal == null ? (Parameter) PTR_NULL : new Pointer(pbstrVal)
                }
        );
        return pbstrVal;
    }

    /**
     * Is the media a member of the given playlist
     */
    public VariantBool isMemberOf(
            IWMPPlaylist /*[in]*/ pPlaylist)
            throws ComException {
        VariantBool pvarfIsMemberOf = new VariantBool();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pPlaylist == null ? (Parameter) PTR_NULL : (Parameter) pPlaylist,
                        pvarfIsMemberOf == null ? (Parameter) PTR_NULL : new Pointer(pvarfIsMemberOf)
                }
        );
        return pvarfIsMemberOf;
    }

    /**
     * Is the attribute read only
     */
    public VariantBool isReadOnlyItem(
            BStr /*[in]*/ bstrItemName)
            throws ComException {
        VariantBool pvarfIsReadOnly = new VariantBool();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrItemName == null ? (Parameter) PTR_NULL : bstrItemName,
                        pvarfIsReadOnly == null ? (Parameter) PTR_NULL : new Pointer(pvarfIsReadOnly)
                }
        );
        return pvarfIsReadOnly;
    }

    /**
     * Determines if the supplied object is the same as the this one
     */
    public VariantBool getIsIdentical(
            IWMPMedia /*[in]*/ pIWMPMedia)
            throws ComException {
        VariantBool pvbool = new VariantBool();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pIWMPMedia == null ? (Parameter) PTR_NULL : (Parameter) pIWMPMedia,
                        pvbool == null ? (Parameter) PTR_NULL : new Pointer(pvbool)
                }
        );
        return pvbool;
    }

    /**
     * Returns the media URL
     */
    public BStr getSourceURL()
            throws ComException {
        BStr pbstrSourceURL = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSourceURL == null ? (Parameter) PTR_NULL : new Pointer(pbstrSourceURL)
                }
        );
        return pbstrSourceURL;
    }

    /**
     * Returns the name of the media
     */
    public BStr getName()
            throws ComException {
        BStr pbstrName = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : new Pointer(pbstrName)
                }
        );
        return pbstrName;
    }

    /**
     * Returns the name of the media
     */
    public void setName(
            BStr /*[in]*/ pbstrName)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrName == null ? (Parameter) PTR_NULL : pbstrName
                }
        );
    }

    /**
     * Returns the original width of the source images
     */
    public Int32 getImageSourceWidth()
            throws ComException {
        Int32 pWidth = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pWidth == null ? (Parameter) PTR_NULL : new Pointer(pWidth)
                }
        );
        return pWidth;
    }

    /**
     * Returns the original height of the source images
     */
    public Int32 getImageSourceHeight()
            throws ComException {
        Int32 pHeight = new Int32();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pHeight == null ? (Parameter) PTR_NULL : new Pointer(pHeight)
                }
        );
        return pHeight;
    }

    /**
     * Returns the number of markers in the file
     */
    public Int32 getMarkerCount()
            throws ComException {
        Int32 pMarkerCount = new Int32();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pMarkerCount == null ? (Parameter) PTR_NULL : new Pointer(pMarkerCount)
                }
        );
        return pMarkerCount;
    }

    /**
     * Returns duration of current media
     */
    public DoubleFloat getDuration()
            throws ComException {
        DoubleFloat pDuration = new DoubleFloat();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pDuration == null ? (Parameter) PTR_NULL : new Pointer(pDuration)
                }
        );
        return pDuration;
    }

    /**
     * Returns duration of current media as a string
     */
    public BStr getDurationString()
            throws ComException {
        BStr pbstrDuration = new BStr();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrDuration == null ? (Parameter) PTR_NULL : new Pointer(pbstrDuration)
                }
        );
        return pbstrDuration;
    }

    /**
     * Returns the count of the attributes associated with this media
     */
    public Int32 getAttributeCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPMediaImpl(this);
    }
}
