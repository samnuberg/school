package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_8 extends Applet {
    int width = 10;
    int height = 10;
    int teller = 0;

    public void init(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int widthScreen = (int)screenSize.getWidth();
        int heightScreen = (int)screenSize.getHeight();
        setSize(widthScreen, heightScreen);
    }

    public void paint(Graphics g){
        while(teller<101){
            g.drawOval(100,100,width,height);
            width += 10;
            height += 10;
            teller ++;
        }
    }
}
