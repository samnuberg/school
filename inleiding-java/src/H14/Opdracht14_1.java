package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht14_1 extends Applet {
    Button knopKaart = new Button("Deel kaart");
    String[] kleuren = {"rood","zwart"};
    String[] kaartenRood = {"ruiten aas","ruiten een","ruiten twee","ruiten drie","ruiten vier","ruiten vijf","ruiten zes","ruiten zeven","ruiten acht","ruiten negen","ruiten tien",
    "ruiten boer","ruiten vrouw","ruiten heer","harten aas","harten een","harten twee","harten drie","harten vier","harten vijf","harten zes","harten zeven","harten acht","harten negen", "harten tien","harten boer","harten vrouw","harten heer",};
    String[] kaartenZwart = {"klaver aas","klaver een","klaver twee","klaver drie","klaver vier","klaver vijf","klaver zes","klaver zeven","klaver acht","klaver negen","klaver tien",
            "klaver boer","klaver vrouw","klaver heer","schoppen aas","schoppen een","schoppen twee","schoppen drie","schoppen vier","schoppen vijf","schoppen zes","schoppen zeven","schoppen acht","schoppen negen", "schoppen tien","schoppen boer","schoppen vrouw","schoppen heer",};
    String kleur = "";
    double kleurRandom;
    double kaartRandom;
    int kleurAfgerond = 0;
    int kaartAfgerond = 0;

    public void init(){
        add(knopKaart);
        knopKaart.addActionListener( new KnopKaartListener() );
    }

    public void paint(Graphics g){
        if (kleur == "rood"){
            g.drawString(""+kaartenRood[kaartAfgerond],50,50);
        }
        if (kleur == "zwart"){
            g.drawString(""+kaartenZwart[kaartAfgerond],50,50);
        }
    }

    class KnopKaartListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            kleurRandom = Math.random();
            kaartRandom = Math.random();
            kleurAfgerond = (int)(kleurRandom *2);
            kaartAfgerond = (int)(kaartRandom *26);
            kleur = kleuren[kleurAfgerond];
            System.out.println(kleurAfgerond);
            System.out.println(kaartAfgerond);
            repaint();
        }
    }
}
