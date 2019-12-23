package day27_AfterSchoolPractice;

public class MultiDimensionalArray_Practice {

    public static void main(String[] args) {

        System.out.println("=======finding the longest words ============================================");
        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"} ;
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi" ,"Nursultan"} ;
        String[] businessAnalysistTeam = {"Lisa" , "Ershad","Naila"} ;

               String[][] scrumTeam = {developersTeam , testersTeam,businessAnalysistTeam} ;
               // my task is to find out which person's name is the longest name is this scrum team

           int maxLength = scrumTeam[0][0].length();

        for ( String[] each1DArray : scrumTeam){
            for( String eachElement :  each1DArray){
                if(maxLength < eachElement.length() ){
                    maxLength = eachElement.length();
                }
            }
        }
        System.out.println("maxLength = " + maxLength);

        System.out.println("=====find out which name is that longest character name ");

        for ( String[] each1DArray : scrumTeam){
            for( String eachElement :  each1DArray){
                if(maxLength ==eachElement.length() ){
                    System.out.println("the longest name is : " + eachElement);
                }
            }
        }


        System.out.println("==third solution : we do find out longest character and longest name in one for each loop====");
          // do everything in the first for each loop --just add condition into solution 1

        String longestName ="";
        for ( String[] each1DArray : scrumTeam){
            for( String eachElement :  each1DArray){
                if(maxLength < eachElement.length() ){
                    maxLength = eachElement.length();
                    longestName = eachElement ;

                }
            }
        }
        System.out.println(longestName);
        System.out.println("maxLength = " +maxLength);



    }
}
