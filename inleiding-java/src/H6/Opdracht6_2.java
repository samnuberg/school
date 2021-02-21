package H6;

import java.awt.*;
import java.applet.*;

public class Opdracht6_2 extends Applet {
    int minuut;
    int uur;
    int dag;
    int jaar;
    public void init(){
        minuut = 60;
        uur = minuut *60;
        dag = uur *24;
        jaar = dag*365;
    }

    public void paint(Graphics g) {
        g.drawString("Er zitten " + uur + " seconden in een uur",100,100);
        g.drawString("Er zitten " + dag + " seconden in een dag",100,120);
        g.drawString("Er zitten " + jaar + " seconden in een jaar",100,140);
    }

}
