package day55.association2;

import java.util.List;

public class CourseX {

    String topic;
    List<Student> studentList;

    public CourseX(String topic, List<Student> studentList) {
        this.topic = topic;
        this.studentList = studentList;
    }
    // version of add student that accept Student Object
    public void addStudent(Student s){
        studentList.add(s);
    }


    // version of add student that accept Student name and id
    // so we can create object inside the method and add to the list
    public void addStudent(String name,int ID){

        Student s1 = new Student(name,ID);
        studentList.add(s1);
    }

    @Override
    public String toString() {
        return "CourseX{" +
                "topic='" + topic + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
