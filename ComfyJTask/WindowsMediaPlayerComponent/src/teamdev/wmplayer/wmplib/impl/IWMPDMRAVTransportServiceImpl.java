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
 * Represents COM interface IWMPDMRAVTransportService.
 */
public class IWMPDMRAVTransportServiceImpl extends IDispatchImpl
        implements IWMPDMRAVTransportService {
    public static final String INTERFACE_IDENTIFIER = IWMPDMRAVTransportService.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPDMRAVTransportServiceImpl() {
    }

    protected IWMPDMRAVTransportServiceImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPDMRAVTransportServiceImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPDMRAVTransportServiceImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPDMRAVTransportServiceImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * Method SetAVTransportURI
     */
    public void setAVTransportURI(
            IUnknown /*[in]*/ punkRemoteEndpointInfo,
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrCurrentURI,
            BStr /*[in]*/ bstrCurrentURIMetaData)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        punkRemoteEndpointInfo == null ? (Parameter) PTR_NULL : (Parameter) punkRemoteEndpointInfo,
                        ulInstanceID,
                        bstrCurrentURI == null ? (Parameter) PTR_NULL : bstrCurrentURI,
                        bstrCurrentURIMetaData == null ? (Parameter) PTR_NULL : bstrCurrentURIMetaData
                }
        );
    }

    /**
     * Method GetMediaInfo
     */
    public void getMediaInfo(
            UInt32 /*[in]*/ ulInstanceID,
            UInt32 /*[out]*/ pulNumTracks,
            BStr /*[out]*/ pbstrMediaDuration,
            BStr /*[out]*/ pbstrCurrentURI,
            BStr /*[out]*/ pbstrCurrentURIMetaData,
            BStr /*[out]*/ pbstrNextURI,
            BStr /*[out]*/ pNextURIMetaData,
            BStr /*[out]*/ pbstrPlayMedium,
            BStr /*[out]*/ pbstrRecordMedium,
            BStr /*[out]*/ pbstrWriteStatus)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pulNumTracks == null ? (Parameter) PTR_NULL : new Pointer(pulNumTracks),
                        pbstrMediaDuration == null ? (Parameter) PTR_NULL : new Pointer(pbstrMediaDuration),
                        pbstrCurrentURI == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentURI),
                        pbstrCurrentURIMetaData == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentURIMetaData),
                        pbstrNextURI == null ? (Parameter) PTR_NULL : new Pointer(pbstrNextURI),
                        pNextURIMetaData == null ? (Parameter) PTR_NULL : new Pointer(pNextURIMetaData),
                        pbstrPlayMedium == null ? (Parameter) PTR_NULL : new Pointer(pbstrPlayMedium),
                        pbstrRecordMedium == null ? (Parameter) PTR_NULL : new Pointer(pbstrRecordMedium),
                        pbstrWriteStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrWriteStatus)
                }
        );
    }

    /**
     * Method GetTransportInfo
     */
    public void getTransportInfo(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[out]*/ pbstrCurrentTransportState,
            BStr /*[out]*/ pbstrCurrentTransportStatus,
            BStr /*[out]*/ pbstrCurrentSpeed)
            throws ComException {
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pbstrCurrentTransportState == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentTransportState),
                        pbstrCurrentTransportStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentTransportStatus),
                        pbstrCurrentSpeed == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentSpeed)
                }
        );
    }

    /**
     * Method GetPositionInfo
     */
    public void getPositionInfo(
            UInt32 /*[in]*/ ulInstanceID,
            UInt32 /*[out]*/ pTrack,
            BStr /*[out]*/ pbstrTrackDuration,
            BStr /*[out]*/ pbstrTrackMetaData,
            BStr /*[out]*/ pbstrTrackURI,
            BStr /*[out]*/ pbstrRelTime,
            BStr /*[out]*/ pbstrAbsTime,
            Int32 /*[out]*/ plRelCount,
            Int32 /*[out]*/ plAbsCount)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pTrack == null ? (Parameter) PTR_NULL : new Pointer(pTrack),
                        pbstrTrackDuration == null ? (Parameter) PTR_NULL : new Pointer(pbstrTrackDuration),
                        pbstrTrackMetaData == null ? (Parameter) PTR_NULL : new Pointer(pbstrTrackMetaData),
                        pbstrTrackURI == null ? (Parameter) PTR_NULL : new Pointer(pbstrTrackURI),
                        pbstrRelTime == null ? (Parameter) PTR_NULL : new Pointer(pbstrRelTime),
                        pbstrAbsTime == null ? (Parameter) PTR_NULL : new Pointer(pbstrAbsTime),
                        plRelCount == null ? (Parameter) PTR_NULL : new Pointer(plRelCount),
                        plAbsCount == null ? (Parameter) PTR_NULL : new Pointer(plAbsCount)
                }
        );
    }

    /**
     * Method GetDeviceCapabilities
     */
    public void getDeviceCapabilities(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[out]*/ pbstrPlayMedia,
            BStr /*[out]*/ pbstrRecMedia,
            BStr /*[out]*/ pbstrRecQualityModes)
            throws ComException {
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pbstrPlayMedia == null ? (Parameter) PTR_NULL : new Pointer(pbstrPlayMedia),
                        pbstrRecMedia == null ? (Parameter) PTR_NULL : new Pointer(pbstrRecMedia),
                        pbstrRecQualityModes == null ? (Parameter) PTR_NULL : new Pointer(pbstrRecQualityModes)
                }
        );
    }

    /**
     * Method GetTransportSettings
     */
    public void getTransportSettings(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[out]*/ pbstrPlayMode,
            BStr /*[out]*/ pbstrRecQualityMode)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pbstrPlayMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrPlayMode),
                        pbstrRecQualityMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrRecQualityMode)
                }
        );
    }

    /**
     * Method Stop
     */
    public void stop(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException {
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID
                }
        );
    }

    /**
     * Method Play
     */
    public void play(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrSpeed)
            throws ComException {
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrSpeed == null ? (Parameter) PTR_NULL : bstrSpeed
                }
        );
    }

    /**
     * Method Pause
     */
    public void pause(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException {
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID
                }
        );
    }

    /**
     * Method Seek
     */
    public void seek(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrUnit,
            BStr /*[in]*/ bstrTarget)
            throws ComException {
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        bstrUnit == null ? (Parameter) PTR_NULL : bstrUnit,
                        bstrTarget == null ? (Parameter) PTR_NULL : bstrTarget
                }
        );
    }

    /**
     * Method Next
     */
    public void next(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException {
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID
                }
        );
    }

    /**
     * Method Previous
     */
    public void previous(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException {
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID
                }
        );
    }

    /**
     * Method GetCurrentTransportActions
     */
    public void getCurrentTransportActions(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in,out]*/ pbstrActions)
            throws ComException {
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ulInstanceID,
                        pbstrActions == null ? (Parameter) PTR_NULL : new Pointer(pbstrActions)
                }
        );
    }

    /**
     * Property TransportState
     */
    public BStr getTransportState()
            throws ComException {
        BStr pbstrTransportState = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrTransportState == null ? (Parameter) PTR_NULL : new Pointer(pbstrTransportState)
                }
        );
        return pbstrTransportState;
    }

    /**
     * Property TransportStatus
     */
    public BStr getTransportStatus()
            throws ComException {
        BStr pbstrTransportStatus = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrTransportStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrTransportStatus)
                }
        );
        return pbstrTransportStatus;
    }

    /**
     * Property PlaybackStorageMedium
     */
    public BStr getPlaybackStorageMedium()
            throws ComException {
        BStr pbstrPlaybackStorageMedium = new BStr();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrPlaybackStorageMedium == null ? (Parameter) PTR_NULL : new Pointer(pbstrPlaybackStorageMedium)
                }
        );
        return pbstrPlaybackStorageMedium;
    }

    /**
     * Property RecordStorageMedium
     */
    public BStr getRecordStorageMedium()
            throws ComException {
        BStr pbstrRecordStorageMedium = new BStr();
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrRecordStorageMedium == null ? (Parameter) PTR_NULL : new Pointer(pbstrRecordStorageMedium)
                }
        );
        return pbstrRecordStorageMedium;
    }

    /**
     * Property PossiblePlaybackStorageMedia
     */
    public BStr getPossiblePlaybackStorageMedia()
            throws ComException {
        BStr pbstrPossiblePlaybackStorageMedia = new BStr();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrPossiblePlaybackStorageMedia == null ? (Parameter) PTR_NULL : new Pointer(pbstrPossiblePlaybackStorageMedia)
                }
        );
        return pbstrPossiblePlaybackStorageMedia;
    }

    /**
     * Property PossibleRecordStorageMedia
     */
    public BStr getPossibleRecordStorageMedia()
            throws ComException {
        BStr pbstrPossibleRecordStorageMedia = new BStr();
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrPossibleRecordStorageMedia == null ? (Parameter) PTR_NULL : new Pointer(pbstrPossibleRecordStorageMedia)
                }
        );
        return pbstrPossibleRecordStorageMedia;
    }

    /**
     * Property CurrentPlayMode
     */
    public BStr getCurrentPlayMode()
            throws ComException {
        BStr pbstrCurrentPlayMode = new BStr();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentPlayMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentPlayMode)
                }
        );
        return pbstrCurrentPlayMode;
    }

    /**
     * Property TransportPlaySpeed
     */
    public BStr getTransportPlaySpeed()
            throws ComException {
        BStr pbstrTransportPlaySpeed = new BStr();
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrTransportPlaySpeed == null ? (Parameter) PTR_NULL : new Pointer(pbstrTransportPlaySpeed)
                }
        );
        return pbstrTransportPlaySpeed;
    }

    /**
     * Property RecordMediumWriteStatus
     */
    public BStr getRecordMediumWriteStatus()
            throws ComException {
        BStr pbstrRecordMediumWriteStatus = new BStr();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrRecordMediumWriteStatus == null ? (Parameter) PTR_NULL : new Pointer(pbstrRecordMediumWriteStatus)
                }
        );
        return pbstrRecordMediumWriteStatus;
    }

    /**
     * Property CurrentRecordQualityMode
     */
    public BStr getCurrentRecordQualityMode()
            throws ComException {
        BStr pbstrCurrentRecordQualityMode = new BStr();
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentRecordQualityMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentRecordQualityMode)
                }
        );
        return pbstrCurrentRecordQualityMode;
    }

    /**
     * Property PossibleRecordQualityModes
     */
    public BStr getPossibleRecordQualityModes()
            throws ComException {
        BStr pbstrPossibleRecordQualityModes = new BStr();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrPossibleRecordQualityModes == null ? (Parameter) PTR_NULL : new Pointer(pbstrPossibleRecordQualityModes)
                }
        );
        return pbstrPossibleRecordQualityModes;
    }

    /**
     * Property NumberOfTracks
     */
    public UInt32 getNumberOfTracks()
            throws ComException {
        UInt32 pulNumberOfTracks = new UInt32();
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pulNumberOfTracks == null ? (Parameter) PTR_NULL : new Pointer(pulNumberOfTracks)
                }
        );
        return pulNumberOfTracks;
    }

    /**
     * Property CurrentTrack
     */
    public UInt32 getCurrentTrack()
            throws ComException {
        UInt32 pulCurrentTrack = new UInt32();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pulCurrentTrack == null ? (Parameter) PTR_NULL : new Pointer(pulCurrentTrack)
                }
        );
        return pulCurrentTrack;
    }

    /**
     * Property CurrentTrackDuration
     */
    public BStr getCurrentTrackDuration()
            throws ComException {
        BStr pbstrCurrentTrackDuration = new BStr();
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentTrackDuration == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentTrackDuration)
                }
        );
        return pbstrCurrentTrackDuration;
    }

    /**
     * Property CurrentMediaDuration
     */
    public BStr getCurrentMediaDuration()
            throws ComException {
        BStr pbstrCurrentMediaDuration = new BStr();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentMediaDuration == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentMediaDuration)
                }
        );
        return pbstrCurrentMediaDuration;
    }

    /**
     * Property CurrentTrackMetaData
     */
    public BStr getCurrentTrackMetaData()
            throws ComException {
        BStr pbstrCurrentTrackMetaData = new BStr();
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentTrackMetaData == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentTrackMetaData)
                }
        );
        return pbstrCurrentTrackMetaData;
    }

    /**
     * Property CurrentTrackURI
     */
    public BStr getCurrentTrackURI()
            throws ComException {
        BStr pbstrCurrentTrackURI = new BStr();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentTrackURI == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentTrackURI)
                }
        );
        return pbstrCurrentTrackURI;
    }

    /**
     * Property AVTransportURI
     */
    public BStr getAVTransportURI()
            throws ComException {
        BStr pbstrAVTransportURI = new BStr();
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrAVTransportURI == null ? (Parameter) PTR_NULL : new Pointer(pbstrAVTransportURI)
                }
        );
        return pbstrAVTransportURI;
    }

    /**
     * Property AVTransportURIMetaData
     */
    public BStr getAVTransportURIMetaData()
            throws ComException {
        BStr pbstrAVTransportURIMetaData = new BStr();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrAVTransportURIMetaData == null ? (Parameter) PTR_NULL : new Pointer(pbstrAVTransportURIMetaData)
                }
        );
        return pbstrAVTransportURIMetaData;
    }

    /**
     * Property NextAVTransportURI
     */
    public BStr getNextAVTransportURI()
            throws ComException {
        BStr pbstrNextAVTransportURI = new BStr();
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrNextAVTransportURI == null ? (Parameter) PTR_NULL : new Pointer(pbstrNextAVTransportURI)
                }
        );
        return pbstrNextAVTransportURI;
    }

    /**
     * Property NextAVTransportURIMetaData
     */
    public BStr getNextAVTransportURIMetaData()
            throws ComException {
        BStr pbstrNextAVTransportURIMetaData = new BStr();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrNextAVTransportURIMetaData == null ? (Parameter) PTR_NULL : new Pointer(pbstrNextAVTransportURIMetaData)
                }
        );
        return pbstrNextAVTransportURIMetaData;
    }

    /**
     * Property RelativeTimePosition
     */
    public BStr getRelativeTimePosition()
            throws ComException {
        BStr pRelativeTimePosition = new BStr();
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pRelativeTimePosition == null ? (Parameter) PTR_NULL : new Pointer(pRelativeTimePosition)
                }
        );
        return pRelativeTimePosition;
    }

    /**
     * Property AbsoluteTimePosition
     */
    public BStr getAbsoluteTimePosition()
            throws ComException {
        BStr pbstrAbsoluteTimePosition = new BStr();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrAbsoluteTimePosition == null ? (Parameter) PTR_NULL : new Pointer(pbstrAbsoluteTimePosition)
                }
        );
        return pbstrAbsoluteTimePosition;
    }

    /**
     * Property RelativeCounterPosition
     */
    public Int32 getRelativeCounterPosition()
            throws ComException {
        Int32 plRelativeCounterPosition = new Int32();
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plRelativeCounterPosition == null ? (Parameter) PTR_NULL : new Pointer(plRelativeCounterPosition)
                }
        );
        return plRelativeCounterPosition;
    }

    /**
     * Property AbsoluteCounterPosition
     */
    public Int32 getAbsoluteCounterPosition()
            throws ComException {
        Int32 plAbsoluteCounterPosition = new Int32();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        plAbsoluteCounterPosition == null ? (Parameter) PTR_NULL : new Pointer(plAbsoluteCounterPosition)
                }
        );
        return plAbsoluteCounterPosition;
    }

    /**
     * Property CurrentTransportActions
     */
    public BStr getCurrentTransportActionsProperty()
            throws ComException {
        BStr pbstrCurrentTransportActions = new BStr();
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrCurrentTransportActions == null ? (Parameter) PTR_NULL : new Pointer(pbstrCurrentTransportActions)
                }
        );
        return pbstrCurrentTransportActions;
    }

    /**
     * Property LastChange
     */
    public BStr getLastChange()
            throws ComException {
        BStr pbstrLastChange = new BStr();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrLastChange == null ? (Parameter) PTR_NULL : new Pointer(pbstrLastChange)
                }
        );
        return pbstrLastChange;
    }

    /**
     * Property A_ARG_TYPE_SeekMode
     */
    public BStr getA_ARG_TYPE_SeekMode()
            throws ComException {
        BStr pbstrSeekMode = new BStr();
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSeekMode == null ? (Parameter) PTR_NULL : new Pointer(pbstrSeekMode)
                }
        );
        return pbstrSeekMode;
    }

    /**
     * Property A_ARG_TYPE_SeekTarget
     */
    public BStr getA_ARG_TYPE_SeekTarget()
            throws ComException {
        BStr pbstrSeekTarget = new BStr();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pbstrSeekTarget == null ? (Parameter) PTR_NULL : new Pointer(pbstrSeekTarget)
                }
        );
        return pbstrSeekTarget;
    }

    /**
     * Property A_ARG_TYPE_InstanceID
     */
    public UInt32 getA_ARG_TYPE_InstanceID()
            throws ComException {
        UInt32 pulInstanceID = new UInt32();
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pulInstanceID == null ? (Parameter) PTR_NULL : new Pointer(pulInstanceID)
                }
        );
        return pulInstanceID;
    }

    /**
     * Property CurrentProtocolInfo
     */
    public BStr getCurrentProtocolInfo()
            throws ComException {
        BStr pstrProtocolInfo = new BStr();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pstrProtocolInfo == null ? (Parameter) PTR_NULL : new Pointer(pstrProtocolInfo)
                }
        );
        return pstrProtocolInfo;
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPDMRAVTransportServiceImpl(this);
    }
}
