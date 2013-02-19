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
 * Represents COM interface IWMPCDDVDWizardExternal.
 */
public class IWMPCDDVDWizardExternalImpl extends IWMPExternalColorsImpl
        implements IWMPCDDVDWizardExternal {
    public static final String INTERFACE_IDENTIFIER = IWMPCDDVDWizardExternal.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPCDDVDWizardExternalImpl() {
    }

    protected IWMPCDDVDWizardExternalImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPCDDVDWizardExternalImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPCDDVDWizardExternalImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPCDDVDWizardExternalImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public void writeNames(
            BStr /*[in]*/ bstrTOC,
            BStr /*[in]*/ bstrMetadata)
            throws ComException {
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTOC == null ? (Parameter) PTR_NULL : bstrTOC,
                        bstrMetadata == null ? (Parameter) PTR_NULL : bstrMetadata
                }
        );
    }

    /**
     *
     */
    public void returnToMainTask()
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
    public void writeNamesEx(
            WMP_WRITENAMESEX_TYPE /*[in]*/ type,
            BStr /*[in]*/ bstrTypeId,
            BStr /*[in]*/ bstrMetadata,
            VariantBool /*[in]*/ fRenameRegroupFiles)
            throws ComException {
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        type,
                        bstrTypeId == null ? (Parameter) PTR_NULL : bstrTypeId,
                        bstrMetadata == null ? (Parameter) PTR_NULL : bstrMetadata,
                        fRenameRegroupFiles
                }
        );
    }

    /**
     *
     */
    public BStr getMDQByRequestID(
            BStr /*[in]*/ bstrRequestID)
            throws ComException {
        BStr pbstrMDQ = new BStr();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrRequestID == null ? (Parameter) PTR_NULL : bstrRequestID,
                        pbstrMDQ == null ? (Parameter) PTR_NULL : new Pointer(pbstrMDQ)
                }
        );
        return pbstrMDQ;
    }

    /**
     *
     */
    public void editMetadata()
            throws ComException {
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public VariantBool isMetadataAvailableForEdit()
            throws ComException {
        VariantBool pbIsAvailable = new VariantBool();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbIsAvailable == null ? (Parameter) PTR_NULL : new Pointer(pbIsAvailable)
                }
        );
        return pbIsAvailable;
    }

    /**
     *
     */
    public void buyCD(
            BStr /*[in]*/ bstrTitle,
            BStr /*[in]*/ bstrArtist,
            BStr /*[in]*/ bstrAlbum,
            BStr /*[in]*/ bstrUFID,
            BStr /*[in]*/ bstrWMID)
            throws ComException {
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrTitle == null ? (Parameter) PTR_NULL : bstrTitle,
                        bstrArtist == null ? (Parameter) PTR_NULL : bstrArtist,
                        bstrAlbum == null ? (Parameter) PTR_NULL : bstrAlbum,
                        bstrUFID == null ? (Parameter) PTR_NULL : bstrUFID,
                        bstrWMID == null ? (Parameter) PTR_NULL : bstrWMID
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPCDDVDWizardExternalImpl(this);
    }
}
