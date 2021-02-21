package H11;

import java.awt.*;
import java.applet.*;

public class Opdracht11_9 extends Applet {

    public void init(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int widthScreen = (int)screenSize.getWidth();
        int heightScreen = (int)screenSize.getHeight();
        setSize(widthScreen, heightScreen);
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {
        int y = 50;
        for (int teller = 0; teller<4; teller++) {
            int x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 50, 50);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 50, 50);
                }
                x += 50;
            }

            //tweede rij
            x = 50;
            y += 50;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 50, 50);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 50, 50);

                }
                x += 50;
            }
            y += 50;
        }
    }
}
