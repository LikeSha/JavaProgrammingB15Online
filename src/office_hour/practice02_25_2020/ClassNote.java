package office_hour.practice02_25_2020;

public class ClassNote {

    /**
     * String StringBuilder StringBuffer
     *
     * String--class in Java ( String is immutable )  immutable means we can not mutate it , we can not
     * change the object , its not changing the same object
     *
     * Heap-- String pool ( is a part of Heap memory ) , String pool is something special specific for String
     * helping us to manage memory .
     *
     * String str1 = "abc" ( object created in a String pool ) --> []
     * String str2 = "abc" ( this two reference are pointing two same objects )
     *
     * lets say if : str1 = "abcd" ; what would be the value of str2 ?  str1 = "abcd"---[]
     * str2 still be "abc " ! str2-->"abc"
     * when new object created  the old object go to the garbage collector .
     * that why we have StringBuilder--->( mutable ) and
     *                  StringBuffer--->synchronized with StringBuilder
     *  the difference between String and StringBuilder, StringBuffer are :
     *  String is immutable ,but those two are mutable



            StringBuilder,StringBuffer they have there own methods

     StringBuilder sb1 = new StringBuilder("word")
     sb1--[]

     StringBuilder sb2 = sb1;
     it means sb2 is pointing to the same object , address of sb2 is same as address of sb1
     StringBuilder is much faster than StringBuffer. so prefer use StringBuilder first .


     sb1 = new StringBuilder("java");
     what is sb2 now ?  sb2 pointing to "word" !

     If you know that you need to do some manipulations on String which class you will use ?
     StringBuilder or StringBuffer depends if we need any synchronization

     If need just to store some String we could always want to use String class

     StringBuilder sb3 = new StringBuilder("selenium");
     sb3--[selenium]
     sb3 = sb3.reverse();
     sb3--[muineles]  it reversed ,but is STILL THE SAME OBJECT .

     String str1 = "abc"; str1 --[abc]
     str1 = str1.toUpperCase(); str1   [abc] < garbage collected
                                str1--[ABC] -- ABC is now a new object because str1 = str1.toUpperCase() has NO
                                RELATION WITH str1



     */

    public static void main(String[] args) {

        String str1 = "java";
        System.out.println("line62 : " + str1 );
        String str2 = "java";
        System.out.println("line64 : " + str2);
        str1 = "selenium";
        System.out.println("str1 after change : " + str1);
        System.out.println("str2 after change : " + str2);

        StringBuilder sb1 = new StringBuilder("html");
        StringBuilder sb2 = sb1;
        System.out.println("values of sb1 = " + sb1 + " and sb2 = " + sb2);
        sb1 = new StringBuilder("cucumber");
        System.out.println("values of sb1 = " + sb1 + " and sb2 = " + sb2 + " after change");

        StringBuilder sb3 = new StringBuilder("jenkins");
        StringBuilder sb4 = sb3;
        System.out.println("values of sb3 = " + sb3 + " and sb4 = " + sb4);
        sb3 = sb3.reverse();
        System.out.println("values of sb3 = " + sb3 + " and sb4 = " + sb4 + " after change ") ;

        // Interview : if they ask you revere String ,you can simply use StringBuilder method

        String word = "apple";
        StringBuilder word2 = new StringBuilder(word);
        word2= word2.reverse();
        System.out.println("word2 = " + word2);


    }


}
