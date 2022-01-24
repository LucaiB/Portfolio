//name: Lucas Banerji  date: 5/5/19
//resource classes for Graphs6: Dijkstra
//                     Graphs7: Dijkstra with Cities

import java.io.*;
import java.util.*;

class Edge {
   public final wVertex target;
   public final double weight;
   
   public Edge(wVertex argTarget, double argWeight) {
      target = argTarget;
      weight = argWeight;
   }
}

interface wVertexInterface 
{
   public String toString();
   public String getName();
   public double getMinDistance();
   public void setMinDistance(double m);
   //public wVertex getPrevious();   //for Dijkstra 7
   //public void setPrevious(wVertex v);  //for Dijkstra 7
   public ArrayList<Edge> getAdjacencies();
   public void addEdge(wVertex v, double weight);   
   public int compareTo(wVertex other);
}

class wVertex implements Comparable<wVertex>, wVertexInterface
{
   private final String name;
   private ArrayList<Edge> adjacencies;
   // The reason why we have the two "unexpected" fields in the wVertex
   // class below is that when we run Dijkstra's algorithm, we want to 
   // obtain two things:
   // 1. The minimum distance of a vertex from the source vertex.
   // 2. The path of the minimum distance from the source to the target vertex.

   private double minDistance = Double.POSITIVE_INFINITY;
   private wVertex previous;  //for building the actual path in Dijkstra 7
                                //uncomment this part when you do Graph 7
   public wVertex(String n)
   {
      name = n;
      adjacencies = new ArrayList<>();
   }
   
   public wVertex getPrevious()
   {
      return previous;
   }
   
   public void setPrevious(wVertex x)
   {
      previous = x;
   }
   
   public String toString()
   {
      return name;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getMinDistance()
   {
      return minDistance;
   }
   
   public void setMinDistance(double m)
   {
      minDistance = m;
   }

   public ArrayList<Edge> getAdjacencies()
   {
      return adjacencies;
   }
   
   public void addEdge(wVertex v, double weight)
   {
      adjacencies.add(new Edge(v, weight));
   }
   
   public int compareTo(wVertex other)
   {
      return (int) (getMinDistance() - other.getMinDistance());
   }    
}


interface AdjListWeightedInterface 
{
   public List<wVertex> getVertices();
   public Map<String, Integer> getNameToIndex();
   public wVertex getVertex(int i);   
   public wVertex getVertex(String vertexName);
   public void addVertex(String v);
   public void addEdge(String source, String target, double weight);
   // This method does 2 things:
   // 1. Set the minimum distance field of all other vertices from the
   //    source vertex. 
   // 2. Set the previous vertext field. This is for tracing the path
   //    from the source to the target vertex. The method 
   //    getShortestPathTo (target) in line #73 needs to use this field in order
   //    to return the PATH from source to target.
   // SetRead Dijkstra_6_Driver.java to see how this 
   // method is called
   public void minimumWeightPath(String sourceVertexName);   //Dijkstra's
}
   /*  Graphs 7 */
// interface AdjListWeightedInterfaceWithCities 
// {       
   // public List<wVertex> getShortestPathTo(wVertex v);
   // public AdjListWeighted graphFromEdgeListData(File vertexNames, File edgeListData) throws FileNotFoundException ;
// }

public class LucasBanerjipd5AdjListWeighted implements AdjListWeightedInterface//, AdjListWeightedInterfaceWithCities
{
   private List<wVertex> vertices = new ArrayList<wVertex>();
   private Map<String, Integer> nameToIndex = new HashMap<String, Integer>();
  //the constructor is no-arg 
    
   public List<wVertex> getVertices()
   {
      return vertices;
   }
    
   public Map<String, Integer> getNameToIndex()
   {
      return nameToIndex;
   }
   
   public wVertex getVertex(int i)
   {
      return vertices.get(i);
   }
   
   public wVertex getVertex(String vertexName)
   {
      if(!nameToIndex.containsKey(vertexName))
         addVertex(vertexName);
      
      return getVertex(nameToIndex.get(vertexName));
   }
   
   public void addVertex(String v)
   {
      nameToIndex.put(v,vertices.size());
      vertices.add(new wVertex(v));
   
   }
   
   public void addEdge(String source, String target, double weight)
   {
      if(getVertex(source) == null)
         addVertex(source);
      if(getVertex(target) == null)
         addVertex(target);
      getVertex(source).addEdge(getVertex(target), weight);
   }
   
   public void minimumWeightPath(String sourceVertexName)
   {
      getVertex(sourceVertexName).setMinDistance(0);
      Queue<wVertex> queue = new LinkedList();
        
      for(wVertex v : vertices)
      {
         v.setPrevious(null); //set previous field
         queue.add(v);
      }
      while(!queue.isEmpty())
      {
            
         wVertex u = ((LinkedList<wVertex>) queue).get(0);  //finds min weight
         for(int i = 1; i < queue.size(); i++)
         {
            if(((LinkedList<wVertex>)queue).get(i).compareTo(u) < 0)
               u = ((LinkedList<wVertex>) queue).get(i);
         }
      
         queue.remove(u);            //removes min weight
         for(Edge e : u.getAdjacencies())
         {
            double length = u.getMinDistance() + e.weight; //min total distance 
            if(length < e.target.getMinDistance()) //compares paths
            {
               e.target.setMinDistance(length);
               e.target.setPrevious(u);
            }
         }
      }
   } 
}
   
   
    
