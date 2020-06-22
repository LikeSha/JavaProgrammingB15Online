package day26;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray()  , another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey" ;

        char[] surveysChars = survey.toCharArray();

        // How did I determine to use car for each ?
        //because each item in char array is char
        for(char each   : surveysChars  ){

            System.out.println("each char is : " + each);
        }
         // just for fun why don't we try while loop
        System.out.println("-----below is while loop version------");
        int x= 0 ;
        while( x < surveysChars.length){

            System.out.println("each char is : " + surveysChars[x]);
            x++ ;

        }
        System.out.println("---------------below is for loop version----------");
        for (int i = 0; i < surveysChars.length ; i++) {

            System.out.println("each char is :" + surveysChars[i]);

        }

        System.out.println("------------below is do while loop version---------------");
        int y = 0 ;
         do{
             System.out.println("each char is : " + surveysChars[y]  );
             y++ ;
         }while( y < surveysChars.length) ;

    }
}
