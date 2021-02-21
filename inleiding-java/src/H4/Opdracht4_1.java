package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_1 extends Applet {

    public void init() {setBackground(Color.white);}

    public void paint(Graphics g) {
        g.drawLine(100,50,200,50);
        g.drawLine(100,50,150,150);
        g.drawLine(200,50,150,150);
    }
}
