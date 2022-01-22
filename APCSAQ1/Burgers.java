/**************************************************************************************
Name: Lucas Banerji
Period: 2
Lab 11: babbage Burgers
Due: 10/6/17
Purpose: To prompt the user for the amount of money made each week and output the 
monthly pay.
I leanred how to use the "for" statemnt in order to create a loop that continues 
until the conditional is no longer true. Furthermore, I had to incorporate if and 
else if statements into my code making this program a great way to practice several 
skills.
**************************************************************************************/
import java.util.Scanner;

public class Burgers
{
   public static void main (String[] args)
   {
      Scanner console = new Scanner (System.in);
      int n = 0;
      double week1 = 0.0;
      double week2 = 0.0;
      double week3 = 0.0;
      double week4 = 0.0;
      
      double sum;
   
      for (n = 1; n < 5; n++)
      {
         System.out.println("How many hours did you work in week " + n + "?");
         double startPay = console.nextDouble();
         
         if (startPay < 0){
            System.out.println("This means you are a horrible worker.");
            break;
         }
         
         double netPay = startPay * 5.15 * 0.7;
         System.out.println("Your take home pay (after 30% tax) is: " + netPay); 
      
         if (n == 1){
            week1 = netPay;
         } else if (n == 2){
            week2 = netPay;
         } else if (n == 3){
            week3 = netPay;
         } else if (n == 4){
            week4 = netPay;
         }
      }
      
      double finalPay = week1 + week2 + week3 + week4;
      System.out.println("\n\nYour total pay for the month is $" + finalPay);
      System.out.println("Hope you enjoy working at Babbage Burgers!");  
   }//  end of main
} //  end of burgers

/* Output 
  ----jGRASP exec: java Burgers
 How many hours did you work in week 1?
 35
 Your take home pay (after 30% tax) is: 126.175
 How many hours did you work in week 2?
 41
 Your take home pay (after 30% tax) is: 147.805
 How many hours did you work in week 3?
 37
 Your take home pay (after 30% tax) is: 133.385
 How many hours did you work in week 4?
 45
 Your take home pay (after 30% tax) is: 162.22500000000002
 
 
 Your total pay for the month is $569.59
 Hope you enjoy working at Babbage Burgers!
 
  ----jGRASP: operation complete.
      
  ----jGRASP exec: java Burgers
 How many hours did you work in week 1?
 45
 Your take home pay (after 30% tax) is: 162.22500000000002
 How many hours did you work in week 2?
 50
 Your take home pay (after 30% tax) is: 180.25
 How many hours did you work in week 3?
 35
 Your take home pay (after 30% tax) is: 126.175
 How many hours did you work in week 4?
 45
 Your take home pay (after 30% tax) is: 162.22500000000002
 
 
 Your total pay for the month is $630.875
 Hope you enjoy working at Babbage Burgers!
 
  ----jGRASP: operation complete.
  ----jGRASP exec: java Burgers
 How many hours did you work in week 1?
 -5
 This means you are a horrible worker.
 
 
 Your total pay for the month is $0.0
 Hope you enjoy working at Babbage Burgers!
 
  ----jGRASP: operation complete.
*/