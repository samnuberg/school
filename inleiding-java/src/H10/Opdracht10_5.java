package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_5 extends Applet {
    TextField tekstvak;
    Label label;
    Button knopOk;
    String input;
    Double cijfer;
    String outputVO;
    Double totaal;
    int gemiddeldeDeler;
    double gemiddelde;
    String outputGeslaagd;
    String outputGemiddelde;

     public void init(){
         tekstvak = new TextField("",10);
         tekstvak.addActionListener( new TekstvakListener() );
         label = new Label("Voer je cijfer in.");
         knopOk = new Button("Ok");
         knopOk.addActionListener( new KnopOkListener() );
         add(tekstvak);
         add(label);
         add(knopOk);
         outputVO = "";
         totaal = 0.0;
         gemiddeldeDeler = 0;
         gemiddelde = 0;
         outputGeslaagd = "";
         outputGemiddelde = "";
     }

     public void paint(Graphics g){
         g.drawString(""+outputVO,100,100);
         g.drawString(""+outputGeslaagd+""+outputGemiddelde,100,125);
     }

     class TekstvakListener implements ActionListener{
         public void actionPerformed(ActionEvent e){
             input = tekstvak.getText();
             cijfer = Double.parseDouble(input);
             if (cijfer>=5.5){
                 outputVO = "Voldoende";
             }
             else {
                 outputVO = "Onvoldoende";
             }
             totaal = totaal +cijfer;
             gemiddeldeDeler = gemiddeldeDeler +1;
             repaint();
         }
     }

     class KnopOkListener implements ActionListener{
         public void actionPerformed(ActionEvent e){
             gemiddelde = totaal /gemiddeldeDeler;
             if (gemiddelde>=5.5){
                 outputGeslaagd = "Je bent geslaagd!";
             }
             else{
                 outputGeslaagd = "Je bent niet geslaagd.";
             }
             outputGemiddelde = " met een gemiddelde van: "+gemiddelde;
             repaint();
         }
     }
}
