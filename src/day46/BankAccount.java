package day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;
    // always add no arg constructor in super class
    // to avoid error in sub class
    public BankAccount(){

    }

    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super(); we have this super() but we don't see .
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount ; // this.balance = this.balance + amount
    }

    public void withdraw(int amount){
        balance -= amount;
    }



}
