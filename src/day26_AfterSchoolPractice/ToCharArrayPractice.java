package day26_AfterSchoolPractice;

public class ToCharArrayPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray() ,anther is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";

        char[] surveyChars = survey.toCharArray();

        for (char each : surveyChars) {

            System.out.println("each char is  = " + each);

        }
        System.out.println("========for loop version======");

        for (int i = 0; i < surveyChars.length ; i++) {
            System.out.println("each char is : " + surveyChars[i]);
        }



        System.out.println("====== while loop version=====");

        // try while loop
        int x = 0;

        while (x < surveyChars.length) {
            System.out.println("each char is : " + surveyChars[x]);
            x++;
        }

        System.out.println("======do while loop version========");
        int y = 0 ;
        do{
            System.out.println("each char is : " + surveyChars[y]);
            y++ ;

        }while(y < surveyChars.length);



        }


    }

