package day51.polymorphism;

public class Animal {

    public void makeNoise(){
        System.out.println("general animal noise");
    }


}
class Dog extends Animal{ // I only write class but no public so I  can do this way under same class doing extention.
                          // I can add more classes as only one class is public and name is as file name
    @Override
    public void makeNoise(){
        System.out.println("woof!!!");
    }

}

class Horse extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("neinei!!!!");
    }

}