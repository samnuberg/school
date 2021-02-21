package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_3 extends Applet {
    Button knopOk;
    TextField tekstvak;
    Label label;
    Double bedrag;
    Double uitkomst;
    Double btw;

    public void init(){
        knopOk = new Button("Bereken");
        add(knopOk);
        tekstvak = new TextField("",10);
        add(tekstvak);
        tekstvak.addActionListener( new TekstvakListener() );
        label = new Label("Geef in het tekstvak uw bedrag zonder BTW op");
        add(label);
        knopOk.addActionListener( new KnopOkListener() );
        uitkomst = 0.0;
    }

    public void paint(Graphics g){
        g.drawString("Uw bedrag met BTW is: "+uitkomst,100,100);
    }

    class KnopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            bedrag = Double.parseDouble(tekstvak.getText());
            btw = (bedrag /100) *21;
            uitkomst = bedrag + btw;
            repaint();
        }
    }
    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            bedrag = Double.parseDouble(tekstvak.getText());
            btw = (bedrag /100) *21;
            uitkomst = bedrag + btw;
            repaint();
        }
    }
}
