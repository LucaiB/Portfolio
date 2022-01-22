/**************************************************************
Lucas Banerji
Period 2
PVT Lab
Due 11/28/17
I furthered my understanding on inheritance during this lab.
I felt like it was easy and it didn't take much time to complete.
I did however have some trouble with the "super" statement.
**************************************************************/
public class DriverPVT
{
   public static void main(String[] args)
   {
      Person Lucas = new Person ("Lucas", 15);
      System.out.println(Lucas);
      Vehicle x = new Vehicle ("Audi", 5, Lucas);
      System.out.println(x);
      Truck y = new Truck ("Ford", 6, Lucas, 200, 500);
      System.out.println(y);
   }
}


