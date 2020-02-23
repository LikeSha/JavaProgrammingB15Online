package selfStudyFolder.oopConcertPart2;

public class Bmw extends Car {//" has-a" relationship

    // when same method is present in parent class as well as child class
    // with the same name and same number of arguments, is called
    // method-Overriding
    public void start(){//overridden method
        System.out.println("BMW---start");
    }
    public void theftSafty(){
        System.out.println("BMW--theftSafety");
    }

}
