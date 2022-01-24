/**
 * Name:             Lucas Banerji                            Period: 5
 * Name of the Lab: Polynomial
 * Purpose of the Program: To create a polynomial using a map
 * Due Date: 3/29
 * Date Submitted: 3/29
 * What I learned: I learned how useful a map can be. I learned how to use it to manipulate a polynomial.
 *  
 * How I feel about this lab This lab was very interesting. I think using a map was the easiest way to represent a polynomial.
 It is very user friendly and also very easy to conceptualize.
 
 * What I wonder: I wonder if there are structures that can represent a polynomial even better
 *
 * Most Difficult Method: toString(), although it seemed easy, my polynomial kept printing in th ereverse order because of the order of TreeSet().
 I got around this by using a stack to reverse the TreeMap.
 
 * Credits: none...
 */
import java.util.*;
public class LucasBanerjipd5MapPolynomial
{
   public static void main(String[] args)
   {
      Polynomial poly = new Polynomial();
      poly.makeTerm(1, -4);
      poly.makeTerm(3, 2);
      poly.makeTerm(0, 2);
      System.out.println(poly.toString());
      double evaluateAt = 2.0;
      System.out.println("Evaluated at "+ evaluateAt +": " +poly.evaluateAt(evaluateAt));
   	   	
      Polynomial poly2 = new Polynomial();
      poly2.makeTerm(1, -5);
      poly2.makeTerm(4, 2);
      poly2.makeTerm(0, -3);
      poly2.makeTerm(2, 1); 
      System.out.println(poly2.toString());
   	
      System.out.println(poly.add(poly2));
      System.out.println(poly.multiply(poly2));
   }
}


class Polynomial
{
   private Map<Integer,Integer> map;
   protected int numTerms;
   
   public Polynomial()
   {
      map = new TreeMap<>();
      int numTerms = 0;
   }  
   
   public Polynomial(Polynomial other)
   {
      this.map = other.map;
   }
   
   public void makeTerm(int exp, int coeff)
   {
      if(map.containsKey(exp))
      {
         map.put(exp, map.get(exp) + coeff);
      }
      else   
         map.put(exp,coeff);
      
      numTerms = map.size();
   }
   
   public double evaluateAt(double xVal)
   {
      int eval = 0;
      for(Integer curr: map.keySet())
      {
         eval += Math.pow(xVal,curr)* map.get(curr);
      }
      
      return eval;
   }
   
   
   public String toString()
   {
      String polynomial = "";
      Stack<Integer> getRev = new Stack();
      
      for(Integer s: map.keySet())
      {
       getRev.push(s); 
      }
      
      while(!getRev.empty())
      {
         if(getRev.peek() == 0)
            polynomial += map.get(getRev.pop()) + "";
         else if(getRev.peek() == 1)
            polynomial += map.get(getRev.pop()) + "x";
         else
            polynomial += map.get(getRev.peek()) + "x^" + getRev.pop();
            
         if(getRev.size() != 0)
            polynomial += " + ";
      
      }
      return polynomial;
   }
   
   public Polynomial add(Polynomial other)
   {
      Polynomial sum = new Polynomial();
      
      for(Integer y: map.keySet())
      {
         if(other.map.containsKey(y))
            sum.makeTerm(y, map.get(y) + other.map.get(y));
         else 
            sum.makeTerm(y, map.get(y));
      }
      
      for(Integer z: other.map.keySet())
      {  
         if(!map.containsKey(z))
            sum.makeTerm(z, other.map.get(z));
      }
      
      return sum;
   }
   
   public Polynomial multiply(Polynomial other)
   {
      Polynomial endPoly = new Polynomial();
      
      for(Integer outer: map.keySet())
      {
         Polynomial newPoly = new Polynomial();
         for(Integer inner: other.map.keySet())
         {
            endPoly.makeTerm(inner + outer, map.get(outer)*other.map.get(inner));
         }
      }
      return endPoly;
   }  
}
/*  
expected output
   2x^3 + -4x + 2
   10.0
   2x^4 + x^2 + -5x + -3
   2x^4 + 2x^3 + x^2 + -9x + -1
   4x^7 + -6x^5 + -6x^4 + -10x^3 + 22x^2 + 2x + -6
   
   
   
   
   my Output
        ----jGRASP exec: java Polynomial_shell
 2x^3 + -4x + 2
 Evaluated at 2.0: 10.0
 2x^4 + 1x^2 + -5x + -3
 2x^4 + 2x^3 + 1x^2 + -9x + -1
 4x^7 + -6x^5 + -6x^4 + -10x^3 + 22x^2 + 2x + -6
 
  ----jGRASP: operation complete.
 */