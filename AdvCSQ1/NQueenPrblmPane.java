import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class NQueenPrblmPane extends JPanel
{
   private JLabel label;
   private JButton reset;
   private JButton [][] board;
   private JFrame frame;

   public NQueenPrblmPane(int x)
   {
      setLayout(new BorderLayout());
         
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel(x + " Queen Problem");
      north.add(label);
      
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(x,x));
      
      board = new JButton[x][x];
      for(int r = 0; r < x; r++)
      {
         for(int c = 0; c < x; c++)
         {
            board[r][c] = new JButton();
            board[r][c].setEnabled(false);
            board[r][c].setBackground(Color.white);
            center.add(board[r][c]);
         }
      }
      add(center, BorderLayout.CENTER);
       
      reset = new JButton("Reset");
      reset.addActionListener(new Handler2());
      reset.setEnabled(true);
      add(reset, BorderLayout.SOUTH); 
   }
   
          // Handling the Reset button
   private class Handler2 implements ActionListener
   {
   
      public void actionPerformed(ActionEvent e)
      {                  
         
         String x = JOptionPane.showInputDialog("Choose size");
      
         JFrame newframe =  new JFrame ("QueenPrblm: Lucas Banerji Pd.5");  
         newframe.setSize (400, 350);  
         newframe.setLocation (200, 200);     
         newframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
         newframe.setContentPane (new NQueenPrblmPane(Integer.parseInt(x)));
         newframe.setVisible(true); 
         frame.dispose();
      
             
      }  // actionPerformed of Handler2
   }  
   
   public static void main(String[] args) 
   {  
      String x = JOptionPane.showInputDialog("Choose size");
   
      JFrame frame =  new JFrame ("QueenPrblm: Lucas Banerji Pd.5");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new NQueenPrblmPane(Integer.parseInt(x)));
      frame.setVisible(true); 
   }
}
