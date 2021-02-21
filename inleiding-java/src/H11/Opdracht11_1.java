package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht11_1 extends Applet {
    int teller;
    int x;

    public void init(){
        teller = 0;
        x = 100;
    }

    public void paint(Graphics g){
        while (teller<10){
            x += 20;
            g.drawLine(x,100,x,200);
            teller++;
        }
    }
}
