package day26;

import java.util.Arrays;

public class ToCharArrayPracticeWithArrayClassMethod {

    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey" ;

        char[] surveyChars = survey.toCharArray() ;
        System.out.println("Before surveyChars : " + Arrays.toString(surveyChars));

        Arrays.sort(surveyChars) ;

        System.out.println("After surveyChars : " + Arrays.toString(surveyChars));




    }
}
