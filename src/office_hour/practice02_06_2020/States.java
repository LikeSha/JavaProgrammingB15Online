package office_hour.practice02_06_2020;

public abstract class States {
    String stateName;
    public abstract void tax();

    public final void method1(){
        System.out.println("method 1 from States class");//final method CAN NOT BE OVERRIDDEN ,BUT CAN BE OVERLOADED!
    }

}


class Kentucky extends States{
    String stateName = "KY";
    public void tax(){ // override method the parent class "State"
        System.out.println("Tax Rate in KY is 6%");
    }

    public void KFC(){
        System.out.println("KY has KFC");
    }

    public final void method1(int a){// this is overloading States class final method1. we can do this.
        System.out.println("method 1 from Kentucky class");
    }
}

class California extends States {
    String stateName = "CA";
    public void tax() {
        System.out.println("Tax Rate in California is 9%");
    }

    public void HollyWood() {
        System.out.println("There is Hollywood in CA");
    }

    public final void method1(int a) {// this is overloading States class final method1. we can do this.
        System.out.println("method 1 from California class");
    }
}