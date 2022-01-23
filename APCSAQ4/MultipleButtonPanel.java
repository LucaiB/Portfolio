import javax.swing.*;                          
import java.awt.*;   
import java.net.*;
import java.awt.event.*;

public class MultipleButtonPanel extends JPanel
{
   private JButton CURT;
   private JButton random;
   private JButton reciprocal;
   private JButton quit;
   private JLabel label;

   public MultipleButtonPanel()
   {
      setLayout(new FlowLayout());
   
      label = new JLabel("0.00000000000000000");
      label.setFont(new Font ("Times New Roman", Font.BOLD, 20));
      add(label);
   
      JButton CURT = new JButton("CURT");
      CURT.addActionListener( new Listener());
      add(CURT);
   
      JButton random = new JButton("Random");
      random.addActionListener( new Listener());
      add(random);
   
      JButton reciprocal = new JButton("Reciprocal");
      reciprocal.addActionListener( new Listener());
      add(reciprocal);
   
      JButton quit = new JButton("Quit");
      quit.addActionListener(new Listener());
      add(quit);
   }

   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if( e.getSource() == random)
            label.setText("" + Math.random());
         else if (e.getSource() == CURT){
            double d = Double.parseDouble(label.getText());
            label.setText("" + Math.pow(d, 1/3));
         }else if (e.getSource() == reciprocal)
            label.setText("" + 1/(Double.parseDouble(label.getText())));
         else if (e.getSource() == quit)
            System.exit(0);
      }
   }
}
