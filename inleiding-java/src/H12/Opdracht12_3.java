package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvak = {new TextField(5),new TextField(5),new TextField(5),new TextField(5),new TextField(5)};
    Button knopOk = new Button("Ok");
    String[] inputString = {"","","","",""};
    Double[] inputDouble = {0.0,0.0,0.0,0.0,0.0};
    boolean firstTime = true;

    public void init(){
        for (int teller = 0; teller < tekstvak.length; teller++){
            add(tekstvak[teller]);
        }
        add(knopOk);
        knopOk.addActionListener( new KnopOkListener() );
    }

    public void paint(Graphics g){
        if (firstTime == true){return;}
        for (int teller = 0; teller < tekstvak.length; teller++){
           tekstvak[teller].setText(""+inputDouble[teller]);
        }
    }

    class KnopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            firstTime = false;
            for (int teller = 0; teller < tekstvak.length; teller++){
                inputString[teller] = tekstvak[teller].getText();
                inputDouble[teller] = Double.parseDouble(inputString[teller]);
            }
            for (int teller = 0; teller < tekstvak.length; teller++){
                Arrays.sort(inputDouble);
            }
            repaint();
        }
    }
}