/***************************************************************************
Lucas Banerji
Pd. 2
Lab 3: Rectangles
Due on 9/7/17
Submitted on 9/7/17
I learned how to prompt the user more than one request followed by more than one answer based on the previous prompt
****************************************************************************/

import java.util.Scanner;


public class Rectangles  //class header
{
   public static void main(String[] args)  //method header
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter the width:");
      int width = console.nextInt();
      System.out.print("Enter the height:");
      int height = console.nextInt();
      int area = height*width;
      int perimeter = (2*height)+(2*width);   
      System.out.println("Area =" + area);
      System.out.println("Perimeter=" + perimeter);
   } // end of main
} // end of class

/* Output:
 Enter the width:5
 Enter the height:7
 Area = 35
 Perimeter = 24
*/