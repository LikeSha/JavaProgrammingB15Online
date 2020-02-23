package selfStudyFolder.oopConcertPart2;

public class TestCar {

    //static polymorphism---compile-time polymorphism
    // it means many method overriding ,this is interview question:
    //what is polymorphism : the same methods in parent class and children
    //classes , overriding .
    public static void main(String[] args) {

      Bmw b = new Bmw();
      b.start();
      b.stop();
      b.refuel();
      b.theftSafty();
      b.engine();

        System.out.println("-------------------------------------");

      Car c = new Car();
      c.start();
      c.stop();
      c.refuel();
      //c.theftSafty(); Car can not access c.theftSafty() method.
        // PARENT CAN NOT ACCESS CHILD CLASS METHOD !!!!!
        //I CAN INHERITE FROM MY PARENTS , BUT MY PARENTS CAN NOT
        // INHERIT FROM ME !!!!

        System.out.println("----------------------");


        //Top Casting
        Car c1 = new Bmw();// child class object can be referred by
        // parent class reference variable --dynamic polymorphism--> Run-time polymorphism.
        c1.start();
        c1.stop();
        c1.refuel();
        // you can not access c1.theftSafty(); because object is Bmw,Bmw
        // is child class object and referred by parent class reference variable
        //you can recommend object but you can not take them properties

        // Down Casting
        //Bmw b1 = new Car();// parent can not referenced to child class reference
        //if you want to do it ,you have to cast it. how to cast it ?
        // just in front of new keyword put a parenthesis ,and inside
        //input Bmw
        Bmw b1 = (Bmw) new Car(); //BUT IF YOU DOING SO ,THE
      // COMPILER DONT ALLOWED , IT WILL SHOW .Car cannot be cast to class selfStudyFolder.oopConcertPart2.Bmw
       // ALSO MEANS " ClassCastException

      // down casting is POSSIBLE BUT NOT ALLOWED !!!

    }
}
