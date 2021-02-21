package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktischeOpdracht2 extends Applet {
    Button knopOk;
    String output = "";
    int antwoord = 0;
    int yAs = 100;
    int tweedeCijfer = 1;

    public void init(){
        setSize(500,500);
        knopOk = new Button("Ok");
        knopOk.addActionListener( new KnopOkListener() );
        add(knopOk);

    }

    public void paint(Graphics g){
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
            if (tweedeCijfer == 10){tweedeCijfer = 0;}
            tweedeCijfer++;
            repaint();
        }
    }
}
