package day27;

public class MultiDimensionalArray_Practice2 {

    public static void main(String[] args) {

        System.out.println("=======finding the shortest words ============================================");
        String[] developersTeam = {"Vladislav" , "Hasan" , "Tolkun" , "Abide"} ;
        String[] testersTeam = {"Zhibekchach" , "Mohammed Sohrabi" ,"Nursultan"} ;
        String[] businessAnalysistTeam = {"Lisa" , "Ershad","Naila"} ;

        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysistTeam} ;

        // find the shortest string of text

        int minLength = scrumTeam[0][0].length() ;
        String shortestString = scrumTeam[0][0];

        for(int i = 0 ; i < scrumTeam.length ; i++){
            for (int j = 0; j <scrumTeam[i].length; j++) {
                if (minLength > scrumTeam[i][j].length()) {
                    minLength = scrumTeam[i][j].length() ;
                    shortestString = scrumTeam[i][j];

                }


            }
        }
        System.out.println("minLength is : " +minLength);
        System.out.println("shortest String name = " + shortestString);




    }


}
