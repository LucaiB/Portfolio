import javax.swing.*; 
 
public class Driver00
{
   public static void main(String[] args) 
   {
      JFrame frame =  new JFrame ("My first GUI");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new Panel00( ));
      frame.setVisible(true);
   }
}