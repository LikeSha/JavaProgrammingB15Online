package office_hour.Practice_01_28;

public class TestAnimal {

    public static void main(String[] args) {

        // create object==> can not !! because Animal is abstract class !!
      //  Animal animal = new Animal();

        Dog dog= new Dog();
        dog.eat();
        dog.call();// The animal is calling
        dog.run(); // The dog is running
        System.out.println("=======================");

        Cat cat = new Cat();
        cat.eat();
        cat.call();
        cat.run();

    }
}
