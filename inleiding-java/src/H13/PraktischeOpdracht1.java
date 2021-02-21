package H13;

import java.applet.*;
import java.awt.*;

public class PraktischeOpdracht1 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        tekenBoom(g,50,50,100,200);
    }

    void tekenBoom(Graphics g,int x,int y,int width,int height){
        g.setColor(Color.darkGray);
        g.fillRect(x+width/2-width/7,y+width/2,width/4,height/2);
        g.setColor(Color.green);
        g.fillRoundRect(x,y,width,height/2,width,height);
    }
}
