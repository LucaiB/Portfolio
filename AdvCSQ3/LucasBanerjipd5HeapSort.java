//Name:Lucas Banerji
//Date:3/4/19
// What I learned: I leanred how to create and then sort a heap from a randomly generated array
// How I feel about this lab:  This lab took me a while to complete, after completing it, however, I feel as though I really understand heap sort.
// Credits: I helped akshath with his heapdown method 
import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class LucasBanerjipd5HeapSort
{
   public static final int SIZE = 9;
	
   public static void main(String[] args)
   {
   //Part 1: Given a heap, sort it. Do this part first.   
      //double heap[] = {-1,99,80,85,17,30,84,2,16,1};
     // display(heap);
     // sort(heap);
     // display(heap);
      
   //Part 2:  Generate 100 random numbers, make a heap, sort it.
      double[] heap = new double[SIZE + 1];
      createRandom(heap);
      display(heap);
      makeHeap(heap, SIZE);
      display(heap); 
      sort(heap);
      display(heap);
   }
   
	//******* Part 1 ******************************************
   public static void display(double[] array)
   {
      for(int k = 1; k < array.length; k++)
         System.out.print(array[k] + "    ");
      System.out.println("\n");	
   }
   public static void sort(double[] array)
   {
      for(int i = array.length - 1; i > 0; i--)
      {
         swap(array, 1, i);
         heapDown(array,i);
      }   
   }
   public static void swap(double[] array, int a, int b)
   {
      double temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
   public static void heapDown(double[] array, int size)
   {
   
      for(int x = 1; x < size; x++)
      {
         int left = x*2;
         int right = x*2+1;
         int max = x;
      
         if(left < size && array[left]> array[x]) //sets max index
         {
            if(right < size &&  array[right] > array[left])              
               max = right;
            else
               max =left;         
         }
         else if(right < size && array[right] > array[x] )
            max = right;
         if(max != x)
            swap(array, x, max);  // swap once positioned
      }
   }
   
   // ****** Part 2 *******************************************
   public static void makeHeap(double[] array, int size)
   {
      for(int  x = array.length-1 /2; x > 0; x--)
         heapDown(array, x);
   }
   //Generate 10 random numbers (between 1 and 100, formatted to 2 decimal places) 
   public static void createRandom(double[] array)
   {  
      NumberFormat formatter = new DecimalFormat("#0.00");
      for(int i = 1; i <= SIZE; i++)
      {
         double random = (Math.random() * 100 + 1);
         array[i] = Double.parseDouble(formatter.format(random));
      }
   }
}

/* output

 
  ----jGRASP exec: java HeapSort_shell
 54.75    64.01    20.15    4.95    47.25    92.31    55.53    42.42    19.32    
 
 92.31    54.75    64.01    42.42    47.25    20.15    55.53    4.95    19.32    
 
 4.95    19.32    20.15    42.42    47.25    54.75    55.53    64.01    92.31    
 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java LucasBanerjipd5HeapSort
 57.68    62.21    8.74    76.62    69.33    47.37    32.34    41.26    94.61    
 
 94.61    76.62    47.37    62.21    69.33    8.74    32.34    41.26    57.68    
 
 8.74    32.34    41.26    47.37    57.68    62.21    69.33    76.62    94.61    
 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java LucasBanerjipd5HeapSort
 67.2    52.01    93.88    2.71    12.25    85.81    50.43    69.11    2.11    
 
 93.88    69.11    85.81    52.01    12.25    67.2    50.43    2.71    2.11    
 
 2.11    2.71    12.25    50.43    52.01    67.2    69.11    85.81    93.88    
 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java LucasBanerjipd5HeapSort
 52.94    14.37    79.8    75.52    52.03    59.02    60.64    42.42    56.82    
 
 79.8    75.52    60.64    56.82    52.03    59.02    52.94    42.42    14.37    
 
 14.37    42.42    52.03    52.94    56.82    59.02    60.64    75.52    79.8    
 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java LucasBanerjipd5HeapSort
 30.82    71.32    74.84    13.73    27.25    46.34    51.15    18.79    14.45    
 
 74.84    71.32    51.15    18.79    27.25    46.34    30.82    13.73    14.45    
 
 13.73    14.45    18.79    27.25    30.82    46.34    51.15    71.32    74.84    
 
 
  ----jGRASP: operation complete.
*/

