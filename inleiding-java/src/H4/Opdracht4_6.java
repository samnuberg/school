package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.fillRect(170,150,15,140);
        g.drawRoundRect(150,40,55,110,20,20);
        g.setColor(Color.red);
        g.fillArc(169,55,20,20,0,360);
        g.setColor(Color.orange);
        g.fillArc(169,85,20,20,0,360);
        g.setColor(Color.green);
        g.fillArc(169,115,20,20,0,360);
    }
}
