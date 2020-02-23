package day50;

// *   day 50 content:
//         *  We will create 2nd grade math Question program
//         *
//         *  Question is abstract idea
//        *     and we will represend it by Abstract class here
//     *
//             *     it has below fields :
//             *         int num1
//             *         int num2
//             *         String operator
//             *         int answer
//             *         boolean calculated
//             *         String questionType = "Unknown"
//             *
//             *         abstract void method calculate();
//        *
//        *         Constructor to set
//        *            Question type and Operator
//        *
//        *         toString method to return this question is + questionType
//        *
//        *         Create sub class Addition
//     *              it has one constructor to set num1 and num2
//             *              it should also set questionType to "addition"
//             *                                 operator to "+"
//             *              it should implement calculate method
//             *              toString method in below format
//             *                 return num1 + operator + num2 = "" if not calculated yet
//             *                 return num1 + operator + num2 = answer if already calculated
//  Create sub class Substraction
//   it has one constructor to set num1 and num2 (num1-num2 should never be minus)
//    if num1 should always be more than num2
//   if num1 is less than num2, swap them
//             *              it should also set questionType to "substraction question"
//             *                                 operator to "-"
//                            it should implement calculate method
//             *              toString method in below format
//             *                 return num1 + operator + num2 = "" if not calculated yet
//             *                 return num1 + operator + num2 = answer if already calculated


public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown"; // setting default value to unknown directly here to avoid null

    public abstract void calculate();

    public Question(String questionType, String operator) {
        this.questionType = questionType;
        this.operator = operator;

    }

    @Override
    public String toString() {
        return "The question type is " + questionType + " : ";
    }
}
