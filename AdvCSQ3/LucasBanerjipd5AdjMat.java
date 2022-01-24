//name: Lucas Banerji   date:   4/2/19
// resource classes and interfaces
// for use with Graphs0: Intro
//              Graphs1: Warshall
//              Graphs2: Floyd
import java.util.*;
import java.io.*;

interface AdjacencyMatrix
{
   public void addEdge(int source, int target);
   public void removeEdge(int source, int target);
   public boolean isEdge(int from, int to);
   public void displayGrid();
   public int edgeCount();
   public List<Integer> getNeighbors(int source);
}

interface Warshall      //User-friendly functionality
{
   public boolean isEdge(String from, String to);
   public Map<String, Integer> getVertices();     
   public void readNames(String fileName) throws FileNotFoundException;
   public void readGrid(String fileName) throws FileNotFoundException;
   public void displayVertices();
   public void allPairsReachability(); // Warshall's Algorithm
}

interface Floyd
{
   public int getCost(int from, int to);
   public int getCost(String from, String to);
   public void allPairsWeighted(); 
}

public class LucasBanerjipd5AdjMat implements AdjacencyMatrix //,Warshall//,Floyd
{
   private int[][] grid = null;   //adjacency matrix representation
   private Map<String, Integer> vertices = null;   // name --> index. Used in Warshall
   
   public LucasBanerjipd5AdjMat(int size)
   {
      grid = new int[size][size];
   }           
                                                    // graph1
   public void addEdge(int source, int target)
   {
      grid[source][target] = 1;
   }
   
   public void removeEdge(int source, int target)
   {
      grid[source][target] = 0;
   }
   
   public boolean isEdge(int from, int to)
   {
      if(grid[from][to] == 1)
         return true;
      else
         return false;
   }
   
   public void displayGrid()
   {
      for(int [] row: grid)
      {
         for(int col: row)
         {
            System.out.print(col + " ");
         }
         System.out.println();
      }
   }
   
   public int edgeCount()
   {
      int count = 0;
      for(int [] row: grid)
         for(int col: row)
            if(col == 1)
               count++;
      return count;
   }
   
   public List<Integer> getNeighbors(int source)
   {
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0; i < grid.length; i++)
      {
         if(isEdge(source,i))
            list.add(i);
      }
      return list;  
   }
}