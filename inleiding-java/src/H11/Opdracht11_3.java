package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_3 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int teller = 0;
        int getal1 = 0;
        int getal2 = 1;
        int output;
        int y = 20;
        while (teller<getal2){
            output = getal1 + getal2;
            getal1 = getal2;
            getal2 = output;
            g.drawString(""+output,100,y);
            y += 20;
        }
    }
}
