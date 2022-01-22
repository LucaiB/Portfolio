/**************************************************************************************
Name: Lucas Banerji
Period: 2
Lab 9: CombinationLock
Due: 10/2/17

I leanred how to use the Math.random function to generate random numbers. Also, I 
leanred how to use and return boolean values. I furthered my understanding of
conditional statemetns as well.
**************************************************************************************/
import java.util.Scanner;
public class CombinationLock
{
   public static void main (String [] args)
   {
      int first, second, third;
      
      first = (int)(Math.random () * 50 + 1);
      second = (int)(Math.random () * 50 + 1);
      third = (int)(Math.random () * 50 + 1);
      
      System.out.println (first + ", " + second + ", " + third );
      System.out.println ("It is \"" + theLockIsOpen (first, second, third)+ 
                                       "\" that the combination is correct.");
   }

   public static boolean theLockIsOpen (int firstNum, int secondNum, int thirdNum)
   {
      Scanner number = new Scanner (System.in);
      System.out.println("Enter the three numbers. Separate each by a space: ");
      int firstN = number.nextInt();
      int secondN = number.nextInt(); 
      int thirdN = number.nextInt();
      if (((Math.abs(firstN - firstNum)== 3)||(Math.abs(firstN - firstNum)== 2)||(Math.abs(firstN - firstNum)== 1)
      ||(Math.abs(firstN - firstNum)== 0))
      &&((Math.abs(secondN - secondNum)== 3)||(Math.abs(secondN - secondNum)== 2)||(Math.abs(secondN - secondNum)== 1)
      ||(Math.abs(secondN - secondNum)== 0))
      &&((Math.abs(thirdN - thirdNum)== 3)||(Math.abs(thirdN - thirdNum)== 2)||(Math.abs(thirdN - thirdNum)== 1)
      ||(Math.abs(thirdN - thirdNum)== 0)))
      {
         System.out.println("Lock Opens");
         return true;
      }      
      System.out.println("Lock Remains Closed");
      return false;
   }
}
/*Output
      ----jGRASP exec: java CombinationLock
 9, 9, 21
 Enter the three numbers. Separate each by a space: 
 9 9 21
 Lock Opens
 It is "true" that the combination is correct.
 
      ----jGRASP exec: java CombinationLock
 32, 3, 9
 Enter the three numbers. Separate each by a space: 
 35 6 6
 Lock Opens
 It is "true" that the combination is correct.
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java CombinationLock
 46, 45, 36
 Enter the three numbers. Separate each by a space: 
 50 45 36
 Lock Remains Closed
 It is "false" that the combination is correct.
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java CombinationLock
 2, 46, 8
 Enter the three numbers. Separate each by a space: 
 1 1 1
 Lock Remains Closed
 It is "false" that the combination is correct.
 
  ----jGRASP: operation complete.
 
*/
