package office_hour.Practice02_10_2020;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    String studentName;

    public Student(String studentName){
        this.studentName = studentName; // if you wanna call instance variable ,you must use this keyword !

    }
     @Override
    public String toString(){
        return "";
    }



}

class School{
    String schoolName;
    List<Student> AllStudentsList;

    public School(String schoolName,List<Student> AllstudentList){
        this.schoolName = schoolName;
        this.AllStudentsList = AllstudentList;
    }

    public void AddNewStudent(Student student){
        this.AllStudentsList.add(student);
    }

    public void AddNewStudent(Student[] students){
        this.AllStudentsList.addAll(Arrays.asList(students));

    }

    public void AddNewStduent(List<Student> listOfStudent){
        this.AllStudentsList.addAll(listOfStudent);
    }

}

 class AssociationExample{

     public static void main(String[] args) {

         Student s1 = new Student("Hasan");
         System.out.println(s1);
         System.out.println(s1.studentName);

      Student s2 = new Student("Muge");
      Student s3 = new Student("Aiko");
      Student s4 = new Student("Sumeyye");
      Student s5 = new Student("Parvin");

      List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

      School cybertek = new School("Cyberteck",list);
         cybertek.AddNewStudent( new Student("Irina"));
         cybertek.AddNewStudent( new Student("Denis"));

         Student[] students = {new Student("Gulnaz"),new Student("Rukshona")};
         cybertek.AddNewStudent(students);

         System.out.println(cybertek.AllStudentsList);
        // System.out.println(cybertek.schoolName);//Cybertek

         for(Student each: cybertek.AllStudentsList){
             System.out.println(each);
         }


     }


}