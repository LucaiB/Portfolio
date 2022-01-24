//name: Lucas Banerji   date:   4/2/19
// resource classes and interfaces
// for use with Graphs0: Intro
//              Graphs1: Warshall
//              Graphs2: Floyd
//Credits: Akshath helped me with the readNames and readGrid mathods that I did not know how to do, I know understand how to do it.

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
   public void readNames(String fileName) throws FileNotFoundException,IOException;
   public void readGrid(String fileName) throws FileNotFoundException,IOException;
   public void displayVertices();
   public void allPairsReachability(); // Warshall's Algorithm
}

interface Floyd
{
   public int getCost(int from, int to);
   public int getCost(String from, String to);
   public void allPairsWeighted(); 
}

public class LucasBanerjipd5AdjMat implements AdjacencyMatrix, Warshall, Floyd
{
   private int[][] grid = null;   //adjacency matrix representation
   private Map<String, Integer> vertices = null;   // name --> index. Used in Warshall
   private String[] names;  //used in Warshall 
   
   
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
   
   public void allPairsReachability() //Algorithm
   {
      for(int mid = 0; mid<grid.length; mid++)
      {
         for(int i = 0; i<grid.length; i++)
         {
            for(int j = 0; j<grid.length; j++)
            {
               if(grid[i][mid] + grid[mid][j] == 2)
                  grid[i][j] = 1;
            }
         }
      }
   }
   
   public Map<String, Integer> getVertices()
   {
      return vertices;
   }
   
   public void displayVertices()   //used array, more straighforward
   {
      for(int i = 0; i < names.length; i++) 
      {
         System.out.println(i + " - " + names[i]);
      }
   
   }
   
   public boolean isEdge(String from, String to) 
   {
      int fromindex = 0, toindex = 0;
      for(int i = 0; i < names.length; i++) 
      {
         if(names[i].equals(from))
            fromindex = i;
      }
      for(int j = 0; j < names.length; j++) 
      {
         if(names[j].equals(to))
            toindex = j;		
      }
      return grid[fromindex][toindex] == 1;
   }


   public void readNames(String fileNames) throws NumberFormatException, IOException //help from akshath
   {
      try {
         FileReader fr = new FileReader(fileNames);
         BufferedReader br = new BufferedReader(fr);
               
         names = new String[Integer.parseInt(br.readLine())];
      
         int counter = 0;
         String st;
         while ((st = br.readLine()) != null)
         {
            names[counter] = st;
            counter++;
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }


   
   public void readGrid(String fileGrid) throws NumberFormatException, IOException  //help from akshath
   {
      try {
      
         FileReader fileReader = new FileReader(fileGrid);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
      	
         int counter1 = 0;
         int counter2 = 0;
      	
         String number = "";
         String s;
      
      
         while ((s = bufferedReader.readLine()) != null) 
         {
            if (s.length() == 1) 
            { 
               grid = new int[Integer.parseInt(s)][Integer.parseInt(s)];
               continue;
            }
            for (int j = 0; j < s.length(); j++) 
            { 
               if(s.substring(j, j + 1).equals(" ")) 
               {
                  grid[counter1][counter2] = Integer.parseInt(number);
                  number = "";
                  counter2++;
               } else {
                  number += s.substring(j, j + 1);
                  if(j == s.length() - 1) {
                     grid[counter1][counter2] = Integer.parseInt(number);
                     number = "";
                     counter2++;
                  }
               }
            }
            counter2 = 0;
            counter1++;
         }
      } catch (FileNotFoundException e) 
      {
         e.printStackTrace();
      }
   }
   
   public int getCost(int from, int to) 
   {
      return grid[from][to];
   }
   
   public int getCost(String from, String to) 
   {
      int fromindex = 0, toindex = 0;
      for(int i = 0; i < names.length; i++) 
      {
         if(names[i].equals(from))
            fromindex = i;
      }
      for(int j = 0; j < names.length; j++)
      {
         if(names[j].equals(to))
            toindex = j;		
      }
      return grid[fromindex][toindex];		
   }
   
   public void allPairsWeighted() 
   {
      for (int i = 0; i < grid.length; i++) 
      {
         for (int j = 0; j < grid[0].length; j++) 
         {
            if (grid[j][i] == 0) 
            { 
               continue;   //end cycle if it equals 0 (saves a lot of time)
            }
            for (int k = 0; k < grid[0].length; k++) 
            { 
               if (grid[j][i] + grid[i][k] < grid[j][k])
               { 
                  grid[j][k] = grid[j][i] + grid[i][k]; 
                  grid[j][k] = getCost(j, k); 
               }
            }
         }
      }
   }



   
   
}