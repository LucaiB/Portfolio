  /*****************************************************************************************************************
NAME:Lucas Banerji
PERIOD:5
DUE DATE: 2/8

PURPOSE:    To delete a node from a BST in any case

WHAT I LEARNED: I learned how to deal with the 3 main cases and all the subcases of deleting a node from a BST. My knowledge 
of BST has definetly increased with this lab.
HOW I FEEL ABOUT THIS LAB: This lab was quite hard for me, it took me a long time to figure out how to deal with all of the cases possible
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITES && what kind of 
         help did you get from the source?): I got help from Harsh and Mitchell on how to get rid of some null pointer exceptions. I also 
         worked and completed most of the lab with Mahi during class.

****************************************************************************************************************/
import java.util.Scanner;
/****************************************************************
Practice with a Binary Search Tree. Uses TreeNode.
Step 1: Prompt the user for an input string.  
Step 2: Build a Binary Search Tree using Comparables.  
Step 3: Display it as a sideways tree (take the code from TreeLab).  
Step 4: Prompt the user for a target and delete that node, if it exists. 
*****************************************************************/
public class LucasBanerjipd5BinarySearchTreeDelete
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input string: ");
      String s = sc.nextLine();   // Use	ECSBPWANR
   	         				   							    
      TreeNode t = null;
      for(int x = 0; x<s.length(); x++)
         t = insert(t, s.substring(x, x+1));
      display(t, 0);
   
      while (true)
      {
         System.out.print("Delete? ");
         String target = sc.next();
         if( contains( t, target ) )
         {
            t = delete( t, target );
            System.out.println("\n" + target+" deleted.");
         }
         else
            System.out.println("\n" + target+" not found");
         display(t, 0);   
      }     
   }
   
	/**************************
	Recursive algorithm to build a BST:  if the node is null, insert the 
	new node.  Else, if the item is less, set the left node and recur to 
	the left.  Else, if the item is greater, set the right node and recur 
	to the right.   
	*****************************/
   public static TreeNode insert(TreeNode t, String s)
   {  	
      if(t==null)
         return new TreeNode(s);
      if(s.compareTo(t.getValue()+"")<0)
         t.setLeft(insert(t.getLeft(), s));
      else
         t.setRight(insert(t.getRight(), s));
      return t;
   }
   public static void display(TreeNode t, int level)
   {
      if(t == null)
         return;
      display(t.getRight(), level + 1); //recurse right
      for(int k = 0; k < level; k++)
         System.out.print("\t");
      System.out.println(t.getValue());
      display(t.getLeft(), level + 1); //recurse left
   }
   
   public static boolean contains( TreeNode current, String target )
   {
      while(current !=null)
      {
         int compare = target.compareTo((String)current.getValue());
         if( compare == 0 )
            return true;
         else if(compare<0)
            current = current.getLeft();
         else if(compare>0)
            current = current.getRight();
      }
      return false;
   }
   public static TreeNode delete(TreeNode current, String target)
   {
      TreeNode root = current;
      TreeNode parent = null;
      while (current != null)
      {
         int compare = target.compareTo((String) current.getValue());
            // ------->  your code goes here
         if(compare == 0)
         {
            if(parent == null && current.getRight() == null && current.getLeft() == null)
            {
                    //current = null;
               return null;
            }
            else if(parent == null && current.getRight() == null)
            {
               current = current.getLeft();
               root = current;
               return root;
            }
            else if(parent == null && current.getLeft() == null )
            {
               current = current.getRight();
               root = current;
               return root;
            }
                //this one kept making an error i think?
            else if(current.getLeft() != null && current.getRight() != null)
            {
               current.setValue( max(current.getLeft()));
               current.setLeft(delete(current.getLeft(), (String)current.getValue()));
            }
            else
            {
               if(((String) current.getValue()).compareTo((String)parent.getValue())< 0) //current is parents left child
               {
                  if(current.getLeft() == null && current.getRight() == null)
                     parent.setLeft(null);
                  else if(current.getLeft() == null)
                     parent.setLeft(current.getRight());
                  else if(current.getRight() == null)
                     parent.setLeft(current.getLeft());
               }
               else if(((String) current.getValue()).compareTo((String)parent.getValue())> 0) //current is parents right child
               {
                  if(current.getLeft() == null && current.getRight() == null)
                     parent.setRight(null);
                  else if( current.getLeft() == null)
                     parent.setRight(current.getRight());
                  else if( current.getRight() == null)
                     parent.setRight(current.getLeft());
               }
               return root;
            }
         
         }
         parent = current;
         if(compare < 0)
            current = current.getLeft();
         else
            current = current.getRight();
      
      
      }
      return root;  //never reached
   } // end of delete
   
   public static Object max(TreeNode t)
   {
      if(t == null) 
         return Integer.MIN_VALUE;
           
      else 
      {
         String result = "" + t.getValue();
         String left = "" + (max(t.getLeft()));
         String right = "" + (max(t.getRight()));
         if(left.compareTo(result) > 0) 
         {
            result = left;
         }
         if(right.compareTo(result) > 0) 
         {
            result = right;
         }
         return result;
      }
   }


}  // end of class

/*  Sample Runs

 Input string: ECSBPWANR
 		W
 	S
 			R
 		P
 			N
 E
 	C
 		B
 			A
 Delete? A
 
 A deleted.
 		W
 	S
 			R
 		P
 			N
 E
 	C
 		B
 Delete? E
 
 E deleted.
 		W
 	S
 			R
 		P
 			N
 C
 	B
 Delete? S
 
 S deleted.
 		W
 	R
 		P
 			N
 C
 	B
 Delete? N
 
 N deleted.
 		W
 	R
 		P
 C
 	B
 Delete? 


*/