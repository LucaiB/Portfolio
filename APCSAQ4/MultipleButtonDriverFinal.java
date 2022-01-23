import javax.swing.*; 

public class MultipleButtonDriverFinal
{
   public static void main(String[] args) 
{  
      JFrame frame =  new JFrame ("Multiple Button");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new MultipleButtonPanelFinal());
      frame.setVisible(true);
   }
}