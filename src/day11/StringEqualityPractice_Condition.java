package day11;

public class StringEqualityPractice_Condition {

    public static void main(String[] args) {


        // Create a program called myStr and assign a value
        // check whether myStr value is Java
        // if true -->> CORRECT WORD !!!
        // if false --->> SAY JAVA !!

        // update this program to add more condition
        // using else if in the middle

        // check the value of myStr
        // if it is Java --> correct word
        //if it is Cava -->> Pumpkin !!!
        //else say NOT JAVA NOR PUMPKIN


        String myStr = "Cava" ;

        if(myStr.equals("Java")){
            System.out.println("CORRECT WORD!!!!!!");

        }else if(myStr.equals("Cava")){
            System.out.println(" Pumpkin!!!!!");

        }else{
            System.out.println("NOT JAVA NOR PUMPKIN");
        }







    }
}
