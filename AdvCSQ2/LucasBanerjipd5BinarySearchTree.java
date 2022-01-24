/*****************************************************************************************************************
NAME: Lucas Banerji
PERIOD: 5
DUE DATE: 1/30/19

PURPOSE:To understand how a BST works

WHAT I LEARNED:Through this lab, I learned how to apply my skills of on binary trees to a more useful sturcture,
the binary search tree. I now understand why this strucuture is so useful. It is much easier to find what you are 
looking for while being more efficient. 

HOW I FEEL ABOUT THIS LAB: This lab was quite easy for me, because I lready had some knowledge on BT, applying
those skills to a BST was an easy transition.
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): none...

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
public class LucasBanerjipd5BinarySearchTree
{
   public static void main(String[] args)
   {
          
      String s = "XCOMPUTERSCIENCE";
   		
      TreeNode root = new TreeNode(s.substring(0, 1));
         
      for(int i = 1; i < s.length(); i++)
         insert(root, s.substring(i, i+1));
      
      display(root,0);
      
      System.out.println("Find 'O': " + find(root, "O"));
      System.out.println("Find 'A': " + find(root, "A"));
      System.out.println("Find 'Z': " + find(root, "Z"));
      System.out.println("Find 'E': " + find(root, "E"));
                  
      System.out.println("Max: " + max(root));
      System.out.println("Min: " + min(root));
      
      System.out.print("Small to Large: ");
      smallToLarge(root);
   
   
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
         t = new TreeNode(s);
         return t;
      }
         
      else 
      {
         if(s.compareTo(t.getValue() + "") <= 0)
            t.setLeft(insert(t.getLeft(), s));
         else
            t.setRight(insert(t.getRight(), s));
         return t;
      }
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
      TreeNode p = t;
      while(p.getLeft() != null)
         p = p.getLeft();
      return p.getValue();         
   }
   /*****************************************************************
   	starting at the root, return the max value in the BST.  
   	Use recursion!
    *****************************************************************/
   public static Object max(TreeNode t)
   {
      TreeNode p = t;
      while(p.getRight() != null)
         p = p.getRight();
      return p.getValue();   
   }
   public static void smallToLarge(TreeNode t)
   {
      if(t == null)
         return;
         
      smallToLarge(t.getLeft());
      System.out.print(t.getValue() + " ");
      smallToLarge(t.getRight());
   }
}  //end of class


/*  Output
 ----jGRASP exec: java BinarySearchTree_SHELL
 X
 				U
 					T
 							S
 						R
 			P
 		O
 				N
 			M
 					I
 				E
 					E
 						E
 	C
 		C
 			C
 Find 'O': true
 Find 'A': false
 Find 'Z': false
 Find 'E': true
 Max: X
 Min: C
 Small to Large: C C C E E E I M N O P R S T U X 
  ----jGRASP: operation complete.
 */