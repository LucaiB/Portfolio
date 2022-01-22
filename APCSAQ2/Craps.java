import java.util.Scanner;
public class Craps
{
   static Scanner console = new Scanner (System.in);
   private int currentSide;
   private int currentSide2;
   public Craps()
   {
      currentSide = (int)(Math.random() * 6)+ 1;
      currentSide2 = (int)(Math.random() * 6)+ 1;
   } 
   public int getCurrentSide()
   {
      return currentSide;
   }
   public int getCurrentSide2()
   {
      return currentSide2;
   }
   public void roll()
   {
      currentSide = (int)(Math.random()*6+1);
      currentSide2 = (int)(Math.random()*6+1);
   } 
   public int findSetPoint()
   {
      return getCurrentSide() + getCurrentSide2();
   }

   public static void main (String[]args)
   {
      Craps c = new Craps();
      System.out.println("Welcome to our Craps Game extrodainaire!" +
                         "\nHere is how you play.\nA first roll of 7" +
                         "or 11 wins.\nA first roll of 2 or 12 loses.\n" +
                         "Any other first role becomes set point." +
                         "\nSubsequent rolls of 7 and 11 lose.\n" + 
                         "On subsequent rolls the set point!\n" +
                         "You are limited to 5 rolls max.\nHere's" + 
                         "what happened for you.");

      int roll = 1;
      for (int k =1; k<= 5; k++)
      {
         c.roll();
         System.out.println("\nRoll# " + roll + "\nYou rolled: " + 
                            c.getCurrentSide() + " and a " + c.getCurrentSide2());
         if (roll == 5)
         {
            System.out.println("Sorry you lose you rolled five times and no luck.");
            break;
         }
         else
         {
            if (roll == 1)
            {
               if (c.findSetPoint() == 7 || c.findSetPoint() == 11)
               {
                  System.out.println("Horay you win! You got a " + c.findSetPoint()
                                      + " first roll");
                  break;
               }
               else if (c.findSetPoint() == 2 || c.findSetPoint() == 12)
               {
                  System.out.println("Sorry you lose.");
                  break;
               }
               else
               {
                  System.out.println("Your setpoint is " + c.findSetPoint());
                  System.out.println("Press 1 to continue");
                  int key = console.nextInt();
                  if (key == 1)
                  {
                     roll++;
                  }
                  else
                  {
                     break;
                  }
               }
            }
            else
            {
               if (c.findSetPoint() == 7 || c.findSetPoint() == 11)
               {
                  System.out.println("Sorry you lose");
                  break;
               }
               else
               {
                  System.out.println("Your setpoint is " + c.findSetPoint());
                  System.out.println("Press 1 to continue");
                  int key = console.nextInt();
                  if (key == 1)
                  {
                     roll++;
                  }
                  else
                  {
                     break;
                  }
               }
            }//else
         }//else
      } //for
   } //main
} //craps

/*   Output
  ----jGRASP exec: java Craps
 Welcome to our Craps Game extrodainaire!
 Hers how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12.
 Any other first role becomes set point.
 Subsequent rolls of 7 and 11 lose.
 On subsequent rolls the set point!
 You are limited to 5 rolls max.
 Heres what happened for you.
 
 Roll# 1
 You rolled: 6 and a 3
 Your setpoint is 9
 Press 1 to continue
 1
 
 Roll# 2
 You rolled: 3 and a 5
 Your setpoint is 8
 Press 1 to continue
 1
 
 Roll# 3
 You rolled: 2 and a 2
 Your setpoint is 4
 Press 1 to continue
 1
 
 Roll# 4
 You rolled: 6 and a 1
 Sorry you lose
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Craps
 Welcome to our Craps Game extrodainaire!
 Hers how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12.
 Any other first role becomes set point.
 Subsequent rolls of 7 and 11 lose.
 On subsequent rolls the set point!
 You are limited to 5 rolls max.
 Heres what happened for you.
 
 Roll# 1
 You rolled: 4 and a 3
 Horay you win! You got a 7 first roll
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java Craps
 Welcome to our Craps Game extrodainaire!
 Hers how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12.
 Any other first role becomes set point.
 Subsequent rolls of 7 and 11 lose.
 On subsequent rolls the set point!
 You are limited to 5 rolls max.
 Heres what happened for you.
 
 Roll# 1
 You rolled: 1 and a 1
 Sorry you lose.
 
  ----jGRASP: operation complete.
       ----jGRASP exec: java Craps
 Welcome to our Craps Game extrodainaire!
 Hers how you play.
 A first roll of 7 or 11 wins.
 A first roll of 2 or 12.
 Any other first role becomes set point.
 Subsequent rolls of 7 and 11 lose.
 On subsequent rolls the set point!
 You are limited to 5 rolls max.
 Heres what happened for you.
 
 Roll# 1
 You rolled: 2 and a 2
 Your setpoint is 4
 Press 1 to continue
 1
 
 Roll# 2
 You rolled: 3 and a 2
 Your setpoint is 5
 Press 1 to continue
 1
 
 Roll# 3
 You rolled: 2 and a 1
 Your setpoint is 3
 Press 1 to continue
 1
 
 Roll# 4
 You rolled: 1 and a 4
 Your setpoint is 5
 Press 1 to continue
 1
 
 Roll# 5
 You rolled: 5 and a 2
 Sorry you lose you rolled five times and no luck.
 
  ----jGRASP: operation complete.
  */