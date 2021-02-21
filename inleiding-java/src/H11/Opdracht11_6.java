package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_6 extends Applet {
    int teller = 0;
    int x = 200;
    int y = 200;
    int width = 10;
    int height = 10;

    public void init(){
    }

    public void paint(Graphics g){
        while (teller<5){
            g.drawOval(x,y,width,height);
            x -= 10;
            y -= 10;
            width += 20;
            height += 20;
            teller ++;
        }
    }
}
