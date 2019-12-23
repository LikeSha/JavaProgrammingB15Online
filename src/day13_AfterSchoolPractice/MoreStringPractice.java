package day13_AfterSchoolPractice;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Pumkin" ;

        System.out.println( name );
//        name = "Bulent" ;

//        System.out.println( name);

        name.toUpperCase();
        System.out.println(name);

        System.out.println( name.toUpperCase()); //Every time when I call a new method ,
         // I just create a new string without changing the original one, this is called
         // String Immunate

        // WHAT IF I REALLY WANT TO CHANGE THE NAME

        name = name.toUpperCase() ;
        System.out.println( name );




    }
}
