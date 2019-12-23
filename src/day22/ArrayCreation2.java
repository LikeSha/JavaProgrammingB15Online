package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {
        

       // int num ;        // we are only declaring a variable
        //    num = 10 ;   // we are assigning a value on a different line



        // Creating an array in second way

        //int[] ages ;                               // we are only declaring a variable
         //     ages =new int[] {3,5,11,33,57,18};   // we are assigning a value on a different line
        
        int[] ages = new int[]{3,5,11,33,57,18};
        
        int itemCount = ages.length ;
        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages);

        //System.out.println(ages[0]);

        for (int x = 0; x<itemCount ; x++) {

            System.out.println( ages[x]);


        }
        // below is the simpliest way ,by doint this way
        // if you do it this way : IT MUST HAPPEN IN ONE LINE TOGETHER(LINE35)
        int[] areaCodes = {703,300,954,665} ;
        //int[] areaCodes ;
         //     areaCodes = {703,300,954,665} ;// this two line declaration not works !

        for (int x = 0; x <areaCodes.length ; x++) {
            System.out.print(areaCodes[x] + " ");

        }
        
        
    }
}
