import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class GridDemo {

   public static void main(String[] args) {
      JFrame jf = new JFrame();
      jf.getContentPane().setLayout(new BorderLayout());
      jf.setTitle("Grid example");
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setSize(400, 300);
      jf.setLocation(220, 120);
      
      
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      // jf.set
      jf.getContentPane().add(panel, BorderLayout.CENTER);
      
      
      JLabel jl1 = new JLabel("First label");
      // jl1.setBackground(Color.GREEN);
      JLabel jl2 = new JLabel("Second label");
      JLabel jl3 = new JLabel("Third label");
      JLabel jl4 = new JLabel("Fourth label");
      JLabel jl5 = new JLabel("Fifth label");
      JLabel jl6 = new JLabel("Sizth label");
      JLabel jl7 = new JLabel("sevent label");
      JLabel jl8 = new JLabel("Eight label");
      jl3.setPreferredSize(new Dimension(100, 100));
      jl3.setBackground(Color.BLACK);
      
      FlowLayout gl = new FlowLayout(FlowLayout.TRAILING);
      
      panel.setLayout(gl);
      
      panel.add(jl1);
      panel.add(jl2);
      panel.add(jl3);
      panel.add(jl4);
      panel.add(jl5);
      // panel.add(jl6);
      // panel.add(jl7);
      // panel.add(jl8);
      
      jf.setVisible(true);



   }
}