package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_5 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(100,100,200,100,0,360);
    }
}
