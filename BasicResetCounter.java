import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.scene.layout.Border;


public class BasicResetCounter {
   public static void main(String[] args) {

      Counter counter = new Counter();

      JFrame frame = new JFrame();
      frame.setSize(400, 300);
      frame.setLocation(200, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("A button experience");
      frame.setVisible(true);


      BorderLayout bl = new BorderLayout();
      JPanel jp = new JPanel(bl);
      jp.setBackground(Color.ORANGE);
      jp.setPreferredSize(new Dimension(200, 10));

      frame.getContentPane().add(jp, BorderLayout.CENTER);

      JLabel label = new JLabel("A increment decrement counter", SwingConstants.CENTER);
      JButton upButton = new JButton("Up");
      JButton downButton = new JButton("Down");
      JButton resetBtn = new JButton("Reset");

      jp.add(label, BorderLayout.CENTER);
      jp.add(upButton, BorderLayout.WEST);
      jp.add(downButton, BorderLayout.EAST);
      jp.add(resetBtn, BorderLayout.SOUTH);

      ListenerButton lst = new ListenerButton(label, counter);

      upButton.addActionListener(lst);
      downButton.addActionListener(lst);
      resetBtn.addActionListener(lst);

      
   }
}
