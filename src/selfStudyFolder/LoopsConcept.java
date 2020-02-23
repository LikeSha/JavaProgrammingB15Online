package selfStudyFolder;

public class LoopsConcept {

    public static void main(String[] args) {


        //  System.out.println(1);
        //  System.out.println(2);
        // System.out.println(3);
        //  System.out.println(4);

        // 1,while loop :
        // dis advantage of while loop : it will generate infinite loop
        // if you don't give incremental / decremental

        int i = 1;
        while (i <= 10) { // condition part
            System.out.println(i);
            i = i + 1; // incremental / decremental part

        }
        System.out.println("------------------------------");

        // 2, for loop:
        for (int j = 1; j <= 10; j++) {  // j++ means j = j +1 Initialization, conditional part,incremental/decrement part
            System.out.println(j);
        }
         // print 10 to 1
        // k -- means k = k-1
        // 10,9,8,7,6,5,4,3,2,1
        for (int k = 10; k >=1 ; k--) {

        }

    }
}