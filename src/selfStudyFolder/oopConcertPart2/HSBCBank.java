package selfStudyFolder.oopConcertPart2;

public class HSBCBank implements USBank,BrazilBank{//we are achieving multiple inheritance
    // Is-a relationship ---Interface to class relationship
    // Has-a relationship -- Class to Class relationship

    // if a class is implementing any Interface,then its mandatory to define/override all the methods of Interface .
    // overriding from USBank
    public void credit(){
        System.out.println("HSBC--Credit");
    }
    public void debit(){
        System.out.println("HSBC--Debit");
    }
    public void transferMoney(){
        System.out.println("HSBC--Transfer Money");
    }
    //separate methods of HSBCBank class
    public void educationaLoan(){
        System.out.println("HSBC--edu loan");
    }
    public void carLoan(){
        System.out.println("HSBC==Car loan");
    }

    @Override
    // BraizlBank method : overriding from BrazilBank
    public void mutualFund() {
        System.out.println("HSBC--Mutual Fund");
    }
}
