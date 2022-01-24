// CS 2110 lab activity starter code. 

import java.util.Scanner; // import statement for Scanner

// Class: OneDArrayActivity
public class OneDArrayActivity {
	
	// Note: this file has a lot of comments to help you understand the code.

	// The "main" method 
	public static void main(String[] args) {
		
		// Setting up a Scanner to read user input from the keyboard 
		Scanner keyboard = new Scanner(System.in);
		// Prompting the user for the size of the array
		System.out.println("How many values do you want in the array?");
		// Reading the number entered in at the keyboard
		int x = keyboard.nextInt();
		
		// Create an int array called "values" of size 'x' (same as number entered 
		int[] values = new int[x];
		
		// for-loop that starts at the beginning of the array and allows you to 
		// input array values one by one. 
		for(int i = 0; i < x; i++){
			System.out.println("Enter the " + i + " value in the array");
			// read the number entered and store it in the ith position in the array (values) 
			values[i] = keyboard.nextInt(); 
		}
		
		
		// for-loop that prints out the contents of the "values" array
		for(int j = 0; j < values.length; j++){
			System.out.print(values[j] + " ");
		}
		
		// YOUR SOLUTION TO THIS IN-CLASS ACTIVITY GOES HERE. NO NEED TO CHANGE ANYTHING ABOVE.
		//Input your code here: 
		boolean flag = true;
		for(int y = 0; y < values.length - 1; y++)
		{
			if(values[y] >= values[y+1])
				flag = false;
		}
		
		if(flag)
			System.out.println("The array is increasing");
		else
			System.out.println("The array is not increasing");
	

	
	
        // It's important to remember to close the Scanner using the close() method	
		// (No need to change this at all, keep this as the last line of your code)
		keyboard.close();
	
	} // END main

} // END Class 

/*  Output (Two cases)
How many values do you want in the array?
5
Enter the 0 value in the array4
1
Enter the 1 value in the array4
5
Enter the 2 value in the array4
7
Enter the 3 value in the array4
68
Enter the 4 value in the array4
69
1 5 7 68 69 The array is increasing

*******************************************
How many values do you want in the array?
5
Enter the 0 value in the array4
45
Enter the 1 value in the array4
67
Enter the 2 value in the array4
57
Enter the 3 value in the array4
100
Enter the 4 value in the array4
200
45 67 57 100 200 The array is not increasing
*/