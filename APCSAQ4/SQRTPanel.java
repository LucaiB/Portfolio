import javax.swing.*;                          
import java.awt.*;   
import java.net.*;
import java.awt.event.*;

public class SQRTPanel extends JPanel
{
   private JLabel label;
   private JTextField box;

   public SQRTPanel()
   {
      setLayout( new FlowLayout());
   
      box = new JTextField ("1.0", 40);
      box.setHorizontalAlignment(SwingConstants.RIGHT);
      add(box);
   
      JButton button = new JButton("SQRT");
      button.addActionListener( new Listener());
      add(button);
   
      label = new JLabel("1.0");
      label.setFont(new Font("Seriff", Font.BOLD, 20));
      label.setForeground(Color.blue);
      add(label);
   }

   private class Listener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         double num = Double.parseDouble(box.getText());
         double sqrnum = Math.sqrt(num);
         label.setText("" + sqrnum);     
      }
   }
}