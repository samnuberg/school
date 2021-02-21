package H4;

import java.awt.*;
import java.applet.*;

public class Opdracht4_4 extends Applet {

    public void init(){

    }

    public void paint(Graphics g) {
        g.drawLine(70,25,70,275);
        g.drawLine(70,275,270,275);
        g.drawString("100",40,25);
        g.drawString("80",40,75);
        g.drawString("60",40,125);
        g.drawString("40",40,175);
        g.drawString("20",40,225);
        g.drawString("0",50,275);
        g.drawString("Valerie",90,300);
        g.drawString("Jeroen",160,300);
        g.drawString("Hans",230,300);
        g.setColor(Color.pink);
        g.fillRect(90,175,20,100);
        g.setColor(Color.green);
        g.fillRect(160,25,20,250);
        g.setColor(Color.blue);
        g.fillRect(230,75,20,200);
    }
}
