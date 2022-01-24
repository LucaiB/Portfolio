//lesson:  Graphs3: EdgeList
//uses AdjList

import java.util.*;
import java.io.*;
 
public class LucasBanerjipd5AdjList_3_Driver
{  
   public static void main(String[] args)throws FileNotFoundException
   {
      System.out.println("Edge List Representation! ");
      LucasBanerjipd5AdjList g = new LucasBanerjipd5AdjList();
      g.addVertex("A");      //if it's not there, add it.
      g.addVertex("B");
      g.addEdge("A", "C"); // <-- warning!  Be sure to add all the Vertices first; 
                           // or else deal with it. 
      g.addVertex("C");
      g.addVertex("D");
      g.addEdge("B", "A");
      g.addEdge("C", "C");
      g.addEdge("C", "D");
      g.addEdge("D", "C");
      g.addEdge("D", "A");
      System.out.println(g.toString());  //let's look at it first
   }
}
/***************************
    Edge List Representation! 
 A [C]
 B [A]
 C [C, D]
 D [C, A]
 
 ************************/
 
 /*  My output
      ----jGRASP exec: java AdjList_3_Driver
 Edge List Representation! 
 
 A[C]
 B[A]
 C[C, D]
 D[C, A]
 
  ----jGRASP: operation complete.
 */
 