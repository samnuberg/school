package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktischeOpdracht extends Applet {
    String[] namen = {"","","","","","","","","",""};
    String[] telefoonNummers = {"","","","","","","","","",""};
    Button knopOk = new Button("Ok");
    TextField tekstvakNummer = new TextField(10);
    TextField tekstvakNaam = new TextField(10);
    int y = 50;
    int teller = 0;
    boolean paintAction = true;

    public void init(){
        add(tekstvakNaam);
        add(tekstvakNummer);
        add(knopOk);
        knopOk.addActionListener( new KnopOkListener() );
    }

    public void paint(Graphics g) {
        if (paintAction == true) {
            return;
        }
        for (int teller = 0; teller < namen.length; teller++) {
            g.drawString("" + namen[teller] + "    " + telefoonNummers[teller], 50, y);
            y += 20;
        }
    }

    class KnopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
                namen[teller] = tekstvakNaam.getText();
                telefoonNummers[teller] = tekstvakNummer.getText();
                teller++;
                if (teller == 10){
                    paintAction = false;
                }
                    repaint();
                }
        }
    }
