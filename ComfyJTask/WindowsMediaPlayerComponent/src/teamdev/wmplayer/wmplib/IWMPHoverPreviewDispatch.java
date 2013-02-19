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
 * Represents Java interface for COM interface IWMPHoverPreviewDispatch.
 */
public interface IWMPHoverPreviewDispatch extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{946B023E-044C-4473-8018-74954F09DC7E}";

    /**
     *
     */
    void dismiss()
            throws ComException;

    /**
     *
     */
    BStr getTitle()
            throws ComException;

    /**
     *
     */
    BStr getAlbum()
            throws ComException;

    /**
     *
     */
    BStr getURL()
            throws ComException;

    /**
     *
     */
    void setImage(
            IDispatch /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    void setAutoClick(
            VariantBool /*[in]*/ param1)
            throws ComException;

    /**
     *
     */
    void setPreviewClick(
            VariantBool /*[in]*/ param1)
            throws ComException;
}
