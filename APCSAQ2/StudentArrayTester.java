/**************************************************************************
NAME:  Lucas Banerji    
PERIOD: 2
DUE DATE:  1/10/18 

PURPOSE:Have an array of students and then add another student. Then the program
asks for an ID. If the ID is available, the program will return the student,
otherwise it will return void. Finally, the program prints the whole array of 
students.   

WHAT I LEARNED: I furthered my understanding of arrays as well as making 
classes. This was also one of the first programs that I used "null" so that 
one of the arrays open spaces would have nothing in it. 
            
CREDITS (BE SPECIFIC: FRIENDS, PEERS, ONLINE WEBSITE): 
None...
***************************************************************************/
import java.util.Scanner;
public class StudentArrayTester
{
   public static void main (String [] args)
   {        
      StudentBody   students = new StudentBody(); 
   
      students.init();  
      Scanner keyboard = new Scanner (System.in);  
      System.out.println ("Enter the id of the student you are looking for: ")  ;
      int   studentID = keyboard.nextInt(); 
   
      Student target = students.searchID(studentID); 
   
      if  (target != null)      
         System.out.println (target);   
      else     
         System.out.println ("Student not found … "); 
   
      System.out.println("Student Body Information: \n" + students);  
   }  // end of main 
}

/*  Output
  ----jGRASP exec: java StudentArrayTester
 Enter student ID: 
 100
 Enter student name: 
 asdfg
 Enter student GPA: 
 2.43
 Enter the id of the student you are looking for: 
 1
 ID: 1
 Name: Bob
 GPA: 2.13
 Student Body Information: 
 Student 1: 
 ID: 1
 Name: Bob
 GPA: 2.13
 Student 2: 
 ID: 2
 Name: Joe
 GPA: 3.0
 Student 3: 
 null
 Student 4: 
 ID: 3
 Name: Lucas
 GPA: 4.99
 Student 100: 
 ID: 100
 Name: asdfg
 GPA: 2.43
 
  ----jGRASP: operation complete.
  
       ----jGRASP exec: java StudentArrayTester
 Enter student ID: 
 5
 Enter student name: 
 reg
 Enter student GPA: 
 4
 Enter the id of the student you are looking for: 
 5
 ID: 5
 Name: reg
 GPA: 4.0
 Student Body Information: 
 Student 1: 
 ID: 1
 Name: Bob
 GPA: 2.13
 Student 2: 
 ID: 2
 Name: Joe
 GPA: 3.0
 Student 3: 
 ID: 3
 Name: Lucas
 GPA: 4.99
 Student 5: 
 ID: 5
 Name: reg
 GPA: 4.0
 
  ----jGRASP: operation complete.
  */