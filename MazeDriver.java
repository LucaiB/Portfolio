import javax.swing.*; 

public class MazeDriver
{
   public static void main(String[] args) 
   {  
      JFrame frame =  new JFrame ("Maze: Lucas Banerji Pd.5");  
      frame.setSize (400, 350);  
      frame.setLocation (200, 200);     
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setContentPane (new MazePanel());
      frame.setVisible(true); 
   }
}