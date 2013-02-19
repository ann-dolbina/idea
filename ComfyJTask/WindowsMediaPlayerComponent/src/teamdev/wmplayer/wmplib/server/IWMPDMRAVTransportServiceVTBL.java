package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.server.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPDMRAVTransportService.
 */
public class IWMPDMRAVTransportServiceVTBL extends IDispatchVTBL {
    public IWMPDMRAVTransportServiceVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "getTransportState",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getTransportStatus",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPlaybackStorageMedium",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getRecordStorageMedium",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPossiblePlaybackStorageMedia",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPossibleRecordStorageMedia",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentPlayMode",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getTransportPlaySpeed",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getRecordMediumWriteStatus",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentRecordQualityMode",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getPossibleRecordQualityModes",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getNumberOfTracks",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new UInt32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentTrack",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new UInt32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentTrackDuration",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentMediaDuration",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentTrackMetaData",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentTrackURI",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAVTransportURI",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAVTransportURIMetaData",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getNextAVTransportURI",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getNextAVTransportURIMetaData",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getRelativeTimePosition",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAbsoluteTimePosition",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getRelativeCounterPosition",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getAbsoluteCounterPosition",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new Int32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentTransportActionsProperty",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getLastChange",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_SeekMode",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_SeekTarget",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getA_ARG_TYPE_InstanceID",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new UInt32())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "getCurrentProtocolInfo",
                                new HResult(),
                                new Parameter[]{
                                        new Pointer(new BStr())
                                },
                                0
                        ),
                        new VirtualMethodCallback(
                                "setAVTransportURI",
                                new HResult(),
                                new Parameter[]{
                                        new IUnknownImpl(),
                                        new UInt32(),
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getMediaInfo",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new UInt32()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getTransportInfo",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getPositionInfo",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new UInt32()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new Int32()),
                                        new Pointer(new Int32())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getDeviceCapabilities",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "getTransportSettings",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new BStr()),
                                        new Pointer(new BStr())
                                }
                        ),
                        new VirtualMethodCallback(
                                "stop",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "play",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "pause",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "seek",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "next",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "previous",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "getCurrentTransportActions",
                                new HResult(),
                                new Parameter[]{
                                        new UInt32(),
                                        new Pointer(new BStr())
                                }
                        )
                }
        );
    }
}