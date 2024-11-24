// A random GUI made for killing time
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MulButton {

   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setTitle("Four diffrent buttons");
      frame.setSize(400, 320);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true); // keet set visisble at last to resolve rendering probleme


      JPanel panelGrid = new JPanel(new GridLayout(2, 2));
      panelGrid.setBackground(Color.YELLOW);

      JPanel panelGridDown = new JPanel(new GridLayout(1,1));
      panelGridDown.setBackground(Color.ORANGE);
      panelGridDown.setPreferredSize(new Dimension(400, 100));



      
      // panel.setPreferredSize(new Dimension());
      
      frame.getContentPane().add(panelGrid, BorderLayout.CENTER);
      frame.getContentPane().add(panelGridDown, BorderLayout.SOUTH);


      JButton firstBtn = new JButton("First");
      JButton secondBtn = new JButton("Second");
      JButton thirdBtn = new JButton("Third");
      JButton fourthBtn = new JButton("Fourth");

      JLabel messageLabel = new JLabel("Hello", SwingConstants.CENTER);
   



      panelGrid.add(firstBtn);
      panelGrid.add(secondBtn);
      panelGrid.add(thirdBtn);
      panelGrid.add(fourthBtn);

      panelGridDown.add(messageLabel);

      ListenerOfTheFour listener = new ListenerOfTheFour(messageLabel);

      firstBtn.addActionListener(listener);
      secondBtn.addActionListener(listener);
      thirdBtn.addActionListener(listener);
      fourthBtn.addActionListener(listener);







   }
}

class ListenerOfTheFour implements ActionListener{

   private JLabel label;
   private static  String[] buttonNames=new String[]{"First", "Second", "Third", "Fourth"};

   public ListenerOfTheFour(JLabel label) {
      this.label=label;
   }

   public void actionPerformed(ActionEvent avt) {
      String keyData = avt.getActionCommand();

      for(String key : buttonNames) {
         if(key.equals(keyData)) {
            label.setText("You pressed the "+key+" key. Thanks.");
            return;
         }
      }

      System.out.println("Some random key");

      
      
   }

}