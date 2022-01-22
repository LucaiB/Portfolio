/************************************************************************
Lucas Banerji
Pd.2
Lab 6b: printAmerican
Due 9/19/17
I learned how to use methods in order to reduce redundncy 
as well as making the code easier to read. This program was an excellent
example as it was made extremely easy to understand as opposed to date.java
*************************************************************************/
public class printAmerican 
{
   public static void main(String[] args)
   {
      String day, month;
      String date, year;
      day = "Saturday";
      month = "July";
      date = "16";
      year = "2011";
   
      System.out.println("American format:");
      System.out.println(printAmerican(day, month, date, year));
   
      System.out.println("European format:");
      System.out.println(printEuropean(day, month, date, year));
  
   }
   public static String printAmerican(String day,String month, String date,String year)
   {
      return (day +", "+month+" "+date+", "+year);
   }
   public static String printEuropean(String day,String month, String date,String year)
   {
      return (day +" "+date+" "+month+", "+year);
   }
}
/*  Output
 ----jGRASP exec: java printAmerican
 American format:
 Saturday, July 16, 2011
 European format:
 Saturday 16 July, 2011
 
  ----jGRASP: operation complete.
  */