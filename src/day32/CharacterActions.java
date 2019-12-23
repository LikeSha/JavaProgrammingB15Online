package day32;

import jdk.swing.interop.SwingInterOpUtils;

public class CharacterActions {

    public static void main(String[] args) {

        printAtoZ();
        printZtoA();

    }
    /**print AtoZ
     * create a method that has no parameter
     * and print A-Z in one line
     *
     */
      public static void printAtoZ(){

          for (char iChar = 'A'; iChar <='Z' ; iChar++) {
              System.out.print(iChar + " ");
          }
          System.out.println(); // so we can move to next line
      }
    /**print ZtoA
     * create a method that has no parameter
     * and print Z-A in one line
     *
     */

     public static void printZtoA(){

         for (char iChar = 'Z'; iChar >='A' ; iChar--) {
             System.out.print(iChar + " ");
         }
         System.out.println();// so we can move to next line
     }

}
