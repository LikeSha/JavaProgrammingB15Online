package selfStudyFolder.oopConcertPart2;

public interface USBank {

    int min_bal = 100;

    public void credit();// in interface ,no method body ,only method defination

    public void debit();

    public void transferMoney();

    // only method declaration
    // no method body--only method prototype
    // in interface , we can declare the variables , variables are by default static in nature.
    // variables value will not be changed, its final/constant in nature. once you defined ,can never change it !

    // no static method in Interface , because Interface is a part of object oriented concept , object can not have static method .
    // therefore we never write static method in interface .

    // no main method in Interface
    //We can not create the object of Interface
    // Interface is abstract in nature .abstract means no instantiate .
}
