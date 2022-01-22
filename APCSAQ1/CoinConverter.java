/***************************************************************
Lucas Banerji
Period 2
CoinConverter(class) Lab
Due 11/20/17
I learned how to use a static instance variable to help initiate
the values for the other instance variables. I also realized how
important the toString() method is. I forgot to put it in my 
program and when I tried to print things, only the memory
location would show.
***************************************************************/
import java.util.Scanner;
public class CoinConverter
{
   private int q;
   private int d;
   private int n;
   private int p;
   private static int amount;
   public CoinConverter(int amount)
   {
      this.amount = amount;
   }
   public int getQuarters()
   {
      return q = amount/25;
   }

   public int getDimes()
   {
      return d = amount%25/10;
   }

   public int getNickles()
   {
      return n = amount%25%10/5;
   }

   public int getPennies()
   {
      return p = amount%25%10%5;
   }
   
   public String toString()
   {
   return "Quarters: " + q + "\nDimes: " + d
          + "\nNickels: " + n + "\nPennies: " + p;
   }
   public static void main (String  []  args)
   {     
      CoinConverter machine ;  
      int amountInCents ;   
      Scanner input  = new Scanner (System.in); 
                              
      System.out.print ("Enter the amount you want to convert: ");   
      amountInCents = input.nextInt() ;
      machine = new CoinConverter (amountInCents); 
      
      machine.getNickles();
      machine.getQuarters();
      machine.getDimes();
      machine.getPennies();
         
      System.out.println(machine);              
   } 
}
/*  Output
  ----jGRASP exec: java CoinConverter
 Enter the amount you want to convert: 100
 Quarters: 4
 Dimes: 0
 Nickels: 0
 Pennies: 0
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java CoinConverter
 Enter the amount you want to convert: 0
 Quarters: 0
 Dimes: 0
 Nickels: 0
 Pennies: 0
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java CoinConverter
 Enter the amount you want to convert: 95
 Quarters: 3
 Dimes: 2
 Nickels: 0
 Pennies: 0
 
  ----jGRASP: operation complete.
      
  ----jGRASP exec: java CoinConverter
 Enter the amount you want to convert: 99
 Quarters: 3
 Dimes: 2
 Nickels: 0
 Pennies: 4
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java CoinConverter
 Enter the amount you want to convert: 60
 Quarters: 2
 Dimes: 1
 Nickels: 0
 Pennies: 0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java CoinConverter
 Enter the amount you want to convert: 75
 Quarters: 3
 Dimes: 0
 Nickels: 0
 Pennies: 0
 
  ----jGRASP: operation complete.
  */