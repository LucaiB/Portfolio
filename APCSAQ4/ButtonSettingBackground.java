import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonSettingBackground extends JPanel implements ActionListener {

   private JButton yellowButton = new JButton("Yellow");

   private JButton blueButton = new JButton("Blue");

   private JButton redButton = new JButton("Red");
   
   private JButton greenButton = new JButton("Green");

   public ButtonSettingBackground() {
      add(yellowButton);
      add(blueButton);
      add(redButton);
      add(greenButton);
   
      yellowButton.addActionListener(this);
      blueButton.addActionListener(this);
      redButton.addActionListener(this);
      greenButton.addActionListener(this);
   }

   public void actionPerformed(ActionEvent evt) {
      Object source = evt.getSource();
      Color color = getBackground();
      if (source == yellowButton)
         color = Color.yellow;
      else if (source == blueButton)
         color = Color.blue;
      else if (source == redButton)
         color = Color.red;
      else if (source == greenButton)
         color = Color.green;
      setBackground(color);
      repaint();
   }

   public static void main(String[] args) {
      JFrame frame = new JFrame("FourButton");
      frame.setSize (400, 350); 
      frame.setLocationRelativeTo (null);
      frame.addWindowListener(
         new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
         });
   
      Container contentPane = frame.getContentPane();
      contentPane.add(new ButtonSettingBackground());
   
      frame.show();
   }
}