import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class MazePanel extends JPanel
{
   private JButton[][] newGrid;
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

   private JButton end;
   private JLabel label;
   private JButton reset;
   private final int VISITED = 3;
   private final int PATH = 7;
   private final int NOT_YET = 1;
   private final int BLOCKED = 0;
   Thread solverThread;
      
   public MazePanel()
   {
      setLayout(new BorderLayout());
         
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("Select your starting point");
      north.add(label);
      
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(8,13));
     
      newGrid = new JButton[8][13];
      for(int r = 0; r < 8; r++)
         for(int c = 0; c < 13; c++)
         {
            newGrid[r][c] = new JButton();
            if(matrix [r][c] == 1)
            {
               newGrid[r][c].setBackground(Color.blue);
               if(r == 7 && c == 12)
                  newGrid[r][c].setBackground(Color.green);
            
               newGrid[r][c].addActionListener( new Handler1(r, c) );
            }
            else
            {
               newGrid[r][c].setBackground(Color.gray);
               newGrid[r][c].setEnabled(false);
            }
               
            center.add(newGrid[r][c]);
         }
      add(center, BorderLayout.CENTER);
       
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
         label.setText("Maze is being solved");
         for(JButton [] a: newGrid)
            for(JButton k: a)
               k.setEnabled(false);
               
         if(newGrid[myRow][myCol].getBackground() == Color.green || newGrid[myRow][myCol].getBackground() == Color.gray)
         {
            return;
         }
      
         if(e.getSource() == newGrid[myRow][myCol])
         {
            if(findPath(myRow, myCol) == false)
            {
               label.setText("Still Trapped Inside Click Reset and Try again");
            		
               for(int i = 0; i < 8; i++)
               {
                  for(int k = 0; k < 13; k++)
                     newGrid[i][k].setEnabled(false);
               }
            }
            else
            {
               label.setText("You Successfully Exited the Maze!");
               for (int i = 0; i < matrix.length; i++) 
               {
                  for (int x = 0; x < matrix[0].length; x++) 
                  {
                     if(matrix[i][x] == 7)
                     {
                        newGrid[i][x].setBackground(Color.green);
                     }
                     newGrid[i][x].setEnabled(false);
                  }
               }
               findPath(myRow, myCol);
            }
         }
      }
      public boolean findPath (int r, int c)
      {
         boolean flag = false;
         
         if (r >= 0 && r < matrix.length && c >= 0 && c < matrix[0].length && matrix[r][c] == 1) 
         {
            matrix[r][c] = 3;       // coordinate has been tried
         
            if (r == matrix.length-1 && c == matrix[0].length-1)
               flag = true;  // maze is solved
            else 
            {
               flag = findPath (r+1, c);  // down
               if (!flag)
               {
                  flag = findPath( r, c+1);
                  newGrid[r][c].setBackground(Color.red);
               }// right
               if (!flag)
               {
                  flag = findPath (r-1, c);
                  newGrid[r][c].setBackground(Color.red);
               }// up
               if (!flag)
               {
                  flag = findPath(r, c-1);
                  newGrid[r][c].setBackground(Color.red);
               }// left
            }
            if (flag) 
               matrix[r][c] = 7;
         }
         return flag;
      //return false;
      
      }
   }  // FindAnExit
          // Handling the Reset button
   private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         label.setText("Select your starting point");
         for(int i = 0; i < 8; i++)
            for(int k = 0; k < 13; k++)
            {
               newGrid[i][k].setEnabled(true);
               if(matrix[i][k] == 7 || matrix[i][k] == 3)
               {
                  newGrid[i][k].setBackground(Color.blue);
                  if(i == 7 && k == 12)
                     newGrid[i][k].setBackground(Color.green);
                  matrix[i][k] = 1;
               }
            }    
      }  // actionPerformed of Handler2
   }  
}


