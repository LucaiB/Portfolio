/*****************************************************************************************************************
NAME: Lucas Banerji
PERIOD: 5
DUE DATE: 12/11/18
ASSIGNMENT: Text Editor

PURPOSE: To edit a line of text using a stack structure.

LEARNED: I learned how to use the Stack class to use the pop and push methods for Strings. I learned how to manipulate
those methods in order to change Strings, with this nowledge I believe that I can complete more difficult tasks using the
stack structure and methods.
            
CREDITS: none...

****************************************************************************************************************/
import java.util.Stack;
import java.util.Scanner;
public class LucasBanerjiPd5TextEditor <E> extends Stack
{
   public LucasBanerjiPd5TextEditor (String str)
   {
      Scanner console = new Scanner(System.in);
      String cont = "y";
      String current, fixed, newWord;

      while(cont.equals("y"))
      {
         while(str.length() != 0)
         {
            current = str.substring(0,1);
            if(current.equals("$"))
               this.removeAll(this);
            else if (current.equals("-"))
               this.pop();
            else
               this.push(current);
            str = str.substring(1);
         }
         
         fixed = "";
         while (this.size() != 0)
            fixed += this.pop();
         newWord = "";
         for (int i = fixed.length(); i > 0; i--)
            newWord += fixed.substring(i-1, i);
            
         System.out.println("Here is the line you entered: " + newWord);
         System.out.print("\n\n Again (y/n)?");
         cont = console.nextLine();
         if(cont.equals("y"))
         {
            System.out.println("Enter a line of text: ");
            str = console.nextLine();
         }
      }                                 
   }
         
   public static void main (String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a line of text: ");
      String str = console.nextLine();
      LucasBanerjiPd5TextEditor t = new LucasBanerjiPd5TextEditor(str);
   }
}
