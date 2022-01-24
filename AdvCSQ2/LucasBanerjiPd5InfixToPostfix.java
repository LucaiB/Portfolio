/***********************************************************************
Name:   Lucas Banerji   
Period:5
Date:    12/15/18
What I Learned: This was a very fun and interesing lab for me. I enjoy solving
this problem and working thorugh the logic. I learned how a stack structure works
and how to change an infix expression to postfix and then evaluate the postfix
expression all through a stack.   
Credit (person who helped me): none...
Student(s) whom I helped (to what extent): none...
************************************************************************/    
import java.util.*;
public class LucasBanerjiPd5InfixToPostfix extends LucasBanerjiPd5PostfixEval
{
   public static void main(String[] args)
   {
      System.out.println("Enter an infix expression, single digits");
      Scanner keyboard = new Scanner(System.in); 
      String s = keyboard.next();  
      while (!s.equals ("-1"))
      {
         String postfixExp = change(s);
         System.out.println (s + " --> " + postfixExp + " --> " + eval(postfixExp) + "\n");
         s = keyboard.next();  
      }
   }  // end of main
   
   
   public static String change(String infix)
   {
      Stack <String> stack = new Stack<String>();
      String op = "+-*/()";
      String postfix = "";
      char c;
      
      for (int i = 0; i < infix.length(); i++)
      {
         c = infix.charAt(i);
         
         if (!op.contains("" + c))
         {
            postfix += c;
            
         } 
         else if (c == '(') 
         {
         
            stack.push("" + c);
         
         } 
         else if (c == ')')
         {
         
            while (!stack.empty() && stack.peek() != "(")
            {
               postfix += stack.pop();
            }
            
            for (int j = 0; j < postfix.length(); j++)
            {
               if (postfix.charAt(j) == '(' || postfix.charAt(j) == ')')
               {
                  postfix = postfix.substring(0, j) + postfix.substring(j+1, postfix.length());
               }
            } 
         
         } 
         else 
         { //Operator
         
            while (!stack.empty() && !(stack.peek() == "(") && priority(c) <= priority(stack.peek().charAt(0)) ) //While stack is not empty AND top is not ( AND top is higher prority, then it will pop
            {
               postfix += stack.pop();
            }
            stack.push("" + c);
         
         }
         
      }
      
      while (!stack.empty()) 
      {
         postfix += stack.pop();
      }
      
      return postfix;
      
   }     
   public static int priority(char c)
   {
      if (c == '+' || c == '-') //Lower priority
      {
         return 1;
      }
      if (c == '*' || c == '/') //Higher priority
      {
         return 2;
      }
      return 0;
   } 
   
} 


/*   Output
  ----jGRASP exec: java LucasBanerjiPd5InfixToPostfix
 Enter an infix expression, single digits
 3+4
 3+4 --> 34+ --> 7
 
 (3+4)
 (3+4) --> 34+ --> 7
 
 (3+4)*5
 (3+4)*5 --> 34+5* --> 35
 
 3+4*5
 3+4*5 --> 345*+ --> 23
 
 3*4+5*6
 3*4+5*6 --> 34*56*+ --> 42
 
 (4+5)-5*3
 (4+5)-5*3 --> 45+53*- --> -6
 
 (3+4)*(5+6)
 (3+4)*(5+6) --> 34+56+* --> 77
 
 (3*(4+5)-2)/5
 (3*(4+5)-2)/5 --> 345+*2-5/ --> 5
 
 8+1*2-9/3
 8+1*2-9/3 --> 812*+93/- --> 7
 
 
  ----jGRASP: process ended by user.
*/