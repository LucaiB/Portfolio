   //Name: Lucas Banerji     Date:  2/12
import java.util.*;

 	/***********************************
	Represents a binary expression tree.
	The BXT can build itself from a postorder expression.  It can
	evaluate and print itself. It also prints an inorder string and a preorder string.  
	************************************/
public class LucasBanerjipd5BXT
{
   private int count;
   protected TreeNode root;
   
   public LucasBanerjipd5BXT()
   {
      count = 0;
      root = null;
   }
   public LucasBanerjipd5BXT(Object obj)
   {
      count = 1;
      root = new TreeNode(obj, null, null);
   }
      /***********************
   	Builds a BXT from a postfix expression.  Uses a helper stack of TreeNodes.
   	****************************/
   public void buildTree(String str)
   {
      Stack <TreeNode> nodeStack = new Stack <TreeNode>();
      StringTokenizer tokenizer = new StringTokenizer(str);
      
      
      while (tokenizer.hasMoreTokens())
      {
         String token = tokenizer.nextToken();
         
         if (!isOperator(token)) //If the token is an operand, creates a leaf TreeNode and pushes onto the stack
         {
            root = new TreeNode(token, null, null);
            nodeStack.push(root);
         }
         else
         {
            root = new TreeNode(token, nodeStack.pop(),nodeStack.pop());
            nodeStack.push(root);
         }
      }
   }
   public double evaluateTree()
   {
      return evaluateNode(root);
   }
   private double evaluateNode(TreeNode root)  //recursive
   {
      if(root != null)
      {
         String s = (String) root.getValue();
         if(isOperator(s))
         {
            double first = evaluateNode(root.getLeft());
            double second = evaluateNode(root.getRight());
            return computeTerm(s, second, first);
         } else
            return Double.parseDouble(s);
      }
      return 0;
   }
   private double computeTerm(String s, double a, double b)
   {
      if(s.equals("+"))
         return a + b;
      else if (s.equals("-"))
         return a - b;
      else if (s.equals("*"))
         return a * b;
      else
         return a / b;
   }
   private boolean isOperator(String s)
   {
      return "+-*/".indexOf(s) != -1;
   }
   public static void display(TreeNode t, int level)
   {
      if(t == null)
         return;
      display(t.getLeft(), level + 1); //recurse right
         
      for(int k = 0; k < level; k++)
         System.out.print("\t");
      System.out.println(t.getValue());
         
      display(t.getRight(), level + 1); //recurse left
   }

   	 
   public static void inorderTraverse(TreeNode t)
   {
      if(t == null)
         return;
         
      inorderTraverse(t.getRight());
      System.out.print(t.getValue() + " ");
      inorderTraverse(t.getLeft());
   }
   	 
   public static void preorderTraverse(TreeNode t)
   {
      if(t == null)
         return;
         
      System.out.print(t.getValue() + " ");
      preorderTraverse(t.getRight());
      preorderTraverse(t.getLeft());
   }
}
	
