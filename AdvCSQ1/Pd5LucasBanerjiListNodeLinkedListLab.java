/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  9/23/18 

PURPOSE: To create a ListNode<Integer> class with several basic methods 

WHAT I LEARNED: This lab was very challenging for me at first. This is a new
data structure and it was difficult knowing how to get around certain problems.
However, throughout this lab I have learned to traverse a LinkedList with ease. 
Furthermore, I have mastered several basic methods associated with this class.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Pd5LucasBanerjiListNodeLinkedListLab {
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
            h = add(h, new Integer(num));
            System.out.print("New list is: ");
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
         return;
      while (head.getNext() != null)
      {
         System.out.print(head.getValue() + ", ");
         head = head.getNext();
      }
      System.out.print(head.getValue());
   }
   public static boolean hasTwo(ListNode  <Integer> head)
   {
      boolean flag = false;
      if(head != null && head.getNext() != null)
         flag = true;
      return flag;
      
   }
   public static int size(ListNode <Integer> head)
   {
      int count = 0;
      if(head == null)
         return 0;
      while (head.getNext() != null) {
         head = head.getNext();
         count++;
      }
      count++;
      return count;
   }

   public static ListNode <Integer> removeFirst(ListNode <Integer> head)
   {	
      if(head == null || head.getNext() == null) 
         return null;
      head = head.getNext();
      return head;
   }

   public static ListNode <Integer> removeLast(ListNode <Integer>  head)
   {	
      if(head == null || head.getNext() == null) 
         return null;
      ListNode<Integer> p = head; 
      while(p.getNext().getNext() != null)
         p = p.getNext();
      p.setNext(null);
      return head;
   }
   public static ListNode <Integer> remove(ListNode<Integer> head, Integer value)
   {		  
      if(head == null)
         return null;
      for(ListNode<Integer>p = head; p.getNext() != null; p = p.getNext())
      {
         if (p.getNext().getValue().equals(value))
            p.setNext(p.getNext().getNext());
      }
   		  
      return head;
   }

   public static ListNode <Integer> add(ListNode <Integer> head, Integer value)
   {
      if(head == null)
      {
         head = new ListNode<Integer> (value, null);
         return head;
      }
         
      ListNode<Integer> p = head;
      while(p.getNext() != null)
      {
         p = p.getNext();
      }
      p.setNext( new ListNode<Integer>(value, null));
      return head;
   }

   public static ListNode <Integer>  reverseList(ListNode <Integer> head)
   {
      ListNode<Integer> curr = head;
      ListNode<Integer> next = null;
      ListNode<Integer> prev = null;
   	   
      while(curr != null)
      {
         next = curr.getNext();
         curr.setNext(prev);
         prev = curr;
         curr = next;
      }
      ListNode<Integer> reverse = prev;
      return reverse;
   }

   public static ListNode <Integer> rotate(ListNode <Integer> head)
   {
      if(head == null)
         return null;
      if(head.getNext() == null)
         return head;
      Integer temp = head.getValue();
      head = head.getNext();
      ListNode<Integer> p = head;
      while(p.getNext() != null)
      {
         p = p.getNext();
      }
      p.setNext(new ListNode<Integer>(temp, null));
      return head;
   }

   public static ListNode <Integer> middleNode(ListNode <Integer>head)
   {
      if(head == null) 
      {
         return null;
      }
      int length = 0;
      ListNode<Integer> curr = head;
      ListNode<Integer> middle = head;
      
      while(curr.getNext() != null)
      {
         length++;
         if(length % 2 == 1)
            middle = middle.getNext();
         curr = curr.getNext();
      }
      return middle;
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
/*   Output
----jGRASP exec: java ListNodeLinkedListLab

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
a
list: 
1, 2, 3, 4, 5
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
b
The List has atleast two element?
true

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
c
The size of the array is: 5

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
d
New list is: 2, 3, 4, 5
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
e
Enter number: 
1
New list is: 
2, 3, 4, 5, 1
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
f
Reverse is: 
1, 5, 4, 3, 2
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
g
rotated array is: 
5, 4, 3, 2, 1
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
h
5, 4, 3, 2, 1
middle node is: 3

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
i
New list is: 5, 4, 3, 2
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
i
New list is: 5, 4, 3
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
i
New list is: 5, 4
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
i
New list is: 5
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
i
New list is: 
====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
a
list: 

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
b
The List has atleast two element?
false

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
c
The size of the array is: 0

====> What would you like to do?
a) Print list
b) Check if list has at least two nodes
c) Get size of the list
d) Remove first node
e) Add a node
f) Reverse
g) Rotate
h) Get middle node
i) Remove last node
z) Quit?
z

----jGRASP: operation complete.
*/

