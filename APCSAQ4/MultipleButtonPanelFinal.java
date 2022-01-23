import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
 public class MultipleButtonPanelFinal extends JPanel
{
   private JLabel label;
   private JPanel panel;
   private JButton buttonR, buttonCR, buttonReci, buttonQuit;
   
   public MultipleButtonPanelFinal()
   {
      setLayout(new BorderLayout());
      label = new JLabel("0.00000000000000000");
      label.setFont(new Font("Serif", Font.BOLD, 30));
      buttonR = new JButton("Random");
      buttonCR = new JButton("Cube Root");
      buttonReci = new JButton("Reciprocal");
      buttonQuit = new JButton("Quit");
      
      panel = new JPanel(new FlowLayout());
      add(panel, BorderLayout.SOUTH);
      
      add(label, BorderLayout.CENTER);
      label.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(buttonR);
      panel.add(buttonCR);
      panel.add(buttonReci);
      panel.add(buttonQuit);
      
      buttonR.addActionListener(new Listener());
      buttonCR.addActionListener(new Listener());
      buttonReci.addActionListener(new Listener());
      buttonQuit.addActionListener(new Listener());
   }
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==buttonR)
         {
            double x = Math.random();
            label.setText("" + x);
         }
         if(e.getSource()==buttonCR)
         {
            double d = Double.parseDouble(label.getText());
            label.setText("" + Math.pow(d, 1.0/3.0));
         }
         if(e.getSource() == buttonReci)
         {
            double d = Double.parseDouble(label.getText());
            label.setText("" + (1.0/d));
         }
         if(e.getSource() == buttonQuit)
         {
            System.exit(0);
         }
      }
   }
}