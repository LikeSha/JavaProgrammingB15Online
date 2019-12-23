package day32;

public class AlphabetInRange {

    /**Alphabet in range
     * char beginning ;
     * char ending ;
     *
     * if beginning character is before ending character
     * for example beginning A , ending D -->> ABCD
     * we did similar action with printing A-Z
     *
     * if beginning character is after ending character
     * for example beginning D , ending A --> DCBA
     * we did similar action with printing Z-A
     *
     * How do we determine a character is before another character ?
     * what does 'a' > 'b' means ? --->> ascii code number comparision
     *
     *TASK :
     * printAlphabetInRange
     * * create a method that have 2 char as parameters: beginning, ending
     * if beginning character is before ending character
     * 	for example beginning A , ending D  -->> ABCD
     * if beginning character is after ending character
     * 	for example beginning D , ending A  -->> DCBA
     */

    public static void main(String[] args) {

        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
        printAlphabetInRange('A','A');
        printAlphabetInRange('a','A');
        printAlphabetInRange('Z','a');

    }

    public static void printAlphabetInRange(char beginning,char ending){

        if(beginning < ending){
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);

            for(char iChar = beginning ; iChar <= ending ; iChar ++){
                System.out.print(iChar + " ");
            }
            System.out.println();

        }else if(beginning > ending){
            System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

            for(char iChar = beginning ; iChar >= ending ; iChar--){
                System.out.print(iChar + " ");
            }
            System.out.println();

        }else{
            System.out.println("THEY ARE SAME CHARACTER !!!");
        }
    }

}
