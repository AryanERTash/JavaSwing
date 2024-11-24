import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ListenerButton 
                        implements ActionListener{
   

   public JLabel label;
   public Counter counter;
   
   public ListenerButton(JLabel label, Counter counter) {
      this.label=label;
      this.counter=counter;
   }

   public void actionPerformed(ActionEvent avt) {

      String data = avt.getActionCommand();

      if(data.equals("Up")) {
         counter.increment();
      } else if(data.equals("Down")) {
         counter.decrement();
      } else if(data.equals("Reset")) {
         counter.reset();
      } else {
         System.out.println("Different key: "+avt.toString());
      }
      label.setText(Integer.toString(counter.getValue()));

   }

}