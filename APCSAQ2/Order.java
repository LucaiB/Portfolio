/**************************************************************
Lucas Banerji
Period 2
Order Lab
Due 11/28/17
I learned how to create a sub and parent class to implement 
the new concept of inheritance. It took a while to get the
hang of using the "super" statement but in the end I figured
it out.
**************************************************************/
public class Order
{
   private String name;
   private int customerNum;
   private int quantityOrdered;
   private double price;

   public Order (String name, int cNum, int qOrdered, double price)
   {
      this.name = name;
      this.price = price;
      customerNum = cNum;
      quantityOrdered = qOrdered;
   }

   public double computePrice()
   {
      return quantityOrdered * price;
   }

   public boolean equals(Order other)
   {
      return this.name.equals (other.name) &&
         this.customerNum == other.customerNum &&
         this.quantityOrdered == other.quantityOrdered &&
         this.price == other.price;
   }

   public String toString()
   {
      return "Name: " + name + "\nCustomer Number: " +
         customerNum + "\nQuantity Ordered: " + 
         quantityOrdered + "\nPrice: " + price;
   }
}


