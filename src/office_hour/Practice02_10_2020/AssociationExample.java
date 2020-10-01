package office_hour.Practice02_10_2020;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String studentName;

    public Student(String studentName){
        this.studentName = studentName;

    }

    public String toString(){
        return studentName;
    }
}

class School{
    String schoolName;
    List<Student> allStudentsList;

    public School(String schoolName,List<Student> allStudentsList){
        this.schoolName = schoolName;
        this.allStudentsList = allStudentsList;
    }

    public void AddNewStudent(Student student){
        this.allStudentsList.add(student);
    }

    public void AddNewStudent(Student[] students){
        this.allStudentsList.addAll(Arrays.asList(students));
    }

    public void AddNewStudent(List<Student> listOfStudent){
        this.allStudentsList.addAll(listOfStudent);
    }

    public String toString(){
        return "" + allStudentsList;
    }

}

public class AssociationExample {

    public static void main(String[] args) {

        Student s1 = new Student("Hasan");
        System.out.println(s1);
//        System.out.println(s1.studentName);
        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Sumeyye");
        Student s5 = new Student("Parvin");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
//        System.out.println(list);


        School cybertek = new School("Cybertek",list);
        cybertek.AddNewStudent(new Student("Irina"));
        cybertek.AddNewStudent(new Student("Denis"));

        Student[] students = {
                new Student("Gulnaz"),
                new Student("Rukhshona")
        };

        cybertek.AddNewStudent(students);

        System.out.println(cybertek.allStudentsList);
//        System.out.println(cybertek.schoolName);//Cybertek

        for(Student eachStudent:cybertek.allStudentsList){
            System.out.println(eachStudent);
        }

        System.out.println(cybertek);


    }
}
