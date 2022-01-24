/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  9/8/18 

PURPOSE: To create a polynomial that is represented as an array of type
double.

WHAT I LEARNED: I reviewed many of the topics that were rusty from the 
summer break. It was a very helpful and interesting lab. I had to find 
creative ways to fill the array when given different parameters through 
a constructor.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
public class Pd5LucasBanerjiArrayBasePoly implements Pd5LucasBanerjiPolynomial
{
   private double [] polyArray;
   
   public Pd5LucasBanerjiArrayBasePoly (double [] array)
   {
      polyArray = array;
   }
   
   public Pd5LucasBanerjiArrayBasePoly (Pd5LucasBanerjiPolynomial copy)
   {
      polyArray = new double [copy.getDegree()+1];
      for(int i = 0; i <= copy.getDegree(); i++)
      {
         polyArray[i] = copy.getCoeff(i);
      }
   }
   
   public Pd5LucasBanerjiArrayBasePoly(double coeff, int exp)
   {
      polyArray = new double[exp+1];
      for(int i = 0; i <= exp; i++)
      {
         if(i != exp){
            polyArray[i] = 0;
         }else{
            polyArray[i] = coeff;
         }
      }     
   }
   
   public int getDegree()
   {
      return polyArray.length-1;
   }
   
   public double getCoeff(int exp)
   {
      return polyArray[exp];
   }
   
   public double evaluate(int xValue)
   {
      double result = 0;
      for (int i = polyArray.length-1; i>=0; i--)
      {
         result += polyArray[i]*Math.pow(xValue,i);
      }
      return result;
   }
   public Pd5LucasBanerjiPolynomial sum(Pd5LucasBanerjiPolynomial other)
   {
      double [] sumArray = new double[Math.max(this.getDegree(),other.getDegree()) + 1];
      
      int indexThis = this.getDegree();
      int indexOther = other.getDegree();
      
      while(indexThis > indexOther)
      {
         sumArray[indexThis] += this.getCoeff(indexThis);
         indexThis--;
      }
      
      while(indexThis < indexOther)
      {
         sumArray[indexOther] += other.getCoeff(indexThis);
         indexOther--;
      }
      
      for(int i = indexThis; i >=0; i--)
      {
         sumArray[i] += this.getCoeff(i) + other.getCoeff(i);
      }  
      
      Pd5LucasBanerjiPolynomial sumPoly = new Pd5LucasBanerjiArrayBasePoly(sumArray);
      return sumPoly;
   }
   
   public Pd5LucasBanerjiPolynomial difference(Pd5LucasBanerjiPolynomial other)
   {
      double [] diffArray = new double[Math.max(this.getDegree(),other.getDegree())+1];
      
      int indexThis = this.getDegree();
      int indexOther = other.getDegree();
      
      while(indexThis > indexOther)
      {
         diffArray[indexThis] += this.getCoeff(indexThis);
         indexThis--;
      }
      
      while(indexThis < indexOther)
      {
         diffArray[indexOther] -= other.getCoeff(indexThis);
         indexOther--;
      }
      
      for(int i = indexThis; i >=0; i--)
      {
         diffArray[i] += this.getCoeff(i) - other.getCoeff(i);
      }  
      
      Pd5LucasBanerjiPolynomial diffPoly = new Pd5LucasBanerjiArrayBasePoly(diffArray);
      return diffPoly;
   }
   
   public Pd5LucasBanerjiPolynomial derivative()
   {
      double[] derivArray = new double [polyArray.length-1];
      for (int i = 1; i <= derivArray.length; i++)
      {
         if(i == 1)
         {
            derivArray[i-1] = polyArray[i];
         }else{
            derivArray[i-1] = i*polyArray[i];
         }
      }
   
      Pd5LucasBanerjiPolynomial derivPoly = new Pd5LucasBanerjiArrayBasePoly(derivArray);
      return derivPoly;
   }
   
   public String toString()
   {
      String result = "";
      for(int i = polyArray.length - 1; i >= 0; i--)
      {
         if(polyArray[i] == 0)
         { 
         }  
         else if(i == polyArray.length-1){
             result += polyArray[i] + "x^" + i;
         }else if(i == 0){
            result += " + " + polyArray[i] + "";
         }else if(i == 1){
            result += " + " + polyArray[i] + "x";
         }else{      
            result +=" + " + polyArray[i] + "x^" + i;
         }
      }
      return result;
   }
}
/*     Output using driver
  ----jGRASP exec: java ArrayBasedPolyDriver
 p1(x) =     4.0x^3 + 3.0x^2 + 1.0
 p2(x) =     -5.0x^1 + -2.0
 p3(x) =     -4.0x^1
 p(x) =     4.0x^3 + 3.0x^2 + -10.0x + -3.0
 p4(x) =     4.0x^3 + 3.0x^2 + -6.0x + -3.0
 p5(x) =     12.0x^2 + 6.0x + -6.0
 clone(x) =     12.0x^2 + 6.0x + -6.0
 p5(0) = -6.0
 p5(1) = 12.0
 
  ----jGRASP: operation complete.
  */