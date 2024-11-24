import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DoubleButton {

   public static void main(String[] args) {
      JFrame jf = new JFrame();
      jf.getContentPane().setLayout(new BorderLayout());
      jf.setTitle("This is double button system");
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(500, 400);
      jf.setLocation(200, 100);
      jf.setVisible(true);


      GridLayout gridLayout = new GridLayout(2, 3);
      
      JPanel panel = new JPanel(gridLayout);
      panel.setBackground(Color.ORANGE);
      panel.setPreferredSize(new Dimension(400, 300));
      
      jf.getContentPane().add(panel, BorderLayout.CENTER);

      // JPanel uPanel = new JPanel();
      JLabel labelTop = new JLabel("First", SwingConstants.CENTER);
      JButton upTop = new JButton("Up");
      JButton downTop = new JButton("Down");

      JLabel labelDown = new JLabel("Second", SwingConstants.CENTER);
      JButton upDown = new JButton("Up");
      JButton downDown = new JButton("Down");

      panel.add(upTop);
      panel.add(labelTop);
      panel.add(downTop);

      panel.add(upDown);
      panel.add(labelDown);
      panel.add(downDown);
      


      ListenerButton lTop = new ListenerButton(labelTop, new Counter());
      ListenerButton lDown = new ListenerButton(labelDown, new Counter());



      upTop.addActionListener(lTop);
      downTop.addActionListener(lTop);


      upDown.addActionListener(lDown);
      downDown.addActionListener(lDown);





   }
}