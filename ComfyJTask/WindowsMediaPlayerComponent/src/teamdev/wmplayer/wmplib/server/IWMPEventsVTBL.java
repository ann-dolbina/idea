package teamdev.wmplayer.wmplib.server;

import com.jniwrapper.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.server.*;
import com.jniwrapper.win32.com.types.*;
import teamdev.wmplayer.wmplib.*;
import teamdev.wmplayer.wmplib.impl.*;

/**
 * Represents VTBL for COM interface IWMPEvents.
 */
public class IWMPEventsVTBL extends IUnknownVTBL {
    public IWMPEventsVTBL(CoClassMetaInfo classMetaInfo) {
        super(classMetaInfo);

        addMembers(
                new VirtualMethodCallback[]{
                        new VirtualMethodCallback(
                                "openStateChange",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playStateChange",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "audioLanguageChange",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "statusChange",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "scriptCommand",
                                null,
                                new Parameter[]{
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "newStream",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "disconnect",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "buffering",
                                null,
                                new Parameter[]{
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "error",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "warning",
                                null,
                                new Parameter[]{
                                        new Int32(),
                                        new Int32(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "endOfStream",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "positionChange",
                                null,
                                new Parameter[]{
                                        new DoubleFloat(),
                                        new DoubleFloat()
                                }
                        ),
                        new VirtualMethodCallback(
                                "markerHit",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "durationUnitChange",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "cdromMediaChange",
                                null,
                                new Parameter[]{
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playlistChange",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl(),
                                        new WMPPlaylistChangeEventType()
                                }
                        ),
                        new VirtualMethodCallback(
                                "currentPlaylistChange",
                                null,
                                new Parameter[]{
                                        new WMPPlaylistChangeEventType()
                                }
                        ),
                        new VirtualMethodCallback(
                                "currentPlaylistItemAvailable",
                                null,
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaChange",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "currentMediaItemAvailable",
                                null,
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "currentItemChange",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaCollectionChange",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaCollectionAttributeStringAdded",
                                null,
                                new Parameter[]{
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaCollectionAttributeStringRemoved",
                                null,
                                new Parameter[]{
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaCollectionAttributeStringChanged",
                                null,
                                new Parameter[]{
                                        new BStr(),
                                        new BStr(),
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playlistCollectionChange",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "playlistCollectionPlaylistAdded",
                                null,
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playlistCollectionPlaylistRemoved",
                                null,
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "playlistCollectionPlaylistSetAsDeleted",
                                null,
                                new Parameter[]{
                                        new BStr(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "modeChange",
                                null,
                                new Parameter[]{
                                        new BStr(),
                                        new VariantBool()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mediaError",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "openPlaylistSwitch",
                                null,
                                new Parameter[]{
                                        new IDispatchImpl()
                                }
                        ),
                        new VirtualMethodCallback(
                                "domainChange",
                                null,
                                new Parameter[]{
                                        new BStr()
                                }
                        ),
                        new VirtualMethodCallback(
                                "switchedToPlayerApplication",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "switchedToControl",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "playerDockedStateChange",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "playerReconnect",
                                null,
                                new Parameter[]{
                                }
                        ),
                        new VirtualMethodCallback(
                                "click",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "doubleClick",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "keyDown",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16()
                                }
                        ),
                        new VirtualMethodCallback(
                                "keyPress",
                                null,
                                new Parameter[]{
                                        new Int16()
                                }
                        ),
                        new VirtualMethodCallback(
                                "keyUp",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mouseDown",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mouseMove",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16(),
                                        new Int32(),
                                        new Int32()
                                }
                        ),
                        new VirtualMethodCallback(
                                "mouseUp",
                                null,
                                new Parameter[]{
                                        new Int16(),
                                        new Int16(),
                                        new Int32(),
                                        new Int32()
                                }
                        )
                }
        );
    }
}