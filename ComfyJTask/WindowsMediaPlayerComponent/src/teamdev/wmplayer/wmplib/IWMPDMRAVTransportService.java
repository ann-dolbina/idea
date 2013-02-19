package teamdev.wmplayer.wmplib;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents Java interface for COM interface IWMPDMRAVTransportService.
 */
public interface IWMPDMRAVTransportService extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{4E195DB1-9E29-47FC-9CE1-DE9937D32925}";

    /**
     * Method SetAVTransportURI
     */
    void setAVTransportURI(
            IUnknown /*[in]*/ punkRemoteEndpointInfo,
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrCurrentURI,
            BStr /*[in]*/ bstrCurrentURIMetaData)
            throws ComException;

    /**
     * Method GetMediaInfo
     */
    void getMediaInfo(
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
            throws ComException;

    /**
     * Method GetTransportInfo
     */
    void getTransportInfo(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[out]*/ pbstrCurrentTransportState,
            BStr /*[out]*/ pbstrCurrentTransportStatus,
            BStr /*[out]*/ pbstrCurrentSpeed)
            throws ComException;

    /**
     * Method GetPositionInfo
     */
    void getPositionInfo(
            UInt32 /*[in]*/ ulInstanceID,
            UInt32 /*[out]*/ pTrack,
            BStr /*[out]*/ pbstrTrackDuration,
            BStr /*[out]*/ pbstrTrackMetaData,
            BStr /*[out]*/ pbstrTrackURI,
            BStr /*[out]*/ pbstrRelTime,
            BStr /*[out]*/ pbstrAbsTime,
            Int32 /*[out]*/ plRelCount,
            Int32 /*[out]*/ plAbsCount)
            throws ComException;

    /**
     * Method GetDeviceCapabilities
     */
    void getDeviceCapabilities(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[out]*/ pbstrPlayMedia,
            BStr /*[out]*/ pbstrRecMedia,
            BStr /*[out]*/ pbstrRecQualityModes)
            throws ComException;

    /**
     * Method GetTransportSettings
     */
    void getTransportSettings(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[out]*/ pbstrPlayMode,
            BStr /*[out]*/ pbstrRecQualityMode)
            throws ComException;

    /**
     * Method Stop
     */
    void stop(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException;

    /**
     * Method Play
     */
    void play(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrSpeed)
            throws ComException;

    /**
     * Method Pause
     */
    void pause(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException;

    /**
     * Method Seek
     */
    void seek(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in]*/ bstrUnit,
            BStr /*[in]*/ bstrTarget)
            throws ComException;

    /**
     * Method Next
     */
    void next(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException;

    /**
     * Method Previous
     */
    void previous(
            UInt32 /*[in]*/ ulInstanceID)
            throws ComException;

    /**
     * Method GetCurrentTransportActions
     */
    void getCurrentTransportActions(
            UInt32 /*[in]*/ ulInstanceID,
            BStr /*[in,out]*/ pbstrActions)
            throws ComException;

    /**
     * Property TransportState
     */
    BStr getTransportState()
            throws ComException;

    /**
     * Property TransportStatus
     */
    BStr getTransportStatus()
            throws ComException;

    /**
     * Property PlaybackStorageMedium
     */
    BStr getPlaybackStorageMedium()
            throws ComException;

    /**
     * Property RecordStorageMedium
     */
    BStr getRecordStorageMedium()
            throws ComException;

    /**
     * Property PossiblePlaybackStorageMedia
     */
    BStr getPossiblePlaybackStorageMedia()
            throws ComException;

    /**
     * Property PossibleRecordStorageMedia
     */
    BStr getPossibleRecordStorageMedia()
            throws ComException;

    /**
     * Property CurrentPlayMode
     */
    BStr getCurrentPlayMode()
            throws ComException;

    /**
     * Property TransportPlaySpeed
     */
    BStr getTransportPlaySpeed()
            throws ComException;

    /**
     * Property RecordMediumWriteStatus
     */
    BStr getRecordMediumWriteStatus()
            throws ComException;

    /**
     * Property CurrentRecordQualityMode
     */
    BStr getCurrentRecordQualityMode()
            throws ComException;

    /**
     * Property PossibleRecordQualityModes
     */
    BStr getPossibleRecordQualityModes()
            throws ComException;

    /**
     * Property NumberOfTracks
     */
    UInt32 getNumberOfTracks()
            throws ComException;

    /**
     * Property CurrentTrack
     */
    UInt32 getCurrentTrack()
            throws ComException;

    /**
     * Property CurrentTrackDuration
     */
    BStr getCurrentTrackDuration()
            throws ComException;

    /**
     * Property CurrentMediaDuration
     */
    BStr getCurrentMediaDuration()
            throws ComException;

    /**
     * Property CurrentTrackMetaData
     */
    BStr getCurrentTrackMetaData()
            throws ComException;

    /**
     * Property CurrentTrackURI
     */
    BStr getCurrentTrackURI()
            throws ComException;

    /**
     * Property AVTransportURI
     */
    BStr getAVTransportURI()
            throws ComException;

    /**
     * Property AVTransportURIMetaData
     */
    BStr getAVTransportURIMetaData()
            throws ComException;

    /**
     * Property NextAVTransportURI
     */
    BStr getNextAVTransportURI()
            throws ComException;

    /**
     * Property NextAVTransportURIMetaData
     */
    BStr getNextAVTransportURIMetaData()
            throws ComException;

    /**
     * Property RelativeTimePosition
     */
    BStr getRelativeTimePosition()
            throws ComException;

    /**
     * Property AbsoluteTimePosition
     */
    BStr getAbsoluteTimePosition()
            throws ComException;

    /**
     * Property RelativeCounterPosition
     */
    Int32 getRelativeCounterPosition()
            throws ComException;

    /**
     * Property AbsoluteCounterPosition
     */
    Int32 getAbsoluteCounterPosition()
            throws ComException;

    /**
     * Property CurrentTransportActions
     */
    BStr getCurrentTransportActionsProperty()
            throws ComException;

    /**
     * Property LastChange
     */
    BStr getLastChange()
            throws ComException;

    /**
     * Property A_ARG_TYPE_SeekMode
     */
    BStr getA_ARG_TYPE_SeekMode()
            throws ComException;

    /**
     * Property A_ARG_TYPE_SeekTarget
     */
    BStr getA_ARG_TYPE_SeekTarget()
            throws ComException;

    /**
     * Property A_ARG_TYPE_InstanceID
     */
    UInt32 getA_ARG_TYPE_InstanceID()
            throws ComException;

    /**
     * Property CurrentProtocolInfo
     */
    BStr getCurrentProtocolInfo()
            throws ComException;
}
