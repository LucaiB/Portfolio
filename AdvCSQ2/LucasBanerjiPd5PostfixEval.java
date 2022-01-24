/***********************************************************************
Name:   Lucas Banerji   
Period: 5
Date:   12/15/18
What I Learned:I learned how to use a stack to evaluate post fix expressions
buy using the pop,peek, and push methods to manipulate the stack.         
Credit (person who helped me): none...
Student(s) whom I helped (to what extent): none...
************************************************************************/    
import java.util.*;
public class LucasBanerjiPd5PostfixEval
{
   public static void main(String[] args)
   {
      System.out.println("Enter a valid postfix expression (single digits only),");
      System.out.println("such as 35*1+");
      Scanner keyboard = new Scanner(System.in);
      String s = keyboard.nextLine();  
      while(!s.equals("-1"))
      { 
         System.out.println(s + "  --->  " + eval(s) + "\n");
      // //        System.out.println((s = "354*+7*") + " = " + eval(s) + "\n");
      // //          System.out.println((s = "82-") + " = " + eval(s) + "\n");
      // //          System.out.println((s = "82/") + " = " + eval(s) + "\n");
         s = keyboard.nextLine();
      }
   }
   
   //precondition: x is a proper postfix expression
   //postcondition: returns the result of the expression
   public static int eval(String x)
   {
      int eval = 0;
      Stack<String> stack = new Stack();
      for (int i = 0; i < x.length(); i++)
      {
         String curr = x.charAt(i) + "";
         if(isOperator(curr))
         {
            int b = Integer.parseInt(stack.pop());
            int a = Integer.parseInt(stack.pop());
            eval = eval(a,b,curr);
            stack.push(eval + "");
         }
         else
            stack.push(curr);
      }          
      return eval;
   }
   
   //precondition: ch must be one of the four common operators
   //postcondition: returns the result of the expression a ch b
   public static int eval(int a, int b, String ch)
   {
      if(ch.equals("-"))
         return a - b;
      else if(ch.equals("+"))
         return a + b;
      else if(ch.equals("*"))
         return a * b;
      else if(ch.equals("/"))
         return a / b;
      return 0;
      
   }
   
   //Precondition: none
   //postcondition: returns if ch is one of the four common operators
   public static boolean isOperator(String ch)
   {
      if(ch.equals("*") || ch.equals("/") || ch.equals("+") || ch.equals("-"))
         return true;
      return false;      
   }
}

/*   Output
  ----jGRASP exec: java LucasBanerjiPd5PostfixEval
 Enter a valid postfix expression (single digits only),
 such as 35*1+
 345*+
 345*+  --->  23
 
 34*5+
 34*5+  --->  17
 
 45+53*-
 45+53*-  --->  -6
 
 34+56+*
 34+56+*  --->  77
 
 345+*2-5/
 345+*2-5/  --->  5
 
 812*+93/-
 812*+93/-  --->  7
 
 
  ----jGRASP: process ended by user.
*/