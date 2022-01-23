public class TicTacToe
{
   private char [] [] board;
   private static final int ROWS = 3, COLUMNS = 3;
   public TicTacToe()
   {
      board = new char [ROWS][COLUMNS];
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = ' ';
      }
   }  // default constructor

// post-condition: set a field in the board. The field must be unoccupied
   public void set (int i, int j, char player)
   {
      if (board [i][j] != ' ')
         throw new IllegalArgumentException ("Position occupied");
      board[i][j] = player;
   }  // set
   
   public boolean getWinner (char player)
   {
      int i = 0;
      int k =0;
      if(board[i][k]==player)
      {
         if(board[i+1][k]==player)
         {
            if(board[i+2][k]==player)
               return true;
         }
         if(board[i][k+1]==player)
         {
            if(board[i][k+2]==player)
               return true;
         }
         if(board[i+1][k+1] == player)
         {
            if(board[i+2][k+2] == player)
               return true;
         }
      }
      if(board[i+1][k+1]==player) 
      {
         if(board[i][k+1]==player)
         {
            if(board[i+2][k+1]==player)
               return true;
         }
         if(board[i+1][k]==player)
         {
            if(board[i+1][k+2]==player)
               return true;
         }
         if(board[i+2][k]==player)
         {
            if(board[i][k+2]==player)
               return true;
         }
      }  
      if(board[i][k+2]==player)
      {
         if(board[i+2][k+2]==player)
         {
            if(board[i+1][k+2]==player)
               return true;
         }
      }
      return false;
   }//getWinner
   
   public boolean isFilled()
   {
      for(int i =0; i<board.length; i++)
      {
         for(int k=0; k<board[0].length; k++)
         {
            if(board[i][k]==' ')
               return false;
         }
      }
      return true;
   }//isFilled


   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)
         {
            r = r + board[i][j] + "|";
         }
         r = r + "\n";
      }
      return r;
   } // toString
}