import javax.swing.*; 

public class NQueenPrblm
{
   public static void main(String[] args) 
   {  
      String x = JOptionPane.showInputDialog("Choose size");
   
      JFrame frame =  new JFrame ("QueenPrblm: Lucas Banerji Pd.5");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new NQueenPrblmPane(Integer.parseInt(x)));
      frame.setVisible(true); 
   }
}