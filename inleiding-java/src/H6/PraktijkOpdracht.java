package H6;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;
    int gemiddeldeInt;

    public void init(){
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) /3;
        gemiddelde = gemiddelde *10;
        gemiddeldeInt = (int)gemiddelde;
        gemiddelde = gemiddeldeInt;
        gemiddelde = gemiddelde /10;


    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: "+ gemiddelde,100,100);
    }
}
