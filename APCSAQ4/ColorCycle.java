import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorCycle extends JPanel implements ActionListener {

   private JButton CycleButton = new JButton("Change Color");

   public ColorCycle() {
      add(CycleButton);
      CycleButton.addActionListener(this);
   }

   public void actionPerformed(ActionEvent evt) {
      
      Color color = getBackground();
      if (color == Color.green)
         color = Color.yellow;
      else if (color == Color.yellow)
         color = Color.blue;
      else if (color == Color.blue)
         color = Color.red;
      else if (color == Color.red)
         color = Color.green;
      else
         color = Color.green;
         
      setBackground(color);
      repaint();
   }

   public static void main(String[] args) {
      JFrame frame = new JFrame("ColorCycle");
      frame.setSize (400, 350); 
      frame.setLocationRelativeTo (null);
      frame.addWindowListener(
         new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
         });
   
      Container contentPane = frame.getContentPane();
      contentPane.add(new ColorCycle());
   
      frame.show();
   }
}