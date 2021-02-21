package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_2 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int teller = 20;
        int y = 25;
        while (teller>10){
            teller--;
            y += 25;
            g.drawString(""+teller,50,y);
        }
    }
}
