import javax.swing.*; 

public class Driver03
{
   public static void main(String[] args) 
   {
      JFrame frame =  new JFrame ("Mini Lab 3");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new Panel03( ));
      frame.setVisible(true);
   
   }
}