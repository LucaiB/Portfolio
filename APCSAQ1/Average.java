/*
Lucas Banerji
Pd. 2
9/7/17
I learned how to calculate average and how to cast to make sure I can get decimals when finding the average.
*/
import java.util.Scanner;

public class Average
{
   public static void main (String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println ("Enter three values:");
      int x= console.nextInt();
      int y= console.nextInt();
      int z= console.nextInt();
      System.out.println("The average of the three values is: " + (double)(x+y+z)/3);
   }
}
/*
Enter three values:
 3
 4
 5
 The average of the three values is: 4.0
*/