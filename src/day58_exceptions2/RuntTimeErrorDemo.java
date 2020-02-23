package day58_exceptions2;

public class RuntTimeErrorDemo { //popular ones !

    static int num = 0;

    public static void main(String[] args) {

        num++;
        System.out.println("num = " +num);
        // call main method again
        main(null);
    }


}
