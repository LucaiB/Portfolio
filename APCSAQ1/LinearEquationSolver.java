import java.util.Scanner;  //tell the compiler where to find the definition of the scanner class
public class LinearEquationSolver
{
   public static void main (String[]args)
   {
      Scanner input=new Scanner(System.in);  //must have this line if you want to receive input from the user
   
      System.out.print("Enter the coefficients of the linear equation:"); //enter the slope, m, and the y-intercept
      double m, b;  //declaring two variables
   
      m=input.nextDouble();  //enter two real numbers seperated by a space on the same line
      b=input.nextDouble();
   
      System.out.println("The solution(s) of the equation:" + (-1.0*b/m));
   }
}