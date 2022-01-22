/*******************************************************************
Lucas Banerji
Pd.2
Lab 8: Division
Due: 10/2/17
I furthered my understanding of conditionl statements as well as my
ablilty to use the division and mod functions.
 **********************************************************************/

import java.util.Scanner;

public class Division
{
       
   public static void main(String [] args)
   {
   Scanner console = new Scanner(System.in);

      System.out.println("Enter the first integer: ");
      int x = console.nextInt();
      System.out.println("Enter the second integer: ");
      int y = console.nextInt();
      
      if (x >= y) {
      System.out.println("The larger number divided by the smaller number is: "
       + x/y +" remainder " + x % y);
       
      } else {
      
      System.out.println("The larger number divided by the smaller number is: "
       + y/x +" remainder " + y % x);
      }
      
 /*  Output
  ----jGRASP exec: java Division
 Enter the first integer: 
 3
 Enter the second integer: 
 4
 The larger number divided by the smaller number is: 1 remainder 1
 
  ----jGRASP: operation complete.
      
  ----jGRASP exec: java Division
 Enter the first integer: 
 4
 Enter the second integer: 
 3
 The larger number divided by the smaller number is: 1 remainder 1
 
  ----jGRASP: operation complete.
 
        
 */


      

   
   
   
   
   
   
   
   
   
   
   }
}