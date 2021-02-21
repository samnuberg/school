package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_7 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.drawRoundRect(150,100,100,100,35,35);
        g.fillArc(170,120,20,20,0,360);
        g.fillArc(170,160,20,20,0,360);
        g.fillArc(210,120,20,20,0,360);
        g.fillArc(210,160,20,20,0,360);
    }
}
