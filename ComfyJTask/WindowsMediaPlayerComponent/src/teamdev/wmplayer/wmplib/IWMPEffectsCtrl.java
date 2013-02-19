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
 * Represents Java interface for COM interface IWMPEffectsCtrl.
 */
public interface IWMPEffectsCtrl extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{A9EFAB80-0A60-4C3F-BBD1-4558DD2A9769}";

    /**
     * method next
     */
    void next()
            throws ComException;

    /**
     * method previous
     */
    void previous()
            throws ComException;

    /**
     * method settings
     */
    void settings()
            throws ComException;

    /**
     * method nextEffect
     */
    void nextEffect()
            throws ComException;

    /**
     * method previousEffect
     */
    void previousEffect()
            throws ComException;

    /**
     * method nextPreset
     */
    void nextPreset()
            throws ComException;

    /**
     * method previousPreset
     */
    void previousPreset()
            throws ComException;

    /**
     * property windowed
     */
    VariantBool getWindowed()
            throws ComException;

    /**
     * property windowed
     */
    void setWindowed(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property allowAll
     */
    VariantBool getAllowAll()
            throws ComException;

    /**
     * property allowAll
     */
    void setAllowAll(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property currentEffectType
     */
    void setCurrentEffectType(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property currentEffectType
     */
    BStr getCurrentEffectType()
            throws ComException;

    /**
     * property currentEffectTitle
     */
    BStr getCurrentEffectTitle()
            throws ComException;

    /**
     * property currentEffect
     */
    IDispatch getCurrentEffect()
            throws ComException;

    /**
     * property currentEffect
     */
    void setCurrentEffect(
            IDispatch /*[in]*/ p)
            throws ComException;

    /**
     * property currentPreset
     */
    Int32 getCurrentPreset()
            throws ComException;

    /**
     * property currentPreset
     */
    void setCurrentPreset(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property currentPresetTitle
     */
    BStr getCurrentPresetTitle()
            throws ComException;

    /**
     * property currentEffectPresetCount
     */
    Int32 getCurrentEffectPresetCount()
            throws ComException;

    /**
     * property fullScreen
     */
    VariantBool getFullScreen()
            throws ComException;

    /**
     * property fullScreen
     */
    void setFullScreen(
            VariantBool /*[in]*/ pbFullScreen)
            throws ComException;

    /**
     * property canGoFullScreen
     */
    VariantBool getEffectCanGoFullScreen()
            throws ComException;

    /**
     * property canGoFullScreen
     */
    VariantBool getEffectHasPropertyPage()
            throws ComException;

    /**
     * property effectCount
     */
    Int32 getEffectCount()
            throws ComException;

    /**
     * property effectTitle(index)
     */
    BStr getEffectTitle(
            Int32 /*[in]*/ index)
            throws ComException;

    /**
     * property effectType(index)
     */
    BStr getEffectType(
            Int32 /*[in]*/ index)
            throws ComException;
}
