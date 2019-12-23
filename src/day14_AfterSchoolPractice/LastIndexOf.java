package day14_AfterSchoolPractice;

public class LastIndexOf {

    public static void main(String[] args) {

        String name = "Game of Java" ;// length is 12, last char index is 11

        // find out last location the letter a shows up
        System.out.println("find out last location the letter a shows up");
        System.out.println( name.lastIndexOf("a")   );

        // find out last location the character space shows up
        System.out.println("find out last location the character space shows up");
        System.out.println( name.lastIndexOf(" ")   );

        // find out last location the letter Ga shows up
        System.out.println("find out last location the letter Ga shows up");
        System.out.println( name.lastIndexOf("Ga")   );

        // find out last location the letter kawa shows up
        System.out.println("find out last location the letter kawa shows up");
        System.out.println( name.lastIndexOf("kawa")   );

        // if I DONT USE contains method, wha would be my condition to check
        // whether we have kawa in this String , either using indexOf or lastIndexOf

        if( name.indexOf("kawa") > -1){

            System.out.println("KAWA FOUND!!!");
        }else{
            System.out.println("NO KAWA-NO PUMPKIN");
        }




    }
}
