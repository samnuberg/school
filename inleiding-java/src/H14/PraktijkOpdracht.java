package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.URL;

public class PraktijkOpdracht extends Applet {
    Button startSpel = new Button("Start spel");
    boolean startHetSpel = false;
    URL pad = PraktijkOpdracht.class.getResource("./resources/");
    Image afbeelding = getImage(pad, "afbeelding praktijkopdracht.jpg");
    Image[] images = {afbeelding,afbeelding,afbeelding};

    public void init() {
        add(startSpel);
        startSpel.addActionListener(new StartSpelListener());
    }

    public void paint(Graphics g){
        if (startHetSpel == false) return;
        g.drawString("test",100,100);
        g.drawImage(images[0],50,50,100,100,this);
        initializeImagesOnScreen();
    }

    void initializeImagesOnScreen(){
        for (int teller = 0; teller < 24; teller++){
            images[teller] = afbeelding;
        }
        System.out.println(images.length);
    }

    class StartSpelListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            startHetSpel = true;
            repaint();
        }
    }
}
