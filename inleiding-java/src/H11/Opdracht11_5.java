package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_5 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int x = 100;
        int y = 100;
        int teller = 0;
        while (teller<5){
            g.drawRect(x,y,20,20);
            x +=20;
            y +=20;
            teller++;
        }
    }
}
