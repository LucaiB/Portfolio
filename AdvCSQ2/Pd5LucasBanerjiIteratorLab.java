/*****************************************************************************************************************
NAME: Lucas Banerji
PERIOD: 5
DUE DATE: 12/7/18
ASSIGNMENT: Iterator Lab

PURPOSE: To learn how to use iterator and for-each loop to complete certain tasks

LEARNED: I learned when it is appropriate to use a for-each loop/iterator. I learned that you cannot modify the 
contents of a list when the iterator is active or else a ConcurrentModifierException will be thrown. Because of 
this, when you want to change a list, a new one must be created. 
            
CREDITS: none...

****************************************************************************************************************/

 // NOTE:  use for-each loops or iterators, not regular for-loops
import java.io.*;
import java.util.*;
public class Pd5LucasBanerjiIteratorLab
{
   public static void main(String[] args)
   {
      System.out.println("Iterator Lab\n");
      int[] rawNumbers = {-9, 4, 2, 5, -10, 6, -4, 24, 20, -28};
      for(int n : rawNumbers )
         System.out.print(n + " ");
      System.out.println();    
      ArrayList<Integer> numbers = createNumbers(rawNumbers);
      System.out.println("ArrayList: "+ numbers);      //Implicit Iterator!
      System.out.println("Count negative numbers: " + countNeg(numbers));
      System.out.println("Average: " + average(numbers));
      numbers = replaceNeg(numbers);
      System.out.println("Replace negative numbers: " + numbers);
      numbers = deleteZero(numbers);
      System.out.println("Delete zeros: " + numbers);
      String[] rawMovies = {"High_Noon", "High_Noon", "Star_Wars", "Tron", "Mary_Poppins", 
               "Dr_No", "Dr_No", "Mary_Poppins", "High_Noon", "Tron"};
      ArrayList<String> movies = createMovies(rawMovies);
      System.out.println("Movies: " + movies);
      System.out.println("Movies: " +  removeDupes(movies));
   }
      // pre: an array of just int values 
   	// post: return an ArrayList containing all the values
   public static ArrayList<Integer> createNumbers(int[] rawNumbers) 
   {
      ArrayList<Integer> copy = new ArrayList<Integer>(rawNumbers.length);
      for (Integer x: rawNumbers)
         copy.add(x);
      return copy;
   }
      // pre: an array of just Strings  
   	// post: return an ArrayList containing all the Strings
   public static ArrayList<String> createMovies(String[] rawWords) 
   {
      ArrayList<String> copy = new ArrayList<String>(rawWords.length);
      for (String x: rawWords)
         copy.add(x);
      return copy;    
   }
   
   	// pre: ArrayList a is not empty and contains only Integer objects
   	// post: return the number of negative values in the ArrayList a
   public static int countNeg(ArrayList<Integer> a)
   {
      int count = 0;
      for(Integer x: a)
      {
         if(x < 0)
            count++;
      }
      return count;
   }
   	// pre: ArrayList a is not empty and contains only Integer objects
   	// post: return the average of all values in the ArrayList a
   public static double average(ArrayList<Integer> a)
   {
      double total = 0;
      double count = 0;
      for(Integer x: a)
      {
         count++;
         total += x;
      }
      return total/count;
   }
     	// pre: ArrayList a is not empty and contains only Integer objects
   	// post: replaces all negative values with 0 
   public static ArrayList<Integer> replaceNeg(ArrayList<Integer> a)
   {
      ArrayList<Integer> x = new ArrayList<Integer>(a.size());
      for(Integer y: a)
      {
         if(y < 0)
            x.add(0);
         else
            x.add(y);
      }
      
      return x;
   }
     	// pre: ArrayList a is not empty and contains only Integer objects
   	// post: deletes all zeros in the ArrayList a
   public static ArrayList<Integer> deleteZero(ArrayList<Integer> a)
   {
      ArrayList<Integer> x = new ArrayList<Integer>();
      for(Integer y: a)
      {
         if(y != 0)
            x.add(y);
      }
      return x;       
   }
      // pre: ArrayList a is not empty and contains only String objects
   	// post: return ArrayList without duplicate movie titles
		// strategy: start with an empty array and add movies as needed
   public static ArrayList<String> removeDupes(ArrayList<String> a)
   {
      ArrayList<String> newList = new ArrayList<String>();
      for (String s: a)
      {
         if(!newList.contains(s))
            newList.add(s);
      }  
      return newList;        
   }
}
/*  Output
  ----jGRASP exec: java IteratorLab_shell
 Iterator Lab
 
 -9 4 2 5 -10 6 -4 24 20 -28 
 ArrayList: [-9, 4, 2, 5, -10, 6, -4, 24, 20, -28]
 Count negative numbers: 4
 Average: 1.0
 Replace negative numbers: [0, 4, 2, 5, 0, 6, 0, 24, 20, 0]
 Delete zeros: [-9, 4, 2, 5, -10, 6, -4, 24, 20, -28]
 Movies: [High_Noon, High_Noon, Star_Wars, Tron, Mary_Poppins, Dr_No, Dr_No, Mary_Poppins, High_Noon, Tron]
 Movies: [High_Noon, Star_Wars, Tron, Mary_Poppins, Dr_No]
 
  ----jGRASP: operation complete.
*/