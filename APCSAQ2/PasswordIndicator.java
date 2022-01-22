/*****************************************************************************************************************
NAME: Lucas Banerji     
PERIOD: 2
DATE SUBMITTED:
DUE DATE:   
ASSIGNMENT: Password Indicator Lab

PURPOSE OF THE LAB: To test the inputed passwords for their strength.    

LEARNED: This lab was very hard in the begining, before the shell was introduced. It made me think of new ways to 
solve the problem at hand.  I learned how to use loops to compare each char of a String to anothers String.
I feel like this was a very beneficial lab because it made me use new String concepts in a real world situation.   
            
CREDITS: Shumann Xu - helped me with assignment before the shell and additional information was given.
I didn't need help once the shell was introduced and I was helped by Mr.Lau.

****************************************************************************************************************/
import java.util.Scanner;
public class PasswordIndicator
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      for(int h = 0; h<8; h++)
      {
         System.out.print("Enter a password(String): "); 
         String password = in.next();
         if(passwordValidator(password) == 1)
            System.out.println("The password " + "'" + password + "'" + 
                               " is a very weak password");  
         else if(passwordValidator(password) == 2)
            System.out.println("The password " + "'" + password + "'" +
                               " is a weak password");
         else if(passwordValidator(password) == 3)
            System.out.println("The password " + "'" + password + "'" +
                               " is a strong password");
         else if(passwordValidator(password) == 4)
            System.out.println("The password " + "'" + password + "'" +
                               " is a very strong password");
         else if(passwordValidator(password) == 5)
            System.out.println("The password " + "'" + password + "'" + 
                               " is a mediocre password");   
         else if(passwordValidator(password) == 6)
            System.out.println("The password " + "'" + password + "'" + 
                               " is a solid password");                                    
         else 
            System.out.println("The password " + "'" + password + "'" + 
                               " is undetermined");
      }
   }   
   public static int passwordValidator(String password)
   {
      int returnValue = 0;
      int numCount = 0;
      int letterCount = 0;
      int countSpecial = 0;
      
      String specialChar = "!@#$%^&*|";                             
      
      for(int w = 0; w < password.length(); w++)
      {
         for(int k = 0; k < specialChar.length(); k++)
         {
            if( password.substring(w,w+1).equals( specialChar.substring(k,k+1)))
            {
               countSpecial++;
            }
         }
      }
      
      String letters = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
      
      for(int m = 0; m < password.length(); m++)
      {
         for(int n = 0; n < letters.length(); n++)
         {
            if( password.substring(m,m+1).equals( letters.substring(n,n+1)))
            {
               letterCount++;
            }
         }
      }
      
      String digits = "1234567890";
      
      for(int q = 0; q < password.length(); q++)
      {
         for(int w = 0; w < digits.length(); w++)
         {
            if( password.substring(q,q+1).equals( digits.substring(w,w+1)))
            {
               numCount++;
            }
         }
      }
   
      int strength = 0;
      if(password.length() < 8)
      {
         if(numCount == password.length())
            strength = 1; //very weak
         else if(letterCount == password.length())
            strength = 2; //weak
         else if(numCount >= 1 && letterCount >= 1)
            strength = 5; //mediocre   
      }
      else 
      {
         if(numCount >= 1 && letterCount >= 1 && countSpecial >= 1)
            strength = 4; //very strong
         else if(numCount >= 1 && letterCount >= 1)
            strength = 3; //strong
         else
            strength = 6;
      }
      return strength;
   } 
}

/*  Output
  ----jGRASP exec: java PasswordIndicator
 Enter a password(String): 12345
 The password '12345' is a very weak password
 Enter a password(String): abcdef
 The password 'abcdef' is a weak password
 Enter a password(String): abc123xyz
 The password 'abc123xyz' is a strong password
 Enter a password(String): 1337h@xor!
 The password '1337h@xor!' is a very strong password
 Enter a password(String): asdfghjkl
 The password 'asdfghjkl' is a solid password
 Enter a password(String): asd234
 The password 'asd234' is a mediocre password
 Enter a password(String): 123456789
 The password '123456789' is a solid password
 Enter a password(String): !@#$%^&de1
 The password '!@#$%^&de1' is a very strong password
 
  ----jGRASP: operation complete.
  */
