package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht12_5 extends Applet {
    double inputDouble;
    Button knopOk = new Button("Ok");
    int index = 0;
    String inputString = "";
    boolean firstTime = true;
    boolean gevonden;
    double[] waardes = { 24.0, 450.0, 690.0, 202.0, 883.0, 284.0 };
    TextField tekstvak = new TextField(10);

    public void init() {
        add(tekstvak);
        add(knopOk);
        knopOk.addActionListener( new KnopOkListener() );
    }

    public void paint(Graphics g) {
        if (firstTime == true){return;}
        gevonden = false;
        int teller = 0;
        while(teller < waardes.length) {
            if(waardes[teller] == inputDouble) {
                gevonden = true;
                index = teller;
                break;
            }
            teller ++;
            System.out.println(teller);
        }
        if(gevonden == true) {
            g.drawString("De waarde is gevonden op index: "+index, 20, 50);
        }
        else {
            g.drawString("De opgegeven waarde is niet gevonden.", 20, 50);
        }
    }

    class KnopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            firstTime = false;
            inputString = tekstvak.getText();
            inputDouble = Double.parseDouble(inputString);
            repaint();
        }
    }
}