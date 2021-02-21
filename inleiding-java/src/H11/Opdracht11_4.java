package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_4 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int keer = 1;
        int x = 100;
        int output;
        while (keer<11){
            output = keer *3;
            g.drawString(""+output,x,100);
            keer++;
            x +=20;
        }
    }
}
