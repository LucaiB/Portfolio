/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  9/8/18 

PURPOSE: To create a RationalNum class that creates a rational number that 
can be added and multiplied to other rational numbers. 

WHAT I LEARNED: I reviewed many of the topics that were rusty from the 
summer break. It was a very helpful and interesting lab. The greatest common
denominator method was very hard for me to figure out but, with some research,
I was able to create a very efficient recursive method to find the GCD.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
public class Pd5LucasBanerjiRationalNum
{
   protected int num, den;
   public Pd5LucasBanerjiRationalNum(int number, int denom)
   {
      num = number;
      den = denom;
      simplify();
   }
   
   public Pd5LucasBanerjiRationalNum(Pd5LucasBanerjiRationalNum copy)
   {
      num = copy.getNum();
      den = copy.getDen();
      simplify();
   }
   public void setNum(int numerator)
   {
      num = numerator;
   }
   public void setDen(int denominator)
   {
      den = denominator;
      if(den == 0)
         System.out.println("Cannot set denominator to 0");
   }  
   public int getNum()
   {
      return num;
   }
   public int getDen()
   {
      return den;
   }
   private static int findGCD(int number1, int number2) 
   {
      if(number1 < number2)
         return findGCD(number2,number1);  
      if(number2 == 0){
         return number1;
      }
      return findGCD(number2, number1%number2);
   }
   
   private void simplify()
   {
      int common = 0;
      if (num != 0)
         common = findGCD(Math.abs(num), den);
      num = num/common;
      den = den/common;   
   }
   
   public Pd5LucasBanerjiRationalNum add(Pd5LucasBanerjiRationalNum other)
   {
      int commondenom = den * other.getDen();
      int numer1 = num * other.getDen();
      int numer2 = other.getNum() * den;
      int sum = numer1 + numer2;
      return new Pd5LucasBanerjiRationalNum(sum, commondenom);
   }
   
   public Pd5LucasBanerjiRationalNum subtract(Pd5LucasBanerjiRationalNum other)
   {
      int commondenom = den * other.getDen();
      int numer1 = num * other.getDen();
      int numer2 = other.getNum() * den;
      int difference = numer1 - numer2;
      return new Pd5LucasBanerjiRationalNum(difference, commondenom);
   }
   
   public Pd5LucasBanerjiRationalNum multiply(Pd5LucasBanerjiRationalNum other)
   {
      int resultnumer = num * other.getNum();
      int resultdenom = den * other.getDen();
      return new Pd5LucasBanerjiRationalNum (resultnumer, resultdenom);
   }
   
   public Pd5LucasBanerjiRationalNum divide(Pd5LucasBanerjiRationalNum other)
   {
      int resultnumer = num * other.getDen();
      int resultdenom = den * other.getNum();
      return new Pd5LucasBanerjiRationalNum (resultnumer, resultdenom);
   }
   
   public boolean equals(Pd5LucasBanerjiRationalNum other)
   {
      return 1.0*num/den == 1.0*other.getNum()/other.getDen();
   }
   
   public String toString()
   {
      return num + "/" + den;
   }
}


/*    Output with RationalNumDriver.java
 ----jGRASP exec: java RationalNumDriver
 r1 = 13/9
 Cannot set denominator to 0
 r2 = 7/0
 
 r2 = 7/14
 
 r1 + r2: 35/18
 r1 - r2: 17/18
 r1 * r2: 13/18
 r1 / r2: 26/9
 r1 equals r2: false
 
  ----jGRASP: operation complete.
*/