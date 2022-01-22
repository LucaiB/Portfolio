/**************************************************************************************
Name: Lucas Banerji
Period: 2
Lab 12: Euclidean Algorithm
Due: 10/17/17
Purpose: To prompt the user for two integers and then calculate the greatesr common divisor.
I leanred how to use the "while statement in order to create a loop that continues 
until the conditional is no longer true. Furthermore, I had to incorporate if and 
else if statements into my code making this program a great way to practice several 
skills.
**************************************************************************************/

import java.util.Scanner;
public class Euclidean
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int smallNum = 0;
      int bigNum = 0;
   
      System.out.println("Enter two positive integers seperated by a space:");
      int n1 = console.nextInt();
      int n2 = console.nextInt();
               
      if (n1 > n2){
         bigNum = n1;
         smallNum = n2;
      } else if (n1 < n2){
         bigNum = n2;
         smallNum = n1;
      }   
      
      System.out.print("The greatest common divisor of these integers is: ");
      System.out.println(findGCD(bigNum, smallNum));
   }   // end of main
   
   public static int findGCD(int bigNum, int smallNum)  //Uses Eucldiean Algorithm
   {
      int remainder = 0;            
      int x = 0;
      while (smallNum != 0)
      {
         remainder = bigNum % smallNum;
         bigNum = smallNum;
         smallNum = remainder;
         x++;
      }      
      return bigNum;
   }   // end of findGCD
}   // end of Euclidean

/*  Output
  ----jGRASP exec: java Euclidean
 Enter two positive integers seperated by a space:
 1 2
 The greatest common divisor of these integers is: 1
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java Euclidean
 Enter two positive integers seperated by a space:
 4 6
 The greatest common divisor of these integers is: 2
 
  ----jGRASP: operation complete.
     ----jGRASP exec: java Euclidean
 Enter two positive integers seperated by a space:
 9 15
 The greatest common divisor of these integers is: 3
 
  ----jGRASP: operation complete. 
       ----jGRASP exec: java Euclidean
 Enter two positive integers seperated by a space:
 36 112
 The greatest common divisor of these integers is: 4
 
  ----jGRASP: operation complete. 
*/