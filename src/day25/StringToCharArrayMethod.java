package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesya" ;

        // how would you store each and every character
        //to an char array from above name
        // without using method we are about to learn
        char[] nameChars = new char[name.length()] ;

//        nameChars[0] = name.charAt(0);
//        nameChars[1] = name.charAt(1) ;

        // using for loop to fill up the array one by one
        for (int x = 0; x <nameChars.length ; x++) {

            // take each character of name and fill the char array values
            nameChars[x] = name.charAt(x) ;

        }
        System.out.println("nameChars = " + Arrays.toString(nameChars));


        char[] namesChar2 = name.toCharArray() ;
        System.out.println("namesChar2 = " + Arrays.toString(namesChar2));


        System.out.println("----------------------my task below-------------------------");
        // pick up your own name and turn it into char array and use for each loop to loop over them
        //optionally count how many a you have in your name

        String myName = "Salik Malik" ;
        // turn this into charArray using toCharArray() method to String

        // what does it do ?
        //
        //toCharArray() is a method of String that turn string into char array
        // do i nee to provide extra data while calling the method ?
        // NO !
        //
        char[] myNameChar = myName.toCharArray();
        System.out.println(" before sorting myNameChar = " + Arrays.toString(myNameChar));
        System.out.println("myNameChar = " + Arrays.toString(myNameChar));

        for(char eachCharacter   : myNameChar){

            System.out.println("eachCharacter = " + eachCharacter);

        }
          // now count how many a in my name
        int count = 0 ;
        for( char eachCharacter : myNameChar){

            if(eachCharacter == 'a'){
                ++count ;
            }

        }

        System.out.println("count = " + count);

        // what if you want to sort all characters of your name
        // in alphabetical order ?

        Arrays.sort(myNameChar) ;
        System.out.println( " after sorting myNameChar = " + Arrays.toString(myNameChar)) ;
        // comes with uppercase first ,then lowercase . thats why the result is like that




    }
}
