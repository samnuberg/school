package H10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_3 extends Applet {
    TextField tekstvak;
    Label label;
    String input;
    int maandnummer;
    String output;

    public void init(){
        tekstvak = new TextField("",10);
        tekstvak.addActionListener( new TekstvakListener() );
        label = new Label("Voer een maandnummer in");
        output = "";
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g){
        g.drawString(""+output,100,100);
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            input = tekstvak.getText();
            maandnummer = Integer.parseInt(input);
            switch (maandnummer) {
                case 1:
                    output = "Januari, 31 dagen.";
                    break;
                case 2:
                    output = "Februari, 28 dagen.";
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
