package H13;

import java.applet.*;
import java.awt.*;

public class PraktischeOpdracht2 extends Applet {
    int x = 25;
    int y = 25;
    public void init(){
        setSize(800,500);
    }

    public void paint(Graphics g){
        for (int teller = 0; teller < 10; teller++){
            tekenBoom(g,x,y,50,150);
            x += 75;
            if (teller == 4){
                y = 150;
                x = 25;
            }
        }
    }

    void tekenBoom(Graphics g,int x1,int y1,int width,int height){
        g.setColor(Color.darkGray);
        g.fillRect(x1+width/2-width/7,y1+width/2,width/4,height/2);
        g.setColor(Color.green);
        g.fillRoundRect(x1,y1,width,height/2,width,height);
    }
}
