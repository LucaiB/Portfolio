import java.util.Scanner;
public class StudentBody
{
   Student [] sbody = new Student [4];
   Student Bob = new Student (1, "Bob", 2.13);
   Student Joe = new Student (2, "Joe", 3.00);
   Student Lucas = new Student (3, "Lucas", 4.99);

   public StudentBody()
   {
      sbody[0] = Bob;
      sbody[1] = Joe;
      sbody[2] = Lucas; 
      sbody[3] = null;
   }

   public void init()
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter student ID: ");
      int newID = in.nextInt();
      System.out.println("Enter student name: ");
      String newName = in.next();
      System.out.println("Enter student GPA: ");
      double newGPA = in.nextDouble();
   
      Student newStudent = new Student (newID, newName,newGPA);
      sbody[3] = newStudent;
   }

   public Student searchID(int target)
   {
      for (int k = 0; k < sbody.length; k++)
      {
         if (sbody[k].id == target)
            return sbody[k];
      }
      return null; 
   }
   
   public String toString()
   {
      return "Student 1: \n" + sbody[0] + 
         "\nStudent 2: \n" + sbody[1] +
         "\nStudent 3: \n" + sbody[2] + 
         "\nStudent " + sbody[3].id + ": \n" + sbody[3];
       
   }
}

