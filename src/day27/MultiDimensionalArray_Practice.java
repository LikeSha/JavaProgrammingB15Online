package day27;

public class MultiDimensionalArray_Practice {

    public static void main(String[] args) {

        System.out.println("=======finding the longest words ============================================");
        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"} ;
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi" ,"Nursultan"} ;
        String[] businessAnalysistTeam = {"Lisa" , "Ershad","Naila"} ;

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysistTeam} ;

        int maxLength = scrumTeam[0][0].length();
        String longestString = "" ; // to store the longest string

        for(String[] each1DArray : scrumTeam ){
            for( String eachElement : each1DArray){
                if(maxLength < eachElement.length()){
                    maxLength = eachElement.length() ;
                    longestString = eachElement ; // if the string has the largest length, we assigning
                                                   // that String to longestString
                }
            }
        }

        System.out.println("maxLength = " + maxLength);
        System.out.println("the longest name is : " +longestString);

        System.out.println("=====find out which word is that longest one ============");

        for(String[] each1DArray : scrumTeam ){
            for( String eachElement : each1DArray){
                if(maxLength == eachElement.length()){
                    System.out.println("the longest name is : " + eachElement);
                }
            }
        }




    }
}
