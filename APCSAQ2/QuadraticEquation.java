/**************************************************************
Lucas Banerji
Period 2
QuadraticEquation(class) Lab
Due 11/14/17
I learned how to incorporate several methods into a class
that are extremely useful in a driver method. Also this lab
was a good review of the math language used in java.
**************************************************************/

import java.util.Scanner; 
import java.lang.Math;
public class QuadraticEquation
{
   private double a, b, c;
   double discriminant;

   public QuadraticEquation(double a, double b, double c)
   {
      this.a = a;
      this.b = b;
      this.c = c;
   }  

   private double findDiscriminant(double a, double b, double c)
   {
      return discriminant = Math.pow(b,2)-4*a*c;
   }
   
   public double getSolution1(double a, double b, double c)
   {
      return (-b + Math.sqrt(discriminant))/(2*a);
   }
   
   public double getSolution2(double a, double b, double c)
   {
      return (-b - Math.sqrt(discriminant))/(2*a);
   }
   
   public boolean noSolution(double a, double b, double c)
   {
      return findDiscriminant(a,b,c) < 0;
   }
   public boolean equalRoots(double a, double b, double c)
   {
      return getSolution1(a,b,c) == getSolution2(a,b,c);
   }
  
   public static void main (String [] args)
            
   {
      Scanner input = new Scanner (System.in); 
                    
      for (int k = 1; k <= 3; k++)
      {
         System.out.println("Enter a: ");
         double  a = input.nextInt();
         System.out.println("Enter b: ");  
         double  b = input.nextInt(); 
         System.out.println("Enter c: ");      
         double c = input.nextInt();
          
         QuadraticEquation q = new QuadraticEquation (a,b,c); 
         
         if (q.noSolution(a,b,c) == true){   
            System.out.println ("No real solution.");
         }else if (q.equalRoots(a,b,c) == true){  
            System.out.println ("The only solution is: "+  q.getSolution1(a,b,c));
         }else{        
            System.out.println("The two real solutions are:");  
            System.out.println(q.getSolution1(a,b,c));
            System.out.println(q.getSolution2(a,b,c));  
         }
                                                            
      }    
   } 
}
/*

  ----jGRASP exec: java QuadraticEquation
 Enter a: 
 5
 Enter b: 
 1
 Enter c: 
 3
 No real solution.
 Enter a: 
 2
 Enter b: 
 5
 Enter c: 
 3
 The two real solutions are:
 -1.0
 -1.5
 Enter a: 
 3
 Enter b: 
 12
 Enter c: 
 12
 The only solution is: -2.0
 
  ----jGRASP: operation complete.
  */