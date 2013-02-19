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
 * Represents Java interface for COM interface IWMPSyncDevice3.
 */
public interface IWMPSyncDevice3 extends IWMPSyncDevice2 {
    public static final String INTERFACE_IDENTIFIER = "{B22C85F9-263C-4372-A0DA-B518DB9B4098}";

    /**
     *
     */
    void estimateSyncSize(
            IWMPPlaylist /*[in]*/ pNonRulePlaylist,
            IWMPPlaylist /*[in]*/ pRulesPlaylist)
            throws ComException;

    /**
     *
     */
    void cancelEstimation()
            throws ComException;
}
