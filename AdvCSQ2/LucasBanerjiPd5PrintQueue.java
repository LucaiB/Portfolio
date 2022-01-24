/*****************************************************************************************************************
NAME: Lucas Banerji
PERIOD: 5
DUE DATE: 12/21/18
ASSIGNMENT: PrintQueue Lab

PURPOSE: To learn how to use a queue to display and modify elements represented by a linked list.

LEARNED: I learned the logic and applications behind the queue structure. Although it is different than a stack
the logic is very similar. 
            
CREDITS: none...

****************************************************************************************************************/
import java.io.*;
import java.util.*;

public class LucasBanerjiPd5PrintQueue
{
   private static Scanner in;
   private static Queue<String> q;
   private static int jobNumber = 100;
   
   public static void main(String[] args) throws Exception
   {
      q = new LinkedList<String>();
      in = new Scanner(System.in);
      String prompt = "Add, Print, Delete, eXit:  ";
      System.out.print(prompt);
      String str = in.next();
      while(!str.equals("X"))
      {
         if(str.equals("A"))
            add();
         else if(str.equals("P"))
            printJob();  
         else if(str.equals("D"))
            delete();
         else
            System.out.println("   invalid command");
         printQueue();
         System.out.print(prompt);
         str = in.next();
      }
      in.close();
   }
   
   public static void add()
   {
      q.add(jobNumber + "");
      jobNumber++;
   }
   public static void printJob()
   {
      System.out.println(q.peek());
   }
			
   public static void delete()
   {
      Scanner console = new Scanner(System.in);
      Queue<String> newQ = new LinkedList<String>();      
      Queue<String> jobs = new LinkedList<String>();
      System.out.println("What job do you want to remove?");
      String delete = console.next();
      int count = 0;
      while(!q.isEmpty())
      {
         if(!q.peek().equals(delete))
            newQ.add(q.remove());    
         else
            jobs.add(q.remove());       
      }
      
      if(jobs.isEmpty())
         System.out.println("Error---job does not exist");
      q = newQ;
   }
   public static void printQueue()
   {
      System.out.println(q);
   }
}

/*  Output
  ----jGRASP exec: java LucasBanerjiPd5PrintQueue
 Add, Print, Delete, eXit:  A
 [100]
 Add, Print, Delete, eXit:  A
 [100, 101]
 Add, Print, Delete, eXit:  A
 [100, 101, 102]
 Add, Print, Delete, eXit:  P
 100
 [100, 101, 102]
 Add, Print, Delete, eXit:  A
 [100, 101, 102, 103]
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 105
 Error---job does not exist
 [100, 101, 102, 103]
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 102
 [100, 101, 103]
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 103
 [100, 101]
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 101
 [100]
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 100
 []
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 100
 Error---job does not exist
 []
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 200
 Error---job does not exist
 []
 Add, Print, Delete, eXit:  A
 [104]
 Add, Print, Delete, eXit:  D
 What job do you want to remove?
 104
 []
 Add, Print, Delete, eXit:  P
 null
 []
 Add, Print, Delete, eXit:  X
 
  ----jGRASP: operation complete.
*/