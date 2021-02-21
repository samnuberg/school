package H6;

import java.awt.*;
import java.applet.*;

public class Opdracht6_1 extends Applet {
    double totaal, deel;

    public void init() {
        totaal = 113;
        deel = totaal /4;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + deel,100,100);
        g.drawString("Ali krijgt: " + deel,100,120);
        g.drawString("Jeannette krijgt: " + deel,100,140);
        g.drawString("Ik krijg: " + deel,100,160);
    }
}
