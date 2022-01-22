import java.util.*;
import java.io.*;

public class LucexBank
{
   private TreeSet<Account> allAccounts;

   public LucexBank()
   {
      allAccounts = new TreeSet<Account>();
   } 
   
   public void addAccount(String user, String password)
   {
      allAccounts.add(new Account(user,password));
   }
   
   public void removeAccount(String username, String password)
   {
      allAccounts.remove(findAccount(username, password));     
   }
   
   public Account findAccount(String username, String password)
   {
      for(Account acc: allAccounts)
         if(acc.isUser(username, password))
            return acc;
            
      return null;
   }
}