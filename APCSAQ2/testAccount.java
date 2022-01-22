public class Account
{
   private double balance;

   public Account()
   {
      this.balance = 0;
   }
   
   public Account(double balance)
   {
      this.balance = balance;
   }
   
   public double Deposit(double add)
   {
      return balance += add;
   }
   
   public double Withdraw(double minus)
   {
      if (balance - minus < 0)
      {
         balance += -5;
      }
      return balance -= minus; 
   }
   
   public String toString()
   {
      return "Balance: " + balance;
   }
   
   public boolean equals (Account other)
   {
      return this.balance == other.balance;
   }
   
   }
   public class testAccount
   {
      public void main(String[] args)
      { 
         Account account = new Account(10);
         System.out.println(account);
      }
   }
