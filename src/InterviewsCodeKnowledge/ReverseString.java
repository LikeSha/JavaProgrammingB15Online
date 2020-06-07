package InterviewsCodeKnowledge;

public class ReverseString {

    // VERY VERY IMPORTANT QUESTION : WHAT IS THE INDEX OF LAST CHARACTER ????
    //ANSWER: YOU FIRST ASK INTERVIEWER : HOW MANY CHARACTER DO YOU HAVE ? I HAVE 5 CHARACTER
    //(HELLO) ,WHAT IS MY LAST INDEX ? MY LAST INDEX IS ALWAYS ALWAYS 1 LESS  THAN MY
    // CHARACTER COUNT !!!
    //THEY WILL ASK THIS KIND OF QUESTION IN INTERVIEW !!!!!
    // How do you find out last character of any String
    // counting character start with one
    // counting index (location) start with 0
    // so last character index/location will be always one less than actual character count
    public static void main(String[] args) {

        // method 1 :
//                     01234
        String name = "Akbar" ;

        System.out.println( name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2)
                + " " + name.charAt(1) + " " + name.charAt(0));


    }

}
