/*******************************************************************
Lucas Banerji
Pd.2
Lab 7: Loan Payments
Due: 9/26/17
I learned how to effectively use methods in order to summarize the 
code for a reader as well as making the program a lot neater and
easier to understand. Although I have a lot to learn, I feel as though
I am improving my skills in Java rapidly and can't wait to learn more.
**********************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class LoanProgram
{
   static Scanner console = new Scanner (System.in);
   static DecimalFormat d = new DecimalFormat("0.00");
   public static void main(String[] args)
   {
      int years;
      double amount, rate, payment;
      amount = getAmount();
      rate = getRate();
      years = getYears();
      payment = findPayment (amount, rate, years);
      displayPayment (payment);
   }
   
   
   public static double getAmount()
   {
      System.out.println ("Enter the amount to be borrowed: ");
      double amount = console.nextDouble();
      if (amount < 0 || amount > 100000)
      {
         System.out.println("Invalid. Enter Amount: ");
         amount = console.nextDouble();
      }
      return amount;
   }
   
   public static double getRate()
   {
      System.out.println("Enter the rate: ");
      double rate = console.nextDouble();
      return rate;
   }
   
   public static int getYears()
   {
      System.out.println("Enter the amount of years you will need the payment");
      int years = console.nextInt();
      return years;
   }
   
   public static double findPayment(double amount, double rate, int years)
   {
      double payment = amount*rate*(Math.pow(rate+1.0,years*12.0)/(Math.pow(rate+1.0,years*12.0)-1.0));
      return payment;
   }
   
   public static void displayPayment( double payment)
   {
      System.out.println("Your payment is: $" + d.format(payment));
   }
}

/*  Output
  ----jGRASP exec: java LoanProgram
 Enter the amount to be borrowed: 
 5000
 Enter the rate: 
 5
 Enter the amount of years you will need the payment
 6
 Your payment is: $ 25000.00
 
  ----jGRASP: operation complete.
      ----jGRASP exec: java LoanProgram
 Enter the amount to be borrowed: 
 1
 Enter the rate: 
 1
 Enter the amount of years you will need the payment
 1
 Your payment is: $1.00
 
     
  ----jGRASP exec: java LoanProgram
 Enter the amount to be borrowed: 
 876.5
 Enter the rate: 
 3.2
 Enter the amount of years you will need the payment
 3
 Your monthly payment is: $2804.80
 
  ----jGRASP: operation complete.
 
 
*/