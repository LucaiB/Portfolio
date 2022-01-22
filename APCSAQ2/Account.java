/**************************************************************
Lucas Banerji
Period 2
Account(class) Lab
Due 11/10/17
I really learned how to create and compose a class.
Before this lab I had a vague understanding on how
to construct a class. It took a while for me to do this lab
but it was extremely beneficial as I futhered my understanding 
of constructors, instance variables, and the toString method.
***************************************************************/

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
   
   public double checkBalance()
   {
      return balance;   
   }
   
   public void Deposit(double deposit)
   {
      balance += deposit;
   }
   
   public void Withdraw(double withdraw)
   {
      if (withdraw > balance){
         balance -= 5;
      }else {
         balance -= withdraw; 
      }
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
