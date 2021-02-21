package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_7 extends Applet {
    int teller = 0;
    int x = 500;
    int y = 500;
    int width = 10;
    int height = 10;

    public void init(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int widthScreen = (int)screenSize.getWidth();
        int heightScreen = (int)screenSize.getHeight();
        setSize(widthScreen, heightScreen);
    }

    public void paint(Graphics g){
        while (teller<50){
            g.drawOval(x,y,width,height);
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
            teller ++;
        }
    }
}

