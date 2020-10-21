package day60;

public class BreakTimeException extends RuntimeException {

}

     class Main {


        public static void main(String[] args) {


//        throw new BreakTimeException();
            try {
                throw new BreakTimeException();
            } catch (BreakTimeException e) {
                System.out.println("WOLA MY OWN THING CAUGHT!!!");
            }

        }

    }





