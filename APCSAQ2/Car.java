/**************************************************************
Lucas Banerji
Period 2
Car(class) Lab
Due 11/14/17
By doing this lab, I furhtered my understanding and familiarity 
of creating a class. Although I felt that this lab was easy, it
was a good way to practice basic concepts. 
**************************************************************/
public class Car
{
   private String make;
   private int year;
   private double mileage, cost;

   public Car(String make, int year, double mileage, double cost)
   {
      this.make = make;
      this.year = year;
      this.mileage = mileage;
      this.cost = cost;
   }
   public String toString()
   {
      return "Make: " + make + "\nYear: " + year +
             "\nMileage: " + mileage + "\nCost: " + cost;
   }
   
   public static void main(String[] args)
   {
      Car x = new Car("Honda", 2005, 19078, 15000);
      System.out.println(x);
   }
}
/*
  ----jGRASP exec: java Car
 Make: Honda
 Year: 2005
 Mileage: 19078.0
 Cost: 15000.0
 
  ----jGRASP: operation complete.
  */