package H4;

import java.awt.*;
import java.applet.*;

public class PraktischeOpdracht extends Applet {

    public void init(){

    }

    public void paint(Graphics g) {
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",100,25);
        g.drawRect(10,40,190,80);
        g.drawString("Rechthoek",75,135);
        g.setColor(Color.magenta);
        g.fillRect(210,40,190,80);
        g.setColor(Color.black);
        g.drawOval(210,40,190,80);
        g.drawString("Gevulde rechthoek met ovaal",230,135);
        g.drawOval(410,40,190,80);
        g.setColor(Color.magenta);
        g.fillArc(410,40,190,80,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",430,135);
        g.drawRoundRect(10,150,190,80,30,30);
        g.drawString("Afgeronde rechthoek",45,245);
        g.setColor(Color.magenta);
        g.fillOval(210,150,190,80);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",265,245);
        g.drawOval(465,150,80,80);
        g.drawString("Cirkel",492,245);
    }
}
