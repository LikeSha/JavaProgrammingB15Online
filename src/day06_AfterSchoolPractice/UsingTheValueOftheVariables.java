package day06_AfterSchoolPractice;

public class UsingTheValueOftheVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300 ;
        int yourFavoriteNumber = myFavoriteNumber ;

        System.out.println("My Favorite Number" + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number" + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        // Create a variable called yourOrder, type String and assign a value
        // Optionally assign this value using Scanner
        // Create another variable called myOrder and assign the value
        // to same value as yourOrder by coping
        // and just print them out.

        String yourOrder = "pizza";
        String myOrder = yourOrder ;
        System.out.println("your Order is " + yourOrder);
        System.out.println("My Order is " + myOrder);




    }
}
