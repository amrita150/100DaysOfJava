import java.util.*;

public class Constructor {
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Amrita");
        Student s3 = new Student(1234);

        
        //this will show error
        // Student s3 = new Student("Amrita" , 1234);
        s1.name = "Shaina";
        s1.rollno = 1254;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2]=80;

        Student s4 = new Student(s1);
        s4.name = "Sheenu";
        s1.marks[2] = 100; //in shallow copy this change will also reflect in s4 object but in deep copy this wont happen

        for(int i = 0 ; i<3 ; i++)
     {
        System.out.println(s4.marks[i]);
     }


    }
}

class Student{

 //constructor -> automatically invoked when we create an object
 Student() //non-parameterized constructor
 { 
    marks = new int[3];
    System.out.println("Constructor is called...");
 }

 Student(String name) //parameterized cons
 {
    this.name = name;
 }

 Student(int roll)
 {
    this.rollno = roll;
 }


 //shallow copy constructor
//  Student(Student s1)
//  {
//     marks = new int[3];
//     this.name = s1.name;
//     this.rollno = s1.rollno;
//     this.marks = s1.marks;
//  }

 //deep copy constructor
 Student(Student s1)
 {
    marks = new int[3];
    this.name = s1.name;
    this.rollno = s1.rollno;
    for(int i = 0 ; i<marks.length ; i++)
     {
      this.marks[i] = s1.marks[i];
     }
}

 //properties
 int rollno;
 String name;
 int marks[];

}
