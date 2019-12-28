package day33;

// practice method


public class ReturnKeywordPractice3 {

    public static void main(String[] args) {

       // calculateAndReturnAge(1975,2020);
        System.out.println(calculateAgeFromBirthYear(199));

    }

    /**
     * Create a class called ReturnKeywordPractice with main
     *
     * calculateAndReturnAge
     * Write a method accept a birth year and return the age
     * the birth year should be within the range of 1900--2020
     * if not return 0
     *
     * optionally : test your code against array of birthYears
     * {1999,122,2019,1987,1978,1964,3999,2004}
     *
     */
//     public static int calculateAndReturnAge(int birthYear, int currentYear){
          ;
 //        if(birthYear >=1900 && birthYear <= 2020){
//             System.out.println(currentYear-birthYear);
//         }else{
 //            System.out.println(0);
//         }
       // return age ;
//         return 0 ;   the above code is made by myself . below is teacher's version .
//     }

         public static int calculateAgeFromBirthYear( int birthYear){
             if(birthYear <= 1900 || birthYear >= 2020){
                 return 0 ;
             }
             // If I reach this point , it means the birth year is valid
              return 2019 - birthYear ;
         }

}
