package thirdQuarter;
/*****************************************************************************************************************
NAME: Akshath Burra     
PERIOD: 5
DUE DATE: 1/30/19

PURPOSE: To learn about Binary Search Trees   

WHAT I LEARNED: I learned how to write methods for Binary Search Trees

HOW I FEEL ABOUT THIS LAB: I thought it was quite easy 
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): none

****************************************************************************************************************/
import java.util.Scanner;

	/****************************************************************
	Practice with a Binary Search Tree. Uses TreeNode.
    Prompt the user for an input string.  Build a Binary Search Tree 
	using Comparables.  Display it as a sideways tree (take the code 
	from the Tree Lab).  Prompt the user for a target and search the tree 
	for it.  Display the tree's minimum and maximum values.  Print 
	the data in order from smallest to largest.
	*****************************************************************/
public class HelpBST
{
   public static void main(String[] args)
   {
	   // your code goes here
        Scanner console = new Scanner(System.in);
        System.out.print("Input String: ");
	    String s = console.nextLine();
	    System.out.print(s);
        TreeNode t = new TreeNode(s.substring(0, 1)); 
	    for(int i = 1; i < s.length(); i++)
	    	insert(t, s.substring(i, i+1));
	    display(t, 0);
	    System.out.println("Input Target");
	    String target = console.nextLine();
	    if(!find(t, target))
	    	System.out.println(target + " not found");
	    else
	    	System.out.println("found: " + target);
	    System.out.println("Min = " + min(t));
	    System.out.println("Max = " + max(t) + "\n");
	    System.out.println("In Order: ");
	    smallToLarge(t);     
   }
      
   	/****************************************************************
   	Recursive algorithm to build a BST:  if the node is null, insert the 
   	new node.  Else, if the item is less, set the left node and recur to 
   	the left.  Else, if the item is greater, set the right node and recur 
   	to the right.   
   	*****************************************************************/
   public static TreeNode insert(TreeNode t, String s)
   {  	
      if(t == null)
      {
    	 t = new TreeNode(s, null, null);
      }
      else if (s.compareTo((String)t.getValue())<0)
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
   	
     /***************************************************************
      Iterative algorithm:  create a temporary pointer p at the root.  
   	While p is not null, if the p's value equals the target, return true.  
   	If the target is less than the p's value, go left, otherwise go right.   
   	If the target is not found, return false. 
      
   	Find the target. Recursive algorithm:  If the tree is empty, 
   	return false.  If the target is less than the current node 
   	value, return the left subtree.  If the target is greater, return 
   	the right subtree.  Otherwise, return true.   
   . ****************************************************************/    
   public static boolean find(TreeNode t, Comparable x)
   {
     if (t == null)
    	 return false;
     if (x.compareTo(t.getValue()) == 0)
    	 return true;
     return find(t.getLeft(), x)||find(t.getRight(),x);
   }
   
     /***************************************************************
   	starting at the root, return the min value in the BST.   
   	Use iteration.   Hint:  look at several BSTs. Where are 
   	the min values always located?  
   	***************************************************************/
   public static Object min(TreeNode t)
   {
	  if(t==null)
		  return null;
      while(t.getLeft()!=null)
    	  t = t.getLeft();
      return t.getValue();
   }
   /*****************************************************************
   	starting at the root, return the max value in the BST.  
   	Use recursion!
    *****************************************************************/
   public static Object max(TreeNode t)
   {
	  if(t == null)
		  return null;
	  else if (t.getRight() == null)
		  return t.getValue();
	  else
		  return max(t.getRight());
   }
   public static void smallToLarge(TreeNode t)
   {
	   if(t == null)
	         return;    
	      smallToLarge(t.getLeft());	   
	      System.out.print(t.getValue()+ " "); 
	      smallToLarge(t.getRight());
   }
}  //end of class
