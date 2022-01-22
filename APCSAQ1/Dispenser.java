/*************************************************************
Lucas Banerji
Pd.2
9/8/17
I learned how to use mod and division to get the exact number
of several different values based off of a user input.
*************************************************************/

import java.util.Scanner;

public class Dispenser
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println("Enter price of item between 25 cents to a dollar (In 5-cent incraments): ");
      int amount = console.nextInt();
      int change = 100 - amount;
      System.out.println("You bought an item for " + amount + " cents and gave me a dollar, so your change is: ");
      int q = change/25;
      change = change%25;
      int d = change/10;
      change = change%10;
      int n = change/5;
      System.out.println();
      System.out.println("Qaurters: " + q + "\nDimes : " + d + "\nNickles: " + n);
   }
}
/*****************************************************************************
Output:

Enter price of item between 25 cents to a dollar (In 5-cent incraments): 
 30
 You bought an item for 30 cents and gave me a dollar, so your change is: 
 
 Qaurters: 2
 Dimes : 2
 Nickles: 0
 **************************************************************************/