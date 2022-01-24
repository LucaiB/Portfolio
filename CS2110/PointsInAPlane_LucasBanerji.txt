import java.util.Scanner;
public class PointsInAPlane {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("What value do you want for x?");
			double x = keyboard.nextDouble();
			System.out.println("What value do you want for y?");
			double y = keyboard.nextDouble();
			
			System.out.println("Calculating points");
			System.out.println(points(x,y));
		}
			
		
		
		
	}
	public static double points(double x, double y) {
		if(x>=0 && y>=0)
			return x*y;
		else if(x<0 && y<0)
			return x/y;
		else
			return x+y;
	}
}

/********* Output
 * What value do you want for x?
5
What value do you want for y?
6
Calculating points
30.0
What value do you want for x?
2
What value do you want for y?
0
Calculating points
0.0
What value do you want for x?
0
What value do you want for y?
0
Calculating points
0.0
What value do you want for x?
-2
What value do you want for y?
-2
Calculating points
1.0
What value do you want for x?
-5
What value do you want for y?
10
Calculating points
5.0
What value do you want for x?
-8
What value do you want for y?
0
Calculating points
-8.0
What value do you want for x?
7
What value do you want for y?
-3
Calculating points
4.0
What value do you want for x?
-5
What value do you want for y?
-5
Calculating points
1.0
What value do you want for x?
-5
What value do you want for y?
-10
Calculating points
0.5
What value do you want for x?
4
What value do you want for y?
4
Calculating points
16.0
*/
