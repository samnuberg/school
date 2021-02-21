package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_4 extends Applet {
    TextField tekstvakMaand;
    TextField tekstvakJaar;
    Label label;
    String inputMaand;
    String inputJaar;
    int jaartal;
    int maandnummer;
    String output;

    public void init(){
        tekstvakMaand = new TextField("",10);
        tekstvakMaand.addActionListener( new TekstvakMaandListener() );
        label = new Label("Voer een maandnummer en jaartal in.");
        tekstvakJaar = new TextField("",10);
        tekstvakJaar.addActionListener( new TekstvakMaandListener() );
        output = "";
        add(tekstvakMaand);
        add(tekstvakJaar);
        add(label);
    }

    public void paint(Graphics g){
        g.drawString(""+output,100,100);
    }

    class TekstvakMaandListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            inputMaand = tekstvakMaand.getText();
            maandnummer = Integer.parseInt(inputMaand);
            inputJaar = tekstvakJaar.getText();
            jaartal = Integer.parseInt(inputJaar);
            switch (maandnummer) {
                case 1:
                    output = "Januari, 31 dagen.";
                    break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 )
                    output = "Februari, 29 dagen.";
                    else output = "Februari, 28 dagen";
                    break;
                case 3:
                    output = "Maart, 31 dagen.";
                    break;
                case 4:
                    output = "April, 30 dagen.";
                    break;
                case 5:
                    output = "Mei, 31 dagen.";
                    break;
                case 6:
                    output = "Juni, 30 dagen.";
                    break;
                case 7:
                    output = "Juli, 31 dagen.";
                    break;
                case 8:
                    output = "Augustus, 31 dagen.";
                    break;
                case 9:
                    output = "September, 30 dagen.";
                    break;
                case 10:
                    output = "Oktober, 31 dagen.";
                    break;
                case 11:
                    output = "November, 30 dagen.";
                    break;
                case 12:
                    output = "December, 31 dagen.";
                    break;
                default:
                    output = "u heeft geen geldig maandnummer ingevoerd.";
                    break;
            }
            repaint();
        }
    }
}
