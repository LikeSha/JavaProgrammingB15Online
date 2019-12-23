package day14;

public class StringMethodCharAt {

    public static void main(String[] args) {

        // charAt method of String
        // it will return a character at certain location specified
        String aName = "Arya" ;
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        // A r y a
        System.out.println( c1+c2+c3+c4);//the result is ASCII number 397 because if you add character directly ,compiler
                                         // considers you are trying to add numbers as a arithmatic operator . So do not
                                         // add character

        System.out.println( c1 + " " + c2 + " " + c3 + " " + c4);



        System.out.println();

        String name = "Salik";

        System.out.print(  name.charAt(0)   + " "   );
        System.out.print(  name.charAt(1)   + " " );
        System.out.print(  name.charAt(2)   + " "  );
        System.out.print(  name.charAt(3)   + " "  );
        System.out.print(  name.charAt(4)   + " "  );


        System.out.println("------------");

        System.out.println(  name.charAt(0)     );
        System.out.println(  name.charAt(1)     );
        System.out.println(  name.charAt(2)     );
        System.out.println(  name.charAt(3)     );
        System.out.println(  name.charAt(4)     );

        String name2 = "LIKE" ;
        char c6= name2.charAt(0) ;
        char c7= name2.charAt(1);
        char c8= name2.charAt(2);
        char c9= name2.charAt(3);

        System.out.println(c6+"" + c7 + c8 +c9); // I tried this by myself , if you concatinated character only adding one double quote
                                                 // it takes whole thing a String , but he name each letter with no space .

    }
}
