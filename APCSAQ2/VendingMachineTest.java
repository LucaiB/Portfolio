/***************************************************************
Lucas Banerji
Period 2
VendingMachine(class) Lab
Due 11/20/17
I furthered my undertanding of accesors and modifiers in this lab.
It was easy and didn't take me long to complete but it was a good
refresher on basic class concepts.
***************************************************************/
public class VendingMachineTest
{
   public static void main (String [] args)   
   {     
      VendingMachine  machine = new VendingMachine();  
      VendingMachine  javaMachine = new VendingMachine (20); 
                       
      machine.addCans (20);  
      machine.insertToken();  
      machine.insertToken(); 
   
      System.out.println (machine);     
      System.out.println (javaMachine);    
   }

}

class VendingMachine
{
   private int sodaCanCount;
   private int tokenCount;

   public VendingMachine()
   {
      sodaCanCount = 10;
      tokenCount = 0;
   }

   public VendingMachine(int sodaCanCount)
   {
      this.sodaCanCount = sodaCanCount;
      tokenCount = 0;
   }

   public void addCans(int numOfNewCans)
   {
      sodaCanCount += numOfNewCans;
   }
   
   public void insertToken()
   {
      tokenCount++;
      sodaCanCount--;
   }
         
   public int getCans()
   {
      return sodaCanCount;
   }
   
   public int getTokens()
   {
      return tokenCount;
   }
   
   public String toString()
   {
      return "Soda Cans: " + sodaCanCount +
          " Tokens: " + tokenCount;
   }
}

/*  Output
 ----jGRASP exec: java VendingMachine
 Soda Cans: 28 Tokens: 2
 Soda Cans: 20 Tokens: 0
 
  ----jGRASP: operation complete.
*/