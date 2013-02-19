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
 * Represents Java interface for COM interface IBarsEffect.
 */
public interface IBarsEffect extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{33E9291A-F6A9-11D2-9435-00A0C92A2F2D}";

    /**
     * property displayMode
     */
    Int32 getDisplayMode()
            throws ComException;

    /**
     * property displayMode
     */
    void setDisplayMode(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property showPeaks
     */
    VariantBool getShowPeaks()
            throws ComException;

    /**
     * property showPeaks
     */
    void setShowPeaks(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property peakHangTime
     */
    Int32 getPeakHangTime()
            throws ComException;

    /**
     * property peakHangTime
     */
    void setPeakHangTime(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property peakFallbackAcceleration
     */
    SingleFloat getPeakFallbackAcceleration()
            throws ComException;

    /**
     * property peakFallbackAcceleration
     */
    void setPeakFallbackAcceleration(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property peakFallbackSpeed
     */
    SingleFloat getPeakFallbackSpeed()
            throws ComException;

    /**
     * property peakFallbackSpeed
     */
    void setPeakFallbackSpeed(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property levelFallbackAcceleration
     */
    SingleFloat getLevelFallbackAcceleration()
            throws ComException;

    /**
     * property levelFallbackAcceleration
     */
    void setLevelFallbackAcceleration(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property levelFallbackSpeed
     */
    SingleFloat getLevelFallbackSpeed()
            throws ComException;

    /**
     * property levelFallbackSpeed
     */
    void setLevelFallbackSpeed(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property backgroundColor
     */
    BStr getBackgroundColor()
            throws ComException;

    /**
     * property backgroundColor
     */
    void setBackgroundColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property levelColor
     */
    BStr getLevelColor()
            throws ComException;

    /**
     * property levelColor
     */
    void setLevelColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property peakColor
     */
    BStr getPeakColor()
            throws ComException;

    /**
     * property peakColor
     */
    void setPeakColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property horizontalSpacing
     */
    Int32 getHorizontalSpacing()
            throws ComException;

    /**
     * property horizontalSpacing
     */
    void setHorizontalSpacing(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property levelWidth
     */
    Int32 getLevelWidth()
            throws ComException;

    /**
     * property levelWidth
     */
    void setLevelWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property levelScale
     */
    SingleFloat getLevelScale()
            throws ComException;

    /**
     * property levelScale
     */
    void setLevelScale(
            SingleFloat /*[in]*/ pVal)
            throws ComException;

    /**
     * property fadeRate
     */
    Int32 getFadeRate()
            throws ComException;

    /**
     * property fadeRate
     */
    void setFadeRate(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property fadeMode
     */
    Int32 getFadeMode()
            throws ComException;

    /**
     * property fadeMode
     */
    void setFadeMode(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property transparent
     */
    VariantBool getTransparent()
            throws ComException;

    /**
     * property transparent
     */
    void setTransparent(
            VariantBool /*[in]*/ pVal)
            throws ComException;
}
