class ExtraChargeOrder extends Order
{
   public ExtraChargeOrder(String name, int cNum, int qOrdered, double price)
   {
      super(name, cNum, qOrdered, price);
   }

   public double computePrice()
   {
      return super.computePrice() + 4;
   }
}
