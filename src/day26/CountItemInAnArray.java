package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spiderman",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Black Widow";
        int countOfItem = 0;

        for (String eachHero : marvelHeroes) {

            if (eachHero.equals(itemToSearch)) {
                countOfItem++;
            }

        }
        System.out.println("countOfItem = " + countOfItem);
        // count the hero with the name contains black in case sensitive manner

        System.out.println("------count the hero with the name contains black in case sensitive manner----");

        int cntOfBlackInName = 0;
        for (String eachHero : marvelHeroes) {

            if (eachHero.toLowerCase().contains("black")) {
                cntOfBlackInName++;
            }

        }
        System.out.println("cntOfBlackInName = " + cntOfBlackInName);


    }
}