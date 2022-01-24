/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 5
DUE DATE:  8/30/18 

PURPOSE: To create an ArrayBag class that implements the Bag interface. 

WHAT I LEARNED: I reviewed many of the topics that were rusty from the 
summer break. It was a very helpful and interesting lab.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
public class Pd5LucasBanerjiArrayBag implements Bag
{
   private Object[] items;
   private int numItems;

   public Pd5LucasBanerjiArrayBag()
   {
      items = new Object[10];
      numItems = 0;
   }

   public void resize()
   {
      Object[] newItems = new Object [items.length*2];
   
      for (int i = 0; i < numItems; i++)
         newItems[i] = items[i];
      items = newItems;
   }

   public boolean add(Object item)
   {
      if (numItems == items.length)
         resize();
      
      items [numItems] = item;
      numItems++;
      return true;
   }
   
   public boolean remove(Object item)
   {
      int index = 0;
      for (int i = 0; i < numItems; i++)
      {
         if(items[i].equals(item))
            index = i;
      }
      for (int h = index; h < items.length-1; h++)
      {
         items[h] = items[h+1];
         items[items.length-1] = null; 
      }
      numItems--;
      System.out.println("Removed " + item);
      return true;   
   }
   
   public boolean contains(Object item)
   {
      for (int i=0;i<numItems;i++)
      {
         if( items[i].equals(item))
            return true;
      }
      return false;
   }
   
   public int numItems()
   {
      System.out.println("Number of items in bag: " + numItems);
      return numItems;
   }

   public Object grab()
   {
      int index = (int)(Math.random()*items.length);
      System.out.println("You grabbed " + items[index]);
      return items[index];
   }
   
   public Object[] toArray()
   {
      System.out.println("Objects in bag include: ");
      for(Object e:items)
      {            
         System.out.print(" [" + e + "]");
      } 
      System.out.println();  
      return items;
   }
   public static void main(String[] args)
   {
      Pd5LucasBanerjiArrayBag bag = new Pd5LucasBanerjiArrayBag();
      bag.add("Hello");
      bag.numItems();
      bag.toArray();
      System.out.println(bag.contains("Hello"));
      bag.remove("Hello");
      bag.numItems();
      bag.toArray();
      bag.add(3.1415);
      bag.add(20);
      bag.add(true);
      bag.add("Hello");
      bag.add(new Pd5LucasBanerjiArrayBag());
      bag.add("Bye");
      bag.add("@#$%");
      bag.add(-56);
      bag.add(false);
      bag.add(.00001);
      bag.toArray();
      bag.numItems();
      bag.grab();
      bag.grab();
      bag.add(1);
      bag.numItems();
      bag.toArray();
      bag.remove("Hello");
      bag.toArray();     
   } 
}

/*   Output
  ----jGRASP exec: java ArrayBag
 Number of items in bag: 1
 Objects in bag include: 
  [Hello] [null] [null] [null] [null] [null] [null] [null] [null] [null]
 true
 Removed Hello
 Number of items in bag: 0
 Objects in bag include: 
  [null] [null] [null] [null] [null] [null] [null] [null] [null] [null]
 Objects in bag include: 
  [3.1415] [20] [true] [Hello] [ArrayBag@15db9742] [Bye] [@#$%] [-56] [false] [1.0E-5]
 Number of items in bag: 10
 You grabbed 20
 You grabbed @#$%
 Number of items in bag: 11
 Objects in bag include: 
  [3.1415] [20] [true] [Hello] [ArrayBag@15db9742] [Bye] [@#$%] [-56] [false] [1.0E-5] [1] [null] [null] [null] [null] [null] [null] [null] [null] [null]
 
  ----jGRASP: operation complete.
  */

