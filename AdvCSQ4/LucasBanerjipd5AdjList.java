//name: Lucas Banerji    date:4/27
//resource classes and interfaces
//for use with Graphs3: EdgeList
//             Graphs4: DFS-BFS
//             Graphs5: EdgeListCities

import java.io.*;
import java.util.*;
/*********************  Graphs 3:  EdgeList *******************************/
interface VertexInterface
{
   public String toString();     //just return the name
   public String getName();
   public ArrayList<Vertex> getAdjacencies();
   public void addEdge(Vertex v);
} 
/***********************************************************/
class Vertex implements VertexInterface 
{
   private final String name;
   private ArrayList<Vertex> adjacencies;
  
   public Vertex(String n)
   {
      name = n;
      adjacencies = new ArrayList<Vertex>();
   }
  
   public String getName()
   {
      return name;
   }
  
   public String toString()
   {
      return name;
   }
  
   public ArrayList<Vertex> getAdjacencies()
   {
      return adjacencies;
   }
   
   public void addEdge(Vertex v)
   {
      adjacencies.add(v);
   }
}   

interface AdjListInterface 
{ 
   public List<Vertex> getVertices();
   public Vertex getVertex(int i) ;
   public Vertex getVertex(String vertexName);
   public Map<String, Integer> getVertexMap();
   public void addVertex(String v);
   public void addEdge(String source, String target);
   public String toString();
}

  
/*********************Graphs 4:  DFS and BFS ****************************/
interface DFS_BFS
{
   public List<Vertex> depthFirstSearch(String name);
   public List<Vertex> depthFirstSearch(Vertex v);
   public List<Vertex> breadthFirstSearch(String name);
   public List<Vertex> breadthFirstSearch(Vertex v);
   //public List<Vertex> depthFirstRecur(String name);
   //public List<Vertex> depthFirstRecur(Vertex v);
   //public void depthFirstRecurHelper(Vertex v, ArrayList<Vertex> reachable);
}

/****************Graphs 5:  EdgeList with Cities  *********/
interface EdgeListWithCities
{
   public void graphFromEdgeListData(String fileName) throws FileNotFoundException;
   public int edgeCount();
   public boolean isReachable(String source, String target);
   public boolean isFullyReachable();
}

/*******************************************************/
public class LucasBanerjipd5AdjList implements AdjListInterface//, DFS_BFS//, EdgeListWithCities
{
   private ArrayList<Vertex> vertices = new ArrayList<Vertex>();
   private Map<String, Integer> nameToIndex = new TreeMap<String, Integer>();
   
   public LucasBanerjipd5AdjList()
   {
      vertices = new ArrayList<Vertex>();
      nameToIndex = new TreeMap<String, Integer>();
   }
   
   public List<Vertex> getVertices()
   {
      return vertices;
   }
   
   public Vertex getVertex(int i)
   {
      return vertices.get(i);
   }
   
   public Vertex getVertex(String vertexName)
   {
      for (Vertex v : vertices) 
      { 
         if (v.getName().equals(vertexName)) 
            return v;
      }
      return null;
       
   }
   
   public Map<String, Integer> getVertexMap()
   {
      return nameToIndex;
   }
   
   public void addVertex(String v)
   {
      if(!nameToIndex.containsKey(v))
      {
         vertices.add(new Vertex(v));
         nameToIndex.put(v, vertices.size() - 1);
      }
   }
   
   public void addEdge(String source, String target)
   {
      if(!nameToIndex.containsKey(source))
         addVertex(source);
      if(!nameToIndex.containsKey(target))
         addVertex(target);
         
      if(nameToIndex.containsKey(source) && nameToIndex.containsKey(target))
         getVertex(source).addEdge(getVertex(target));
   }
   public String toString()
   {
      String s = "";
      for(Vertex v: vertices)
      {
         s = s + "\n" + v + v.getAdjacencies();
      }
      return s;
   
   }
   
   ////////////////////////////////////////////////////////////////////////////// DFS_BFS

   public List<String> depthFirstSearch(String name) 
   {
      ArrayList<String> DFSlist = new ArrayList<String>();           //DFS
      Vertex tempV;
      Stack<Vertex> stack = new Stack<Vertex>();                     //use stack to get order of dfslist
      ArrayList<String> visitedlist = new ArrayList<String>();             //create list of all visited 
      boolean hasBeen = false;
   	
      stack.push(getVertex(name));
      visitedlist.add(name);
   
      while(!stack.isEmpty()) 
      {
         tempV = (Vertex) stack.peek();
         DFSlist.add(tempV.getName());
         stack.pop();
      
         for(Vertex ver : tempV.getAdjacencies()) 
         {
            for(int i = 0; i < visitedlist.size(); i++) 
            {
               if(visitedlist.get(i).equals(ver.getName()))
                  hasBeen = true;
            }
            if(!hasBeen) 
            {
               stack.push(ver);
               visitedlist.add(ver.getName());
            }
            hasBeen = false;
         }
      }
      return DFSlist;
   }
   
   public List<String> breadthFirstSearch(String name)    //same idea but use a queue
   {
      ArrayList<String> BFSlist = new ArrayList<String>();
      Vertex tempV;
      Queue<Vertex> queue = new LinkedList<Vertex>();
      ArrayList<String> visitedlist = new ArrayList<String>();
      boolean hasBeen = false;
   	
      visitedlist.add(name);
      queue.add(getVertex(name));
   	
      while(!queue.isEmpty()) {
         tempV = queue.peek();
         BFSlist.add(tempV.getName());
         queue.remove();
      
         for(Vertex ver : tempV.getAdjacencies()) 
         {
            for(int i = 0; i < visitedlist.size(); i++) 
            {
               if(visitedlist.get(i).equals(ver.getName()))
                  hasBeen = true;
            }
            if(!hasBeen) 
            {
               queue.add(ver);
               visitedlist.add(ver.getName());
            }
            hasBeen = false;
         }
      }
      return BFSlist;
   
   }
   
   public void graphFromEdgeListData(String fileOfCities) throws IOException
   {
      try {
      
         FileReader fileReader = new FileReader(fileOfCities);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String s;
         int toIndex = 0;
         String start = "";
         String end = "";
      
      	//iterates through each line of the text file (in this case cityEdgeList)
         while ((s = bufferedReader.readLine()) != null) 
         {
         	
            for(int i = 0; i < s.length(); i++)                 //finds the name for the first vertex
            {
               if(s.substring(i, i + 1).equals(" ")) 
               {                                           
                  start = s.substring(0, i);
                  toIndex = i + 1;                 //starting index of next for loop
                  break;
               }
            }
         	
         	//finds the name for the second vertex
            for(int j = toIndex; j < s.length(); j++) 
            {
               if(s.substring(j, j + 1).equals(" ")) 
               { 
                  end = s.substring(toIndex, j); //sets name to the previous index to second character index
                  addEdge(start, end); 
                  break;
               } 
               else if (j == s.length() - 1) 
               {                                     //or, if the iterator reaches the end of the line, set the name
                  end = s.substring(toIndex, j + 1); //use addEdge handle all the way to the end of the string for the substring method
                  addEdge(start, end);
               
               }
            }
         }
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   
   }

   public int edgeCount() {
      int count = 0;
      for(int i = 0; i < vertices.size(); i++) //all vertices
      { 
         for(int j = 0; j < vertices.get(i).getAdjacencies().size(); j++) //all vertex connections
         { 
            count++;
         }
      }
      return count;
   }
	
   public boolean isReachable(String from, String to) 
   {
      List<String> list = this.depthFirstSearch(from); 
      for(int i = 0; i < list.size(); i++) 
      {
         if(list.get(i).equals(to))                  //if vertices is equal to 'end', return true
            return true;
      }
      return false; 
   }

   public boolean isFullyReachable() //checks if every vertex is double sided and connects to every other node
   { 
      for(int i = 0; i < vertices.size(); i++) 
      { 
         for(int j = 0; j < vertices.size(); j++) 
         { 
            if(!isReachable(vertices.get(i).getName(), vertices.get(j).getName())) //check connections
               return false;                                                       //if one doesn't exist return false
         }
      }
      return true;
   }

}

