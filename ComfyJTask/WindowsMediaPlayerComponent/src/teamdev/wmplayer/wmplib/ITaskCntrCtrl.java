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
 * Represents Java interface for COM interface ITaskCntrCtrl.
 */
public interface ITaskCntrCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{891EADB1-1C45-48B0-B704-49A888DA98C4}";

    /**
     *
     */
    void activate()
            throws ComException;

    /**
     *
     */
    IUnknown getCurrentContainer()
            throws ComException;

    /**
     *
     */
    void setCurrentContainer(
            IUnknown /*[in]*/ ppUnk)
            throws ComException;
}
