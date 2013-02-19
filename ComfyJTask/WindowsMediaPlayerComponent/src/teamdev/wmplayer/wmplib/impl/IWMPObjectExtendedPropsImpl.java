package teamdev.wmplayer.wmplib.impl;

import com.jniwrapper.*;
import com.jniwrapper.win32.*;
import com.jniwrapper.win32.automation.*;
import com.jniwrapper.win32.automation.impl.*;
import com.jniwrapper.win32.automation.types.*;
import com.jniwrapper.win32.com.*;
import com.jniwrapper.win32.com.impl.*;
import com.jniwrapper.win32.com.types.*;
import com.jniwrapper.win32.com.types.GUID;
import teamdev.wmplayer.wmplib.*;

/**
 * Represents COM interface IWMPObjectExtendedProps.
 */
public class IWMPObjectExtendedPropsImpl extends IDispatchImpl
        implements IWMPObjectExtendedProps {
    public static final String INTERFACE_IDENTIFIER = IWMPObjectExtendedProps.INTERFACE_IDENTIFIER;
    private static final IID _iid = IID.create(INTERFACE_IDENTIFIER);

    public IWMPObjectExtendedPropsImpl() {
    }

    protected IWMPObjectExtendedPropsImpl(IUnknownImpl that) throws ComException {
        super(that);
    }

    public IWMPObjectExtendedPropsImpl(IUnknown that) throws ComException {
        super(that);
    }

    public IWMPObjectExtendedPropsImpl(CLSID clsid, ClsCtx dwClsContext) throws ComException {
        super(clsid, dwClsContext);
    }

    public IWMPObjectExtendedPropsImpl(CLSID clsid, IUnknownImpl pUnkOuter, ClsCtx dwClsContext) throws ComException {
        super(clsid, pUnkOuter, dwClsContext);
    }

    /**
     * method moveTo
     */
    public void moveTo(
            Int32 /*[in]*/ newX,
            Int32 /*[in]*/ newY,
            Int32 /*[in]*/ moveTime)
            throws ComException {
        invokeStandardVirtualMethod(
                39,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newX,
                        newY,
                        moveTime
                }
        );
    }

    /**
     * method slideTo
     */
    public void slideTo(
            Int32 /*[in]*/ newX,
            Int32 /*[in]*/ newY,
            Int32 /*[in]*/ moveTime)
            throws ComException {
        invokeStandardVirtualMethod(
                40,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newX,
                        newY,
                        moveTime
                }
        );
    }

    /**
     * method moveSizeTo
     */
    public void moveSizeTo(
            Int32 /*[in]*/ newX,
            Int32 /*[in]*/ newY,
            Int32 /*[in]*/ newWidth,
            Int32 /*[in]*/ newHeight,
            Int32 /*[in]*/ moveTime,
            VariantBool /*[in]*/ fSlide)
            throws ComException {
        invokeStandardVirtualMethod(
                41,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newX,
                        newY,
                        newWidth,
                        newHeight,
                        moveTime,
                        fSlide
                }
        );
    }

    /**
     * method alphaBlendTo
     */
    public void alphaBlendTo(
            Int32 /*[in]*/ newVal,
            Int32 /*[in]*/ alphaTime)
            throws ComException {
        invokeStandardVirtualMethod(
                44,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        newVal,
                        alphaTime
                }
        );
    }

    /**
     * property id
     */
    public BStr getID()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                7,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property elementType
     */
    public BStr getElementType()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                8,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property left
     */
    public Int32 getLeft()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                9,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property left
     */
    public void setLeft(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                10,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property top
     */
    public Int32 getTop()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                11,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property top
     */
    public void setTop(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                12,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property right
     */
    public Int32 getRight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                13,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property right
     */
    public void setRight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                14,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property bottom
     */
    public Int32 getBottom()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                15,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property bottom
     */
    public void setBottom(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                16,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property width
     */
    public Int32 getWidth()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                17,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property width
     */
    public void setWidth(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                18,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property height
     */
    public Int32 getHeight()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                19,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property height
     */
    public void setHeight(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                20,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property zIndex
     */
    public Int32 getZIndex()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                21,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property zIndex
     */
    public void setZIndex(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                22,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property clippingImage
     */
    public BStr getClippingImage()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                23,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property clippingImage
     */
    public void setClippingImage(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                24,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property clippingColor
     */
    public BStr getClippingColor()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                25,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property clippingColor
     */
    public void setClippingColor(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                26,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property visible
     */
    public VariantBool getVisible()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                27,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property visible
     */
    public void setVisible(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                28,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property enabled
     */
    public VariantBool getEnabled()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                29,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property enabled
     */
    public void setEnabled(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                30,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property tabStop
     */
    public VariantBool getTabStop()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                31,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property tabStop
     */
    public void setTabStop(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                32,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property passThrough
     */
    public VariantBool getPassThrough()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                33,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property passThrough
     */
    public void setPassThrough(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                34,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property horizontalAlignment
     */
    public BStr getHorizontalAlignment()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                35,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property horizontalAlignment
     */
    public void setHorizontalAlignment(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                36,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property verticalAlignment
     */
    public BStr getVerticalAlignment()
            throws ComException {
        BStr pVal = new BStr();
        invokeStandardVirtualMethod(
                37,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property verticalAlignment
     */
    public void setVerticalAlignment(
            BStr /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                38,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : pVal
                }
        );
    }

    /**
     * property alphaBlend
     */
    public Int32 getAlphaBlend()
            throws ComException {
        Int32 pVal = new Int32();
        invokeStandardVirtualMethod(
                42,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property alphaBlend
     */
    public void setAlphaBlend(
            Int32 /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                43,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property accName
     */
    public BStr getAccName()
            throws ComException {
        BStr pszName = new BStr();
        invokeStandardVirtualMethod(
                45,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszName == null ? (Parameter) PTR_NULL : new Pointer(pszName)
                }
        );
        return pszName;
    }

    /**
     * property accName
     */
    public void setAccName(
            BStr /*[in]*/ pszName)
            throws ComException {
        invokeStandardVirtualMethod(
                46,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszName == null ? (Parameter) PTR_NULL : pszName
                }
        );
    }

    /**
     * property accDescription
     */
    public BStr getAccDescription()
            throws ComException {
        BStr pszDesc = new BStr();
        invokeStandardVirtualMethod(
                47,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszDesc == null ? (Parameter) PTR_NULL : new Pointer(pszDesc)
                }
        );
        return pszDesc;
    }

    /**
     * property accDescription
     */
    public void setAccDescription(
            BStr /*[in]*/ pszDesc)
            throws ComException {
        invokeStandardVirtualMethod(
                48,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszDesc == null ? (Parameter) PTR_NULL : pszDesc
                }
        );
    }

    /**
     * property accKeyboardShortcut
     */
    public BStr getAccKeyboardShortcut()
            throws ComException {
        BStr pszShortcut = new BStr();
        invokeStandardVirtualMethod(
                49,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszShortcut == null ? (Parameter) PTR_NULL : new Pointer(pszShortcut)
                }
        );
        return pszShortcut;
    }

    /**
     * property accKeyboardShortcut
     */
    public void setAccKeyboardShortcut(
            BStr /*[in]*/ pszShortcut)
            throws ComException {
        invokeStandardVirtualMethod(
                50,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszShortcut == null ? (Parameter) PTR_NULL : pszShortcut
                }
        );
    }

    /**
     * property resizeImages
     */
    public VariantBool getResizeImages()
            throws ComException {
        VariantBool pVal = new VariantBool();
        invokeStandardVirtualMethod(
                51,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal == null ? (Parameter) PTR_NULL : new Pointer(pVal)
                }
        );
        return pVal;
    }

    /**
     * property resizeImages
     */
    public void setResizeImages(
            VariantBool /*[in]*/ pVal)
            throws ComException {
        invokeStandardVirtualMethod(
                52,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pVal
                }
        );
    }

    /**
     * property nineGridMargins
     */
    public BStr getNineGridMargins()
            throws ComException {
        BStr pszMargins = new BStr();
        invokeStandardVirtualMethod(
                53,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszMargins == null ? (Parameter) PTR_NULL : new Pointer(pszMargins)
                }
        );
        return pszMargins;
    }

    /**
     * property nineGridMargins
     */
    public void setNineGridMargins(
            BStr /*[in]*/ pszMargins)
            throws ComException {
        invokeStandardVirtualMethod(
                54,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pszMargins == null ? (Parameter) PTR_NULL : pszMargins
                }
        );
    }

    /**
     * property resizeOptimize
     */
    public BStr getResizeOptimize()
            throws ComException {
        BStr ppszResizeOptimize = new BStr();
        invokeStandardVirtualMethod(
                55,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppszResizeOptimize == null ? (Parameter) PTR_NULL : new Pointer(ppszResizeOptimize)
                }
        );
        return ppszResizeOptimize;
    }

    /**
     * property resizeOptimize
     */
    public void setResizeOptimize(
            BStr /*[in]*/ ppszResizeOptimize)
            throws ComException {
        invokeStandardVirtualMethod(
                56,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        ppszResizeOptimize == null ? (Parameter) PTR_NULL : ppszResizeOptimize
                }
        );
    }

    /**
     * property rotation
     */
    public SingleFloat getRotation()
            throws ComException {
        SingleFloat pfVal = new SingleFloat();
        invokeStandardVirtualMethod(
                57,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal == null ? (Parameter) PTR_NULL : new Pointer(pfVal)
                }
        );
        return pfVal;
    }

    /**
     * property rotation
     */
    public void setRotation(
            SingleFloat /*[in]*/ pfVal)
            throws ComException {
        invokeStandardVirtualMethod(
                58,
                Function.STDCALL_CALLING_CONVENTION,
                new Parameter[]{
                        pfVal
                }
        );
    }

    public IID getIID() {
        return _iid;
    }

    public Object clone() {
        return new IWMPObjectExtendedPropsImpl(this);
    }
}
