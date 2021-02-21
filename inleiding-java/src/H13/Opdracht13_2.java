package H13;

import java.awt.*;
import java.applet.*;

public class Opdracht13_2 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        tekenMuur(g,100,100,10,10);
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
}
