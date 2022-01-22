/************************************************************************
NAME:  Lucas Banerji    
PERIOD: 2
DUE DATE:  1/10/18 

PURPOSE: To show convert names so that the first initial is the last 
character of the last name and that the middle initial is the second to last 
character of the last name.  

WHAT I LEARNED: I learned how to use arrays in order to receive Strings
and then convert those Strings and put them into new Arrays. I also leanrned
that the Character.toUpperCase method is a great tool when editing Strings
and chars.  
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
Scott Sulivan helped me grasp the concept of what the purpose of the lab was.
***************************************************************************/
import java.util.Scanner;
public class EmployeeNamesTester
{
   public static Scanner console = new Scanner (System.in);
   public static void main(String [] args)
   {
      String [] lastNames = new String [10];
      
      int index = 0;
      while (index < 10)
      {
         System.out.println("Enter 'n' to add a name and 'f' to format" 
                                                    + "current names");
         if(console.next().equals("n"))
         {
            System.out.println("Enter the last name: ");
            lastNames[index++] = console.next();
         }else{
            break;
         
         }
         }
         String [] formatNames = EmployeeNames.convertName(lastNames);
         for (String a:formatNames)
         {
            if (a != null)
               System.out.println(a);
         }
      }
   }


/*  Output
 ----jGRASP exec: java EmployeeNamesTester
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Smith
 Enter 'n' to add a name and 'f' to format current names
 f
 H. T. Smith
 
  ----jGRASP: operation complete.
 ----jGRASP exec: java EmployeeNamesTester
 Enter 'n' to add a name and 'f' to format current names
 f
 
  ----jGRASP: operation complete.
      ----jGRASP exec: java EmployeeNamesTester
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Smith
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Jones
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Lau
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Banerji
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Ball
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 EEEEEE
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Sullivan
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 APCSA
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 Pascal
 Enter 'n' to add a name and 'f' to format current names
 n
 Enter the last name: 
 BB
 H. T. Smith
 S. E. Jones
 U. A. Lau
 I. J. Banerji
 L. L. Ball
 E. E. EEEEEE
 N. A. Sullivan
 A. S. APCSA
 L. A. Pascal
 B. B. BB
 
  ----jGRASP: operation complete.

  */
  
