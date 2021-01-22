package InterviewsCodeKnowledge;

import java.util.Arrays;

/*
Create a method that will take any String of letters and numbers and sort each substring of numbers and letters
Ex:Input:  "DC501GCCCA098911"
   OutPut: "CD015ACCCG011899"

   // solution explain is in rebootcamp 05/28/2020 Day 6 JAVA video
 */
public class SortNumberAndLetterInAString {

    public static void main(String[] args) {

        System.out.println(sortEach("DC501GCCCA098911"));

    }

    public static String sortEach(String str){

        String sorted = "";
        String each = "";

        for (int i = 0; i < str.length(); i++) {

            each += str.charAt(i);

            if(Character.isLetter(str.charAt(i))){
                if(i == str.length()-1 || !Character.isLetter(str.charAt(i+1))){//checking if the next one is letter or number
                    // action1
                    sorted +=sortSubString(each);
                    each = "";// reassign my each back to nothing because I found everything and need to redo everything
                }
            }else{
                 if(i==str.length()-1 ||!Character.isDigit(str.charAt(i+1))){
                     //action2  // because action1 and action2 are pretty much similar, so we need a method to make it simple
                      // I need to take each part of substring and sort it.method name is "sortSubString"
                     sorted +=sortSubString(each);
                     each = "";
                 }
            }
        }

        return sorted;
    }

    private static String sortSubString(String str){

        String[] arr = str.split("");
        Arrays.sort(arr);
        return Arrays.toString(arr).replace("[","").replace("]","").
                replace(",","");//converted my array into string
    }

}
