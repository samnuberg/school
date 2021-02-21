package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {
    Button manLeerlingenKnop;
    Button vrouwLeerlingenKnop;
    Button pManLeerlingenKnop;
    Button pVrouwLeerlingenKnop;
    String totaalLeerlingenInSchool;
    Label p1;
    Label p2;
    Label p3;
    Label p4;

    public void init(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int widthScreen = (int)screenSize.getWidth();
        int heightScreen = (int)screenSize.getHeight();
        setSize(widthScreen, heightScreen);
        manLeerlingenKnop = new Button("9");
        add(manLeerlingenKnop);
        manLeerlingenKnop.addActionListener( new ManLeerlingenListener() );
        p1 = new Label("Mannelijke leerlingen");
        add(p1);

        vrouwLeerlingenKnop = new Button("13");
        add(vrouwLeerlingenKnop);
        vrouwLeerlingenKnop.addActionListener( new VrouwLeerlingenListener() );
        p2 = new Label("Vrouwelijke Leerlingen");
        add(p2);

        pManLeerlingenKnop = new Button("17");
        add(pManLeerlingenKnop);
        pManLeerlingenKnop.addActionListener( new PManLeerlingenListener() );
        p3 = new Label("Potentiele Mannelijke Leerlingen");
        add(p3);

        pVrouwLeerlingenKnop = new Button("21");
        add(pVrouwLeerlingenKnop);
        pVrouwLeerlingenKnop.addActionListener( new PVrouwLeerlingenListener() );
        p4 = new Label("Potentiele Vrouwelijke Leerlingen");
        add(p4);
        totaalLeerlingenInSchool = "";
    }
    public void paint(Graphics g){
        g.drawString(""+totaalLeerlingenInSchool,100,100);
    }
    class ManLeerlingenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            totaalLeerlingenInSchool = "Totaal aantal leerlingen is: 60";
            repaint();
        }
    }
    class VrouwLeerlingenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            totaalLeerlingenInSchool = "Totaal aantal leerlingen is: 60";
            repaint();
        }
    }
    class PManLeerlingenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            totaalLeerlingenInSchool = "Totaal aantal leerlingen is: 60";
            repaint();
        }
    }
    class PVrouwLeerlingenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            totaalLeerlingenInSchool = "Totaal aantal leerlingen is: 60";
            repaint();
        }
    }
}
