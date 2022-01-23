/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 2
DUE DATE:  2/15/18 

PURPOSE: To create a minesweeper game that gives the option of playing 
on two different sized minefields.

WHAT I LEARNED: I learned through this lab how a 2D array worls and how 
to use it to my advantage. I discovered how to navigate through the arrays
and was able to create methods to manipulate them. This was a really fun lab
for me that I felt I learned a lot from.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import java.util.*;
public class Minesweeper
{
   public static void main (String [] args)
   {
      int  size = welcomeAndAskForSizeOfField();
      int  [] [] minesfield = new int [size] [size];
      char [] []outputField = new char [size][size];
         			
      init (minesfield, outputField);
      //displayBombs(minesfield);      //Uncommented shows minefield
      displayOutput(outputField);
      
      boolean gameOver = false;
      while (gameOver != true)
      {
         gameOver = playGame(minesfield, outputField);
         displayOutput(outputField);		
      }
   	 // display the bombs when game is over
      displayBombs(minesfield);
      	
   }  // main
   	
   
      //*********************************************  welcomeAndAskForSizeOfField
   public static int welcomeAndAskForSizeOfField()
   {
      Scanner keyboard = new Scanner(System.in);
      int size;
      System.out.println("Welcome to Minesweeper!\nChoose size of grid " +
                            "(Press 1 for 5x5, Press 2 for 10x10): ");
      int x = keyboard.nextInt();
      if (x == 1)
         return 5;
      else
         return 10;                       
   }
   	
      //*********************************************  init
   public static void init (int [] [] mines, char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            output[r][c] = ' ';
      }
         // generate a random mine field
      for (int r = 0; r <  mines.length; r++)
      {
         for (int c = 0; c < mines[0].length; c++)
            mines[r][c] = (int)(Math.random() * 2);
      }
   }  // init
   	
   
      //*********************************************  displayOutput   
   public static void displayOutput (char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            System.out.print ("[" + (char)output[r][c] + "]");
         System.out.println();
      } 
   }
   	
   	
      //*********************************************  countMines		
   public static int countMines (int [] [] mines, int r, int c)
   {
      int count=0;
      int cr=r-1;
      int cc=c-1;
      int length=mines.length;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
     
      cr=r-1;
      cc=c;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
      
      cr=r-1;
      cc=c+1;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
     
      cr=r;
      cc=c-1;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
     
      cr=r;
      cc=c+1;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
     
      cr=r+1;
      cc=c-1;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
     
      cr=r+1;
      cc=c;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }
     
      cr=r+1;
      cc=c+1;
      if(cr>=0 && cc>=0 && cr<length && cc<length)
      {
         if(mines[cr][cc]==1)
            count++;
      }   
      return count;
   }  // countMines
   	
   
      //*********************************************  playGame
   		
   public static boolean playGame (int [][] mines, char [] [] outputBoard)
   {
      Scanner  console = new Scanner(System.in); 
      System.out.println("Enter row and column of the cell you want to " +
                                                  "open[row col]: ");
      int r=console.nextInt();
      int c=console.nextInt();
      if(mines[r][c]==1)
      {
         outputBoard[r][c]='X';
         System.out.println("Ooppps! You stepped on a bomb. Sorry, game over!");
         return true; 
      }
      else if(mines[r][c]==0)
      {
         int count= countMines(mines,r,c);
         outputBoard[r][c] = (count + "").charAt(0);
         mines[r][c]=-1;
         return checkStatus(mines);
      }
      return true;
   }
      	
   	
   	// post: if all the cells that do not contain bombs have
   	//       been marked, returns true; otherwise, returns false
   private static boolean checkStatus (int [] [] mines)
   {
      boolean flag = false;
      int count = 0;
      for (int r = 0; r < mines.length; r++)
      {
         for (int c = 0; c < mines[r].length; c++)
         {
            if(mines[r][c] == 0)
               count++;
               
            if (count > 0)
               flag = false;
            else
               flag = true;   
         }
      } 
      
      if (flag)
         System.out.println("Congradulations!! You win!!");
                 
      return flag;
   }
      
   public static void displayBombs(int [][] mines)
   {
      for (int r = 0; r < mines.length; r++)
      {
         for (int c = 0; c < mines[r].length; c++)
         {
            System.out.print(mines[r][c] + " ");
         }
         System.out.println();   
      }          
   }
} // Minesweeper

/*   Output
  ----jGRASP exec: java Minesweeper
 Welcome to Minesweeper!
 Choose size of grid (Press 1 for 5x5, Press 2 for 10x10): 
 1
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 0 0
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 4 4
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][1]
 Enter row and column of the cell you want to open[row col]: 
 3 2
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][2][ ][ ]
 [ ][ ][ ][ ][1]
 Enter row and column of the cell you want to open[row col]: 
 0 3
 Ooppps! You stepped on a bomb. Sorry, game over!
 [1][ ][ ][X][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][2][ ][ ]
 [ ][ ][ ][ ][1]
 -1 0 1 1 0 
 1 0 0 1 0 
 1 1 0 0 0 
 0 0 -1 0 0 
 0 0 0 1 -1 
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java Minesweeper
 Welcome to Minesweeper!
 Choose size of grid (Press 1 for 5x5, Press 2 for 10x10): 
 2
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 0 0
 Ooppps! You stepped on a bomb. Sorry, game over!
 [X][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 1 1 1 0 1 1 1 0 0 0 
 0 0 0 1 1 0 1 0 0 0 
 0 1 1 1 0 1 1 0 1 0 
 1 1 1 0 0 0 0 0 1 1 
 1 1 1 1 0 1 1 1 1 0 
 1 1 1 0 1 0 1 0 1 1 
 0 1 0 0 1 1 0 1 0 0 
 0 1 1 1 0 0 1 1 1 0 
 1 0 1 0 1 1 1 1 1 0 
 1 0 0 0 1 1 1 1 1 1 
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java Minesweeper
 Welcome to Minesweeper!
 Choose size of grid (Press 1 for 5x5, Press 2 for 10x10): 
 1
 0 1 0 0 1 
 0 0 0 0 1               // showing minefield
 1 1 1 0 1 
 1 1 1 1 1 
 0 0 1 0 0 
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 0 0
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 0 2
 [1][ ][1][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 0 3
 [1][ ][1][2][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 1 0
 [1][ ][1][2][ ]
 [3][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 1 1
 [1][ ][1][2][ ]
 [3][4][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 1 2
 [1][ ][1][2][ ]
 [3][4][3][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 1 3
 [1][ ][1][2][ ]
 [3][4][3][4][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 2 3
 [1][ ][1][2][ ]
 [3][4][3][4][ ]
 [ ][ ][ ][6][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 4 0
 [1][ ][1][2][ ]
 [3][4][3][4][ ]
 [ ][ ][ ][6][ ]
 [ ][ ][ ][ ][ ]
 [2][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 4 1
 [1][ ][1][2][ ]
 [3][4][3][4][ ]
 [ ][ ][ ][6][ ]
 [ ][ ][ ][ ][ ]
 [2][4][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 4 3
 [1][ ][1][2][ ]
 [3][4][3][4][ ]
 [ ][ ][ ][6][ ]
 [ ][ ][ ][ ][ ]
 [2][4][ ][4][ ]
 Enter row and column of the cell you want to open[row col]: 
 4 4
 Congradulations!! You win!!
 [1][ ][1][2][ ]
 [3][4][3][4][ ]
 [ ][ ][ ][6][ ]
 [ ][ ][ ][ ][ ]
 [2][4][ ][4][2]
 -1 1 -1 -1 1 
 -1 -1 -1 -1 1 
 1 1 1 -1 1 
 1 1 1 1 1 
 -1 -1 1 -1 -1 
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java Minesweeper
 Welcome to Minesweeper!
 Choose size of grid (Press 1 for 5x5, Press 2 for 10x10): 
 2
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 1
 4
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][5][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 7 9
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][5][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][1]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 3 1
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][5][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][4][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][1]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 Enter row and column of the cell you want to open[row col]: 
 6 6
 Ooppps! You stepped on a bomb. Sorry, game over!
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][5][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][4][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][X][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][1]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
 0 1 0 0 1 1 1 0 0 1 
 1 1 1 1 -1 0 1 0 1 1 
 1 1 0 1 1 0 0 1 0 1 
 0 -1 1 1 0 0 1 1 1 1 
 1 0 0 1 0 0 1 0 1 0 
 1 0 0 1 0 1 0 1 0 0 
 1 1 1 0 0 0 1 0 0 0 
 0 0 0 1 1 0 1 0 0 -1 
 0 1 1 1 1 1 0 0 1 0 
 0 0 0 1 1 1 1 1 1 0 
 
  ----jGRASP: operation complete.
  
*/