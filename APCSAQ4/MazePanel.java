import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MazePanel extends JPanel
{
   private JButton[][] board;
   private int[][] matrix = 
      {
      {1,1,1,0,1,1,0,0,0,1,1,1,1},
      {1,0,1,1,1,0,1,1,1,1,0,0,1},
      {0,0,0,0,1,0,1,0,1,0,1,0,0},
      {1,1,1,0,1,1,1,0,1,0,0,1,1},
      {1,0,1,0,0,0,0,1,1,1,0,0,1},
      {1,0,1,1,1,1,1,1,0,1,1,1,0},
      {1,0,0,0,0,0,0,0,0,0,0,0,0},
      {1,1,1,1,1,1,1,1,1,1,1,1,1}
      };

   private int sX, sY, eX, eY;
   private JLabel label;
   private JButton reset;
      
   public MazePanel()
   {
      setLayout(new BorderLayout());
         
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("Select your starting point");
      north.add(label);
      
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(10,10));
      add(center, BorderLayout.CENTER);
      board = new JButton[10][10];
   
      for(int r = 0; r < 10; r++)
         for(int c = 0; c < 10; c++)
         {
            board[r][c] = new JButton();
            board[r][c].setBackground(Color.blue);
            board[r][c].addActionListener( new Handler1(r, c) );
            center.add(board[r][c]);
         }
      
      reset = new JButton("Reset");
      reset.addActionListener( new Handler2() );
      reset.setEnabled(true);
      add(reset, BorderLayout.SOUTH);
         
         
   }
      
   private class Handler1 implements ActionListener
   {
      private int myRow, myCol;
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
      public void actionPerformed(ActionEvent e)
      {
              // The following two statements are for debugging purpose
         System.out.println (myRow);
         System.out.println (myCol);
            
         	  
         torpedoes--;
         label.setText("You have "+torpedoes+" torpedoes.");
         if(torpedoes == 0 && countHits<4)
         {
            label.setText("You have Lost!");
            for(JButton [] a: board)
               for(JButton k: a)
                  k.setEnabled(false);
            for(int ro=0; ro<matrix.length; ro++)
               for(int co=0; co<matrix[0].length;co++)
                  if(matrix[ro][co]==1)
                     board[ro][co].setBackground(Color.red);
         }
         if(board[myRow][myCol].getBackground()==Color.blue && matrix[myRow][myCol]==0)
         {
            board[myRow][myCol].setEnabled(false);
            board[myRow][myCol].setBackground(Color.black);
         }
         if(board[myRow][myCol].getBackground()==Color.blue && matrix[myRow][myCol]==1)
         {
            board[myRow][myCol].setEnabled(false);
            board[myRow][myCol].setBackground(Color.red);
            countHits++;
         }
         if(countHits == 4)
         {
            label.setText("You have won!");
            for(JButton [] a: board)
               for(JButton k: a)
                  k.setEnabled(false);
         }
              
         
             
      }   // actionPerformed of Handler
   }
      
          // Handling the Reset button
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         torpedoes = 20;
         countHits = 0;
         label.setText("Select your starting point");
         for(JButton []j: board)
            for(JButton l: j)
            {
               l.setBackground(Color.blue);
               l.setEnabled(true);
            }
         placeShip();
      }  // actionPerformed of Handler2
   }

}