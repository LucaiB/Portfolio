/*************************************************************
Lucas Banerji
Pd.2
9/8/17
I learned how to use mod and division to get the exact number
of several different values based off of a user input.
*************************************************************/

import java.util.Scanner;

public class AdvancedDispenser
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println("Enter price of item between 0 cents to a dollar: ");
      int amount = console.nextInt();
      int change = 100 - amount;
      System.out.println("You bought an item for " + amount + " cents and gave me a dollar, so your change is: ");
      int q = change/25;
      change = change%25;
      int d = change/10;
      change = change%10;
      int n = change/5;
      change = change%5;
      int p = change;
      System.out.println();
      System.out.println("Quarters: " + q + "\nDimes : " + d + "\nNickles: " + n + "\nPennies: " + p);
   }
}
/*****************************************************************************
Output:

Enter price of item between 0 cents to a dollar: 
 58
 You bought an item for 58 cents and gave me a dollar, so your change is: 
 
 Qaurters: 1
 Dimes : 1
 Nickles: 1
 Pennies: 2
 **************************************************************************/