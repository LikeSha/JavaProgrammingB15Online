package day14_AfterSchoolPractice;

public class IndexOfPractice {

    public static void main(String[] args) {

        // indexOf
        // find out index of another String inside This String (  FIND OUT THE
        //  LOCATION OF CERTAIN TEXT INSIDE ONE TEXT. not like charAt , charAt
        //  GIVE THE CHARACTER AT CERTAIN LOCATION (is supposed
        // the location already knew , but just find out each location correspondent character.)
        //             012345678901
        String name = "Game of Java" ;// length is 12
        // find out the location of Java
        //find out the location of letter o
        //find out the location of first space


        System.out.println("find out the location of Java");
        System.out.println(name.indexOf("Java"));

        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));
        // if the location is not found , we get minus number
        System.out.println("find out the location of uppercase o");
        System.out.println( name.indexOf("O"));

       // System.out.println(name.indexOf("a")); this question wil learn soon

        //find out the location of first space
        System.out.println("find out the location of first space ");
        System.out.println(name.indexOf(" "));




    }

}
