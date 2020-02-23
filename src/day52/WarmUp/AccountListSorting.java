package day52.WarmUp;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountlst = new ArrayList<>();
        accountlst.add(new Account("John Snow",10000));
        accountlst.add(new Account("Vald",11000));
        accountlst.add(new Account("Sventlana",13000));
        accountlst.add(new Account("Muhammad",80000));
        accountlst.add(new Account("Emme",17000));
        accountlst.add(new Account("Ata",15000));

        System.out.println("accountlst  before =  \n" + accountlst);

        Collections.sort(accountlst);

        System.out.println("accountlst after = \n" + accountlst);

        // Create another account with your name ;
        // transfer everyone's money to your account

        Account myAccount = new Account("Salik",0);

        for(Account each : accountlst){
            each.transferAll(myAccount);
        }

        System.out.println("myAccount = " + myAccount);
        System.out.println("accountlst = " + accountlst);

       // what can be the data type of a1
        /*
        Account a1;
        Comparable a1 ;
        Transferable a1;
        Object a1

        An object can be referred by
            it's own type
            it's super class type
            interface type that it implemented

         */

        Account a1 = new Account("Polymorphism",10000);

        Transferable t1 = new Account("Polymorphism2",10000);
        Comparable c1 =  new Account("Polymorphism4",10000);
        Object o1 = new Account("Polymorphism3",10000);



    }
}
