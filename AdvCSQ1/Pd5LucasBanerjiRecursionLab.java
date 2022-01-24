import java.util.Scanner;   
public class Pd5LucasBanerjiRecursionLab
{
   //Pre: c is a lower case letter - Post: all lower case letters a-char c are printed 
   public static void letters(char c)
   {
      if(c == 'a') 
         System.out.print("a");
      else                         //call method with prev char until 'a'
      {                            //print all chars
         letters((char) (c-1));
         System.out.print(c);
      }
   }
 
   
	//Pre: none - Post: returns number of times two can go into x
   public static int twos(int x)
   {
      if (x%2 != 0)                //if x is odd, stop   
         return 0;                 //divide by two and add 1 to "count"
      return 1 + twos(x/2);
   }
	//Pre: none - Post: returns if x is a power of 3
   public static boolean powerof3(int x)
   {
      if(x%3 != 0)                 //must always be divisible by 3
         return false;             //if it is divisible by 3 through 3 then it is a power of 3 
      if(x/3 == 1)
         return true;   
      return powerof3(x/3);
   }
	//Pre: none - Post: returns String of x reversed 
   public static String reverse(long x)
   {
      if(x%10 == x)                     //find last digit and print it first
         return x + "";   
      return x%10 + "" + reverse(x/10);
   }
	//Pre: x > 0 - Post: Prints x in base 5
   public static void base5(int x)
   {
      if(x%5 == x)                      //divide by five and find remainder (change of base rule)
         System.out.print(x);
      else
      {   
         base5(x/5);
         System.out.print(x%5);
      }
   }
	// Pre: x > 0 - Post: Prints x with commas
   public static void printWithCommas(long x)
   {
      if(x/1000 == 0)
         System.out.print(x);
      else                                      //every 1000, add a comma
      {
         printWithCommas(x/1000);
         System.out.print("," + x%1000);
         
      } 
   }
	
	
   public static void main(String []args)
   {
      Scanner scan = new Scanner (System.in);
      int choice;
      do
      {
         System.out.println("\n\n1)Letters"+
                           "\n2)Twos"+
                           "\n3)Power Of 3"+
                           "\n4)Reverse"+
                           "\n5)Base 5"+
                           "\n6)Print With Commas"+
                           "\n7)Exit");
         choice = scan.nextInt();
         if (choice == 1)
         {
            System.out.println("Enter a letter");
            char charA = scan.next().charAt(0);
            if (charA < 'a' || charA > 'z')
               System.out.println("That letter not valid");
            else
               letters(charA);
         }
         else if (choice == 2)
         {
            System.out.println("Enter a number");
            System.out.println(twos(scan.nextInt()));
         }
         else if (choice == 3)
         {
            System.out.println("Enter a number");
            System.out.println(powerof3(scan.nextInt()));
         }
         else if (choice == 4)
         {
            System.out.println("Enter a number");
            System.out.println(reverse(scan.nextLong()));
         }
         else if (choice == 5)
         {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if (number > 0)
               base5(number);
            else
               System.out.println("That number is not valid");
         }
         else if (choice == 6)
         {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if (number > 0)
               printWithCommas(number);
            else
               System.out.println("That number is not valid");
         }
      }while(choice != 7);
   }
}
