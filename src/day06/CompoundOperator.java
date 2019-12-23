package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        // Assignment Operator =
        // -->> will save the result of whatever operation on the right side
        // and assign the result to the left side variable ;
        int studentOnLine = 263;

        studentOnLine = studentOnLine + 5 ;

        System.out.println("5 people joined the class" +  studentOnLine);

        studentOnLine = studentOnLine -3 ;

        System.out.println(" 3 people left the clas " + studentOnLine);
        // studentOnLine = studentOnLine *2

        studentOnLine = studentOnLine + studentOnLine ;

        System.out.println(" the student count doubled " + studentOnLine);

        studentOnLine = studentOnLine / 3 ;
        System.out.println(" the student count dropped to 1/3 : " + studentOnLine);



    }
}
