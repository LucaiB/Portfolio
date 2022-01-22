public class Truck extends Vehicle
{
   private double loadCapacity;
   private int towingCapacity;

   public Truck()
   {
      super();
      loadCapacity = 0.0;
      towingCapacity = 0;
   }

   public Truck(String m, int cNum, Person x, double lC, int tC)
   {
      super (m, cNum, x);
      loadCapacity = lC;
      towingCapacity = tC;
   }  

   public double getLoadCapacity()
   {
      return loadCapacity;
   }
   public int towingCapacity()
   {
      return towingCapacity;
   }
   
   public boolean equals(Truck other)
   {
      return this.loadCapacity == other.loadCapacity
         && this.towingCapacity == other.towingCapacity;
   }
   
   public String toString()
   {
      return super.toString() + "\nTowing Capacity: " + towingCapacity
         + "\nLoading Capacity: " + loadCapacity;
   }
}
/*  Output
  ----jGRASP exec: java DriverPVT
 Name: Lucas    //Person
 Age: 15
 
 Name: Lucas    //Vehicle
 Age: 15
 Make: Audi
 Cylinder Number: 5
 
 Name: Lucas    //Truck
 Age: 15
 Make: Ford
 Cylinder Number: 6
 Towing Capacity: 500
 Loading Capacity: 200.0
 
  ----jGRASP: operation complete.
  */