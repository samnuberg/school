package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdracht extends Applet {
    Button keer;
    Button delen;
    Button plus;
    Button min;
    TextField tekstvak1;
    TextField tekstvak2;
    Double input1;
    Double input2;
    Double output;
     public void init(){
         tekstvak1 = new TextField("",10);
         add(tekstvak1);
         tekstvak2 = new TextField("",10);
         add(tekstvak2);
         keer = new Button("*");
         add(keer);
         keer.addActionListener( new KeerListener() );
         delen = new Button("/");
         add(delen);
         delen.addActionListener( new DelenListener() );
         plus = new Button("+");
         add(plus);
         plus.addActionListener( new PlusListener() );
         min = new Button("-");
         add(min);
         min.addActionListener( new MinListener() );

     }
     class KeerListener implements ActionListener{
         public void actionPerformed(ActionEvent e){
             input1 = Double.parseDouble(tekstvak1.getText());
             input2 = Double.parseDouble(tekstvak2.getText());
             output = input1 *input2;
             tekstvak1.setText(""+output);
             tekstvak2.setText("");
         }

     }
     class DelenListener implements ActionListener{
         public void actionPerformed(ActionEvent e){
             input1 = Double.parseDouble(tekstvak1.getText());
             input2 = Double.parseDouble(tekstvak2.getText());
             output = input1 /input2;
             tekstvak1.setText(""+output);
             tekstvak2.setText("");
         }
     }
    class PlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            input1 = Double.parseDouble(tekstvak1.getText());
            input2 = Double.parseDouble(tekstvak2.getText());
            output = input1 +input2;
            tekstvak1.setText(""+output);
            tekstvak2.setText("");
        }
    }
    class MinListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            input1 = Double.parseDouble(tekstvak1.getText());
            input2 = Double.parseDouble(tekstvak2.getText());
            output = input1 -input2;
            tekstvak1.setText(""+output);
            tekstvak2.setText("");
        }
    }
}
