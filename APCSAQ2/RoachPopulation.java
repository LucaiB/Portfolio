/**************************************************************
Lucas Banerji
Period 2
Roach(class) Lab
Due 11/16/17
By doing this lab, I furhtered my understanding and familiarity 
of creating a class. Although I felt that this lab was easy, it
was a good way to practice basic concepts.
**************************************************************/
public class RoachPopulation
{
   public int Size;

   public RoachPopulation(int Size)
   {
      this.Size = Size;
   }

   public void waitForDoubling()
   {
      Size *= 2;
   }

   public void spray()
   {
      Size = (int)(Size*0.9);
   }

   public int getRoaches()
   {
      return Size;
   }
   
   public String toString()
   {
   return "Size: " + Size;
   }

   public static void main (String [] args)   
   {         
      RoachPopulation  kitchen = new RoachPopulation(10); 
               
      for (int  k = 1; k <= 3; k++)       
      {              
         kitchen.waitForDoubling();
         kitchen.spray();     
         System.out.println (kitchen);
      } 
   }  
}
/*    Output
  ----jGRASP exec: java RoachPopulation
 Size: 18
 Size: 32
 Size: 57
 
  ----jGRASP: operation complete.
  */
