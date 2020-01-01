package day34;

public class MoreMethodPractice {

    public static void main(String[] args) {

        // CodingBat.com

        System.out.println((monkeyTrouble(true,true)));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true,false));

        System.out.println(monkeyTrouble2(true,true));
        System.out.println(monkeyTrouble2(false,false));
        System.out.println(monkeyTrouble2(true,false));

    }
     /*
     A method that return true only if both monkeys are smiling or not smiling
     aSmile first monkey smiled or not
     bSmile second monkey smiled or not
     true only if both monkeys are smiling or not smiling
      */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //TODO : YOUR code goes here
        //return aSmile = bSmile;
        // if( (aSmile && bSmile ) || (!aSmile && bSmile)){
        //    return true ;
        // }else{
        //    return false;
        //      }

         return (aSmile && bSmile) || (!aSmile && !bSmile);

    }
      // return yes and no instead of true and false
     /*
     A method that return true only if both monkeys are smiling or not smiling
     aSmile first monkey smiled or not
     bSmile second monkey smiled or not
     yes only if both monkeys are smiling or not smiling

      */

    /**
     *                    //  open up " /" then "**" then hit enter , ---->>
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static String monkeyTrouble2(boolean aSmile, boolean bSmile){
        //TODO : YOUR CODE goes here
        if( (aSmile && bSmile ) || (!aSmile && !bSmile)){
            return "Yes";
        }else{
            return "No";
        }
    }


}
