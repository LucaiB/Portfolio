/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 2
DUE DATE:  2/21/18 

PURPOSE: To create a tic-tac-toe game that two users can play using x's
and o's.

WHAT I LEARNED: I learned through this lab how a 2D array works and how 
to use it to my advantage. I discovered how to navigate through the arrays
and was able to create methods to find values around array.
This was a really fun lab for me that I felt I learned a lot from.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import javax.swing.JOptionPane;

public class TicTacToeTester
{
   public static void main (String [] args)
   {
      char player = 'x';
      TicTacToe game = new TicTacToe();
      while (true)
      {
         System.out.println (game);
         String input = JOptionPane.showInputDialog ("Row for " +
                        player + " (from 0-2 and press Cancel to exit)");
         if (input == null) System.exit(0);
      	
         int row = Integer.parseInt (input);
         input = JOptionPane.showInputDialog ("Column for " + player +
                                              " from 0-2 and press Cancel to exit)");
         int column = Integer.parseInt (input);
         game.set (row, column, player);
         if (player == 'x')
            player = 'o';
         else
            player = 'x';
            
         if(game.getWinner('o') == true)
         {
            System.out.println(game.toString());
            System.out.println("'o' is the winner!" + "\n" + "Thanks for playing");
            break;
         }
         else if(game.getWinner('x') == true)
         {
            System.out.println(game.toString());
            System.out.println("'x' is the winner!" + "\n" + "Thanks for playing");
            break;
         }  
         
         if(game.isFilled()==true)
         {
            System.out.println(game.toString());
            System.out.println("Tie Game!" + "\n" + "Thanks for playing");
            break;
         }
      
      } // while
   }  // main
} // TicTacToeTester


/*    Output
  ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x|o| |
 | | | |
 | | | |
 
 |x|o| |
 |x| | |
 | | | |
 
 |x|o|o|
 |x| | |
 | | | |
 
 |x|o|o|
 |x| | |
 |x| | |
 
 'x' is the winner!
 Thanks for playing
 
  ----jGRASP: operation complete.
    
  ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 | | | |
 | |x| |
 | | | |
 
 |o| | |
 | |x| |
 | | | |
 
 |o|x| |
 | |x| |
 | | | |
 
 |o|x| |
 |o|x| |
 | | | |
 
 |o|x| |
 |o|x|x|
 | | | |
 
 |o|x| |
 |o|x|x|
 |o| | |
 
 'o' is the winner!
 Thanks for playing
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 |x| | |
 | | | |
 | | | |
 
 |x| | |
 |o| | |
 | | | |
 
 |x|x| |
 |o| | |
 | | | |
 
 |x|x| |
 |o| | |
 |o| | |
 
 |x|x|x|
 |o| | |
 |o| | |
 
 'x' is the winner!
 Thanks for playing
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 | |x| |
 | | | |
 | | | |
 
 |o|x| |
 | | | |
 | | | |
 
 |o|x| |
 |x| | |
 | | | |
 
 |o|x| |
 |x|o| |
 | | | |
 
 |o|x| |
 |x|o| |
 | |x| |
 
 |o|x| |
 |x|o| |
 | |x|o|
 
 'o' is the winner!
 Thanks for playing
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 | | | |
 | | | |
 |x| | |
 
 |o| | |
 | | | |
 |x| | |
 
 |o| | |
 | |x| |
 |x| | |
 
 |o| | |
 |o|x| |
 |x| | |
 
 |o| |x|
 |o|x| |
 |x| | |
 
 'x' is the winner!
 Thanks for playing
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java TicTacToeTester
 | | | |
 | | | |
 | | | |
 
 | | | |
 | |x| |
 | | | |
 
 |o| | |
 | |x| |
 | | | |
 
 |o|x| |
 | |x| |
 | | | |
 
 |o|x| |
 | |x| |
 | |o| |
 
 |o|x| |
 |x|x| |
 | |o| |
 
 |o|x| |
 |x|x|o|
 | |o| |
 
 |o|x|x|
 |x|x|o|
 | |o| |
 
 |o|x|x|
 |x|x|o|
 |o|o| |
 
 |o|x|x|
 |x|x|o|
 |o|o|x|
 
 Tie Game!
 Thanks for playing
 
  ----jGRASP: operation complete.
  */