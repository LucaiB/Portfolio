//Name:   
//Date:
// What I learned:
// How I feel about this lab:
// I am wondering:
import java.util.*;
public class LucasBanerjipd5ActingSchool
{
   public static void main(String[] args)
   {
      Map<String, String> sGrades = new HashMap<String, String>();     //HashMap
   
      sGrades.put("Jack Nicholson", "A-");
      sGrades.put("Humphrey Bogart", "A+");
      sGrades.put("Audrey Hepburn", "A");
      sGrades.put("Meryl Streep", "A-");
      sGrades.put("Jimmy Stewart", "A");
   
      System.out.println(sGrades);                 //display initial data
           
   	
      Map<String, ArrayList<String>> revS = new HashMap<String, ArrayList<String>>();
      
      for (Map.Entry<String, String> entry : sGrades.entrySet())                                    //reverse the map
      {
         String oldVal = entry.getValue(); 
         String oldKey = entry.getKey(); 
         ArrayList<String> newVal = null; 
         
         if (revS.containsKey(oldVal)) 
         { 
            newVal = revS.get(oldVal); 
            newVal.add(oldKey); 
         } 
         else 
         { 
            newVal= new ArrayList<>(); 
            newVal.add(oldKey); 
         } 
         
         revS.put(oldVal, newVal); 
      }
      System.out.println();   	
      System.out.println(revS);                 //display the reversed map
   	
   }
}

/**********************
 Audrey Hepburn (A)
 Humphrey Bogart (A+)
 Jack Nicholson (A-)
 Jimmy Stewart (A)
 Meryl Streep (A-)
 
 A: [Audrey Hepburn, Jimmy Stewart]
 A+: [Humphrey Bogart]
 A-: [Jack Nicholson, Meryl Streep]
 
 *********************/
 
 /* My output
    ----jGRASP exec: java ActingSchool_shell
 {Audrey Hepburn=A, Meryl Streep=A-, Jimmy Stewart=A, Humphrey Bogart=A+, Jack Nicholson=A-}
 
 {A=[Audrey Hepburn, Jimmy Stewart], A+=[Humphrey Bogart], A-=[Meryl Streep, Jack Nicholson]}
 
  ----jGRASP: operation complete.
 
 */