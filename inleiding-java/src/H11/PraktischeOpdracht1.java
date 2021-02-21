package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktischeOpdracht1 extends Applet {
    TextField tekstvak;
    Button knopOk;
    String inputString = "";
    int inputInt = 0;
    String output = "";
    int antwoord = 0;
    int yAs = 100;
    int tweedeCijfer = 0;
    boolean firstTime = true;

    public void init(){
        setSize(500,500);
        tekstvak = new TextField(10);
        knopOk = new Button("Ok");
        knopOk.addActionListener( new KnopOkListener() );
        add(tekstvak);
        add(knopOk);

    }

    public void paint(Graphics g){
        if(firstTime == true){return;}
        yAs = 100;
        for (int teller = 1; teller<=10; teller++){
            antwoord = teller*tweedeCijfer;
            output = ""+teller+" * "+tweedeCijfer+" = "+antwoord;
            yAs += 25;
            g.drawString(""+output,50,yAs);
        }
    }

    class KnopOkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            firstTime = false;
            inputString = tekstvak.getText();
            inputInt = Integer.parseInt(inputString);
            tweedeCijfer = inputInt;
            repaint();
        }
    }
}
