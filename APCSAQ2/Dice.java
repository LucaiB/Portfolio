/**************************************************************
Lucas Banerji
Period 2
Dice(class) Lab
Due 11/16/17
By doing this lab, I furhtered my understanding and familiarity 
of creating a class. Although I felt that this lab was easy, it
was a good way to practice basic concepts as well as the new 
Math.random concept. 
**************************************************************/
public class Dice
{
   private int side;
   public Dice()
   {
      side = 3;
   }

   public void roll()
   {
      side = (int)(Math.random()*6+1);
   }
   public int currentSide()
   {
      return side;
   }
   public static void main (String [] args)
   {  
      Dice d = new Dice(); 
      System.out.println (d.currentSide());                                                                     
      for (int   k = 1; k <= 5; k++)  
      {   
         d.roll();   
         System.out.println ("\nCurrent side:  " + d.currentSide());  
      }  
   }
}
/*   Output
  ----jGRASP exec: java Dice
 3
 
 Current side:  2
 
 Current side:  3
 
 Current side:  3
 
 Current side:  6
 
 Current side:  5
 
  ----jGRASP: operation complete.
  */