import javax.swing.*; 

public class FourButtonDriver
{
   public static void main(String[] args) 
   {
      JFrame frame =  new JFrame ("FourButton");  
      frame.setSize (400, 350);  
      frame.setLocationRelativeTo (null);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new FourButtonPanel( ));
      frame.setVisible(true);
   
   }
}