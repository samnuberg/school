package H5;

import java.awt.*;
import java.applet.*;

public class Opdracht5_2 extends Applet {
    int weightValerie;
    int weightJeroen;
    int weightHans;
    int startY;

    public void init(){
        weightValerie = 40*2;
        weightJeroen = 100*2;
        weightHans = 60*2;
        startY = 250;
    }

    public void paint(Graphics g) {
        g.drawLine(70,50,70,250);
        g.drawLine(70,250,270,250);
        g.drawString("100",40,50);
        g.drawString("80",40,90);
        g.drawString("60",40,130);
        g.drawString("40",40,170);
        g.drawString("20",40,210);
        g.drawString("0",50,250);
        g.drawString("Valerie",90,275);
        g.drawString("Jeroen",160,275);
        g.drawString("Hans",230,275);
        g.setColor(Color.pink);
        g.fillRect(90,startY - weightValerie,20,weightValerie);
        g.setColor(Color.green);
        g.fillRect(160,startY - weightJeroen,20,weightJeroen);
        g.setColor(Color.blue);
        g.fillRect(230,startY - weightHans,20,weightHans);
    }
}
