import javax.swing.*; 

public class SQRTDriver
{
   public static void main(String[] args) 
{  
      JFrame frame =  new JFrame ("Hello Text Box");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new SQRTPanel( ));
      frame.setVisible(true);
   
   }
}