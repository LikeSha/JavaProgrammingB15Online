package day49;

public class MainTeslaTest {

    public static void main(String[] args) {

       Tesla t1 = new Tesla(2019,420,"S");

       t1.start();
       t1.selfDrive();
       t1.goForward();//this one we did not override it ,we just use as it is.
       t1.charge();//this one we did not override it ,we just use as it is.
       System.out.println("t1 = " + t1);





    }



    }