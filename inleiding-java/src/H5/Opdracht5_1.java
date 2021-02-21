package H5;

import java.awt.*;
import java.applet.*;

public class Opdracht5_1 extends Applet {
    Color opvulkleur;
    Color omtrekkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.magenta;
        omtrekkleur = Color.black;
        breedte = 190;
        hoogte = 80;
    }

    public void paint(Graphics g) {
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",100,25);
        g.drawRect(10,40,breedte,hoogte);
        g.drawString("Rechthoek",75,135);
        g.setColor(opvulkleur);
        g.fillRect(210,40,breedte,hoogte);
        g.setColor(omtrekkleur);
        g.drawOval(210,40,breedte,hoogte);
        g.drawString("Gevulde rechthoek met ovaal",230,135);
        g.drawOval(410,40,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(410,40,breedte,hoogte,0,45);
        g.setColor(omtrekkleur);
        g.drawString("Taartpunt met ovaal eromheen",430,135);
        g.drawRoundRect(10,150,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek",45,245);
        g.setColor(opvulkleur);
        g.fillOval(210,150,breedte,hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",265,245);
        g.drawOval(465,150,80,80);
        g.drawString("Cirkel",492,245);
    }

}
