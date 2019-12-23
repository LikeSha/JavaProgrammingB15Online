package day26_AfterSchoolPractice;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length ;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch  = "Black Widow" ;
        int countOfItem = 0 ;

        for(String eachHero : marvelHeroes){
            if(eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);

        // count the hero with the name contains "black"

        int cntOfBlack = 0 ;
        for( String eachHero : marvelHeroes){
            if(eachHero.toLowerCase().contains("black")){
                cntOfBlack ++ ;
            }
        }
        System.out.println("Hero Names contains black = " + cntOfBlack);

    }
}
