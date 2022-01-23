import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PennyPitcher extends JPanel
{
   private JButton[][] board;
   private int[][] matrix;
   private int hits;
   private int sum;
   private JButton hitsBTN;
   private JTextField amount;
   private JButton reset;
   
   public PennyPitcher()
   {
      setLayout(new BorderLayout());
      hits = 5;
      sum = 0;
      
      JPanel options = new JPanel();
      options.setLayout(new BorderLayout());
      add(options, BorderLayout.SOUTH);
      
      hitsBTN = new JButton("THROW");
      options.add(hitsBTN, BorderLayout.WEST);
      hitsBTN.addActionListener(new Handler1());
      
      amount = new JTextField("" + sum);
      options.add(amount, BorderLayout.CENTER);
      amount.setEditable(false);
      
      reset = new JButton("RESET");
      options.add(reset, BorderLayout.EAST);
      reset.addActionListener(new Handler2());
      reset.setEnabled(false);
        
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(5, 5));
      add(center, BorderLayout.CENTER);
      board = new JButton[5][5];
      matrix = new int[5][5];
      
      for(int r = 0; r < 5; r++)
      {
         for(int c = 0; c < 5; c++)
         {
            board[r][c] = new JButton();
            
            if (r == 0 || r == 4 || c == 0 || c == 4)
            {
               matrix[r][c] = 1;
               board[r][c].setText("1");
               center.add(board[r][c]);
               board[r][c].addActionListener(new Handler1());
            } else if (r == 1 || r == 3 || c == 1 || c == 3) {
               matrix[r][c] = 2;
               board[r][c].setText("2");
               center.add(board[r][c]);
               board[r][c].addActionListener(new Handler1());
            } else {
               matrix[r][c] = 3;
               board[r][c].setText("3");
               center.add(board[r][c]);
               board[r][c].addActionListener(new Handler1());
            }
         } //For loop to set score to matrix
      } //For loop to set score to matrix
      
   } //PennyPitcher Constructor
   
   private class Handler1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int row = (int)(Math.random() * 5);
         int col = (int)(Math.random() * 5);
         
         if (e.getSource() == hitsBTN)
         {
            hits--;
            while (matrix[row][col] == 0)
            {
               row = (int)(Math.random() * 5);
               col = (int)(Math.random() * 5);
            }   
            board[row][col].setText("P");
            board[row][col].setBackground(Color.RED);
            sum += matrix[row][col];
            matrix[row][col] = 0;
            amount.setText("" + sum);
         } 
         if (hits == 0) 
         {
            hitsBTN.setEnabled(false);
            reset.setEnabled(true);
         }
      }
   } //Handler1
   
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         hits = 5;
         sum = 0;
         amount.setText("" + sum);
         
         hitsBTN.setEnabled(true);
         reset.setEnabled(false);
         
         for(int r = 0; r < 5; r++)
         {
            for(int c = 0; c < 5; c++)
            {
               board[r][c].setBackground(null);
               if (r == 0 || r == 4 || c == 0 || c == 4)
               {
                  matrix[r][c] = 1;
                  board[r][c].setText("1");
               } else if (r == 1 || r == 3 || c == 1 || c == 3) {
                  matrix[r][c] = 2;
                  board[r][c].setText("2");
               } else {
                  matrix[r][c] = 3;
                  board[r][c].setText("3");
               } //If
            } //For loop reset
         } //For loop reset
      }
   }
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Penny Pitcher");
      frame.setSize(400, 400);
      frame.setLocation(200, 100);
      frame.setContentPane(new PennyPitcher());
      frame.setVisible(true);
   } //Main
   
} //PennyPitcher