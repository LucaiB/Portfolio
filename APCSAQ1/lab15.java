/**************************************************************************************
Name: Lucas Banerji
Period: 2
Lab 15: Perfect and amicable numbers
Due: 10/23/17
I leanred how to use boolean methods as well as int methods to find perfect and 
amicable numbers. I found it to be an easy lab as I have had a lot of pracitce 
with writing methods.
**************************************************************************************/
import java.util.Scanner;
public class lab15
{
   int value;
   int sum;
   int i;
   public static void main( String[]args)
   {
      Scanner console=new Scanner(System.in);
      System.out.println("Enter an integer greater than 1: ");
      int x = console.nextInt();
      System.out.println ("The aliquot sum of "+x+" is "+aliquotSum(x));
   }
   public static int aliquotSum (int n)
   {
      int sum=0;
      for(int m=1;m<n;m++)
         if (n%m==0)
            sum+=m;
      return sum;
   }
   public static boolean isPerfect(int n)
   {
      return n==aliquotSum(n);
   }
   public static boolean printAmicablePairs(int x)
   {
      int aliquotX=aliquotSum(x);
      return x!=aliquotX&&x==aliquotSum(aliquotX);
   }
}
/*  Output
  ----jGRASP exec: java lab15
 Enter an integer greater than 1: 
 28
 The aliquot sum of 28 is 28
 
  ----jGRASP: operation complete.
  
      Enter an integer greater than 1: 
 4
 The aliquot sum of 4 is 3
 
  ----jGRASP: operation complete.
  */