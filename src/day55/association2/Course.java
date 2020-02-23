package day55.association2;

import java.util.List;

public class Course {

    String name;
  //  String[] studentNames; this will work but fixed in size
    List<String> studentNames;

    public Course(String name, List<String> studentNames) {
        this.name = name;
        this.studentNames = studentNames;
    }
     public void addStudent(String name){

        studentNames.add(name);

     }
      public void addManyStudents(List<String> many){

        studentNames.addAll(many); // adding one list to another list

      }

     @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
