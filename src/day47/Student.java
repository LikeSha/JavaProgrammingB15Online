package day47;

public class Student {

    final int studentID;
    // public final static field with initial value set(CONSTANT)
    //This type of field name always suggested to make all uppercase
    //to make it clear that this is a public static field that never change
    //other languages has specific term called CONSTANT for this
    // when interview if they ask you " tell me about constant in Java "
    // your answer is it " public static final field "
    //if interviewer asks for how do I define CONSTANT in Java ?
    // you would say will create public static final field
    public static final String SCHOOL = "Cyertek";

    public Student(int studentID){
        this.studentID = studentID;

        //final method can be inherited but cannot be modified
    }
}
