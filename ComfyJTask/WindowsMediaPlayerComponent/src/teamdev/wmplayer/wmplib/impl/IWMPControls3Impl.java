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
 * Represents COM interface IWMPControls3.
 */
public class IWMPControls3Impl extends IWMPControls2Impl
        implements IWMPControls3 {
    public static final String INTERFACE_IDENTIFIER = IWMPControls3.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPControls3Impl() {
    }

    protected IWMPControls3Impl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPControls3Impl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPControls3Impl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPControls3Impl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Returns the LCID corresponding to the index
     */
    public Int32 getAudioLanguageID(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        Int32 plLangID = new Int32();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        plLangID == null ? (Parameter) PTR_NULL : new Pointer(plLangID)
                }
        );
        return plLangID;
    }

    /**
     * Returns the desription corresponding to the index
     */
    public BStr getAudioLanguageDescription(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        BStr pbstrLangDesc = new BStr();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pbstrLangDesc == null ? (Parameter) PTR_NULL : new Pointer(pbstrLangDesc)
                }
        );
        return pbstrLangDesc;
    }

    /**
     * Returns the human-readable name of language specified by LCID
     */
    public BStr getLanguageName(
            Int32 /*[in]*/ lLangID)
            throws ComException {
        BStr pbstrLangName = new BStr();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lLangID,
                        pbstrLangName == null ? (Parameter) PTR_NULL : new Pointer(pbstrLangName)
                }
        );
        return pbstrLangName;
    }

    /**
     * Returns the count of supported audio languages
     */
    public Int32 getAudioLanguageCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     * Gets the current audio language setting for playback
     */
    public Int32 getCurrentAudioLanguage()
            throws ComException {
        Int32 plLangID = new Int32();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plLangID == null ? (Parameter) PTR_NULL : new Pointer(plLangID)
                }
        );
        return plLangID;
    }

    /**
     * Gets the current audio language setting for playback
     */
    public void setCurrentAudioLanguage(
            Int32 /*[in]*/ plLangID)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plLangID
                }
        );
    }

    /**
     * Gets the current audio language index setting for playback
     */
    public Int32 getCurrentAudioLanguageIndex()
            throws ComException {
        Int32 plIndex = new Int32();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plIndex == null ? (Parameter) PTR_NULL : new Pointer(plIndex)
                }
        );
        return plIndex;
    }

    /**
     * Gets the current audio language index setting for playback
     */
    public void setCurrentAudioLanguageIndex(
            Int32 /*[in]*/ plIndex)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plIndex
                }
        );
    }

    /**
     * Returns the current timecode position in media
     */
    public BStr getCurrentPositionTimecode()
            throws ComException {
        BStr bstrTimecode = new BStr();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTimecode == null ? (Parameter) PTR_NULL : new Pointer(bstrTimecode)
                }
        );
        return bstrTimecode;
    }

    /**
     * Returns the current timecode position in media
     */
    public void setCurrentPositionTimecode(
            BStr /*[in]*/ bstrTimecode)
            throws ComException {
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTimecode == null ? (Parameter) PTR_NULL : bstrTimecode
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPControls3Impl(this);
    }
}
