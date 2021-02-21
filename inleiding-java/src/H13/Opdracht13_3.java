package H13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht13_3 extends Applet {
    Button knop1 = new Button("Knop 1");
    Button knop2 = new Button("Knop 2");
    int welke = 0;

    public void init(){
        add(knop1);
        knop1.addActionListener( new Knop1Listener() );
        add(knop2);
        knop2.addActionListener( new Knop2Listener() );
        setSize(700,400);
    }

    public void paint(Graphics g){
        if (welke == 1){
            tekenMuur(g,100,100,10,10);
        }
        else if (welke == 2){
            tekenBeton(g,100,100,10,10);
        }
    }

    void tekenMuur(Graphics g,int x1,int y1,int width,int height){
        for (int teller = 0; teller< height; teller++) {
            for (int teller1 = 0; teller1 < width; teller1++) {
                g.setColor(Color.red);
                g.fillRect(x1, y1, 25, 10);
                x1 += 30;
            }
            x1 -= width*30;
            y1 += 15;
        }
    }

    void tekenBeton(Graphics g,int x1,int y1,int width,int height){
        for (int teller = 0; teller< height; teller++) {
            for (int teller1 = 0; teller1 < width; teller1++) {
                g.setColor(Color.lightGray);
                g.fillRect(x1, y1, 35, 20);
                x1 += 40;
            }
            x1 -= width*40;
            y1 += 25;
        }
    }

    class Knop1Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            welke = 1;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            welke = 2;
            repaint();
        }
    }
}
