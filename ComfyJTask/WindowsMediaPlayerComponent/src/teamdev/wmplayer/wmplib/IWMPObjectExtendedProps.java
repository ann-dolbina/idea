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
 * Represents Java interface for COM interface IWMPObjectExtendedProps.
 */
public interface IWMPObjectExtendedProps extends IDispatch {
    public static final String INTERFACE_IDENTIFIER = "{21D077C1-4BAA-11D3-BD45-00C04F6EA5AE}";

    /**
     * method moveTo
     */
    void moveTo(
            Int32 /*[in]*/ newX,
            Int32 /*[in]*/ newY,
            Int32 /*[in]*/ moveTime)
            throws ComException;

    /**
     * method slideTo
     */
    void slideTo(
            Int32 /*[in]*/ newX,
            Int32 /*[in]*/ newY,
            Int32 /*[in]*/ moveTime)
            throws ComException;

    /**
     * method moveSizeTo
     */
    void moveSizeTo(
            Int32 /*[in]*/ newX,
            Int32 /*[in]*/ newY,
            Int32 /*[in]*/ newWidth,
            Int32 /*[in]*/ newHeight,
            Int32 /*[in]*/ moveTime,
            VariantBool /*[in]*/ fSlide)
            throws ComException;

    /**
     * method alphaBlendTo
     */
    void alphaBlendTo(
            Int32 /*[in]*/ newVal,
            Int32 /*[in]*/ alphaTime)
            throws ComException;

    /**
     * property id
     */
    BStr getID()
            throws ComException;

    /**
     * property elementType
     */
    BStr getElementType()
            throws ComException;

    /**
     * property left
     */
    Int32 getLeft()
            throws ComException;

    /**
     * property left
     */
    void setLeft(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property top
     */
    Int32 getTop()
            throws ComException;

    /**
     * property top
     */
    void setTop(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property right
     */
    Int32 getRight()
            throws ComException;

    /**
     * property right
     */
    void setRight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property bottom
     */
    Int32 getBottom()
            throws ComException;

    /**
     * property bottom
     */
    void setBottom(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property width
     */
    Int32 getWidth()
            throws ComException;

    /**
     * property width
     */
    void setWidth(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property height
     */
    Int32 getHeight()
            throws ComException;

    /**
     * property height
     */
    void setHeight(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property zIndex
     */
    Int32 getZIndex()
            throws ComException;

    /**
     * property zIndex
     */
    void setZIndex(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property clippingImage
     */
    BStr getClippingImage()
            throws ComException;

    /**
     * property clippingImage
     */
    void setClippingImage(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property clippingColor
     */
    BStr getClippingColor()
            throws ComException;

    /**
     * property clippingColor
     */
    void setClippingColor(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property visible
     */
    VariantBool getVisible()
            throws ComException;

    /**
     * property visible
     */
    void setVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property enabled
     */
    VariantBool getEnabled()
            throws ComException;

    /**
     * property enabled
     */
    void setEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property tabStop
     */
    VariantBool getTabStop()
            throws ComException;

    /**
     * property tabStop
     */
    void setTabStop(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property passThrough
     */
    VariantBool getPassThrough()
            throws ComException;

    /**
     * property passThrough
     */
    void setPassThrough(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property horizontalAlignment
     */
    BStr getHorizontalAlignment()
            throws ComException;

    /**
     * property horizontalAlignment
     */
    void setHorizontalAlignment(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property verticalAlignment
     */
    BStr getVerticalAlignment()
            throws ComException;

    /**
     * property verticalAlignment
     */
    void setVerticalAlignment(
            BStr /*[in]*/ pVal)
            throws ComException;

    /**
     * property alphaBlend
     */
    Int32 getAlphaBlend()
            throws ComException;

    /**
     * property alphaBlend
     */
    void setAlphaBlend(
            Int32 /*[in]*/ pVal)
            throws ComException;

    /**
     * property accName
     */
    BStr getAccName()
            throws ComException;

    /**
     * property accName
     */
    void setAccName(
            BStr /*[in]*/ pszName)
            throws ComException;

    /**
     * property accDescription
     */
    BStr getAccDescription()
            throws ComException;

    /**
     * property accDescription
     */
    void setAccDescription(
            BStr /*[in]*/ pszDesc)
            throws ComException;

    /**
     * property accKeyboardShortcut
     */
    BStr getAccKeyboardShortcut()
            throws ComException;

    /**
     * property accKeyboardShortcut
     */
    void setAccKeyboardShortcut(
            BStr /*[in]*/ pszShortcut)
            throws ComException;

    /**
     * property resizeImages
     */
    VariantBool getResizeImages()
            throws ComException;

    /**
     * property resizeImages
     */
    void setResizeImages(
            VariantBool /*[in]*/ pVal)
            throws ComException;

    /**
     * property nineGridMargins
     */
    BStr getNineGridMargins()
            throws ComException;

    /**
     * property nineGridMargins
     */
    void setNineGridMargins(
            BStr /*[in]*/ pszMargins)
            throws ComException;

    /**
     * property resizeOptimize
     */
    BStr getResizeOptimize()
            throws ComException;

    /**
     * property resizeOptimize
     */
    void setResizeOptimize(
            BStr /*[in]*/ ppszResizeOptimize)
            throws ComException;

    /**
     * property rotation
     */
    SingleFloat getRotation()
            throws ComException;

    /**
     * property rotation
     */
    void setRotation(
            SingleFloat /*[in]*/ pfVal)
            throws ComException;
}
