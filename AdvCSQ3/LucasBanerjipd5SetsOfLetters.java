//Name:   Lucas Banerji
//Date:  3/16
// What I learned:  I learned different Character methods (isLetter,isLowerCase) as well as learned how TreeSets worked.
// While doing this lab i often ran it through canvas so I could visualize how the TreeSets were working. I also learned some new Scanner methods
// How I feel about this lab: This lab took some problem solving but it did not feel too difficult. It was interesting and I learned a lot from it
// What I wonder: I wonder if there is a way to solve this problem all in one loop instead of making two.
// Question:  If Java didn't implement Sets, how would you solve this programming problem?  Be creative!
// Maybe one could solve it using a hashtable, since looking up if a value exists already is very efficient O(1)
import java.util.*;
import java.io.*;
public class LucasBanerjipd5SetsOfLetters
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner reader = new Scanner(new File("C:\\Users\\lucas\\OneDrive\\Quarter3CSB\\declarationLast.txt"));
      
      Set<Character> comUpper = new TreeSet<Character>();
      Set<Character> comLower = new TreeSet<Character>();
      Set<Character> comOther = new TreeSet<Character>();
   
      char [] currLine = reader.nextLine().toCharArray();
      Character cchar;
         
      for(int i = 0; i < currLine.length; i++)   //put first line into commonSets to establish a baseline
      {
         cchar = currLine[i];
         if(Character.isLetter(cchar))
         {
            if(Character.isLowerCase(cchar))
               comLower.add(currLine[i]);
            else
               comUpper.add(currLine[i]);
         }
         else
            comOther.add(currLine[i]);
      }
      
      while(reader.hasNextLine())   //read all lines
      {
         currLine = reader.nextLine().toCharArray();
         
         TreeSet<Character> bylineUp = new TreeSet<Character>();
         TreeSet<Character> bylineLo = new TreeSet<Character>();
         TreeSet<Character> bylineOt = new TreeSet<Character>();
         
         for(int i = 0; i < currLine.length; i++)   //only add Charachter if it is already in the common set
         {
            cchar = currLine[i];
         
            if(Character.isLetter(cchar))
            {
               if(Character.isLowerCase(cchar) && comLower.contains(cchar))
                  bylineLo.add(cchar);
               else if(comUpper.contains(cchar))
                  bylineUp.add(cchar);
            }
            else if(comOther.contains(cchar))
               bylineOt.add(cchar);
         }
         
         comLower = bylineLo;      //currentLine sets will have all intersected characters, so set commonSets equal to the currentLine sets
         comUpper = bylineUp;
         comOther = bylineOt;
      }
      
      System.out.println("Common Lower Case: " + comLower);  //print
      System.out.println("Common Upper Case: " + comUpper);
      System.out.println("Common Other: " + comOther);

   }
}

/*  Output
  ----jGRASP exec: java SetsOfLetters_shell
 Common Lower Case: [d, e, n, o, r, t]
 Common Upper Case: []
 Common Other: [ ]
 
  ----jGRASP: operation complete.
  */