package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        // If you have complain in life : call 1-800-Alexander
        String name = "Alexander";

        // get each and every character and print them out vertically

        // HOW TO GET THE LAST INDEX ? THIS IS VERY VERY IMPORTANT !!!!!!!!!!
        int x = 0 ;
        // in order to print each character of a String
        // we need to start getting character
        // from index 0 till last index ( name.length()-1 )

        while(x < name.length()){ // ( x <= name.length()-1 )

            System.out.print("index " + x + " : " );
            System.out.println( name.charAt(x));
            ++x ;
        }

//
//        ++x ;





    }
}
