package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10_2 extends Applet {
    TextField tekstvak;
    Label label;
    String input;
    double inputGetal;
    double hoogsteGetal;
    double laagsteGetal;
    double outputHoogste;
    double outputLaagste;

    public void init(){
        tekstvak = new TextField("",5);
        tekstvak.addActionListener( new TekstvakListener() );
        label = new Label("Typ een getal in het tekstvak");
        input = "";
        add(tekstvak);
        add(label);
    }

    public void paint(Graphics g){
        g.drawString("Het hoogste getal is: "+outputHoogste,100,100);
        g.drawString("Het laagste getal is: "+outputLaagste,100,125);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            input = tekstvak.getText();
            inputGetal = Double.parseDouble(input);
            if (inputGetal>hoogsteGetal){
                hoogsteGetal = inputGetal;
                outputHoogste = hoogsteGetal;
            }
            else if (inputGetal<laagsteGetal){
                laagsteGetal = inputGetal;
                outputLaagste = laagsteGetal;
            }
            repaint();
        }
    }
}
