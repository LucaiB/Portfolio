import java.util.Scanner;     //tell the compiler where to find the definition of the Scanner class
public class ProgramOne
{
   public static void main(String[]args)
   {
      Scanner keyBoardInput=new Scanner(System.in); //must have this line if you want to receive input
                                              //from the user
      System.out.print("Enter a value for x:");
      double x;                                        //declare integer variable x
      x=keyBoardInput.nextDouble();                    //Assign the user input to the variable x
      System.out.println("The square of x is:" +(x*x));   /*the '+' sign here is an operator used 
   to combine the string "t=The square of x is:" and a number*/
   } //end of main
} //end of ProgramOne