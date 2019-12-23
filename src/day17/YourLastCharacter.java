package day17;

public class YourLastCharacter {

    public static void main(String[] args) {

        // assuming you don't know the length of your name
        // write a program to print your name in reverse order

        // find out the location of your last character of your name
        //pick your last character of your name according to the location
        //then keep shifting the location to pick util first character
        //             01234567  index = count - 1
        String name = "salik" ;
        //             12345678    count = name.length()-1 ;

        int lastCharacterIndex = name.length()-1 ;//SUPER IMPORTANT FORMULA !!!!!!!!! REMEMBER IT !!!
                  // THIS IS YOUR NAME LAST CHARACTER INDEX COUNT, USE THIS FORMULA
                  // You can use x instead of lastCharacterIndex ,to void program too long .

        while(lastCharacterIndex >= 0){
            System.out.println( "index" +lastCharacterIndex + " : " + name.charAt(lastCharacterIndex) );
            --lastCharacterIndex;


        }




    }
}
