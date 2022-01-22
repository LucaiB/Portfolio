import java.util.*;
import java.io.*;
public class Account
{
   private String username, password;
   private double balance;
   
   public Account(String user,String passWord)
   {
      username = user;
      password = passWord;
      balance = 0;
   }
   
   public Account()
   {
      username = null;
      password = null;
      balance = 0;
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   public void withdraw(int amount)
   {
      balance -= amount;
   }
   
   public void deposit(int amount)
   {
      balance += amount;
   }
   
   public boolean isUser(String inputUsername, String inputPassword)
   {
      if(inputUsername.equals(username) && inputPassword.equals(password))
         return true;
      else
         return false;
   }
}