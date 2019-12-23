package day13;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Pumkin" ;

        System.out.println( name);
//        name = "Cat" ;

//        System.out.println( name);

        // String is immutable , once created It can not be changed
        // any String actions/methods tha looks like changing the variable
        // actually creating a new String object

        name.toUpperCase();
        System.out.println( name);

        System.out.println( name.toUpperCase());

        // WHAT IF I REALLY WANT TO CHANGE THE NAME

        name = name.toUpperCase();
        System.out.println( name);





    }
}
