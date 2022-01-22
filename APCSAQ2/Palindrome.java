import java.util.Scanner;
public class Palindrome
{      
   public static void main (String [] args)  
   {  
      String s;   
      boolean isPalindrome;  
      Scanner console = new Scanner (System.in); 
   
      for (int  k = 1; k < 8; k++) 
      {     
         System.out.print ("Enter a string: ");  
         s = console.nextLine();
 
         isPalindrome = check (s);  
         if (isPalindrome)
         {  
            System.out.println (s + " is a palindrome\n\n");   
         }else{        
            System.out.println (s + " is NOT a palindrome\n\n");  
         }  // for    
      } // main
   } 
 
   // postcondition: returns true if s is a palindrome; otherwise,returns false.   
   public static boolean check(String s) 
   {  
      s = removeSpace(s);
      int a = s.length()-1;
      int b = 0;
      while(a>0)
      {
         if(s.charAt(a) != s.charAt(b))
         {
            return false;
         }
         a--;
         b++;
      }
      return true;   
   }
                     
   // postcondition: return a String without spaces in it   
   public static String removeSpace(String s)   
   { 
      int x = s.indexOf(" ");
      
      while (x != 1);
      {
         s = s.substring(0, x) + s.substring(s.indexOf(x) + 1);
         x = s.indexOf(" ");
      }
      return s;
   }
}  // Palindrome 
 
 
