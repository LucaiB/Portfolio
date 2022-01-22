/*******************************************************************************
Lucas Banerji
Pd. 2
9/7/17
Lab 4B: DisplayVertical
I learned how to use mod and division to get certain digits out of a number.It
took a little bit of critical thinking but in the end it felt like a comfortable
assignment.
*******************************************************************************/

import java.util.Scanner;

public class DisplayVertical
{
   public static void main (String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println("Enter four digit number: ");
      int x = console.nextInt();
      System.out.println(x/1000);
      System.out.println(x%1000/100);
      System.out.println(x%100/10);
      System.out.println(x%10/1);
   }
}
/*
Enter four digit number: 
  3456
 3
 4
 5
 6
 
  Enter four digit number: 
 0000
 0
 0
 0
 0
Enter four digit number: 
 9999
 9
 9
 9
 9
  Enter four digit number: 
 7863
 7
 8
 6
 3
 */