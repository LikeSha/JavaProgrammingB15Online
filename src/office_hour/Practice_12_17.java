package office_hour;

public class Practice_12_17 {

    public static void main(String[] args) {

        // String method , nasted loop

        /** data types : primitive   non-primitive
         *
         * primitive : byte ,short ,int, long, float , double , char, boolean
         * non-primitive : Scanner String Array
         *
          */
       int number = 6 ;

       String word = "java";

       // replace j-->c
        System.out.println("After replace it changed to  " + word.replace("j","c"));

        System.out.println(word) ; // java
        System.out.println("word"); // word-> this is just a pint something ,its different from the above
        System.out.println(number);  // 6

        System.out.println(number + 6);  // 12
           //                6 + 6 = 12

        // in order to see how many characters we have in a variable
        System.out.println("there are total " + word.length() + " chars in word");
        // all the methods have () behind the name .

        System.out.println("I have 6" + 7);// when we add a primitive type into a non primitive type
         // for example String ,the result is a String

        System.out.println("I have 9" + 1 + 2);// longer data type like a shark ,if combined with
        // a smaller data type ,it will " eat " smaller one ,and become longer data type

        System.out.println("I have 8" +(1+4));

        System.out.println((2+3) +(3+5));
            //         0123456789012345678
        String book = "Learn java in 1 day,java is fun" ;
        System.out.println("first j index " + book.indexOf("j"));
        System.out.println("last j index " + book.lastIndexOf("j"));

        System.out.println(book.length());
        //I want only one char
        System.out.println(book.charAt(0));

        System.out.println("I am looking for a space " + book.charAt(5));

        // we can use subString method to get one or moe chars
        String student = "Rabia" ;
        System.out.println(student.substring(2));

        System.out.println(student.substring(0,1));

        System.out.println(student.substring(4)); // last a
        System.out.println(student.substring(4,5)); // last a

        System.out.println(student.toUpperCase()); // RABIA
        System.out.println(student.toLowerCase()); // rabia


        // below is very important in selenium part , in real testing job

        System.out.println( student.length()); // return is 5 , its int bype 5


        int lengthOfStudent = student.length() ; // 5
        // int lengthOfStudent = 5   -->> line 68 and 69 is exactly same !
        System.out.println(lengthOfStudent);

        String lowerStudent = student.toLowerCase();
        System.out.println(lowerStudent);

        String batch = "Online" ;

        // UpperCase + length
        System.out.println(batch.toUpperCase().length()); // ONLINE -- this is called method chainning

        System.out.println("Asiya".toUpperCase().toLowerCase().length()); // the result is 5 .ASIYA-->asiya-->5

        // trim
         String a = "  Asiya   " ;
        System.out.println(a.trim());// cut all spaces in a string



    }
}
