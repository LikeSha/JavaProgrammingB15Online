package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        // creating an array object with empty slot
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95 ;
        scores[1] = 70 ;
        scores[2] = 88 ;
        scores[3] = 100 ;

        // accessing the elements inside array one by one
//        System.out.println(  scores[0]    );
//        System.out.println(  scores[1]    );
//        System.out.println(  scores[2]    );
//        System.out.println(  scores[3]    );

       // how do we get the size of any array object
        // array object has a property called length
        // arrayVariable.length will give you the count of items

        int itemCount = scores.length ;
        int lastItemIndex = itemCount-1 ;


        //How do I diffcienated the property and the method ? the parenthesis (). if you have parenthesis
        // that is called method , if no parenthesis ,its property
        // String.length(). <-- method
        // Array.length <-- property
        //method is action , property is something describes the object

        //for ( int x = 0 ; x <= lastItemIndex ; x++){
        //for ( int x = 0 ; x <= itemCount-1 ; x++){
        for ( int x = 0 ; x < itemCount ; x++){
            System.out.println(scores[x]);
        }
        System.out.println("------------print this array in reverse order---------------------------");
        // print this array in reverse order
        for ( int x = itemCount-1 ; x >= 0 ; x--){
            System.out.println(scores[x]);
        }

        // how do we get the char count of a String
        String name = "Jon Snow" ;
        int charCount = name.length();// orange color is " property " always think what is pink M
        // length(). in array is property ( property without parenthesis () ) String does not
        // have length_ property  Muhammet Fatih Arslan 1:30 PM
        //string.length();going and calculating the length.
        // array.length it already knows just showing the info. That's what I get



    }
}
