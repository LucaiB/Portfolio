public class Box
{
   private int width, length, height;

   public Box()
   {
      this. width = 1;
      this.length = 1;
      this.height = 1;
   }

   public Box(int width, int length, int height)
   {
      this. width = width;
      this.length = length;
      this.height = height;
   }   
   
   public String toString()
   {
      return "\nWidth: " + width + 
          "\nlength: " + length + 
          "\nHeight: " + height;
   }
   

   public static void main (String [] args) 
   {           
      Box defaultBox = new Box();  
      Box box = new Box(1, 2, 3); 
   
      System.out.println(defaultBox);
      System.out.println(box); 
   }
} // End of box