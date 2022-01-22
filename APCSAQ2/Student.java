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
**************************************************************/
public class Student
{
   int id;
   private String name;
   private double gpa;

   public Student()
   {
      this.id = 0000;
      this.name = "Bob";
      this.gpa = 0.0;
   }

   public Student(int id, String name, double gpa)
   {
      this.id = id;
      this.name = name;
      this.gpa = gpa;
   }

   public String toString()
   {
      return "ID: " + id + 
             "\nName: " + name +
             "\nGPA: " + gpa;
   }    
   
   public int getID()
   {
      return id;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getGPA()
   {
      return gpa;
   }
   
   public static void main(String[] args)
   {    
      Student lau = new Student (1290, "Edmund", 3.95); 
   
      System.out.println (lau.getID()); 
      System.out.println (lau);     
   } 
}  //end of Student Class
/*  Output
  ----jGRASP exec: java Student
 1290
 ID: 1290
 Name: Edmund
 GPA: 3.95
 
  ----jGRASP: operation complete.
   */
