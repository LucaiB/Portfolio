import javax.swing.*; 

public class HelloDriver
{
   public static void main(String[] args) 
   {
      JFrame frame =  new JFrame ("Hello Button");  
      frame.setSize (400, 350);  
      frame.setLocationRelativeTo (null);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new HelloPanel( ));
      frame.setVisible(true);
   
   }
}