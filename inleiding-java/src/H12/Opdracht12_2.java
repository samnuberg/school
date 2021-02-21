package H12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_2 extends Applet {
    Button[] knoppen = {new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button(""),new Button("")};

    public void init(){
        for (int teller = 0; teller < knoppen.length; teller++){
            add(knoppen[teller]);
        }
        System.out.println(knoppen.length);
    }

    public void paint(Graphics g){
    }
}