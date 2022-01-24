/***********************************************************************
Name:Lucas Banerji      
Period:5
Date: 12/13/18 

What I Learned:I learned how to use a stack structure to compare values
of a String. I also figured out that using the indexOf method to compare 
the left and right operators was a much more efficient way of solving this
problem. This lab was very fun to complete and I think I really am starting
to understand the stack structure.        
  
Credit (person who helped me): none...
Student(s) whom I helped (to what extent): none...
************************************************************************/   
import java.util.*;
public class LucasBanerjiPd5ParenMatch
{
   public static final String left  = "([{<";
   public static final String right = ")]}>";
   public static void main(String[] args)
   {
   
      System.out.println("Enter an expression with grouping symbols,");
      System.out.println("such as (2+3)-[5*(6+1)]IndexMals");
      Scanner keyboard = new Scanner(System.in);
      String s = keyboard.next();  
      while(!s.equals("-1"))
      {
         boolean flag = check(s);
         if(flag)
            System.out.println(s + " is good.");
         else
            System.out.println("No, no, no.  Bad.  " + s);
         System.out.println();
         s = keyboard.next();
      }
   }
   // precondition: none
   // postcondition: returns whether the expression is valid or not
   public static boolean check(String s)
   {
      Stack <String> stack = new Stack();
      while(s.length() != 0)
      {
         String curr = s.substring(0,1);
         if(isLeftOperator(curr))
         {
            stack.push(curr);
         }
         else if(isRightOperator(curr))
         {
            if(stack.isEmpty())
               return false;
            if(left.indexOf(stack.peek()) == (right.indexOf(curr)))
               stack.pop();
            else
               return false;
          }
         s = s.substring(1);        
      }
      if(stack.isEmpty())
         return true;
      else
         return false;
   }
   
   public static boolean isLeftOperator(String str)
   {
   if(str.equals("(")|| str.equals("[") || str.equals("{") || str.equals("<"))
      return true;
   else
      return false;
   }
   
   public static boolean isRightOperator(String str)
   {
   if(str.equals(")")|| str.equals("]") || str.equals("}") || str.equals(">"))
      return true;
   else
      return false;
   }
}


/*   Output
  ----jGRASP exec: java LucasBanerjiPd5ParenMatch
 Enter an expression with grouping symbols,
 such as (2+3)-[5*(6+1)]IndexMals
 5+7
 5+7 is good.
 
 (5+7)
 (5+7) is good.
 
 )5+7(
 No, no, no.  Bad.  )5+7(
 
 ((5+7*3)
 No, no, no.  Bad.  ((5+7*3)
 
 ((5+7)*3)
 ((5+7)*3) is good.
 
 [(5+7)*]3
 [(5+7)*]3 is good.
 
 <{5+7}*3>
 <{5+7}*3> is good.
 
 (5+7)*3
 (5+7)*3 is good.
 
 5+(7*3)
 5+(7*3) is good.
 
 ((5+7)*3
 No, no, no.  Bad.  ((5+7)*3
 
 [(5+7]*3)
 No, no, no.  Bad.  [(5+7]*3)
 
 [(5+7)*3])
 No, no, no.  Bad.  [(5+7)*3])
 
 ([(5+3)*3]
 No, no, no.  Bad.  ([(5+3)*3]
 
 
  ----jGRASP: process ended by user.
*/
