package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_3 extends Applet {

    public void init() {
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100,50,15,200);
        g.setColor(Color.red);
        g.fillRect(115,50,100,20);
        g.setColor(Color.white);
        g.fillRect(115,70,100,20);
        g.setColor(Color.blue);
        g.fillRect(115,90,100,20);
    }
}
