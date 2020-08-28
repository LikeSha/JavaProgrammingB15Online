package office_hour.Practice_01_28;

public abstract class Animal implements Zoo{

    // rules for abstract class :
    //1, NO OBJECT CREATION
    //2, Abstract method no method body

    // default constructor(invisible, unless we write it down)
    public Animal(){

    }
    // information-->> variable

    // variables ==> local ,instance ,static

    int age;
    String color;
    String breed;

    //Action--> methods
    //method--> instance,constructor

    // this is also called concrete method , because
    // it contains body and everything .
    public void eat(){
        System.out.println("The animal is eating");
    }

    public void call(){
        System.out.println("The animal is calling");
    }
    // concrete method vs abstract method


    // what if we just declare a method that should be in
    //child class ,and they have different body

    // Inheritance : extends
    // Abstraction :
        // 1, abstract class keyword : abstract
       //   a.abstract class ==>> no object creation
        //  b. abstract method===> no body

    //2,Interface==> abstract method ONLY
    //               what the other classes have



    // abstract method==I want this method will appear in
    // both cat and dog classes, yet they should have
    //different body
    public abstract void run();
}
