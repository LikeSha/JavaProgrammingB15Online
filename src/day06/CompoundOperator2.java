package day06;

public class CompoundOperator2 {

    public static void main(String[] args) {

        // Assignment Operator =
        // -->> will save the result of whatever operation on the right side
        // and assign the result to the left side variable ;

        // +=, -=, *=, /=, %= are called shorthand operator, compound operator
        // on both side of the assignment

        int studentOnLine = 263 ;

        // studentOnLine = studentOnLine + 5
        studentOnLine += 5;

        System.out.println("5 people joined the class" +  studentOnLine);

        //studentOnLine = studentOnline - 3 ;
        studentOnLine -= 3;

        System.out.println(" 3 people left the clas " + studentOnLine);

        // studentOnLine = studentOnLine * 2
        studentOnLine *= 2;

        System.out.println(" the student count doubled " + studentOnLine);

        // studentOnLine = studentOnLine / 3 ;
        studentOnLine /= 3 ;

        System.out.println(" the student count dropped to 1/3 : " + studentOnLine);








    }

}
