/**************************************************************************************
Name: Lucas Banerji
Period: 2
Lab 10: Slope
Due: 10/4/17
Purpose: To find the slope based on two coordinates given by user.

I learned how to combine if/else statements along with methods. Although 
I have a basic understanding of the two concepts seperatly, the bringing
of the two together furthered my understanding of both ideas. I also had 
to deal with many curly brackets, hence, I found it useful to pu a comment
on where different methods ended.
**************************************************************************************/

import java.util.Scanner;

public class Slope
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      System.out.println("Enter the first coordinate (x space y): ");
      int x1 = console.nextInt();
      int y1 = console.nextInt();
      
      System.out.println("Enter the second coordinate (x space y): ");
      int x2 = console.nextInt();
      int y2 = console.nextInt();
      
      findSlope (x1, y1, x2, y2);
   }  // end of main
   
   public static void findSlope (int x1, int y1, int x2, int y2)
   {
      if (y1 == y2 && x1 == x2){
         System.out.println("The two points are identical. Slope can't be calculated.");
      } else if ( y1 == y2){
         System.out.println(" This is a horizontal line. The slope is 0.");
      } else if (x1 == x2) {
         System.out.println(" This is a vertical line! Slope can't be calculated.");
      } else {
         System.out.println( "The slope is: " + (double)(y2 - y1)/(x2 - x1));
      }
   } // end of findSlope
} // end of Slope

/*  Output
  ----jGRASP exec: java Slope
 Enter the first coordinate (x space y): 
 2 3
 Enter the second coordinate (x space y): 
 3 4
 The slope is: 1.0
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java Slope
 Enter the first coordinate (x space y): 
 1 2
 Enter the second coordinate (x space y): 
 1 3
  This is a vertical line! Slope can't be calculated.
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java Slope
 Enter the first coordinate (x space y): 
 3 4
 Enter the second coordinate (x space y): 
 5 4
  This is a horizontal line. The slope is 0.
 
  ----jGRASP: operation complete.
      
  ----jGRASP exec: java Slope
 Enter the first coordinate (x space y): 
 5 6
 Enter the second coordinate (x space y): 
 5 6
 The two points are identical. Slope can't be calculated.
 
  ----jGRASP: operation complete.
  
  */

