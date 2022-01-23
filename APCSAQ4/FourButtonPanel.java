import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class FourButtonPanel extends JPanel
{
   private JButton gButton;
   private JButton bButton;
   private JButton rButton;
   private JButton yButton;

   public FourButtonPanel()
   {
      setLayout(new FlowLayout());
         
      gButton = new JButton("Green");
      add(gButton);
            
      bButton = new JButton("Blue");
      add(bButton);
         
      rButton = new JButton("Red");
      add(rButton);      
   
      yButton = new JButton ("Yellow");
      add(yButton);
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource() == gButton)
            setBackground(Color.green);
         else if(e.getSource() == rButton)
            setBackground(Color.red);
         else if(e.getSource() == yButton)
            setBackground(Color.yellow);
         else if(e.getSource() == bButton)
            setBackground(Color.blue);
      }
   }
}
