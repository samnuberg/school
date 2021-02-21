package H6;

import java.awt.*;
import java.applet.*;

public class Opdracht6_3 extends Applet {
    int grootGetal;
    int kleinGetal;
    int uitkomst;

    public void init() {
        grootGetal = 2147483647;
        kleinGetal = 1;
        uitkomst = grootGetal + kleinGetal;
    }

    public void paint(Graphics g) {
        g.drawString("" + uitkomst,100,100);
    }
}
