package lesOpdracht;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdrachtLes extends Applet {
    int gegevenGetal = 0;
    int som = 0;
    int teller1 = 0;
    int teller2 = 0;
    int teller3 = 0;
    int y = 80;
    TextField tekstvak = new TextField(10);

    public void init(){
        add(tekstvak);
        tekstvak.addActionListener( new TekstvakListener() );
    }

    public void paint(Graphics g){
        for (int beginGetal = 1; beginGetal <= gegevenGetal; beginGetal++) {
            if (beginGetal % 2 == 0) {
                teller3++;
                if (beginGetal % 6 == 0) {
                    g.drawString(""+beginGetal * beginGetal,100,y);
                    y += 20;
                    som = som + beginGetal * beginGetal;
                    teller1++;
                } else {
                    g.drawString(""+beginGetal,100,y);
                    y+= 20;
                    som = som + beginGetal;
                    teller2++;
                }
            }
            if (beginGetal == gegevenGetal) g.drawString(""+som,100,y);
        }
        //System.out.println(teller1);
        //System.out.println(teller2);
        //System.out.println(teller3);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            gegevenGetal = Integer.parseInt( tekstvak.getText() );
            System.out.println(gegevenGetal);
            som = 0;
            y = 80;
            repaint();
        }
    }
}

