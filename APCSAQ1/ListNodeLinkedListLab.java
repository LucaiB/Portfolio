/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  9/22/18 

PURPOSE:
WHAT I LEARNED:             
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import java.util.NoSuchElementException;
import java.util.Scanner;
public class ListNodeLinkedListLab {
   private static class ListNode <E> 
   {    
      private E value;    
      private ListNode <E>  next; 
      public ListNode  (E  initValue, ListNode <E> initNext)    
      { 
         value = initValue; 
         next = initNext; 
      }  
      public E getValue()  
      { 
         return value; 
      }    
      
      public ListNode <E> getNext() 
      { 
         return next;  
      } 
      
      public void setValue(E theNewValue)
      { 
         value = theNewValue;
      }
      
      public void setNext(ListNode  <E> theNewNext)
      { 
         next = theNewNext; 
      }
      
   }  // end of ListNode

   public static void main(String [] args)
   {
      Scanner input = new Scanner (System.in);
      ListNode <Integer> h = new ListNode( 5, null);
      h= new ListNode(4, h);
      h= new ListNode(3, h);
      h= new ListNode(2, h);
      h= new ListNode(1, h);
           
      char option ;
      do
      {
         option = menu();
         if( option  == 'a')
         {
            System.out.println("list: ");
            printLinkedList(h);
         }	
         else if(option == 'b')
         {
            System.out.println("The List has atleast two element?");
            System.out.println(hasTwo(h));
         }	
         else if( option  =='c')
         {
            System.out.print("The size of the array is: ");
            System.out.println(size(h));
         }	
         else if( option  == 'd')
         {
            h = removeFirst(h);
            System.out.print("New list is: ");
            printLinkedList(h);
         }
         else  if( option  == 'e')
         {
            System.out.println("Enter number: ");
            int num = input.nextInt();
            add(h, new Integer(num));
            System.out.println("New list is: ");
            printLinkedList(h);
         }
         else if( option  == 'f')
         {
            h = reverseList(h);
            System.out.println("Reverse is: ");
            printLinkedList(h);
         }
         else if( option  == 'g')
         {
            h = rotate(h);
            System.out.println("rotated array is: ");
            printLinkedList(h);
         }
         else if( option  == 'h')
         {
            printLinkedList(h);
            System.out.println("\nmiddle node is: "+middleNode(h).getValue());
         }
            
         else if( option  == 'i')
         {
            h = removeLast(h);
            System.out.print("New list is: ");
            printLinkedList(h);
         }
         
      } while (option != 'z');
      
   }  // end of main
	   
   public static void printLinkedList(ListNode <Integer> head)
   {  
      if(head == null)
      {
         return;
      }
      while (head.getNext() != null)
      {
         System.out.print(head.getValue() + ", ");
         head = head.getNext();
      }
      
      System.out.print(head.getValue());
   }
   public static boolean hasTwo(ListNode  <Integer> head)
   {
      boolean flag = true;
      if (head.getNext() == null || head == null)
         flag = false;
      else
         flag = true;
      return flag;
   }
   public static int size(ListNode <Integer> head)
   {
      int count = 0;
      while(head.getNext() != null)
      {
         head = head.getNext();
         count++;
      }
      return ++count;
   }

   public static ListNode <Integer> removeFirst(ListNode <Integer> head)
   {	
      if(head == null)
         return null;
   
      ListNode<Integer> newList = head.getNext();
      return newList;
   }

   public static ListNode <Integer> removeLast(ListNode <Integer>  head)
   {	
      if(head == null || head.getNext() == null)
         return null;
         
      ListNode<Integer> c = head;
      while(c.getNext().getNext() != null)
      {  
         c = c.getNext();
      }
      c.setNext(null); 
                 
      return head;
      
   }
   public static ListNode <Integer> remove(ListNode head, Integer value)
   {	
      if(head == null)
         return null;
      for(ListNode<Integer> p = head ; p.getNext() != null; p = p.getNext())
      {
         if(p.getNext().getValue().equals(value))
            p.setNext(p.getNext().getNext());
      }
      return head;
   }

   public static void add(ListNode <Integer> head, Integer value)
   {
      if(head == null)
      {
      head.setValue(value);
      return;
      }
         
      while(head.getNext() != null)
      {
         head= head.getNext();
      }
      head.setNext(new ListNode<Integer>(value, null));
   }

   public static ListNode <Integer>  reverseList(ListNode <Integer> head)
   {
      ListNode <Integer> currNode = head;
      ListNode <Integer> nextNode = null;
      ListNode <Integer> prevNode = null;
      
      while(currNode != null)
      {
         nextNode = currNode.getNext();
         currNode.setNext(prevNode);
         prevNode = currNode;
         currNode = nextNode;
      }
      ListNode <Integer> reverse = prevNode;
      return reverse;
   }

   public static ListNode <Integer> rotate(ListNode <Integer> head)
   {
      ListNode<Integer> temp = head;
      head = head.getNext().getNext();
      while(head.getNext() != null)
      {
         temp.setNext(new ListNode<Integer>(head.getValue(), null));
         head = head.getNext();
      }
      head.setNext(new ListNode<Integer>(head.getValue(), null));
      return temp;
   }

   public static ListNode <Integer> middleNode(ListNode <Integer>head)
   {
      return null;
   }


   public static char menu()
   {
      Scanner input = new Scanner (System.in);
      System.out.println("\n====> What would you like to do?");
      System.out.println("a) Print list");
      System.out.println("b) Check if list has at least two nodes");
      System.out.println("c) Get size of the list");
      System.out.println("d) Remove first node");
      System.out.println("e) Add a node");
      System.out.println("f) Reverse");
      System.out.println("g) Rotate");
      System.out.println("h) Get middle node");
      System.out.println("i) Remove last node");
      System.out.println("z) Quit?");
      String choice = input.next();
      return choice.charAt(0);   
   }
}
