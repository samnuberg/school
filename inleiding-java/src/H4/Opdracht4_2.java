package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet{
    public void init(){

    }

    public void paint(Graphics g) {
        g.drawRect(150,150,100,100);
        g.drawLine(150,150,200,100);
        g.drawLine(250,150,200,100);
        g.drawRect(175,225,15,25);
        g.drawRoundRect(200,218,40,24,10,10);
    }
}
