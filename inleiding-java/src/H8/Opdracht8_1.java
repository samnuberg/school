package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_1 extends Applet {
    Button knopOk;
    Button knopReset;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init(){
        knopOk = new Button("Ok");
        knopReset = new Button("Reset");
        tekstvak = new TextField("",30);
        label = new Label("Typ iets in het tekstvak");
        add(knopOk);
        add(knopReset);
        add(tekstvak);
        add(label);
        tekst = "";
        knopOk.addActionListener( new KnopOkListener() );
        knopReset.addActionListener( new KnopResetListener() );
    }

    class KnopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekst = tekstvak.getText();
            repaint();
        }
    }

    class KnopResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekst = "";
            tekstvak.setText("");
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString(tekst,100,100);
    }
}
