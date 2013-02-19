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
 * Represents Java interface for COM interface IWMPCDDVDWizardExternal.
 */
public interface IWMPCDDVDWizardExternal extends IWMPExternalColors {
    public static final String INTERFACE_IDENTIFIER = "{2D7EF888-1D3C-484A-A906-9F49D99BB344}";

    /**
     *
     */
    void writeNames(
            BStr /*[in]*/ bstrTOC,
            BStr /*[in]*/ bstrMetadata)
            throws ComException;

    /**
     *
     */
    void returnToMainTask()
            throws ComException;

    /**
     *
     */
    void writeNamesEx(
            WMP_WRITENAMESEX_TYPE /*[in]*/ type,
            BStr /*[in]*/ bstrTypeId,
            BStr /*[in]*/ bstrMetadata,
            VariantBool /*[in]*/ fRenameRegroupFiles)
            throws ComException;

    /**
     *
     */
    BStr getMDQByRequestID(
            BStr /*[in]*/ bstrRequestID)
            throws ComException;

    /**
     *
     */
    void editMetadata()
            throws ComException;

    /**
     *
     */
    VariantBool isMetadataAvailableForEdit()
            throws ComException;

    /**
     *
     */
    void buyCD(
            BStr /*[in]*/ bstrTitle,
            BStr /*[in]*/ bstrArtist,
            BStr /*[in]*/ bstrAlbum,
            BStr /*[in]*/ bstrUFID,
            BStr /*[in]*/ bstrWMID)
            throws ComException;
}
