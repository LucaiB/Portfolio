//Name: Lucas Banerji  
//Date: 2/25/18
// What I learned: I learned how to implement a priority queue through a heap represented by an array
// How I feel about this lab: This lab took a long time for me. I had to brainstorm with Mitchell and Mahi for a while during class to figure out how to 
//solve the reheap up and reheapdown methods. I had to figure out and push through many errors to finally come up with a solution

// I am wondering (the what-if moment): If the heap were represented by a more efficient structure, such as a linkedlist or even a BT, how it would effect the PQ
// Credits:  Mitchell and I worked together during class, Mahi and I created the reheapdown method with a helper method to solve the problems we were running into
import java.util.*;
public class LucasBanerjipd5HeapPQ <E extends Comparable>
{
   private static final int DEFAULT_CAPACITY = 1024;
   private Comparable items[];  // use a 1-D array instead of ArrayList
   protected int numItems;  // number of elements in items

  
   public LucasBanerjipd5HeapPQ()
   {
      items = new Comparable [DEFAULT_CAPACITY];
   }
   
   public LucasBanerjipd5HeapPQ (int initialCapacity)
   {
      items = new Comparable [initialCapacity];
   }
   
   public boolean isEmpty()
   {
      return numItems == 0;
   }
   
   public E peek()
   {
      if(items[1] == null)
         return null;
      return (E) items [1];
   }
   
   public E remove()
   {
      if(items[1]  == null)
         return null;   
      E temp = (E) items [1];
      items[1] = items[numItems];
      items[numItems] = null;
      numItems--;
      reheapDown();
      return temp;
   }
   
   public boolean add(E obj)
   {
      if(numItems == items.length-1)
         doubleCapacity();
      items[++numItems] = obj;
      reheapUp();
      
      return true;
   }
   /*
   private void reheapDown()
   {
      int index = 1;
      while(index*2+1 <= numItems)  //make sure "treenode" has two children
      {
         while(items[index].compareTo(items[index*2]) < 0 || items[index].compareTo(items[index*2+1]) < 0)  //check if it is in right place
         {
            if(items[index*2].compareTo(items[index*2+1]) > 0)  //find bigger child
            {
               E temp = (E)items[index];                         //swap
               items[index] = items[index*2];
               items[index*2] = temp;
               index *= 2;
            }
            else
            {
               E temp = (E)items[index];
               items[index] = items[index*2+1];
               items[index*2+1] = temp;
               index = index*2+1;
            }
         }
      }
      
      if(index*2 == numItems)                            //if only one child
      {
         if(items[index].compareTo(items[index*2]) < 0)
         {
            E temp = (E)items[index];                         
            items[index] = items[index*2];
            items[index*2] = temp;
            index *= 2;
         }
      } 
   }
   */
    private void reheapDown()
    {
        int space = 1;        //starting index
        Comparable item = items[space];
        int newSpace = newSpace(space, item); //finds the index to swap 
        while(newSpace != space)
        {
            items[space] = items[newSpace]; //swap
            space = newSpace;
            newSpace = newSpace(space, item);
        }
        items[space] = item;

    }

    private int newSpace(int space, Comparable item)
    {
        int leftChild = space*2 + 1;
        int rightChild = space*2 + 2;
        if(leftChild > numItems) //has no children
            return space;
        else if (leftChild == numItems) //only has a left child
        {
            if (item.compareTo(items[leftChild]) < 0) //parent is smaller
                return leftChild;
            else
                return space;
        }
        else
        {
            if(items[leftChild].compareTo(items[rightChild]) < 0) //right child is bigger
            {
                if(items[rightChild].compareTo(item) <= 0) //item is >= right child
                    return space;
                else
                    return rightChild;
            }
            else
            {
                if(items[leftChild].compareTo(item) <= 0) //item is >= left child
                    return space;
                else
                    return leftChild;
            }
        }
    }

   
   private void reheapUp()
   {
      int index = numItems;
      Comparable temp;
      while(index != 1 && items[index].compareTo(items[index/2]) > 0)  //if parent is smaller
      {
         temp = items[index];
         items[index] = items[index/2];                                //swap
         items[index/2] = temp;
         index = index/2;
      }    
   }
   
   private void doubleCapacity()
   {
      Comparable [] newHeap = new Comparable[items.length*2];
      
      for(int i = 1; i < items.length; i++)
         newHeap[i] = items[i];
         
      items = newHeap;         
   }
   
   public void display()
   {
      for(int i = 1; i < items.length; i++)
      {
         if(items[i] == null)
         {
            System.out.println();
            return;
         }
         System.out.print(items[i] + " ");
      }
      System.out.println();
   }
   
   public static void main (String [] args)
   {
      LucasBanerjipd5HeapPQ heapPQ = new LucasBanerjipd5HeapPQ <Integer> (4);
      
        System.out.println("Empty: " + heapPQ.isEmpty()); 
        System.out.println("Peek: " + heapPQ.peek());
        heapPQ.add(1);
        heapPQ.display();
        heapPQ.add(2);
        heapPQ.add(3);
        heapPQ.display();
        System.out.println("removed: " + heapPQ.remove());
        heapPQ.display();

        heapPQ.add(99);
        heapPQ.add(67);  //resizes heap with doubleCapacity()
        heapPQ.add(12);
        heapPQ.add(100);
        heapPQ.display();
        System.out.println("removed: " + heapPQ.remove());
        heapPQ.display();
        
        System.out.println("Empty: " + heapPQ.isEmpty()); 
        System.out.println("Peek: " + heapPQ.peek());
   }    
}  //LucasBanerjipd5HeapPQ


/*  Output
  ----jGRASP exec: java LucasBanerjipd5HeapPQ
 Empty: true
 Peek: null
 1 
 3 1 2 
 removed: 3
 2 1 
 100 67 99 1 12 2 
 removed: 100
 99 67 2 1 12 
 Empty: false
 Peek: 99
 
  ----jGRASP: operation complete.
  */