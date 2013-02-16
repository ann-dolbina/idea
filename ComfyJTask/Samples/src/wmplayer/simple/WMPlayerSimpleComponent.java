package wmplayer.simple;

import com.jniwrapper.win32.automation.OleContainer;
import com.jniwrapper.win32.automation.types.BStr;
import com.jniwrapper.win32.ole.types.OleVerbs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import teamdev.wmplayer.wmplib.IWMPCore;
import teamdev.wmplayer.wmplib.impl.IWMPCoreImpl;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class WMPlayerSimpleComponent extends JComponent{
    private final OleContainer playerContainer;
    private final Logger logger=LoggerFactory.getLogger(WMPlayerSimpleComponent.class);
    public WMPlayerSimpleComponent() {
        super();
        setPreferredSize(new Dimension(160,128));
        playerContainer=new OleContainer();
        setLayout(new BorderLayout());
        add(playerContainer, BorderLayout.CENTER);
        playerContainer.createObject("WMPlayer.OCX");
        playerContainer.setActivationVerb(OleVerbs.INPLACEACTIVATE);
    }
    public void open(final File file){
        try {
            playerContainer.getOleMessageLoop().doInvokeAndWait(new Runnable() {
                @Override
                public void run() {
                    IWMPCore iwmpCore=new IWMPCoreImpl(playerContainer.getOleObject());
                    iwmpCore.setURL(new BStr(file.getAbsolutePath()));
                    if (iwmpCore != null && !iwmpCore.isNull()) {
                        iwmpCore.setAutoDelete(false);
                        iwmpCore.release();
                    }
                }
            });
        } catch (Exception e) {
            logger.error("File open failed ",e);
        }
    }
    public void destroy(){
        logger.info("Destroying "+getName());
        playerContainer.destroyObject();
    }
}
