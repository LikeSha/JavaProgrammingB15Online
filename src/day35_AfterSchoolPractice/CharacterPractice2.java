package day35_AfterSchoolPractice;

public class CharacterPractice2 {

    public static void main(String[] args) {

        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method

        //Given any String  for example
        //String str = "A34B123C4X";
        //Add all the numbers inside the String : above String should generate 17
        // THIS IS INTERVIEW QUESTION    if you got 9 interviews  6 times you are being asked this question!

        String str = "A34B123C4X";

        int sum = 0 ;
        char[] allChar = str.toCharArray();

        for( char each:allChar){
            if(Character.isDigit(each)){
                System.out.println("each = " + each);
                int eachNum = Integer.parseInt(each+"");
                sum = sum + eachNum ;

            }

        }

        System.out.println("sum = " + sum);
    }
}
