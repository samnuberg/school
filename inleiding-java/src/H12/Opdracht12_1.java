package H12;


import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    int y = 50;
    Double totaal = 0.0;
    Double[] getallen = {12.0,35.0,23.0,65.0,34.0,12.0,95.0,76.0,14.0,54.0};
    Double gemiddelde = 0.0;

    public void init(){
    }

    public void paint(Graphics g){
        for (int teller = 0; teller < getallen.length; teller++){
            g.drawString(""+getallen[teller],50,y);
            totaal += getallen[teller];
            y += 20;
        }
        gemiddelde = totaal /getallen.length;
        System.out.println(totaal);
        g.drawString("gemiddelde is: "+gemiddelde,50,y);
    }
}
