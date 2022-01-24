/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  10/24/18

PURPOSE: To read a file and fill an area.

WHAT I LEARNED: This lab was fairly easy, but fun. I learned how to read 
files and I also brushed up on my recursion skills. Furthermore, the read
method was a great place to use a try block.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import java.util.Scanner;
import java.io.*;
public class Pd5LucasBanerjiAreaFill
{
   public static char[][] grid = null;
   
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Filename: ");
      String filename = sc.next();
      grid = read(filename);
      display(grid);
      System.out.print("\nEnter ROW COL to fill from: ");
      int row = sc.nextInt();
      int col = sc.nextInt(); 
      fill(grid, row, col, grid[row][col], 'a');
      display(grid);
      sc.close();
   }
   public static char[][] read(String filename)throws FileNotFoundException
   {
      try {
         String s = "";
         File file = new File(filename);
         System.out.println(file.exists() + " " + file.canRead());
         Scanner scanner = new Scanner(file);
         int k = scanner.nextInt();
         int j = scanner.nextInt();
         char[][] c = new char[k][j];
         s = scanner.nextLine();
         for (int i = 0; i < k; i++) {
            s = scanner.nextLine();
            c[i] = s.toCharArray();
         }
         return c;
      }
      catch (FileNotFoundException e) {
         throw new FileNotFoundException("File wasn't found!");
      }
   }
      
   public static void display(char[][] g)
   {              
      for(int i = 0; i < g.length; i++)
      {
    	  for(int k = 0; k <g[1].length; k++)
    	  {
    		  System.out.print(g[i][k]);
    	  }
    	  System.out.println();
      }
   }
   public static void fill(char[][] g, int r, int c, char ch, char replace) //recursive method
   {       
      g[r][c] = replace;
      if (r < g.length - 1 && g[r+1][c] == ch)
      {
         fill(g, r+1, c, ch, replace);
      }
      if (c < g[0].length - 1 && g[r][c+1] == ch)
      {
         fill(g, r, c+1, ch, replace);
      }
      if (r > 0 && g[r-1][c] == ch)
      {
         fill(g, r-1, c, ch, replace);
      }
      if (c > 0 && g[r][c-1] == ch)
      {
         fill(g, r, c-1, ch, replace);
      }
   }
}