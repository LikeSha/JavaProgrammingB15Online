package day32_AfterSchoolPractice;

public class AlphabetInRange {

    public static void main(String[] args) {

        printAlphabetInRange('a','f');
        printAlphabetInRange('t', 'b');

    }

    public static void printAlphabetInRange(char beginning, char ending) {
        if (beginning < ending) {
            System.out.println(" increment ");

            for(char ichar = beginning ; ichar <= ending ; ichar ++){
                System.out.print(ichar + " ");
            }
            System.out.println();

        } else if (beginning > ending) {
            System.out.println("decrement");

            for (char ichar = beginning ; ichar >= ending ; ichar--){
                System.out.print(ichar + " ");
            }
            System.out.println();

        } else {
            System.out.println("same character");
        }


        }
    }
