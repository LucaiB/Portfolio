public class Vehicle
{
   private String make;
   private int CylinderNum;
   private Person owner;

   public Vehicle()
   {
      make = "No manufacturer yet.";
      CylinderNum = 0;
      owner = null;
   }

   public Vehicle(String make, int cNum, Person owner)
   {
      this.make = make;
      CylinderNum = cNum;
      this.owner = owner;
   }

   public String getMake()
   {
      return make;
   }
   public int getCNum()
   {
      return CylinderNum;
   }
   public Person getOwner()
   {
      return owner;
   }
   
   public boolean equals(Vehicle other)
   {
      return this.make.equals (other.make) &&
          this.CylinderNum == other.CylinderNum
          && this.owner == other.owner;
   }
   
   public String toString()
   {
      return super.toString() + "\nMake: " + make + 
         "\nCylinder Number: " + CylinderNum;
   }
}
