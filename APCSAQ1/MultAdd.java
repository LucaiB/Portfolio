/************************************************************************
Lucas Banerji
Pd.2
Lab 6c: MultAdd
Due 9/19/17
I learned how to use methods in order to reduce redundncy as well as
making the code easier to read.I also learned how to use different 
syntax in order to write out math expressions.
*************************************************************************/

public class MultAdd
{
   public static void main (String [] args)
   {
   
      System.out.println(multAdd (1., 2., 3.));
      
      double cs = Math.cos(Math.toRadians(45.0));
      double t = 0.5;
      double s = Math.sin(45.0*Math.PI/180.0);
      System.out.println(multAdd (cs, t, s));
      
      double w = Math.log10(10);
      double i = Math.log10(20);
      System.out.println(multAdd (w, 1.0, i));
   
      System.out.println(yikes (0));
      System.out.println(yikes (1));
   } 

   public static double multAdd(double a, double b, double c)
   {
      double result = a*b+c;
      return result;
   }

   public static double yikes (double n)
   {
      double e = Math.exp(-n);
      double q = Math.sqrt(1 - e);
      return multAdd(n,e,q);         
   }
}
/* Output
  ----jGRASP exec: java MultAdd
 5.0
 1.0606601717798212
 2.3010299956639813
 0.0
 1.1629395387920924
 
  ----jGRASP: operation complete.
  */