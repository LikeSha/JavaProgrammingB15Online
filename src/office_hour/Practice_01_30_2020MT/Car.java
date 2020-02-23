package office_hour.Practice_01_30_2020MT;

public abstract class Car {

    // public abstract void(void is return type) methodName();

    public abstract void start();

}

class Toyota extends Car{

    @Override
    public void start() {
        System.out.println("Push Button");
        System.out.println("Start Engine");

    }
}

class Jeep extends Car{
    public void start(){
        System.out.println("Call Mechanic");
        System.out.println("Oil Change");
        System.out.println("Start Engine");
    }
}

abstract class ElectricCars extends Car{ // if the subclass is also an abstract class ,you dont have to override the super class methods

       public abstract void HasBattery();
       // there are 2 abstract methods : start(); , HasBattery();
}

class Tesla extends ElectricCars{
    @Override
    public void start(){
        System.out.println("Say start");
        System.out.println("start engine");
    }
    @Override
    public void HasBattery(){
        System.out.println("Tesla has Battery");
    }
}

class Test{
    public static void main(String[] args) {
        Jeep obj1 = new Jeep();
        obj1.start();
        System.out.println("========================================");
        Toyota obj2 = new Toyota();
           obj2.start();
        System.out.println("====================================");
           Tesla obj3 = new Tesla();
           obj3.start();
           obj3.HasBattery();

          // Car obj4 = new Car();  abstract class is not concrete we can not create object


    }
}

