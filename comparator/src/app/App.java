package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


 class Hello{
  public static void main (String[] args) {
    List<Student> studn = new ArrayList<>();
    studn.add(new Student(1000, 413));
    studn.add(new Student(1001, 441));
    studn.add(new Student(1002, 550));
    studn.add(new Student(1003,119));
    
  
    Collections.sort(studn, (s1, s2) ->{
     return s1.marks > s2.marks? 1: s1.marks < s2.marks ? -1:0;
      
    });
    
    for(Student st: studn){
      System.out.println("Student Detail : " + st);
    }
    
        
  }
}



class Student{
  int rollNO;
  int marks;
  
   Student(int rollNumber, int marks){
    this.rollNO = rollNumber;
    this.marks = marks;
  }
  public String toString(){
    return "Student{ rollNumber = " + rollNO + " Marks = " +marks + " }";
  }
}
