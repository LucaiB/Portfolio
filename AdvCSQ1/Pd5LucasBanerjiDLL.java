/***********************************************************************************************************************************************
 * Name: Lucas Banerji        
 * Period: 5
 * Name of the Lab: DLL
 * Purpose of the Program: To create a working DLL by creating basic methods
  * Due Date: 10/3
 * Date Submitted:  10/3
 * What I learned: 
 * 1. I learned how to make a copy of the DLL so that a pointer can traverse the DLL without changing anything
 * 2. I learned the basicc methods needed for a doubly linked list and a circularly linked list
 * 
 * How I feel about this lab: I felt that this lab was very comfortable. I was able to complete everything was ease.
 * What I wonder: Im still wondering about the real life appliction of this data structure
 * Student(s) who helped me (to what extent): none...
 * Student(s) whom I helped (to what extent):  Alex Lanier, helped him deal with pointer exceptions.
 *************************************************************************************************************************************************/
public class Pd5LucasBanerjiDLL <E>
{
   // private static nested class
   private class DLNode <E>
   {
      private E value;
      private DLNode prev;
      private DLNode next;
      public DLNode(E arg, DLNode <E> p, DLNode <E> n)
      {
         value=arg;
         prev=p;
         next=n;
      }
      public DLNode()
      {
         value=null;
         next=this;
         prev=this;
      }
      public void setValue(E arg)
      {
         value=arg;
      }
      public void setNext(DLNode <E> arg)
      {
         next=arg;
      }
      public void setPrev(DLNode <E> arg)
      {
         prev=arg;
      }
      public DLNode <E> getNext()
      {
         return next;
      }
      public DLNode <E> getPrev()
      {
         return prev;
      }
      public E getValue()
      {
         return value;
      }
   }  // end of DLNode
   
   //*********************************************************************************************  DLL class

   private int size;
   private DLNode <E> head = new DLNode <E> (); //dummy node--very useful--simplifies the code
   
   //Precondition: none
   //Postcondition: returns size of DLL
   public int size()
   {
      int count = 0;
      if (head.getNext() != null) {                        //traverse through DLL and increments the count
         DLNode<E> temp = head.getNext();
         for (; temp != head; temp = temp.getNext())
         {
            count++;
         }
      
         size = count;
         return count;
      } else
         return count;
   
   }
   // Pre: none
   /* Post: appends obj to end of list; increases size;
     @return true  */
   public boolean add(E obj)
   {
      DLNode<E> insert = new DLNode(obj, head.getPrev(), head);
      head.setPrev(insert);                                       //becuase list is circular, append is just adding to head.prev
      head.getPrev().getPrev().setNext(insert);   
      size();
      return true;
      
   }
   //Pre:  index is not larger than DLL
   //Post: inserts obj at position index.  increments size.
   public void add(int index, E obj)
   {
      DLNode<E> c = head;
      for(int i = 1; i < index; i++)  //traverse array to index
      {
         c = c.getNext();
      }
      DLNode<E> insert = new DLNode(obj, c, c.getNext());   //insert new DLNode and make sure all pointers are correct
      c.setNext(insert);
      c.getNext().getNext().setPrev(insert);
      size();
   }
   //Pre: index is not larger than DLL
   //Post: return obj at position index.	
   public E get(int index)
   {
      DLNode<E> c = head;
      for(int i = 0; i < index; i++)  //traverse array to index
      {
         c = c.getNext();
      }
       
      return c.getValue();
   }
   
   //Pre: index is not larger than DLL
   //Post: replaces obj at position index.  
   public void set(int index, E obj)
   {
      DLNode<E> c = head;
      for(int i = 0; i < index; i++)  //traverse array to index
      {
         c = c.getNext();
      }
      c.setValue(obj);
   }
   
   //Pre: index is not larger than DLL
   //Post: removes the node from position index.  decrements size. 
   //@return the object at position index.
   public E remove(int index)
   {
      DLNode<E> c1 = head;
      for(int i = 0; i < index; i++)  //traverse array to index
      {
         c1 = c1.getNext();
      }
      E obj = c1.getValue();                //save value in variable
      
      DLNode<E> c2 = c1;
      
      c1.getNext().setPrev(c2.getPrev());    //delete node
      c2.getPrev().setNext(c1.getNext());
      
      return obj;
   }
   
   //Pre: none
   //Post: inserts obj at front of list; increases size;
   public void addFirst(E obj)
   {
      DLNode<E> insert = new DLNode<E> (obj, head, head.getNext()); 
      head.getNext().getNext().setPrev(insert);
      head.setNext(insert);
      size();
   }
   
   //Pre: none
   //Post: appends obj to end of list; increases size;
   public void addLast(E obj)
   {
      DLNode<E> c = head;
      while(c.getNext() != head)                        //traverse list
      {
         c = c.getNext();
      }
      DLNode<E> insert = new DLNode<E> (obj, c, head);   
      c.setNext(insert);                                //properly set prev and next
      head.setPrev(insert);
      size();
   }
   
   //Pre: DLL is not null
   //Post: Returns first DLNode (not dummy)
   public E getFirst()
   {
      return head.getNext().getValue();
   }
   
   //Pre: DLL is not null
   //Post: Returns last DLNode
   public E getLast()
   {
      return head.getPrev().getValue();
   }
   
   //Pre: none
   //Post: returns value of first DLNode
   public E removeFirst()
   {
      return remove(0);
   }
   
   //Pre:
   //Post:
   public E removeLast()
   {
      return remove(this.size());
   }
   
   //Pre: none
   //Post: returns string representation of DLNode
   public String toString()
   {
      head = head.getNext();
      String s = "";
      for (int i = 0; i < this.size(); i++) {
         s += head.getValue() + " ";
         head = head.getNext();
      }
      return s;
   }



   public static void main(String args[])
   {
      Pd5LucasBanerjiDLL <String> list = new Pd5LucasBanerjiDLL <String> ();	
   
      list.addLast("Apple");
      list.addLast("Banana");
      list.addLast("Cucumber");
      list.add("Dumpling");
      list.add("Escargot");
      System.out.println(list);
      System.out.println("Size: " + list.size());
      Object obj = list.remove(3);
      System.out.println(list);
      System.out.println("Size: " +list.size());
      System.out.println("Removed "+ obj);
      System.out.print("Add at 3:   ");
      list.add(3,"Cheese");
      System.out.println(list);
      System.out.println("Get values at 1 and first: " + list.get(1)+" and " + list.getFirst());
      System.out.println("No change: " +list);
      System.out.println( list.removeFirst() + " is now removed!"); 
      System.out.println(list);
      System.out.print("Add first:  ");
      list.addFirst("Anchovie");
      System.out.println(list);
      System.out.println("Size: " + list.size());
      System.out.print("Set the second:  ");
      list.set(2, "Rread");
      System.out.println(list);
   }
}


