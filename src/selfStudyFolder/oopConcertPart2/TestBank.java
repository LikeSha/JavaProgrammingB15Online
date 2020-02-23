package selfStudyFolder.oopConcertPart2;

public class TestBank {

    public static void main(String[] args) {

        System.out.println(USBank.min_bal);
        //USBank.min_bal = 200 ; this is NOT ALLOWED !! YOU CAN NOT CHANGE THE FINAL VALUE
        // RULES : IN INTERFACE ,variables value will not be changed

        HSBCBank hs = new HSBCBank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.educationaLoan();
        hs.carLoan();

        // dynamic polymorphism
        // child class object can be referred by parent Interface reference variable

        USBank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();
        //b.educationLoan();this one can not !! because educationLoan is HUSBCBank itself method ,it is not override method !!
        // only the overridden method ban be called
    }


}