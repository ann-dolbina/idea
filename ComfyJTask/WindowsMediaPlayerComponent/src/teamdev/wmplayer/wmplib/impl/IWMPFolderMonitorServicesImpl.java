package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPFolderMonitorServices.
 */
public class IWMPFolderMonitorServicesImpl extends IUnknownImpl
        implements IWMPFolderMonitorServices {
    public static final String INTERFACE_IDENTIFIER = IWMPFolderMonitorServices.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPFolderMonitorServicesImpl() {
    }

    protected IWMPFolderMonitorServicesImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPFolderMonitorServicesImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPFolderMonitorServicesImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPFolderMonitorServicesImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     *
     */
    public BStr item(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        BStr pbstrFolder = new BStr();
        invokeStandardVirtualMethod(
                4,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex,
                        pbstrFolder == null ? (Parameter) PTR_NULL : new Pointer(pbstrFolder)
                }
        );
        return pbstrFolder;
    }

    /**
     *
     */
    public void add(
            BStr /*[in]*/ bstrFolder)
            throws ComException {
        invokeStandardVirtualMethod(
                5,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        bstrFolder == null ? (Parameter) PTR_NULL : bstrFolder
                }
        );
    }

    /**
     *
     */
    public void remove(
            Int32 /*[in]*/ lIndex)
            throws ComException {
        invokeStandardVirtualMethod(
                6,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        lIndex
                }
        );
    }

    /**
     *
     */
    public void startScan()
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public void stopScan()
            throws ComException {
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[0]
        );
    }

    /**
     *
     */
    public Int32 getCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                3,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     *
     */
    public WMPFolderScanState getScanState()
            throws ComException {
        WMPFolderScanState pwmpfss = new WMPFolderScanState();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pwmpfss == null ? (Parameter) PTR_NULL : new Pointer(pwmpfss)
                }
        );
        return pwmpfss;
    }

    /**
     *
     */
    public BStr getCurrentFolder()
            throws ComException {
        BStr pbstrFolder = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrFolder == null ? (Parameter) PTR_NULL : new Pointer(pbstrFolder)
                }
        );
        return pbstrFolder;
    }

    /**
     *
     */
    public Int32 getScannedFilesCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     *
     */
    public Int32 getAddedFilesCount()
            throws ComException {
        Int32 plCount = new Int32();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plCount == null ? (Parameter) PTR_NULL : new Pointer(plCount)
                }
        );
        return plCount;
    }

    /**
     *
     */
    public Int32 getUpdateProgress()
            throws ComException {
        Int32 plProgress = new Int32();
        invokeStandardVirtualMethod(
                11,
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
        return new IWMPFolderMonitorServicesImpl(this);
    }
}
