package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    String input;
    int cijfer;
    String output;

    public void init(){
        tekstvak = new TextField("",10);
        tekstvak.addActionListener( new TekstvakListener() );
        label = new Label("Voer je cijfer in");
        add(tekstvak);
        add(label);
        input = "";
        cijfer = 0;
        output = "";
    }

    public void paint(Graphics g){
        g.drawString(""+output,100,100);
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            input = tekstvak.getText();
            cijfer = Integer.parseInt(input);
            switch (cijfer){
                case 1:
                    output = "Slecht";
                    break;
                case 2:
                    output = "Slecht";
                    break;
                case 3:
                    output = "Slecht";
                    break;
                case 4:
                    output = "Onvoldoende";
                    break;
                case 5:
                    output = "Matig";
                    break;
                case 6:
                    output = "Voldoende";
                    break;
                case 7:
                    output = "Voldoende";
                    break;
                case 8:
                    output = "Goed";
                    break;
                case 9:
                    output = "Goed";
                    break;
                case 10:
                    output = "Goed";
                    break;
                default:
                    output = "Er is een verkeerd cijfer ingevoerd.";
                    break;
            }
            repaint();
        }
    }
}
