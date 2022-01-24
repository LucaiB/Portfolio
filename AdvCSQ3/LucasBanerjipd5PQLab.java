/*****************************************************************************************************************
NAME: Lucas Banerji
PERIOD: 5
DUE DATE: 2/20/19

PURPOSE:To implement a Priority Queue using a data structure other than a heap

WHAT I LEARNED:Through this lab, I learned how to apply my skills of arraylists and my current knowledge of
priority queues to implement a PQ

HOW I FEEL ABOUT THIS LAB: This lab was quite easy for me, because I already I have a good amount of knowledge on 
arraylists so implementing a PQ was very easy.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): none...

****************************************************************************************************************/
import java.util.*;

public class LucasBanerjipd5PQLab<E extends Comparable<E>>
{
   private ArrayList<E> a;

   public LucasBanerjipd5PQLab()
   {
      a = new ArrayList<E>();
   }

   public boolean add(E obj)
   {
      return a.add(obj);
   }

   public E remove()
   {
      String s = "Nothing to remove";
      if(a.size() == 0)
         return (E)s;
      int min = 0;
      for(int i = 1; i < a.size(); i++)
      {
         if(a.get(min).compareTo(a.get(i)) > 0)
            min = i;
      }
      return a.remove(min);
   }
   
   public void print()
   {
      for(int i = 0; i<a.size(); i++)
         System.out.print(a.get(i) + " ");
      System.out.println();
   }
   
   public E peek()
   {
      String s = "Queue is empty";
      if(a.size() == 0)
         return (E)s;

      int min = 0;
      for(int i = 1; i < a.size(); i++)
      {
         if(a.get(min).compareTo(a.get(i)) > 0)
            min = i;
      }
      return a.get(min); 
   }
   
   public boolean isEmpty()
   {
      return a.size() == 0;
   }
   
   public static void main (String [] args)
   {
      LucasBanerjipd5PQLab arrayListPQ = new LucasBanerjipd5PQLab<Integer>();
      System.out.println("Is empty: " + arrayListPQ.isEmpty());
      
      arrayListPQ.add(3);
      arrayListPQ.add(1);
      arrayListPQ.add(10);
      arrayListPQ.add(5);
      arrayListPQ.add(7);
      arrayListPQ.add(2);
      
      System.out.print("The queue contains: ");
      arrayListPQ.print();
      
      System.out.println("Peek: " + arrayListPQ.peek());
      System.out.println("Remove: " + arrayListPQ.remove());
      System.out.println("Peek: " + arrayListPQ.peek());
      System.out.println("Remove: " + arrayListPQ.remove());
      
      System.out.print("The queue contains: ");
      arrayListPQ.print();
      
      System.out.println("Remove: " + arrayListPQ.remove());
      System.out.println("Remove: " + arrayListPQ.remove());
      System.out.println("Peek: " + arrayListPQ.peek());
      System.out.println("Remove: " + arrayListPQ.remove());
      
      System.out.print("The queue contains: ");
      arrayListPQ.print();
      
      System.out.println("Remove: " + arrayListPQ.remove());
      System.out.println("Remove: " + arrayListPQ.remove());
      System.out.println("Peek: " + arrayListPQ.peek());
      
      System.out.println("Is empty: " + arrayListPQ.isEmpty());
      
      System.out.print("The queue contains: ");
      arrayListPQ.print();
   }
}
//Output
/*      ----jGRASP exec: java LucasBanerjiPQLab
 Is empty: true
 The queue contains: 3 1 10 5 7 2 
 Peek: 1
 Remove: 1
 Peek: 2
 Remove: 2
 The queue contains: 3 10 5 7 
 Remove: 3
 Remove: 5
 Peek: 7
 Remove: 7
 The queue contains: 10 
 Remove: 10
 Remove: Nothing to remove
 Peek: Queue is empty
 Is empty: true
 The queue contains: 
 
  ----jGRASP: operation complete.
  */