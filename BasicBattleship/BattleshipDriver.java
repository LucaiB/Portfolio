import javax.swing.*; 

public class BattleshipDriver
{
   public static void main(String[] args) 
{  
      JFrame frame =  new JFrame ("BattleShip");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new BattleshipPanel());
      frame.setVisible(true);
      
      
   }
}